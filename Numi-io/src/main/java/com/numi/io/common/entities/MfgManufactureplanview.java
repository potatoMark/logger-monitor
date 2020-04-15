package com.numi.io.common.entities;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "mfg_manufactureplanview")
public class MfgManufactureplanview implements Serializable {

    /** 制品编码 */
    @Id
    @Column(name = "entity_code")
    String entityCode;

    /** id */
    @Column(name = "id")
    Long id;

    /** 工厂编码 */
    @Column(name = "plant_code")
    String plantCode;

    /** 制造计划编码 */
    @Column(name = "manufactureplan_code")
    String manufactureplanCode;

    /** 车间编码 */
    @Column(name = "shop_code")
    String shopCode;

    /** VRN */
    @Column(name = "manufactureplan_serial")
    String manufactureplanSerial;

    /** 产品编码 */
    @Column(name = "product_code")
    String productCode;

    /** 工艺路径编码 */
    @Column(name = "technology_code")
    String technologyCode;

    /** 计划数量 */
    @Column(name = "manufactureplan_qty")
    Integer manufactureplanQty;

    /** 计划交付日期 */
    @Column(name = "manufactureplan_deliverdate")
    LocalDateTime manufactureplanDeliverdate;

    /** 生产状态 */
    @Column(name = "manufactureplan_status")
    String manufactureplanStatus;

    /** 创建时间 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 创建者 */
    @Column(name = "create_user")
    String createUser;

    /** 更新时间 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 更新者 */
    @Column(name = "update_user")
    String updateUser;

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
     * Returns the plantCode.
     * 
     * @return the plantCode
     */
    public String getPlantCode() {
        return plantCode;
    }

    /** 
     * Sets the plantCode.
     * 
     * @param plantCode the plantCode
     */
    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    /** 
     * Returns the manufactureplanCode.
     * 
     * @return the manufactureplanCode
     */
    public String getManufactureplanCode() {
        return manufactureplanCode;
    }

    /** 
     * Sets the manufactureplanCode.
     * 
     * @param manufactureplanCode the manufactureplanCode
     */
    public void setManufactureplanCode(String manufactureplanCode) {
        this.manufactureplanCode = manufactureplanCode;
    }

    /** 
     * Returns the shopCode.
     * 
     * @return the shopCode
     */
    public String getShopCode() {
        return shopCode;
    }

    /** 
     * Sets the shopCode.
     * 
     * @param shopCode the shopCode
     */
    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    /** 
     * Returns the manufactureplanSerial.
     * 
     * @return the manufactureplanSerial
     */
    public String getManufactureplanSerial() {
        return manufactureplanSerial;
    }

    /** 
     * Sets the manufactureplanSerial.
     * 
     * @param manufactureplanSerial the manufactureplanSerial
     */
    public void setManufactureplanSerial(String manufactureplanSerial) {
        this.manufactureplanSerial = manufactureplanSerial;
    }

    /** 
     * Returns the productCode.
     * 
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /** 
     * Sets the productCode.
     * 
     * @param productCode the productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /** 
     * Returns the technologyCode.
     * 
     * @return the technologyCode
     */
    public String getTechnologyCode() {
        return technologyCode;
    }

    /** 
     * Sets the technologyCode.
     * 
     * @param technologyCode the technologyCode
     */
    public void setTechnologyCode(String technologyCode) {
        this.technologyCode = technologyCode;
    }

    /** 
     * Returns the manufactureplanQty.
     * 
     * @return the manufactureplanQty
     */
    public Integer getManufactureplanQty() {
        return manufactureplanQty;
    }

    /** 
     * Sets the manufactureplanQty.
     * 
     * @param manufactureplanQty the manufactureplanQty
     */
    public void setManufactureplanQty(Integer manufactureplanQty) {
        this.manufactureplanQty = manufactureplanQty;
    }

    /** 
     * Returns the manufactureplanDeliverdate.
     * 
     * @return the manufactureplanDeliverdate
     */
    public LocalDateTime getManufactureplanDeliverdate() {
        return manufactureplanDeliverdate;
    }

    /** 
     * Sets the manufactureplanDeliverdate.
     * 
     * @param manufactureplanDeliverdate the manufactureplanDeliverdate
     */
    public void setManufactureplanDeliverdate(LocalDateTime manufactureplanDeliverdate) {
        this.manufactureplanDeliverdate = manufactureplanDeliverdate;
    }

    /** 
     * Returns the manufactureplanStatus.
     * 
     * @return the manufactureplanStatus
     */
    public String getManufactureplanStatus() {
        return manufactureplanStatus;
    }

    /** 
     * Sets the manufactureplanStatus.
     * 
     * @param manufactureplanStatus the manufactureplanStatus
     */
    public void setManufactureplanStatus(String manufactureplanStatus) {
        this.manufactureplanStatus = manufactureplanStatus;
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
}