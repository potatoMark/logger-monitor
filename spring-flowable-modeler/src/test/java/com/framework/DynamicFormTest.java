package com.framework;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;
import org.flowable.engine.FormService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.Model;
import org.flowable.engine.repository.ProcessDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicFormTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicFormTest.class);

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    RepositoryService repositoryService;

    @Autowired
    TaskService taskService;

    @Autowired
    FormService formService;


    @Test
    public void modelConvertDeployment() throws IOException {

        List<Model> modelList = repositoryService.createModelQuery().notDeployed().listPage(0, 100);

        for (Model model : modelList) {
            LOGGER.info("model.name = {},model.id = {}",model.getName(),model.getId());

            byte[] bytes = repositoryService.getModelEditorSource(model.getId());

            if (bytes == null || bytes.length == 0) {
                LOGGER.info("bytes is null,model.name = {}",model.getName());
                continue;
            }

            JsonNode modelNode = new ObjectMapper().readTree(bytes);
            BpmnModel bpmnModel = new BpmnJsonConverter().convertToBpmnModel(modelNode);

            Deployment deployment = repositoryService.createDeployment()
                    .name(model.getName())
                    .addBpmnModel(model.getKey()+".bpmn20.xml", bpmnModel)
                    .deploy();

            model.setDeploymentId(deployment.getId());
            repositoryService.saveModel(model);

            LOGGER.info("deploy success,model.name = {}",model.getName());

        }


    }
}
