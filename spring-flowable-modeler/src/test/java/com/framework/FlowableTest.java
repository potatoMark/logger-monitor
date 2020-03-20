package com.framework;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.flowable.engine.FormService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlowableTest {

	private static final Logger logger = LoggerFactory.getLogger(FlowableTest.class);

	@Autowired
	RuntimeService runtimeService;

	@Autowired
	RepositoryService repositoryService;

	@Autowired
	TaskService taskService;

	@Autowired
	FormService formService;


	@Test
	public void testLeaveApproval(){

		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey("myProcess").singleResult();

		logger.info("processDefinition = {}", ToStringBuilder.reflectionToString(processDefinition, ToStringStyle.JSON_STYLE));


		ProcessInstance processInstance = runtimeService.startProcessInstanceById(processDefinition.getId());


		Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();

		logger.info("task.name = {}",task.getName());

		taskService.complete(task.getId());

	}
}
