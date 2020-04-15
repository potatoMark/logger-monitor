package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * OTD在库Rank统计表
 */
@Entity
@Table(name = "otd_phaseinventoryrank")
public class OtdPhaseinventoryrank implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 工作日期 */
    @Column(name = "otd_workdate")
    LocalDate otdWorkdate;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** 组织编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** rank代码 */
    @Column(name = "rank_code")
    String rankCode;

    /** rank内在库数 */
    @Column(name = "rank_passcount")
    BigDecimal rankPasscount;

    /**  */
    @Column(name = "cyclephase_overstay")
    BigDecimal cyclephaseOverstay;

    /**  */
    @Column(name = "cyclephase_delay")
    BigDecimal cyclephaseDelay;

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
     * Returns the rankCode.
     * 
     * @return the rankCode
     */
    public String getRankCode() {
        return rankCode;
    }

    /** 
     * Sets the rankCode.
     * 
     * @param rankCode the rankCode
     */
    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    /** 
     * Returns the rankPasscount.
     * 
     * @return the rankPasscount
     */
    public BigDecimal getRankPasscount() {
        return rankPasscount;
    }

    /** 
     * Sets the rankPasscount.
     * 
     * @param rankPasscount the rankPasscount
     */
    public void setRankPasscount(BigDecimal rankPasscount) {
        this.rankPasscount = rankPasscount;
    }

    /** 
     * Returns the cyclephaseOverstay.
     * 
     * @return the cyclephaseOverstay
     */
    public BigDecimal getCyclephaseOverstay() {
        return cyclephaseOverstay;
    }

    /** 
     * Sets the cyclephaseOverstay.
     * 
     * @param cyclephaseOverstay the cyclephaseOverstay
     */
    public void setCyclephaseOverstay(BigDecimal cyclephaseOverstay) {
        this.cyclephaseOverstay = cyclephaseOverstay;
    }

    /** 
     * Returns the cyclephaseDelay.
     * 
     * @return the cyclephaseDelay
     */
    public BigDecimal getCyclephaseDelay() {
        return cyclephaseDelay;
    }

    /** 
     * Sets the cyclephaseDelay.
     * 
     * @param cyclephaseDelay the cyclephaseDelay
     */
    public void setCyclephaseDelay(BigDecimal cyclephaseDelay) {
        this.cyclephaseDelay = cyclephaseDelay;
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