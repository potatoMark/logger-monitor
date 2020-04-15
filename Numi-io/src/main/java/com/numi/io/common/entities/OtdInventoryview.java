package com.numi.io.common.entities;

import java.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * VIEW
 */
@Entity
@Table(name = "otd_inventoryview")
public class OtdInventoryview implements Serializable {

    /** 制品编码 */
    @Id
    @Column(name = "entity_code")
    String entityCode;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** 组织编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** 工作日期 */
    @Column(name = "otd_workdate")
    LocalDate otdWorkdate;

    /**  */
    @Column(name = "flag")
    Integer flag;

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
     * Returns the cyclephaseCode.
     * 
     * @return the cyclephaseCode
     */
    public String getCyclephaseCode() {
        return cyclephaseCode;
    }

    /** 
     * Sets the cyclephaseCode.
     * 
     * @param cyclephaseCode the cyclephaseCode
     */
    public void setCyclephaseCode(String cyclephaseCode) {
        this.cyclephaseCode = cyclephaseCode;
    }

    /** 
     * Returns the deptCode.
     * 
     * @return the deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    /** 
     * Sets the deptCode.
     * 
     * @param deptCode the deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /** 
     * Returns the otdWorkdate.
     * 
     * @return the otdWorkdate
     */
    public LocalDate getOtdWorkdate() {
        return otdWorkdate;
    }

    /** 
     * Sets the otdWorkdate.
     * 
     * @param otdWorkdate the otdWorkdate
     */
    public void setOtdWorkdate(LocalDate otdWorkdate) {
        this.otdWorkdate = otdWorkdate;
    }

    /** 
     * Returns the flag.
     * 
     * @return the flag
     */
    public Integer getFlag() {
        return flag;
    }

    /** 
     * Sets the flag.
     * 
     * @param flag the flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}