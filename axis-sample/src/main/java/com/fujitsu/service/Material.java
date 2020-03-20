/**
 * Material.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class Material  implements java.io.Serializable {
    private int capacity;

    private java.lang.String combinemanufacturetype;

    private java.lang.String description;

    private java.lang.String ean;

    private java.lang.String figurenumber;

    private java.lang.String givenUnit;

    private java.lang.String globalTypeOfMaterial;

    private java.lang.String msdmateriallevelNumber;

    private java.lang.String name;

    private java.lang.String number;

    private java.lang.String producer;

    private boolean sendFlag;

    public Material() {
    }

    public Material(
           int capacity,
           java.lang.String combinemanufacturetype,
           java.lang.String description,
           java.lang.String ean,
           java.lang.String figurenumber,
           java.lang.String givenUnit,
           java.lang.String globalTypeOfMaterial,
           java.lang.String msdmateriallevelNumber,
           java.lang.String name,
           java.lang.String number,
           java.lang.String producer,
           boolean sendFlag) {
           this.capacity = capacity;
           this.combinemanufacturetype = combinemanufacturetype;
           this.description = description;
           this.ean = ean;
           this.figurenumber = figurenumber;
           this.givenUnit = givenUnit;
           this.globalTypeOfMaterial = globalTypeOfMaterial;
           this.msdmateriallevelNumber = msdmateriallevelNumber;
           this.name = name;
           this.number = number;
           this.producer = producer;
           this.sendFlag = sendFlag;
    }


    /**
     * Gets the capacity value for this Material.
     * 
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Material.
     * 
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the combinemanufacturetype value for this Material.
     * 
     * @return combinemanufacturetype
     */
    public java.lang.String getCombinemanufacturetype() {
        return combinemanufacturetype;
    }


    /**
     * Sets the combinemanufacturetype value for this Material.
     * 
     * @param combinemanufacturetype
     */
    public void setCombinemanufacturetype(java.lang.String combinemanufacturetype) {
        this.combinemanufacturetype = combinemanufacturetype;
    }


    /**
     * Gets the description value for this Material.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Material.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ean value for this Material.
     * 
     * @return ean
     */
    public java.lang.String getEan() {
        return ean;
    }


    /**
     * Sets the ean value for this Material.
     * 
     * @param ean
     */
    public void setEan(java.lang.String ean) {
        this.ean = ean;
    }


    /**
     * Gets the figurenumber value for this Material.
     * 
     * @return figurenumber
     */
    public java.lang.String getFigurenumber() {
        return figurenumber;
    }


    /**
     * Sets the figurenumber value for this Material.
     * 
     * @param figurenumber
     */
    public void setFigurenumber(java.lang.String figurenumber) {
        this.figurenumber = figurenumber;
    }


    /**
     * Gets the givenUnit value for this Material.
     * 
     * @return givenUnit
     */
    public java.lang.String getGivenUnit() {
        return givenUnit;
    }


    /**
     * Sets the givenUnit value for this Material.
     * 
     * @param givenUnit
     */
    public void setGivenUnit(java.lang.String givenUnit) {
        this.givenUnit = givenUnit;
    }


    /**
     * Gets the globalTypeOfMaterial value for this Material.
     * 
     * @return globalTypeOfMaterial
     */
    public java.lang.String getGlobalTypeOfMaterial() {
        return globalTypeOfMaterial;
    }


    /**
     * Sets the globalTypeOfMaterial value for this Material.
     * 
     * @param globalTypeOfMaterial
     */
    public void setGlobalTypeOfMaterial(java.lang.String globalTypeOfMaterial) {
        this.globalTypeOfMaterial = globalTypeOfMaterial;
    }


    /**
     * Gets the msdmateriallevelNumber value for this Material.
     * 
     * @return msdmateriallevelNumber
     */
    public java.lang.String getMsdmateriallevelNumber() {
        return msdmateriallevelNumber;
    }


    /**
     * Sets the msdmateriallevelNumber value for this Material.
     * 
     * @param msdmateriallevelNumber
     */
    public void setMsdmateriallevelNumber(java.lang.String msdmateriallevelNumber) {
        this.msdmateriallevelNumber = msdmateriallevelNumber;
    }


    /**
     * Gets the name value for this Material.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Material.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this Material.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Material.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the producer value for this Material.
     * 
     * @return producer
     */
    public java.lang.String getProducer() {
        return producer;
    }


    /**
     * Sets the producer value for this Material.
     * 
     * @param producer
     */
    public void setProducer(java.lang.String producer) {
        this.producer = producer;
    }


    /**
     * Gets the sendFlag value for this Material.
     * 
     * @return sendFlag
     */
    public boolean isSendFlag() {
        return sendFlag;
    }


    /**
     * Sets the sendFlag value for this Material.
     * 
     * @param sendFlag
     */
    public void setSendFlag(boolean sendFlag) {
        this.sendFlag = sendFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Material)) return false;
        Material other = (Material) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.capacity == other.getCapacity() &&
            ((this.combinemanufacturetype==null && other.getCombinemanufacturetype()==null) || 
             (this.combinemanufacturetype!=null &&
              this.combinemanufacturetype.equals(other.getCombinemanufacturetype()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ean==null && other.getEan()==null) || 
             (this.ean!=null &&
              this.ean.equals(other.getEan()))) &&
            ((this.figurenumber==null && other.getFigurenumber()==null) || 
             (this.figurenumber!=null &&
              this.figurenumber.equals(other.getFigurenumber()))) &&
            ((this.givenUnit==null && other.getGivenUnit()==null) || 
             (this.givenUnit!=null &&
              this.givenUnit.equals(other.getGivenUnit()))) &&
            ((this.globalTypeOfMaterial==null && other.getGlobalTypeOfMaterial()==null) || 
             (this.globalTypeOfMaterial!=null &&
              this.globalTypeOfMaterial.equals(other.getGlobalTypeOfMaterial()))) &&
            ((this.msdmateriallevelNumber==null && other.getMsdmateriallevelNumber()==null) || 
             (this.msdmateriallevelNumber!=null &&
              this.msdmateriallevelNumber.equals(other.getMsdmateriallevelNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.producer==null && other.getProducer()==null) || 
             (this.producer!=null &&
              this.producer.equals(other.getProducer()))) &&
            this.sendFlag == other.isSendFlag();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCapacity();
        if (getCombinemanufacturetype() != null) {
            _hashCode += getCombinemanufacturetype().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEan() != null) {
            _hashCode += getEan().hashCode();
        }
        if (getFigurenumber() != null) {
            _hashCode += getFigurenumber().hashCode();
        }
        if (getGivenUnit() != null) {
            _hashCode += getGivenUnit().hashCode();
        }
        if (getGlobalTypeOfMaterial() != null) {
            _hashCode += getGlobalTypeOfMaterial().hashCode();
        }
        if (getMsdmateriallevelNumber() != null) {
            _hashCode += getMsdmateriallevelNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getProducer() != null) {
            _hashCode += getProducer().hashCode();
        }
        _hashCode += (isSendFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Material.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "material"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinemanufacturetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "combinemanufacturetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figurenumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "figurenumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "givenUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalTypeOfMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTypeOfMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msdmateriallevelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msdmateriallevelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
