package com.numi.io.common.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "stock_productwarehousecycle")
public class StockProductwarehousecycle implements Serializable {

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

    /** 库房编码 */
    @Column(name = "warehouse_code")
    String warehouseCode;

    /** 经销商编码 */
    @Column(name = "dealer_code")
    String dealerCode;

    @Column(name = "productwarehousearea_code")
    String productwarehouseareaCode;

    /** 入库点位编码 */
    @Column(name = "productwarehouse_tpin")
    String productwarehouseTpin;

    /** 入库时间 */
    @Column(name = "productwarehouse_intime")
    LocalDateTime productwarehouseIntime;

    /** 出库点位编码 */
    @Column(name = "productwarehouse_tpout")
    String productwarehouseTpout;

    /** 出库时间 */
    @Column(name = "productwarehouse_outtime")
    LocalDateTime productwarehouseOuttime;

    /** 成品库存周期 */
    @Column(name = "productstock_cycle")
    BigDecimal productstockCycle;

    /** 成品库停留计算基准 */
    @Column(name = "productstock_staystandtime")
    BigDecimal productstockStaystandtime;

    /** 实际停留时间 */
    @Column(name = "productstock_staytime")
    BigDecimal productstockStaytime;

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
     * Returns the warehouseCode.
     * 
     * @return the warehouseCode
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /** 
     * Sets the warehouseCode.
     * 
     * @param warehouseCode the warehouseCode
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    /** 
     * Returns the dealerCode.
     * 
     * @return the dealerCode
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /** 
     * Sets the dealerCode.
     * 
     * @param dealerCode the dealerCode
     */
    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    /** 
     * Returns the productwarehouseTpin.
     * 
     * @return the productwarehouseTpin
     */
    public String getProductwarehouseTpin() {
        return productwarehouseTpin;
    }

    /** 
     * Sets the productwarehouseTpin.
     * 
     * @param productwarehouseTpin the productwarehouseTpin
     */
    public void setProductwarehouseTpin(String productwarehouseTpin) {
        this.productwarehouseTpin = productwarehouseTpin;
    }

    /** 
     * Returns the productwarehouseIntime.
     * 
     * @return the productwarehouseIntime
     */
    public LocalDateTime getProductwarehouseIntime() {
        return productwarehouseIntime;
    }

    /** 
     * Sets the productwarehouseIntime.
     * 
     * @param productwarehouseIntime the productwarehouseIntime
     */
    public void setProductwarehouseIntime(LocalDateTime productwarehouseIntime) {
        this.productwarehouseIntime = productwarehouseIntime;
    }

    /** 
     * Returns the productwarehouseTpout.
     * 
     * @return the productwarehouseTpout
     */
    public String getProductwarehouseTpout() {
        return productwarehouseTpout;
    }

    /** 
     * Sets the productwarehouseTpout.
     * 
     * @param productwarehouseTpout the productwarehouseTpout
     */
    public void setProductwarehouseTpout(String productwarehouseTpout) {
        this.productwarehouseTpout = productwarehouseTpout;
    }

    /** 
     * Returns the productwarehouseOuttime.
     * 
     * @return the productwarehouseOuttime
     */
    public LocalDateTime getProductwarehouseOuttime() {
        return productwarehouseOuttime;
    }

    /** 
     * Sets the productwarehouseOuttime.
     * 
     * @param productwarehouseOuttime the productwarehouseOuttime
     */
    public void setProductwarehouseOuttime(LocalDateTime productwarehouseOuttime) {
        this.productwarehouseOuttime = productwarehouseOuttime;
    }

    /** 
     * Returns the productstockCycle.
     * 
     * @return the productstockCycle
     */
    public BigDecimal getProductstockCycle() {
        return productstockCycle;
    }

    /** 
     * Sets the productstockCycle.
     * 
     * @param productstockCycle the productstockCycle
     */
    public void setProductstockCycle(BigDecimal productstockCycle) {
        this.productstockCycle = productstockCycle;
    }

    /** 
     * Returns the productstockStaystandtime.
     * 
     * @return the productstockStaystandtime
     */
    public BigDecimal getProductstockStaystandtime() {
        return productstockStaystandtime;
    }

    /** 
     * Sets the productstockStaystandtime.
     * 
     * @param productstockStaystandtime the productstockStaystandtime
     */
    public void setProductstockStaystandtime(BigDecimal productstockStaystandtime) {
        this.productstockStaystandtime = productstockStaystandtime;
    }

    /** 
     * Returns the productstockStaytime.
     * 
     * @return the productstockStaytime
     */
    public BigDecimal getProductstockStaytime() {
        return productstockStaytime;
    }

    /** 
     * Sets the productstockStaytime.
     * 
     * @param productstockStaytime the productstockStaytime
     */
    public void setProductstockStaytime(BigDecimal productstockStaytime) {
        this.productstockStaytime = productstockStaytime;
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

    public String getProductwarehouseareaCode() {
        return productwarehouseareaCode;
    }

    public void setProductwarehouseareaCode(String productwarehouseareaCode) {
        this.productwarehouseareaCode = productwarehouseareaCode;
    }
}