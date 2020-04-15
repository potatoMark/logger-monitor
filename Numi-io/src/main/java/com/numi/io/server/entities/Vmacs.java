
package com.numi.io.server.entities;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM", propOrder = {
        "id",
        "plantCode",
        "orderNumber",
        "vin",
        "vehicheStatus",
        "triggerDate",
        "dmsOrder",
        "buildDate"

})
@XmlRootElement(name = "ITEM")
public class Vmacs {

    @XmlElement(name = "ID")
    protected String id;

    @XmlElement(name = "PLANTCODE")
    protected String plantCode;

    @XmlElement(name = "ORDERNUMBER")
    protected String orderNumber;

    @XmlElement(name = "VIN")
    protected String vin;

    @XmlElement(name = "VEHICHESTATUS")
    protected String vehicheStatus;

    @XmlElement(name = "STATUSDATE")
    protected String triggerDate;

    @XmlElement(name = "DMSORDER")
    protected String dmsOrder;

    @XmlElement(name = "BUILDDATE")
    protected String buildDate;

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicheStatus() {
        return vehicheStatus;
    }

    public void setVehicheStatus(String vehicheStatus) {
        this.vehicheStatus = vehicheStatus;
    }

    public String getTriggerDate() {
        return triggerDate;
    }

    public void setTriggerDate(String triggerDate) {
        this.triggerDate = triggerDate;
    }

    public String getDmsOrder() {
        return dmsOrder;
    }

    public void setDmsOrder(String dmsOrder) {
        this.dmsOrder = dmsOrder;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
