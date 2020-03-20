
package com.numi.io.server.entities;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM", propOrder = {
        "vin",
        "dealerCode",
        "vehicleType",
        "vehicleDate",
        "passCount"
})
@XmlRootElement(name = "ITEM")
public class Gis {

    @XmlElement(name = "VIN")
    protected String vin;

    @XmlElement(name = "DEALERCODE")
    protected String dealerCode;

    @XmlElement(name = "VEHICHETYPE")
    protected String vehicleType;

    @XmlElement(name = "VEHICHEDATE")
    protected String vehicleDate;

    @XmlElement(name = "COUNT")
    protected String passCount;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleDate() {
        return vehicleDate;
    }

    public void setVehicleDate(String vehicleDate) {
        this.vehicleDate = vehicleDate;
    }

    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }
}
