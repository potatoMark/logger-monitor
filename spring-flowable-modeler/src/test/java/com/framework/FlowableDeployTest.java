package com.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.configration.domain.AbstractModel;
import com.framework.configration.domain.Model;
import com.framework.configration.exception.InternalServerErrorException;
import com.framework.model.form.FormRepresentation;
import com.framework.serviceapi.ModelService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;
import org.flowable.engine.FormService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.DeploymentBuilder;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.form.model.SimpleFormModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlowableDeployTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlowableDeployTest.class);

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    RepositoryService repositoryService;

    @Autowired
    TaskService taskService;

    @Autowired
    FormService formService;

    @Autowired
    ModelService modelService;

    @Autowired
    protected ObjectMapper objectMapper;

    protected BpmnJsonConverter bpmnJsonConverter = new BpmnJsonConverter();


    @Test
    public void testDeployment() {

        //
        DeploymentBuilder deploymentBuilder = repositoryService
                .createDeployment();

        //获取设计model
        Model designerModel = modelService.getModel("6c6bdbfd-a48e-11e9-82d7-f8f8f8f8f8f8");

        //转换成BPMN文件
        BpmnModel bpmnModel = modelService.getBpmnModel(designerModel);
        deploymentBuilder.addBpmnModel(designerModel.getKey().concat(".bpmn20.xml"), bpmnModel);


        LOGGER.info("query start");
        List<Model> informationList = modelService.getReferencedModels(designerModel.getId());
        LOGGER.info("query end");
        for (Model model : informationList) {

            LOGGER.info("formmodel = {}", ToStringBuilder.reflectionToString(model, ToStringStyle.JSON_STYLE));
            FormRepresentation formRepresentation = createFormRepresentation(model);
            LOGGER.info("formRepresentation = {}", ToStringBuilder.reflectionToString(formRepresentation, ToStringStyle.JSON_STYLE));
            deploymentBuilder.addString(model.getKey().concat(".form"),model.getModelEditorJson());
        }


        Deployment deployment = deploymentBuilder.deploy();

        ProcessDefinition def = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).singleResult();

        //挂起
        repositoryService.suspendProcessDefinitionById(def.getId());

        //修改发布状态


    }

    protected FormRepresentation createFormRepresentation(AbstractModel model) {
        SimpleFormModel formDefinition = null;
        try {
            formDefinition = objectMapper.readValue(model.getModelEditorJson(), SimpleFormModel.class);
        } catch (Exception e) {
            LOGGER.error("Error deserializing form", e);
            throw new InternalServerErrorException("Could not deserialize form definition");
        }

        FormRepresentation result = new FormRepresentation(model);
        result.setFormDefinition(formDefinition);
        return result;
    }
    
    @Test
    public void testDeleteDeployment(){

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey("leaveApproval").latestVersion().singleResult();

        Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(processDefinition.getDeploymentId()).singleResult();

        repositoryService.deleteDeployment(deployment.getId(),true);

    }

}
