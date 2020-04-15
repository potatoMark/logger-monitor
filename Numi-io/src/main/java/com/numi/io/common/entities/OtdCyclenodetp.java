package com.numi.io.common.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "otd_cyclenodetp")
public class OtdCyclenodetp implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** otd节点组代码 */
    @Column(name = "cyclenodegroup_code")
    String cyclenodegroupCode;

    /** otd节点代码 */
    @Column(name = "cyclenode_code")
    String cyclenodeCode;

    /** tp编码 */
    @Column(name = "tp_code")
    String tpCode;

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
     * Returns the cyclenodegroupCode.
     * 
     * @return the cyclenodegroupCode
     */
    public String getCyclenodegroupCode() {
        return cyclenodegroupCode;
    }

    /** 
     * Sets the cyclenodegroupCode.
     * 
     * @param cyclenodegroupCode the cyclenodegroupCode
     */
    public void setCyclenodegroupCode(String cyclenodegroupCode) {
        this.cyclenodegroupCode = cyclenodegroupCode;
    }

    /** 
     * Returns the cyclenodeCode.
     * 
     * @return the cyclenodeCode
     */
    public String getCyclenodeCode() {
        return cyclenodeCode;
    }

    /** 
     * Sets the cyclenodeCode.
     * 
     * @param cyclenodeCode the cyclenodeCode
     */
    public void setCyclenodeCode(String cyclenodeCode) {
        this.cyclenodeCode = cyclenodeCode;
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