package com.numi.io.common.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "technology_technologytpview")
public class TechnologyTechnologytpview implements Serializable {

    /** 工厂编码 */
    @Column(name = "plant_code")
    String plantCode;

    /** 工艺路径编码 */
    @Id
    @Column(name = "technology_code")
    String technologyCode;

    /** 工序编码 */
    @Column(name = "operation_code")
    String operationCode;

    /** 前序工艺工序编码 */
    @Column(name = "parent_technologyoperation")
    Long parentTechnologyoperation;

    /** TP编码 */
    @Column(name = "tp_code")
    String tpCode;

    /** TP类型 */
    @Column(name = "tp_type")
    String tpType;

    /** 多次通过 */
    @Column(name = "is_multipass")
    Integer isMultipass;

    /** 工艺工序编码 */
    @Column(name = "technologyoperation_code")
    String technologyoperationCode;

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
     * Returns the parentTechnologyoperation.
     * 
     * @return the parentTechnologyoperation
     */
    public Long getParentTechnologyoperation() {
        return parentTechnologyoperation;
    }

    /** 
     * Sets the parentTechnologyoperation.
     * 
     * @param parentTechnologyoperation the parentTechnologyoperation
     */
    public void setParentTechnologyoperation(Long parentTechnologyoperation) {
        this.parentTechnologyoperation = parentTechnologyoperation;
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
     * Returns the technologyoperationCode.
     * 
     * @return the technologyoperationCode
     */
    public String getTechnologyoperationCode() {
        return technologyoperationCode;
    }

    /** 
     * Sets the technologyoperationCode.
     * 
     * @param technologyoperationCode the technologyoperationCode
     */
    public void setTechnologyoperationCode(String technologyoperationCode) {
        this.technologyoperationCode = technologyoperationCode;
    }
}