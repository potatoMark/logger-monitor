package com.numi.io.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "delivery_sectiontp")
public class DeliverySectiontp implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 路线编码 */
    @Column(name = "section_code")
    String sectionCode;

    /** TP编码 */
    @Column(name = "tp_code")
    String tpCode;

    /** TP类型 */
    @Column(name = "tp_type")
    BigDecimal tpType;

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
     * Returns the sectionCode.
     * 
     * @return the sectionCode
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /** 
     * Sets the sectionCode.
     * 
     * @param sectionCode the sectionCode
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
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
    public BigDecimal getTpType() {
        return tpType;
    }

    /** 
     * Sets the tpType.
     * 
     * @param tpType the tpType
     */
    public void setTpType(BigDecimal tpType) {
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