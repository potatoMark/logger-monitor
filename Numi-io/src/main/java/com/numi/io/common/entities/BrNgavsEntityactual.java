package com.numi.io.common.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "br_ngavs_entityactual")
public class BrNgavsEntityactual implements Serializable {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**  */
    @Column(name = "plant_code")
    String plantCode;

    /**  */
    @Column(name = "station")
    String station;

    /**  */
    @Column(name = "vin")
    String vin;

    /**  */
    @Column(name = "model")
    String model;

    /**  */
    @Column(name = "cat_code")
    String catCode;

    /**  */
    @Column(name = "color")
    String color;

    /**  */
    @Column(name = "pass_count")
    String passCount;

    /**  */
    @Column(name = "scan_time")
    String scanTime;

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
     * Returns the plantCode.
     * 
     * @return the plantCode
     */
    public String getPlantCode() {
        return plantCode;
    }

    /** 
     * Sets the plantCode.
     * 
     * @param plantCode the plantCode
     */
    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    /** 
     * Returns the station.
     * 
     * @return the station
     */
    public String getStation() {
        return station;
    }

    /** 
     * Sets the station.
     * 
     * @param station the station
     */
    public void setStation(String station) {
        this.station = station;
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
     * Returns the model.
     * 
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /** 
     * Sets the model.
     * 
     * @param model the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Returns the catCode.
     * 
     * @return the catCode
     */
    public String getCatCode() {
        return catCode;
    }

    /** 
     * Sets the catCode.
     * 
     * @param catCode the catCode
     */
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    /** 
     * Returns the color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /** 
     * Sets the color.
     * 
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** 
     * Returns the passCount.
     * 
     * @return the passCount
     */
    public String getPassCount() {
        return passCount;
    }

    /** 
     * Sets the passCount.
     * 
     * @param passCount the passCount
     */
    public void setPassCount(String passCount) {
        this.passCount = passCount;
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

}