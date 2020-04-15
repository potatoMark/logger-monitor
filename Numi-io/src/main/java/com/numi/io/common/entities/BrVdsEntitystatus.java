package com.numi.io.common.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_vds_entitystatus")
public class BrVdsEntitystatus implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "vin")
    String vin;

    /**  */
    @Column(name = "status")
    String status;

    /**  */
    @Column(name = "change_time")
    String changeTime;

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
     * Returns the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Sets the status.
     * 
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Returns the changeTime.
     * 
     * @return the changeTime
     */
    public String getChangeTime() {
        return changeTime;
    }

    /** 
     * Sets the changeTime.
     * 
     * @param changeTime the changeTime
     */
    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }
}