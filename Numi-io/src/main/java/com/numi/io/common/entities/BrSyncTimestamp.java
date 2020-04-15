package com.numi.io.common.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_sync_timestamp")
public class BrSyncTimestamp implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "code")
    String code;

    /**  */
    @Column(name = "sync_time")
    LocalDateTime syncTime;

    /**  */
    @Column(name = "class_name")
    String className;

    /**  */
    @Column(name = "params")
    String params;

    /**  */
    @Column(name = "cron_expression")
    String cronExpression;

    /** 任务运行状态 */
    @Column(name = "job_status")
    String jobStatus;

    /** 业务执行状态 */
    @Column(name = "runtime_status")
    String runtimeStatus;

    /**  */
    @Column(name = "remark")
    String remark;

    /**  */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /**  */
    @Column(name = "update_user")
    String updateUser;

    /**  */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /**  */
    @Column(name = "create_user")
    String createUser;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the code.
     * 
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /** 
     * Sets the code.
     * 
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Returns the syncTime.
     * 
     * @return the syncTime
     */
    public LocalDateTime getSyncTime() {
        return syncTime;
    }

    /** 
     * Sets the syncTime.
     * 
     * @param syncTime the syncTime
     */
    public void setSyncTime(LocalDateTime syncTime) {
        this.syncTime = syncTime;
    }

    /** 
     * Returns the className.
     * 
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /** 
     * Sets the className.
     * 
     * @param className the className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /** 
     * Returns the params.
     * 
     * @return the params
     */
    public String getParams() {
        return params;
    }

    /** 
     * Sets the params.
     * 
     * @param params the params
     */
    public void setParams(String params) {
        this.params = params;
    }

    /** 
     * Returns the cronExpression.
     * 
     * @return the cronExpression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /** 
     * Sets the cronExpression.
     * 
     * @param cronExpression the cronExpression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /** 
     * Returns the jobStatus.
     * 
     * @return the jobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /** 
     * Sets the jobStatus.
     * 
     * @param jobStatus the jobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /** 
     * Returns the runtimeStatus.
     * 
     * @return the runtimeStatus
     */
    public String getRuntimeStatus() {
        return runtimeStatus;
    }

    /** 
     * Sets the runtimeStatus.
     * 
     * @param runtimeStatus the runtimeStatus
     */
    public void setRuntimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
    }

    /** 
     * Returns the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Sets the remark.
     * 
     * @param remark the remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /** 
     * Returns the updateUser.
     * 
     * @return the updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /** 
     * Sets the updateUser.
     * 
     * @param updateUser the updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /** 
     * Returns the createUser.
     * 
     * @return the createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    /** 
     * Sets the createUser.
     * 
     * @param createUser the createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}