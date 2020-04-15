package com.numi.io.common.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * OTD阶段周期波动
 */
@Entity
@Table(name = "otd_phasecyclestatistics")
public class OtdPhasecyclestatistics implements Serializable {

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

    /** 节点类型（0上，1下） */
    @Column(name = "cyclephase_type")
    String cyclephaseType;

    /** MIN周期 */
    @Column(name = "phasecycle_min")
    BigDecimal phasecycleMin;

    /** 1Q周期 */
    @Column(name = "phasecycle_1q")
    BigDecimal phasecycle1q;

    /** 2Q周期 */
    @Column(name = "phasecycle_2q")
    BigDecimal phasecycle2q;

    /** 3Q周期 */
    @Column(name = "phasecycle_3q")
    BigDecimal phasecycle3q;

    /** 平均周期 */
    @Column(name = "phasecycle_ave")
    BigDecimal phasecycleAve;

    /** MAX周期 */
    @Column(name = "phasecycle_max")
    BigDecimal phasecycleMax;

    /** 周期波动率 */
    @Column(name = "phasecycle_volatility")
    BigDecimal phasecycleVolatility;

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
     * Returns the phasecycleMin.
     * 
     * @return the phasecycleMin
     */
    public BigDecimal getPhasecycleMin() {
        return phasecycleMin;
    }

    /** 
     * Sets the phasecycleMin.
     * 
     * @param phasecycleMin the phasecycleMin
     */
    public void setPhasecycleMin(BigDecimal phasecycleMin) {
        this.phasecycleMin = phasecycleMin;
    }

    /** 
     * Returns the phasecycle1q.
     * 
     * @return the phasecycle1q
     */
    public BigDecimal getPhasecycle1q() {
        return phasecycle1q;
    }

    /** 
     * Sets the phasecycle1q.
     * 
     * @param phasecycle1q the phasecycle1q
     */
    public void setPhasecycle1q(BigDecimal phasecycle1q) {
        this.phasecycle1q = phasecycle1q;
    }

    /** 
     * Returns the phasecycle2q.
     * 
     * @return the phasecycle2q
     */
    public BigDecimal getPhasecycle2q() {
        return phasecycle2q;
    }

    /** 
     * Sets the phasecycle2q.
     * 
     * @param phasecycle2q the phasecycle2q
     */
    public void setPhasecycle2q(BigDecimal phasecycle2q) {
        this.phasecycle2q = phasecycle2q;
    }

    /** 
     * Returns the phasecycle3q.
     * 
     * @return the phasecycle3q
     */
    public BigDecimal getPhasecycle3q() {
        return phasecycle3q;
    }

    /** 
     * Sets the phasecycle3q.
     * 
     * @param phasecycle3q the phasecycle3q
     */
    public void setPhasecycle3q(BigDecimal phasecycle3q) {
        this.phasecycle3q = phasecycle3q;
    }

    /** 
     * Returns the phasecycleAve.
     * 
     * @return the phasecycleAve
     */
    public BigDecimal getPhasecycleAve() {
        return phasecycleAve;
    }

    /** 
     * Sets the phasecycleAve.
     * 
     * @param phasecycleAve the phasecycleAve
     */
    public void setPhasecycleAve(BigDecimal phasecycleAve) {
        this.phasecycleAve = phasecycleAve;
    }

    /** 
     * Returns the phasecycleMax.
     * 
     * @return the phasecycleMax
     */
    public BigDecimal getPhasecycleMax() {
        return phasecycleMax;
    }

    /** 
     * Sets the phasecycleMax.
     * 
     * @param phasecycleMax the phasecycleMax
     */
    public void setPhasecycleMax(BigDecimal phasecycleMax) {
        this.phasecycleMax = phasecycleMax;
    }

    /** 
     * Returns the phasecycleVolatility.
     * 
     * @return the phasecycleVolatility
     */
    public BigDecimal getPhasecycleVolatility() {
        return phasecycleVolatility;
    }

    /** 
     * Sets the phasecycleVolatility.
     * 
     * @param phasecycleVolatility the phasecycleVolatility
     */
    public void setPhasecycleVolatility(BigDecimal phasecycleVolatility) {
        this.phasecycleVolatility = phasecycleVolatility;
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