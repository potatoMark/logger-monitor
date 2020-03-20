package com.numi.io.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "mfg_entityactual")
public class MfgEntityactual implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** catalog型号编码 */
    @Column(name = "catalogmodel_code")
    String catalogmodelCode;

    /** catalog配置编码 */
    @Column(name = "catalogoption_code")
    String catalogoptionCode;

    /** catalog颜色编码 */
    @Column(name = "catalogcolor_code")
    String catalogcolorCode;

    /** 产品编码 */
    @Column(name = "product_code")
    String productCode;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** 工厂编码 */
    @Column(name = "plant_code")
    String plantCode;

    /** 车间编码 */
    @Column(name = "shop_code")
    String shopCode;

    /** 域编码 */
    @Column(name = "zone_code")
    String zoneCode;

    /** 产线编码 */
    @Column(name = "line_code")
    String lineCode;

    /** 工艺工序编码 */
    @Column(name = "technologyoperation_code")
    String technologyoperationCode;

    /** 型号编码 */
    @Column(name = "operation_code")
    String operationCode;

    /** TP编码 */
    @Column(name = "operation_tp")
    String operationTp;

    /** TP类型 */
    @Column(name = "operation_type")
    String operationType;

    /** 通过次数 */
    @Column(name = "entityactual_passcnt")
    Integer entityactualPasscnt;

    /** 实际通过自然日历时间 */
    @Column(name = "entityactual_act_passtime")
    LocalDateTime entityactualActPasstime;

    /** 实际通过工作日历时间 */
    @Column(name = "entityactual_act_passwktime")
    LocalDateTime entityactualActPasswktime;

    /** 工作班次 */
    @Column(name = "entityactual_shiftcode")
    String entityactualShiftcode;

    /** 生产结束标识 */
    @Column(name = "entityactual_isfinished")
    String entityactualIsfinished;

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
     * Returns the catalogmodelCode.
     * 
     * @return the catalogmodelCode
     */
    public String getCatalogmodelCode() {
        return catalogmodelCode;
    }

    /** 
     * Sets the catalogmodelCode.
     * 
     * @param catalogmodelCode the catalogmodelCode
     */
    public void setCatalogmodelCode(String catalogmodelCode) {
        this.catalogmodelCode = catalogmodelCode;
    }

    /** 
     * Returns the catalogoptionCode.
     * 
     * @return the catalogoptionCode
     */
    public String getCatalogoptionCode() {
        return catalogoptionCode;
    }

    /** 
     * Sets the catalogoptionCode.
     * 
     * @param catalogoptionCode the catalogoptionCode
     */
    public void setCatalogoptionCode(String catalogoptionCode) {
        this.catalogoptionCode = catalogoptionCode;
    }

    /** 
     * Returns the catalogcolorCode.
     * 
     * @return the catalogcolorCode
     */
    public String getCatalogcolorCode() {
        return catalogcolorCode;
    }

    /** 
     * Sets the catalogcolorCode.
     * 
     * @param catalogcolorCode the catalogcolorCode
     */
    public void setCatalogcolorCode(String catalogcolorCode) {
        this.catalogcolorCode = catalogcolorCode;
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
     * Returns the zoneCode.
     * 
     * @return the zoneCode
     */
    public String getZoneCode() {
        return zoneCode;
    }

    /** 
     * Sets the zoneCode.
     * 
     * @param zoneCode the zoneCode
     */
    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    /** 
     * Returns the lineCode.
     * 
     * @return the lineCode
     */
    public String getLineCode() {
        return lineCode;
    }

    /** 
     * Sets the lineCode.
     * 
     * @param lineCode the lineCode
     */
    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
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
     * Returns the operationTp.
     * 
     * @return the operationTp
     */
    public String getOperationTp() {
        return operationTp;
    }

    /** 
     * Sets the operationTp.
     * 
     * @param operationTp the operationTp
     */
    public void setOperationTp(String operationTp) {
        this.operationTp = operationTp;
    }

    /** 
     * Returns the operationType.
     * 
     * @return the operationType
     */
    public String getOperationType() {
        return operationType;
    }

    /** 
     * Sets the operationType.
     * 
     * @param operationType the operationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /** 
     * Returns the entityactualPasscnt.
     * 
     * @return the entityactualPasscnt
     */
    public Integer getEntityactualPasscnt() {
        return entityactualPasscnt;
    }

    /** 
     * Sets the entityactualPasscnt.
     * 
     * @param entityactualPasscnt the entityactualPasscnt
     */
    public void setEntityactualPasscnt(Integer entityactualPasscnt) {
        this.entityactualPasscnt = entityactualPasscnt;
    }

    /** 
     * Returns the entityactualActPasstime.
     * 
     * @return the entityactualActPasstime
     */
    public LocalDateTime getEntityactualActPasstime() {
        return entityactualActPasstime;
    }

    /** 
     * Sets the entityactualActPasstime.
     * 
     * @param entityactualActPasstime the entityactualActPasstime
     */
    public void setEntityactualActPasstime(LocalDateTime entityactualActPasstime) {
        this.entityactualActPasstime = entityactualActPasstime;
    }

    /** 
     * Returns the entityactualActPasswktime.
     * 
     * @return the entityactualActPasswktime
     */
    public LocalDateTime getEntityactualActPasswktime() {
        return entityactualActPasswktime;
    }

    /** 
     * Sets the entityactualActPasswktime.
     * 
     * @param entityactualActPasswktime the entityactualActPasswktime
     */
    public void setEntityactualActPasswktime(LocalDateTime entityactualActPasswktime) {
        this.entityactualActPasswktime = entityactualActPasswktime;
    }

    /** 
     * Returns the entityactualShiftcode.
     * 
     * @return the entityactualShiftcode
     */
    public String getEntityactualShiftcode() {
        return entityactualShiftcode;
    }

    /** 
     * Sets the entityactualShiftcode.
     * 
     * @param entityactualShiftcode the entityactualShiftcode
     */
    public void setEntityactualShiftcode(String entityactualShiftcode) {
        this.entityactualShiftcode = entityactualShiftcode;
    }

    /** 
     * Returns the entityactualIsfinished.
     * 
     * @return the entityactualIsfinished
     */
    public String getEntityactualIsfinished() {
        return entityactualIsfinished;
    }

    /** 
     * Sets the entityactualIsfinished.
     * 
     * @param entityactualIsfinished the entityactualIsfinished
     */
    public void setEntityactualIsfinished(String entityactualIsfinished) {
        this.entityactualIsfinished = entityactualIsfinished;
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