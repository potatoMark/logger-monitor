package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "otd_phasepassrank")
public class OtdPhasepassrank implements Serializable {

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

    /** 工厂编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** 节点类型（0上，1下） */
    @Column(name = "cyclephase_type")
    String cyclephaseType;

    /** rank代码 */
    @Column(name = "rank_code")
    String rankCode;

    /** rank内通过数 */
    @Column(name = "rank_passcount")
    BigDecimal rankPasscount;

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


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * Returns the cyclephaseType.
     * 
     * @return the cyclephaseType
     */
    public String getCyclephaseType() {
        return cyclephaseType;
    }

    /** 
     * Sets the cyclephaseType.
     * 
     * @param cyclephaseType the cyclephaseType
     */
    public void setCyclephaseType(String cyclephaseType) {
        this.cyclephaseType = cyclephaseType;
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