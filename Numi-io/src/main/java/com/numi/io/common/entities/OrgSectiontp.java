package com.numi.io.common.entities;

import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 产线TP关系表
 */
@Entity
@Table(name = "org_sectiontp")
public class OrgSectiontp implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 组织编码 */
    @Column(name = "dept_code")
    String deptCode;

    /** 车间编码 */
    @Column(name = "div_code")
    String divCode;

    /** 线段编码 */
    @Column(name = "sect_code")
    String sectCode;

    /** TP编码 */
    @Column(name = "tp_code")
    String tpCode;

    /** TP类型 */
    @Column(name = "tp_type")
    String tpType;

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
     * Returns the divCode.
     * 
     * @return the divCode
     */
    public String getDivCode() {
        return divCode;
    }

    /** 
     * Sets the divCode.
     * 
     * @param divCode the divCode
     */
    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    /** 
     * Returns the sectCode.
     * 
     * @return the sectCode
     */
    public String getSectCode() {
        return sectCode;
    }

    /** 
     * Sets the sectCode.
     * 
     * @param sectCode the sectCode
     */
    public void setSectCode(String sectCode) {
        this.sectCode = sectCode;
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
     * Returns the tpType.
     * 
     * @return the tpType
     */
    public String getTpType() {
        return tpType;
    }

    /** 
     * Sets the tpType.
     * 
     * @param tpType the tpType
     */
    public void setTpType(String tpType) {
        this.tpType = tpType;
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