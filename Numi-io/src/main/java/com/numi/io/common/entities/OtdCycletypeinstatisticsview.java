package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * VIEW
 */
@Entity
@Table(name = "otd_cycletypeinstatisticsview")
public class OtdCycletypeinstatisticsview implements Serializable {

    /** 工作日期 */
    @Column(name = "otd_workdate")
    LocalDate otdWorkdate;

    /** 制品编码 */
    @Id
    @Column(name = "entity_code")
    String entityCode;

    /** 组织编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** otd阶段停留时间 */
    @Column(name = "cycleact_staytime")
    BigDecimal cycleactStaytime;

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
     * Returns the cycleactStaytime.
     * 
     * @return the cycleactStaytime
     */
    public BigDecimal getCycleactStaytime() {
        return cycleactStaytime;
    }

    /** 
     * Sets the cycleactStaytime.
     * 
     * @param cycleactStaytime the cycleactStaytime
     */
    public void setCycleactStaytime(BigDecimal cycleactStaytime) {
        this.cycleactStaytime = cycleactStaytime;
    }
}