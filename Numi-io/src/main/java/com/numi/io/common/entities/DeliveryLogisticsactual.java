package com.numi.io.common.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "delivery_logisticsactual")
public class DeliveryLogisticsactual implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** 发运计划编码 */
    @Column(name = "deliveryplan_code")
    String deliveryplanCode;

    /** 实际路线编码 */
    @Column(name = "route_code")
    String routeCode;

    /** 过站TP */
    @Column(name = "logisticsactual_tpcode")
    String logisticsactualTpcode;

    /** 过站时间 */
    @Column(name = "logisticsactual_passtime")
    LocalDateTime logisticsactualPasstime;

    /** 过站次数 */
    @Column(name = "logisticsactual_passcount")
    Integer logisticsactualPasscount;

    /** 创建时间 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 创建者 */
    @Column(name = "create_user")
    String createUser;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * Returns the entityCode.
     * 
     * @return the entityCode
     */
    public String getEntityCode() {
        return entityCode;
    }

    /** 
     * Sets the entityCode.
     * 
     * @param entityCode the entityCode
     */
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    /** 
     * Returns the deliveryplanCode.
     * 
     * @return the deliveryplanCode
     */
    public String getDeliveryplanCode() {
        return deliveryplanCode;
    }

    /** 
     * Sets the deliveryplanCode.
     * 
     * @param deliveryplanCode the deliveryplanCode
     */
    public void setDeliveryplanCode(String deliveryplanCode) {
        this.deliveryplanCode = deliveryplanCode;
    }

    /** 
     * Returns the routeCode.
     * 
     * @return the routeCode
     */
    public String getRouteCode() {
        return routeCode;
    }

    /** 
     * Sets the routeCode.
     * 
     * @param routeCode the routeCode
     */
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    /** 
     * Returns the logisticsactualTpcode.
     * 
     * @return the logisticsactualTpcode
     */
    public String getLogisticsactualTpcode() {
        return logisticsactualTpcode;
    }

    /** 
     * Sets the logisticsactualTpcode.
     * 
     * @param logisticsactualTpcode the logisticsactualTpcode
     */
    public void setLogisticsactualTpcode(String logisticsactualTpcode) {
        this.logisticsactualTpcode = logisticsactualTpcode;
    }

    /** 
     * Returns the logisticsactualPasstime.
     * 
     * @return the logisticsactualPasstime
     */
    public LocalDateTime getLogisticsactualPasstime() {
        return logisticsactualPasstime;
    }

    /** 
     * Sets the logisticsactualPasstime.
     * 
     * @param logisticsactualPasstime the logisticsactualPasstime
     */
    public void setLogisticsactualPasstime(LocalDateTime logisticsactualPasstime) {
        this.logisticsactualPasstime = logisticsactualPasstime;
    }

    /** 
     * Returns the logisticsactualPasscount.
     * 
     * @return the logisticsactualPasscount
     */
    public Integer getLogisticsactualPasscount() {
        return logisticsactualPasscount;
    }

    /** 
     * Sets the logisticsactualPasscount.
     * 
     * @param logisticsactualPasscount the logisticsactualPasscount
     */
    public void setLogisticsactualPasscount(Integer logisticsactualPasscount) {
        this.logisticsactualPasscount = logisticsactualPasscount;
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