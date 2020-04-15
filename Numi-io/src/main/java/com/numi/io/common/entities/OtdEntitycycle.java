package com.numi.io.common.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "otd_entitycycle")
public class OtdEntitycycle implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    @Column(name = "dept_code")
    String deptCode;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** otd阶段周期时间 */
    @Column(name = "cycleact_cycletime")
    BigDecimal cycleactCycletime;

    /** otd阶段停留时间 */
    @Column(name = "cycleact_staytime")
    BigDecimal cycleactStaytime;

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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}