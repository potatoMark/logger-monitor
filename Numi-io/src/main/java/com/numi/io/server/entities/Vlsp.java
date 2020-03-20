
package com.numi.io.server.entities;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM", propOrder = {
        "compound",
        "vin",
        "inOrOut",
        "scanTime",
        "passCount"
})
@XmlRootElement(name = "ITEM")
public class Vlsp {

    @XmlElement(name = "VIN")
    protected String vin;

    @XmlElement(name = "COMPOUND")
    protected String compound;

    @XmlElement(name = "INOROUT")
    protected String inOrOut;

    @XmlElement(name = "SCANTIME")
    protected String scanTime;

    @XmlElement(name = "COUNT")
    protected String passCount;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(String inOrOut) {
        this.inOrOut = inOrOut;
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }
}
