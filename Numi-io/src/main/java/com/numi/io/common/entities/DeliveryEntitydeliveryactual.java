package com.numi.io.common.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "delivery_entitydeliveryactual")
public class DeliveryEntitydeliveryactual implements Serializable {

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
    @Column(name = "deliveryactual_tpcode")
    String deliveryactualTpcode;

    /** 过站时间 */
    @Column(name = "deliveryactual_passtime")
    LocalDateTime deliveryactualPasstime;

    /** 过站次数 */
    @Column(name = "deliveryactual_passcount")
    Integer deliveryactualPasscount;

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
     * Returns the deliveryactualTpcode.
     * 
     * @return the deliveryactualTpcode
     */
    public String getDeliveryactualTpcode() {
        return deliveryactualTpcode;
    }

    /** 
     * Sets the deliveryactualTpcode.
     * 
     * @param deliveryactualTpcode the deliveryactualTpcode
     */
    public void setDeliveryactualTpcode(String deliveryactualTpcode) {
        this.deliveryactualTpcode = deliveryactualTpcode;
    }

    /** 
     * Returns the deliveryactualPasstime.
     * 
     * @return the deliveryactualPasstime
     */
    public LocalDateTime getDeliveryactualPasstime() {
        return deliveryactualPasstime;
    }

    /** 
     * Sets the deliveryactualPasstime.
     * 
     * @param deliveryactualPasstime the deliveryactualPasstime
     */
    public void setDeliveryactualPasstime(LocalDateTime deliveryactualPasstime) {
        this.deliveryactualPasstime = deliveryactualPasstime;
    }

    /** 
     * Returns the deliveryactualPasscount.
     * 
     * @return the deliveryactualPasscount
     */
    public Integer getDeliveryactualPasscount() {
        return deliveryactualPasscount;
    }

    /** 
     * Sets the deliveryactualPasscount.
     * 
     * @param deliveryactualPasscount the deliveryactualPasscount
     */
    public void setDeliveryactualPasscount(Integer deliveryactualPasscount) {
        this.deliveryactualPasscount = deliveryactualPasscount;
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