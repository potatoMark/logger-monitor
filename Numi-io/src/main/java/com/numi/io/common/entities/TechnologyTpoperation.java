package com.numi.io.common.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "technology_tpoperation")
public class TechnologyTpoperation implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 工厂编码 */
    @Column(name = "plant_code")
    String plantCode;

    /** 工艺路径编码 */
    @Column(name = "technology_code")
    String technologyCode;

    /** 工序编码 */
    @Column(name = "operation_code")
    String operationCode;

    /** TP编码 */
    @Column(name = "tp_code")
    String tpCode;

    /** TP类型 */
    @Column(name = "tp_type")
    String tpType;

    /** 多次通过 */
    @Column(name = "is_multipass")
    Integer isMultipass;

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
     * Returns the operationCode.
     * 
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /** 
     * Sets the operationCode.
     * 
     * @param operationCode the operationCode
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /** 
     * Returns the tpCode.
     * 
     * @return the tpCode
     */
    public String getTpCode() {
        return tpCode;
    }

    /** 
     * Sets the tpCode.
     * 
     * @param tpCode the tpCode
     */
    public void setTpCode(String tpCode) {
        this.tpCode = tpCode;
    }

    /** 
     * Returns the tpType.
     * 
     * @return the tpType
     */
    public String getTpType() {
        return tpType;
    }

    /** 
     * Sets the tpType.
     * 
     * @param tpType the tpType
     */
    public void setTpType(String tpType) {
        this.tpType = tpType;
    }

    /** 
     * Returns the isMultipass.
     * 
     * @return the isMultipass
     */
    public Integer getIsMultipass() {
        return isMultipass;
    }

    /** 
     * Sets the isMultipass.
     * 
     * @param isMultipass the isMultipass
     */
    public void setIsMultipass(Integer isMultipass) {
        this.isMultipass = isMultipass;
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