package com.numi.io.common.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_boundarymanage")
public class BrBoundarymanage implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "code")
    String code;

    /**  */
    @Column(name = "name")
    String name;

    /**  */
    @Column(name = "boundary_status")
    String boundaryStatus;// 0未同步 1开始同步 2同步完成 3同步失败

    /**  */
    @Column(name = "transaction_id")
    String transactionId;

    /**  */
    @Column(name = "receive_total")
    String receiveTotal;

    /**  */
    @Column(name = "receive_starttime")
    String receiveStarttime;

    /**  */
    @Column(name = "receive_endtime")
    String receiveEndtime;

    /**  */
    @Column(name = "reply_code")
    String replyCode;

    /**  */
    @Column(name = "reply_content")
    String replyContent;

    /**  */
    @Column(name = "remark")
    String remark;

    /**  */
    @Column(name = "component_json")
    String componentJson;

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
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the boundaryStatus.
     * 
     * @return the boundaryStatus
     */
    public String getBoundaryStatus() {
        return boundaryStatus;
    }

    /** 
     * Sets the boundaryStatus.
     * 
     * @param boundaryStatus the boundaryStatus
     */
    public void setBoundaryStatus(String boundaryStatus) {
        this.boundaryStatus = boundaryStatus;
    }

    /** 
     * Returns the transactionId.
     * 
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /** 
     * Sets the transactionId.
     * 
     * @param transactionId the transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /** 
     * Returns the receiveTotal.
     * 
     * @return the receiveTotal
     */
    public String getReceiveTotal() {
        return receiveTotal;
    }

    /** 
     * Sets the receiveTotal.
     * 
     * @param receiveTotal the receiveTotal
     */
    public void setReceiveTotal(String receiveTotal) {
        this.receiveTotal = receiveTotal;
    }

    /** 
     * Returns the receiveStarttime.
     * 
     * @return the receiveStarttime
     */
    public String getReceiveStarttime() {
        return receiveStarttime;
    }

    /** 
     * Sets the receiveStarttime.
     * 
     * @param receiveStarttime the receiveStarttime
     */
    public void setReceiveStarttime(String receiveStarttime) {
        this.receiveStarttime = receiveStarttime;
    }

    /** 
     * Returns the receiveEndtime.
     * 
     * @return the receiveEndtime
     */
    public String getReceiveEndtime() {
        return receiveEndtime;
    }

    /** 
     * Sets the receiveEndtime.
     * 
     * @param receiveEndtime the receiveEndtime
     */
    public void setReceiveEndtime(String receiveEndtime) {
        this.receiveEndtime = receiveEndtime;
    }

    /** 
     * Returns the replyCode.
     * 
     * @return the replyCode
     */
    public String getReplyCode() {
        return replyCode;
    }

    /** 
     * Sets the replyCode.
     * 
     * @param replyCode the replyCode
     */
    public void setReplyCode(String replyCode) {
        this.replyCode = replyCode;
    }

    /** 
     * Returns the replyContent.
     * 
     * @return the replyContent
     */
    public String getReplyContent() {
        return replyContent;
    }

    /** 
     * Sets the replyContent.
     * 
     * @param replyContent the replyContent
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
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
     * Returns the componentJson.
     * 
     * @return the componentJson
     */
    public String getComponentJson() {
        return componentJson;
    }

    /** 
     * Sets the componentJson.
     * 
     * @param componentJson the componentJson
     */
    public void setComponentJson(String componentJson) {
        this.componentJson = componentJson;
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