package com.numi.io.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "mfg_manufactureplanentity")
public class MfgManufactureplanentity implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** 工厂编码 */
    @Column(name = "plant_code")
    String plantCode;

    /** 制造计划编码 */
    @Column(name = "manufactureplan_code")
    String manufactureplanCode;

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