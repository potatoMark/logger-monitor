package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 制品工序周期表
 */
@Entity
@Table(name = "mfg_entityoperationcycle")
public class MfgEntityoperationcycle implements Serializable {

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

    /** 工艺工序编码 */
    @Column(name = "operation_code")
    String operationCode;

    /** 开始tp */
    @Column(name = "operationactual_tpin")
    String operationactualTpin;

    /** 实际开始时间 */
    @Column(name = "operationactual_actstarttime")
    LocalDateTime operationactualActstarttime;

    /** 实际开始工作日历时间 */
    @Column(name = "operationactual_actstartworktime")
    LocalDateTime operationactualActstartworktime;

    /** 开始工作班次 */
    @Column(name = "operationactual_actstartshift")
    String operationactualActstartshift;

    /** 结束tp */
    @Column(name = "operationactual_tpout")
    String operationactualTpout;

    /** 实际结束时间 */
    @Column(name = "operationactual_actendtime")
    LocalDateTime operationactualActendtime;

    /** 实际结束工作日历时间 */
    @Column(name = "operationactual_actendworktime")
    LocalDateTime operationactualActendworktime;

    /** 结束工作班次 */
    @Column(name = "operationactual_actendshift")
    String operationactualActendshift;

    /** 实际生产周期 */
    @Column(name = "operationactual_cycle")
    BigDecimal operationactualCycle;

    /** 实际车间停留基准时间 */
    @Column(name = "operationactual_staystand")
    BigDecimal operationactualStaystand;

    /** 产线实际停留时间 */
    @Column(name = "operationactual_staytime")
    BigDecimal operationactualStaytime;

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
     * Returns the operationactualTpin.
     * 
     * @return the operationactualTpin
     */
    public String getOperationactualTpin() {
        return operationactualTpin;
    }

    /** 
     * Sets the operationactualTpin.
     * 
     * @param operationactualTpin the operationactualTpin
     */
    public void setOperationactualTpin(String operationactualTpin) {
        this.operationactualTpin = operationactualTpin;
    }

    /** 
     * Returns the operationactualActstarttime.
     * 
     * @return the operationactualActstarttime
     */
    public LocalDateTime getOperationactualActstarttime() {
        return operationactualActstarttime;
    }

    /** 
     * Sets the operationactualActstarttime.
     * 
     * @param operationactualActstarttime the operationactualActstarttime
     */
    public void setOperationactualActstarttime(LocalDateTime operationactualActstarttime) {
        this.operationactualActstarttime = operationactualActstarttime;
    }

    /** 
     * Returns the operationactualActstartworktime.
     * 
     * @return the operationactualActstartworktime
     */
    public LocalDateTime getOperationactualActstartworktime() {
        return operationactualActstartworktime;
    }

    /** 
     * Sets the operationactualActstartworktime.
     * 
     * @param operationactualActstartworktime the operationactualActstartworktime
     */
    public void setOperationactualActstartworktime(LocalDateTime operationactualActstartworktime) {
        this.operationactualActstartworktime = operationactualActstartworktime;
    }

    /** 
     * Returns the operationactualActstartshift.
     * 
     * @return the operationactualActstartshift
     */
    public String getOperationactualActstartshift() {
        return operationactualActstartshift;
    }

    /** 
     * Sets the operationactualActstartshift.
     * 
     * @param operationactualActstartshift the operationactualActstartshift
     */
    public void setOperationactualActstartshift(String operationactualActstartshift) {
        this.operationactualActstartshift = operationactualActstartshift;
    }

    /** 
     * Returns the operationactualTpout.
     * 
     * @return the operationactualTpout
     */
    public String getOperationactualTpout() {
        return operationactualTpout;
    }

    /** 
     * Sets the operationactualTpout.
     * 
     * @param operationactualTpout the operationactualTpout
     */
    public void setOperationactualTpout(String operationactualTpout) {
        this.operationactualTpout = operationactualTpout;
    }

    /** 
     * Returns the operationactualActendtime.
     * 
     * @return the operationactualActendtime
     */
    public LocalDateTime getOperationactualActendtime() {
        return operationactualActendtime;
    }

    /** 
     * Sets the operationactualActendtime.
     * 
     * @param operationactualActendtime the operationactualActendtime
     */
    public void setOperationactualActendtime(LocalDateTime operationactualActendtime) {
        this.operationactualActendtime = operationactualActendtime;
    }

    /** 
     * Returns the operationactualActendworktime.
     * 
     * @return the operationactualActendworktime
     */
    public LocalDateTime getOperationactualActendworktime() {
        return operationactualActendworktime;
    }

    /** 
     * Sets the operationactualActendworktime.
     * 
     * @param operationactualActendworktime the operationactualActendworktime
     */
    public void setOperationactualActendworktime(LocalDateTime operationactualActendworktime) {
        this.operationactualActendworktime = operationactualActendworktime;
    }

    /** 
     * Returns the operationactualActendshift.
     * 
     * @return the operationactualActendshift
     */
    public String getOperationactualActendshift() {
        return operationactualActendshift;
    }

    /** 
     * Sets the operationactualActendshift.
     * 
     * @param operationactualActendshift the operationactualActendshift
     */
    public void setOperationactualActendshift(String operationactualActendshift) {
        this.operationactualActendshift = operationactualActendshift;
    }

    /** 
     * Returns the operationactualCycle.
     * 
     * @return the operationactualCycle
     */
    public BigDecimal getOperationactualCycle() {
        return operationactualCycle;
    }

    /** 
     * Sets the operationactualCycle.
     * 
     * @param operationactualCycle the operationactualCycle
     */
    public void setOperationactualCycle(BigDecimal operationactualCycle) {
        this.operationactualCycle = operationactualCycle;
    }

    /** 
     * Returns the operationactualStaystand.
     * 
     * @return the operationactualStaystand
     */
    public BigDecimal getOperationactualStaystand() {
        return operationactualStaystand;
    }

    /** 
     * Sets the operationactualStaystand.
     * 
     * @param operationactualStaystand the operationactualStaystand
     */
    public void setOperationactualStaystand(BigDecimal operationactualStaystand) {
        this.operationactualStaystand = operationactualStaystand;
    }

    /** 
     * Returns the operationactualStaytime.
     * 
     * @return the operationactualStaytime
     */
    public BigDecimal getOperationactualStaytime() {
        return operationactualStaytime;
    }

    /** 
     * Sets the operationactualStaytime.
     * 
     * @param operationactualStaytime the operationactualStaytime
     */
    public void setOperationactualStaytime(BigDecimal operationactualStaytime) {
        this.operationactualStaytime = operationactualStaytime;
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