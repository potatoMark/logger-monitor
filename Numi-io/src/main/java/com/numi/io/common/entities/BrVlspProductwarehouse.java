package com.numi.io.common.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_vlsp_productwarehouse")
public class BrVlspProductwarehouse implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "compound")
    String compound;

    /**  */
    @Column(name = "vin")
    String vin;

    /**  */
    @Column(name = "scan_time")
    String scanTime;

    /**  */
    @Column(name = "in_out")
    String inOut;

    /**  */
    @Column(name = "type")
    String type;

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
     * Returns the compound.
     * 
     * @return the compound
     */
    public String getCompound() {
        return compound;
    }

    /** 
     * Sets the compound.
     * 
     * @param compound the compound
     */
    public void setCompound(String compound) {
        this.compound = compound;
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
     * Returns the scanTime.
     * 
     * @return the scanTime
     */
    public String getScanTime() {
        return scanTime;
    }

    /** 
     * Sets the scanTime.
     * 
     * @param scanTime the scanTime
     */
    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    /** 
     * Returns the inOut.
     * 
     * @return the inOut
     */
    public String getInOut() {
        return inOut;
    }

    /** 
     * Sets the inOut.
     * 
     * @param inOut the inOut
     */
    public void setInOut(String inOut) {
        this.inOut = inOut;
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

    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }
}