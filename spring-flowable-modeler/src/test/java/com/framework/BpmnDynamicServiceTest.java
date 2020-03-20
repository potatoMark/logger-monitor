package com.framework;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.framework.configration.domain.Model;
import com.framework.serviceapi.ModelService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;
import org.flowable.engine.*;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BpmnDynamicServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(BpmnDynamicServiceTest.class);

	@Autowired
	RuntimeService runtimeService;

	@Autowired
	RepositoryService repositoryService;

	@Autowired
	TaskService taskService;

	@Autowired
	FormService formService;

	@Autowired
	DynamicBpmnService dynamicBpmnService;

	@Autowired
	ModelService modelService;



	protected BpmnJsonConverter bpmnJsonConverter = new BpmnJsonConverter();


	@Test
	public void testDynamicBpmn(){

		Model designerModel = modelService.getModel("ba04567a-a486-11e9-9b2f-f8f8f8f8f8f8");
		BpmnModel bpmnModel = modelService.getBpmnModel(designerModel);
		ObjectNode objectNode = bpmnJsonConverter.convertToJson(bpmnModel);

	}
}
