package com.numi.io.common.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "stock_productwarehouseactual")
public class StockProductwarehouseactual implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** 库房编码 */
    @Column(name = "warehouse_code")
    String warehouseCode;

    /** 采集库位编码 */
    @Column(name = "productwarehouse_tpcode")
    String productwarehouseTpcode;

    /** 扫描时间 */
    @Column(name = "productwarehouse_passtime")
    LocalDateTime productwarehousePasstime;

    /** 扫描次数时间 */
    @Column(name = "productwarehouse_passcount")
    Integer productwarehousePasscount;

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
     * Returns the productwarehouseTpcode.
     * 
     * @return the productwarehouseTpcode
     */
    public String getProductwarehouseTpcode() {
        return productwarehouseTpcode;
    }

    /** 
     * Sets the productwarehouseTpcode.
     * 
     * @param productwarehouseTpcode the productwarehouseTpcode
     */
    public void setProductwarehouseTpcode(String productwarehouseTpcode) {
        this.productwarehouseTpcode = productwarehouseTpcode;
    }

    /** 
     * Returns the productwarehousePasstime.
     * 
     * @return the productwarehousePasstime
     */
    public LocalDateTime getProductwarehousePasstime() {
        return productwarehousePasstime;
    }

    /** 
     * Sets the productwarehousePasstime.
     * 
     * @param productwarehousePasstime the productwarehousePasstime
     */
    public void setProductwarehousePasstime(LocalDateTime productwarehousePasstime) {
        this.productwarehousePasstime = productwarehousePasstime;
    }

    /** 
     * Returns the productwarehousePasscount.
     * 
     * @return the productwarehousePasscount
     */
    public Integer getProductwarehousePasscount() {
        return productwarehousePasscount;
    }

    /** 
     * Sets the productwarehousePasscount.
     * 
     * @param productwarehousePasscount the productwarehousePasscount
     */
    public void setProductwarehousePasscount(Integer productwarehousePasscount) {
        this.productwarehousePasscount = productwarehousePasscount;
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