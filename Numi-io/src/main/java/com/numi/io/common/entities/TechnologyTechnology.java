package com.numi.io.common.entities;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(name = "technology_technology")
public class TechnologyTechnology implements Serializable {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /**
     * 工厂编码
     */
    @Column(name = "plant_code")
    String plantCode;

    /**
     * 工艺路径编码
     */
    @Column(name = "technology_code")
    String technologyCode;

    /**
     * 工艺路径名称
     */
    @Column(name = "technology_name")
    String technologyName;

    /**
     * 工艺模式
     */
    @Column(name = "technology_type")
    Integer technologyType;

    /**
     *
     */
    @Column(name = "technology_global_default")
    String technologyGlobalDefault;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /**
     * 创建者
     */
    @Column(name = "create_user")
    String createUser;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /**
     * 更新者
     */
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
     * Returns the technologyName.
     *
     * @return the technologyName
     */
    public String getTechnologyName() {
        return technologyName;
    }

    /**
     * Sets the technologyName.
     *
     * @param technologyName the technologyName
     */
    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    /**
     * Returns the technologyType.
     *
     * @return the technologyType
     */
    public Integer getTechnologyType() {
        return technologyType;
    }

    /**
     * Sets the technologyType.
     *
     * @param technologyType the technologyType
     */
    public void setTechnologyType(Integer technologyType) {
        this.technologyType = technologyType;
    }

    /**
     * Returns the technologyGlobalDefault.
     *
     * @return the technologyGlobalDefault
     */
    public String getTechnologyGlobalDefault() {
        return technologyGlobalDefault;
    }

    /**
     * Sets the technologyGlobalDefault.
     *
     * @param technologyGlobalDefault the technologyGlobalDefault
     */
    public void setTechnologyGlobalDefault(String technologyGlobalDefault) {
        this.technologyGlobalDefault = technologyGlobalDefault;
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