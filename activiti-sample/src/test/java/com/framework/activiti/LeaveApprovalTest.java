package com.framework.activiti;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.Process;
import org.activiti.engine.*;
import org.activiti.engine.history.*;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceBuilder;
import org.activiti.engine.task.Task;
import org.activiti.image.ProcessDiagramGenerator;
import org.activiti.image.impl.DefaultProcessDiagramGenerator;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveApprovalTest {

    private static final Logger logger = LoggerFactory.getLogger(LeaveApprovalTest.class);

    @Autowired
    ProcessEngine processEngine;

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    TaskService taskService;

    @Autowired
    RepositoryService repositoryService;

    @Autowired
    FormService formService;

    @Autowired
    HistoryService historyService;

    @Autowired
    IdentityService identityService;

    @Test
    public void test1() throws Exception {

        //设置用户信息
        identityService.setAuthenticatedUserId("Mark");

        initialIdentity();

        //设置startForm的属性
        ProcessDefinition processDefinition = repositoryService
                .createProcessDefinitionQuery()
                .processDefinitionKey("leaveProcess")
                .latestVersion()
                .singleResult();

        logger.info("获取到流程定义, processDefinition.name = {}, processDefinition.id = {}", processDefinition.getName(), processDefinition.getId());
        Object renderedStartForm = formService.getRenderedStartForm(processDefinition.getId());

        logger.info("获取到开始表单,renderedStartForm = {}", renderedStartForm.toString());

        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinition.getId());

        Process process = bpmnModel.getProcessById(processDefinition.getKey());


        //生产流程定义图
        gernateProcessImage(processDefinition);

        //启动流程
        Map<String, String> variables = Maps.newHashMap(); // 模拟画面输入
        variables.put("leaveType", "公休");
        variables.put("startTime", "2019/06/20 08:00:00");
        variables.put("endTime", "2019/06/25 20:00:00");
        variables.put("reason", "请假原因1,2,3,4,5;但是1,2,3,4,5;而且1,2,3,4,5");
        variables.put("applyUserId", "Mark");
        ProcessInstance processInstance = formService.submitStartFormData(processDefinition.getId(), variables);

        logger.info("流程启动成功,processInstance = {}", ToStringBuilder.reflectionToString(processInstance, ToStringStyle.JSON_STYLE));
        //获取Task 会签阶段
        Task task = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateUser("leader1")// 用户名为leader1
                .taskCandidateGroup("leaderGroup2")// 或者用户组为leadGroup2
                .singleResult();

        //获取TaskForm
        taskService.claim(task.getId(), "leader1"); // 设置 办理
        Object renderedTaskForm = formService.getRenderedTaskForm(task.getId());

        logger.info("获取到用户表单,renderedTaskForm = {}", renderedTaskForm.toString());

        //生产领导审批流程节点图片
        generateUserTaskImage(bpmnModel, process, task, "leader");

        //执行 领导审批
        Map<String, String> vars = Maps.newHashMap();
        vars.put("leaderResult", "agree");// 执行同意操作
        vars.put("key1","value_1");

        vars.put("key2","value_2");
        runtimeService.setVariable(task.getExecutionId(),"key3","value_3");
        runtimeService.setVariableLocal(task.getExecutionId(),"key4","value_4");
        formService.submitTaskFormData(task.getId(), vars);


        Task taskhr = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateUser("hr1")// hr1
                .taskCandidateGroup("hrGroup1")// 或者用户组为hrGroup1
                .singleResult();

        Object renderedTaskForm1 = formService.getRenderedTaskForm(taskhr.getId());
        logger.info("获取到用户表单,renderedTaskForm1 = {}", renderedTaskForm1.toString());

        //生成HR审批流程节点图片
        generateUserTaskImage(bpmnModel, process, taskhr, "hr");

        Map<String, String> hrVars = Maps.newHashMap();
        hrVars.put("hrResult", "true");// 执行同意操作
        hrVars.put("hrBackReason","None");

        formService.submitTaskFormData(taskhr.getId(), hrVars);
    }

    @Test
    public void test2() throws Exception {

        //设置startForm的属性
        ProcessDefinition processDefinition = repositoryService
                .createProcessDefinitionQuery()
                .processDefinitionKey("leaveProcess")
                .latestVersion()
                .singleResult();


        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinition.getId());

        Process process = bpmnModel.getProcessById(processDefinition.getKey());

        //查看下一步Task
        Task taskHr = taskService.createTaskQuery()
