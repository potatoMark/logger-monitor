package com.numi.io.common.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_vmacs_mfgplan")
public class BrVmacsMfgplan implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "plant_code")
    String plantCode;

    /**  */
    @Column(name = "order_id")
    String orderId;

    /**  */
    @Column(name = "vin")
    String vin;

    /**  */
    @Column(name = "vehiche_status")
    String vehicheStatus;

    /**  */
    @Column(name = "trigger_time")
    String triggerTime;

    /**  */
    @Column(name = "dms_order")
    String dmsOrder;

    /**  */
    @Column(name = "assembly_time")
    String assemblyTime;

    /**  */
    @Column(name = "plan_create")
    String planCreate;

    /**  */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /**  */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /**  */
    @Column(name = "create_user")
    String createUser;

    /**  */
    @Column(name = "update_suer")
    String updateSuer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicheStatus() {
        return vehicheStatus;
    }

    public void setVehicheStatus(String vehicheStatus) {
        this.vehicheStatus = vehicheStatus;
    }
    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getDmsOrder() {
        return dmsOrder;
    }

    public void setDmsOrder(String dmsOrder) {
        this.dmsOrder = dmsOrder;
    }

    public String getAssemblyTime() {
        return assemblyTime;
    }
    public void setAssemblyTime(String assemblyTime) {
        this.assemblyTime = assemblyTime;
    }

    public String getPlanCreate() {
        return planCreate;
    }

    public void setPlanCreate(String planCreate) {
        this.planCreate = planCreate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateSuer() {
        return updateSuer;
    }

    public void setUpdateSuer(String updateSuer) {
        this.updateSuer = updateSuer;
    }
}