package com.numi.io.common.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_gis_dealerpickup")
public class BrGisDealerpickup implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "vin")
    String vin;

    /**  */
    @Column(name = "date")
    String date;

    /**  */
    @Column(name = "type")
    String type;

    /**  */
    @Column(name = "dealer_code")
    String dealerCode;

    /**  */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /**  */
    @Column(name = "update_user")
    String updateUser;

    /**  */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /**  */
    @Column(name = "create_user")
    String createUser;

    /**  */
    @Column(name = "pass_count")
    String passCount;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the vin.
     * 
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /** 
     * Sets the vin.
     * 
     * @param vin the vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /** 
     * Returns the date.
     * 
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /** 
     * Sets the date.
     * 
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Returns the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /** 
     * Sets the type.
     * 
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Returns the dealerCode.
     * 
     * @return the dealerCode
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /** 
     * Sets the dealerCode.
     * 
     * @param dealerCode the dealerCode
     */
    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
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

    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }
}