//                .processInstanceId(processInstance.getId())
                .taskCandidateUser("hr1")// 用户名为hr1
                .taskCandidateGroup("hrGroup1")// 或者用户组为hrGroup1
                .singleResult();

        //会签阶段
        taskService.claim(taskHr.getId(), "hr1");

        Map<String, Object> variables2 = runtimeService.getVariables(taskHr.getExecutionId());
        Map<String, Object> variablesLocal = runtimeService.getVariablesLocal(taskHr.getExecutionId());

        //生产HR图片
        generateUserTaskImage(bpmnModel, process, taskHr, "hr");
        //执行 HR审批
        Map<String, String> variables1 = Maps.newHashMap();
        variables1.put("hrResult", "agree");
        formService.submitTaskFormData(taskHr.getId(), variables1);

    }

    @Test
    public void testLeaveProcess() throws Exception {

        //设置用户信息
        identityService.setAuthenticatedUserId("Mark");

        initialIdentity();

        //设置startForm的属性
        ProcessDefinition processDefinition = repositoryService
                .createProcessDefinitionQuery()
                .processDefinitionKey("leaveProcess")
                .latestVersion()
                .singleResult();

        logger.info("获取到流程定义, processDefinition.name = {}, processDefinition.id = {}", processDefinition.getName(), processDefinition.getId());
        Object renderedStartForm = formService.getRenderedStartForm(processDefinition.getId());

        logger.info("获取到开始表单,renderedStartForm = {}", renderedStartForm.toString());

        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinition.getId());

        Process process = bpmnModel.getProcessById(processDefinition.getKey());


        //生产流程定义图
        gernateProcessImage(processDefinition);

        //启动流程
        Map<String, String> variables = Maps.newHashMap(); // 模拟画面输入
        variables.put("leaveType", "公休");
        variables.put("startTime", "2019/06/20 08:00:00");
        variables.put("endTime", "2019/06/25 20:00:00");
        variables.put("reason", "请假原因1,2,3,4,5;但是1,2,3,4,5;而且1,2,3,4,5");
        variables.put("applyUserId", "Mark");
        ProcessInstance processInstance = formService.submitStartFormData(processDefinition.getId(), variables);

        logger.info("流程启动成功,processInstance = {}", ToStringBuilder.reflectionToString(processInstance, ToStringStyle.JSON_STYLE));
        //获取Task 会签阶段
        Task task = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateUser("leader1")// 用户名为leader1
                .taskCandidateGroup("leaderGroup2")// 或者用户组为leadGroup2
                .singleResult();

        //获取TaskForm
        taskService.claim(task.getId(), "leader1"); // 设置 办理
        Object renderedTaskForm = formService.getRenderedTaskForm(task.getId());

        logger.info("获取到用户表单,renderedTaskForm = {}", renderedTaskForm.toString());

        //生产领导审批流程节点图片
        generateUserTaskImage(bpmnModel, process, task, "leader");

        //执行 领导审批
        Map<String, String> vars = Maps.newHashMap();
        vars.put("leaderResult", "agree");// 执行同意操作
        vars.put("key1","value_1");

        vars.put("key2","value_2");
        runtimeService.setVariable(task.getExecutionId(),"key3","value_3");
        runtimeService.setVariableLocal(task.getExecutionId(),"key4","value_4");
        formService.submitTaskFormData(task.getId(), vars);

        //查看下一步Task
        Task taskHr = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateUser("hr1")// 用户名为hr1
                .taskCandidateGroup("hrGroup1")// 或者用户组为hrGroup1
                .singleResult();

        //会签阶段
        taskService.claim(taskHr.getId(), "hr1");

        Map<String, Object> variables2 = runtimeService.getVariables(taskHr.getExecutionId());
        Map<String, Object> variablesLocal = runtimeService.getVariablesLocal(taskHr.getExecutionId());

        //生产HR图片
        generateUserTaskImage(bpmnModel, process, taskHr, "hr");
        //执行 HR审批
        Map<String, String> variables1 = Maps.newHashMap();
        variables1.put("hrResult", "agree");
        formService.submitTaskFormData(taskHr.getId(), variables1);

        //判断当前流程是否执行完成
        List<Task> taskList = taskService.createTaskQuery()
                .processInstanceId(processInstance.getProcessInstanceId())
                .listPage(0, 100);

        logger.info("目前还剩余{}个task任务待执行", taskList.size());

        //查询历史记录信息
        List<HistoricProcessInstance> historicProcessInstances = historyService.createHistoricProcessInstanceQuery().startedBy("Mark").list();
        for (HistoricProcessInstance historicProcessInstance : historicProcessInstances) {
            logger.info("流程实例历史记录,historicProcessInstance = {}", ToStringBuilder.reflectionToString(historicProcessInstance, ToStringStyle.JSON_STYLE));
        }
        //
        List<HistoricActivityInstance> list = historyService
                .createHistoricActivityInstanceQuery()
                .processInstanceId(historicProcessInstances.get(0).getId())
                .listPage(0,100);

        for (HistoricActivityInstance historicActivityInstance : list) {
            logger.info("查询指定流程实例对应的所有节点操作履历,historicActivityInstance = {}", ToStringBuilder.reflectionToString(historicActivityInstance, ToStringStyle.JSON_STYLE));
        }

        //
        List<HistoricTaskInstance> historicTaskInstanceList = historyService.createHistoricTaskInstanceQuery()
                .processInstanceId(historicProcessInstances.get(0).getId())
                .listPage(0, 100);

        for (HistoricTaskInstance historicTaskInstance : historicTaskInstanceList) {
            logger.info("查询流程实例对应所有和UserTask相关的操作履历historicTaskInstance = {}", ToStringBuilder.reflectionToString(historicTaskInstance,ToStringStyle.JSON_STYLE));
        }

        //
        List<HistoricDetail> historicDetailList = historyService.createHistoricDetailQuery()
                .processInstanceId(historicProcessInstances.get(0).getId())
                .listPage(0, 100);

        for (HistoricDetail historicDetail : historicDetailList) {
            logger.info("查询流程实例对应的所有与Form相关的参数信息,historicDetail = {}",ToStringBuilder.reflectionToString(historicDetail,ToStringStyle.JSON_STYLE));
        }

        List<HistoricVariableInstance> historicVariableInstanceList = historyService.createHistoricVariableInstanceQuery()
                .processInstanceId(historicProcessInstances.get(0).getId())
                .listPage(0, 100);
        for (HistoricVariableInstance historicVariableInstance : historicVariableInstanceList) {
            logger.info("查询流程实例所有的参数信息historicVariableInstance = {}",ToStringBuilder.reflectionToString(historicVariableInstance,ToStringStyle.JSON_STYLE));
        }
        ProcessInstanceHistoryLog processInstanceHistoryLog = historyService.createProcessInstanceHistoryLogQuery(processInstance.getId())
                .includeActivities()
                .includeComments()
                .includeFormProperties()
                .includeTasks()
                .includeVariables()
                .includeVariableUpdates()
                .singleResult();

        logger.info("流程执行履历查询, processInstanceHistoryLog = {}",ToStringBuilder.reflectionToString(processInstanceHistoryLog,ToStringStyle.JSON_STYLE));


    }

    private void initialIdentity() {
        User mark = identityService.newUser("Mark");
        identityService.saveUser(mark);

        User leader1 = identityService.newUser("leader1");
        User leader2 = identityService.newUser("leader2");
        identityService.saveUser(leader1);
        identityService.saveUser(leader2);

        Group leaderGroup1 = identityService.newGroup("leaderGroup1");

        identityService.saveGroup(leaderGroup1);

        identityService.createMembership(leader1.getId(), leaderGroup1.getId());
        identityService.createMembership(leader2.getId(), leaderGroup1.getId());


        User hr1 = identityService.newUser("hr1");
        identityService.saveUser(hr1);

        Group hrGroup1 = identityService.newGroup("hrGroup1");
        identityService.saveGroup(hrGroup1);

        identityService.createMembership(hr1.getId(), hrGroup1.getId());
    }

    private void generateUserTaskImage(BpmnModel bpmnModel, Process process, Task task, String name) throws IOException {
        FlowElement flowElement = process.getFlowElement(task.getTaskDefinitionKey());
        DefaultProcessDiagramGenerator generator = new DefaultProcessDiagramGenerator();
        List<String> highLightedActivities = Lists.newArrayList();
        highLightedActivities.add(flowElement.getId());

        InputStream inputStream = generator.generateDiagram(bpmnModel, "png", highLightedActivities, Collections.emptyList(), "宋体", "宋体", "宋体", null, 2.0);
        FileOutputStream fos = new FileOutputStream(name.concat(".png"));
        IOUtils.copy(inputStream, fos);
        inputStream.close();
        fos.close();
    }

    private void gernateProcessImage(ProcessDefinition processDefinition) throws IOException {
        InputStream inputStream = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(), processDefinition.getDiagramResourceName());
        FileOutputStream fos = new FileOutputStream("all.png");

        IOUtils.copy(inputStream, fos);
        inputStream.close();
        fos.close();
    }
}
