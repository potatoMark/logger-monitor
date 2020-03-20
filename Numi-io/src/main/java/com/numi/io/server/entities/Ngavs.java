
package com.numi.io.server.entities;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM", propOrder = {
    "catcode",
    "color",
    "id",
    "model",
    "plantcode",
    "scantime",
    "station",
    "vin",
    "passCount"
})
@XmlRootElement(name="ITEM")
public class Ngavs {

    @XmlElement(name = "CATCODE")
    protected String catcode;
    @XmlElement(name = "COLOR")
    protected String color;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "MODEL")
    protected String model;
    @XmlElement(name = "PLANTCODE")
    protected String plantcode;
    @XmlElement(name = "SCANTIME")
    protected String scantime;
    @XmlElement(name = "STATION")
    protected String station;
    @XmlElement(name = "VIN")
    protected String vin;
    @XmlElement(name = "COUNT")
    protected String passCount;

    public String getCatcode() {
        return catcode;
    }

    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlantcode() {
        return plantcode;
    }

    public void setPlantcode(String plantcode) {
        this.plantcode = plantcode;
    }

    public String getScantime() {
        return scantime;
    }

    public void setScantime(String scantime) {
        this.scantime = scantime;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }
}
