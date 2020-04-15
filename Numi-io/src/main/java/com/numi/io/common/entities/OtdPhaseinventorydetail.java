package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 每日期末在库详细
 */
@Entity
@Table(name = "otd_phaseinventorydetail")
public class OtdPhaseinventorydetail implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 工作日期 */
    @Column(name = "otd_workdate")
    LocalDate otdWorkdate;

    /** 组织编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** tp点位 */
    @Column(name = "tp_code")
    String tpCode;

    /**  */
    @Column(name = "cycleact_staytime")
    BigDecimal cycleactStaytime;

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