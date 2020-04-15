package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * VIEW
 */
@Entity
@Table(name = "otd_cycletypeoutstatisticsview")
public class OtdCycletypeoutstatisticsview implements Serializable {

    /**  */
    @Column(name = "work_date")
    LocalDate workDate;

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

    /** otd阶段周期时间 */
    @Column(name = "cycleact_cycletime")
    BigDecimal cycleactCycletime;

    /** 
     * Returns the workDate.
     * 
     * @return the workDate
     */
    public LocalDate getWorkDate() {
        return workDate;
    }

    /** 
     * Sets the workDate.
     * 
     * @param workDate the workDate
     */
    public void setWorkDate(LocalDate workDate) {
        this.workDate = workDate;
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
     * Returns the cycleactCycletime.
     * 
     * @return the cycleactCycletime
     */
    public BigDecimal getCycleactCycletime() {
        return cycleactCycletime;
    }

    /** 
     * Sets the cycleactCycletime.
     * 
     * @param cycleactCycletime the cycleactCycletime
     */
    public void setCycleactCycletime(BigDecimal cycleactCycletime) {
        this.cycleactCycletime = cycleactCycletime;
    }
}