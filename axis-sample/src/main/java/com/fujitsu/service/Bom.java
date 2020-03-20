/**
 * Bom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class Bom  implements java.io.Serializable {
    private java.lang.String bomversion;

    private java.lang.String description;

    private java.util.Calendar fromDate;

    private java.lang.String givenUnit;

    private boolean master;

    private java.lang.String name;

    private java.lang.String number;

    private java.lang.String productNumber;

    private com.fujitsu.service.Schema[] schemas;

    private boolean sendFlag;

    private java.util.Calendar toDate;

    public Bom() {
    }

    public Bom(
           java.lang.String bomversion,
           java.lang.String description,
           java.util.Calendar fromDate,
           java.lang.String givenUnit,
           boolean master,
           java.lang.String name,
           java.lang.String number,
           java.lang.String productNumber,
           com.fujitsu.service.Schema[] schemas,
           boolean sendFlag,
           java.util.Calendar toDate) {
           this.bomversion = bomversion;
           this.description = description;
           this.fromDate = fromDate;
           this.givenUnit = givenUnit;
           this.master = master;
           this.name = name;
           this.number = number;
           this.productNumber = productNumber;
           this.schemas = schemas;
           this.sendFlag = sendFlag;
           this.toDate = toDate;
    }


    /**
     * Gets the bomversion value for this Bom.
     * 
     * @return bomversion
     */
    public java.lang.String getBomversion() {
        return bomversion;
    }


    /**
     * Sets the bomversion value for this Bom.
     * 
     * @param bomversion
     */
    public void setBomversion(java.lang.String bomversion) {
        this.bomversion = bomversion;
    }


    /**
     * Gets the description value for this Bom.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Bom.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fromDate value for this Bom.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this Bom.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the givenUnit value for this Bom.
     * 
     * @return givenUnit
     */
    public java.lang.String getGivenUnit() {
        return givenUnit;
    }


    /**
     * Sets the givenUnit value for this Bom.
     * 
     * @param givenUnit
     */
    public void setGivenUnit(java.lang.String givenUnit) {
        this.givenUnit = givenUnit;
    }


    /**
     * Gets the master value for this Bom.
     * 
     * @return master
     */
    public boolean isMaster() {
        return master;
    }


    /**
     * Sets the master value for this Bom.
     * 
     * @param master
     */
    public void setMaster(boolean master) {
        this.master = master;
    }


    /**
     * Gets the name value for this Bom.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Bom.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this Bom.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Bom.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the productNumber value for this Bom.
     * 
     * @return productNumber
     */
    public java.lang.String getProductNumber() {
        return productNumber;
    }


    /**
     * Sets the productNumber value for this Bom.
     * 
     * @param productNumber
     */
    public void setProductNumber(java.lang.String productNumber) {
        this.productNumber = productNumber;
    }


    /**
     * Gets the schemas value for this Bom.
     * 
     * @return schemas
     */
    public com.fujitsu.service.Schema[] getSchemas() {
        return schemas;
    }


    /**
     * Sets the schemas value for this Bom.
     * 
     * @param schemas
     */
    public void setSchemas(com.fujitsu.service.Schema[] schemas) {
        this.schemas = schemas;
    }

    public com.fujitsu.service.Schema getSchemas(int i) {
        return this.schemas[i];
    }

    public void setSchemas(int i, com.fujitsu.service.Schema _value) {
        this.schemas[i] = _value;
    }


    /**
     * Gets the sendFlag value for this Bom.
     * 
     * @return sendFlag
     */
    public boolean isSendFlag() {
        return sendFlag;
    }


    /**
     * Sets the sendFlag value for this Bom.
     * 
     * @param sendFlag
     */
    public void setSendFlag(boolean sendFlag) {
        this.sendFlag = sendFlag;
    }


    /**
     * Gets the toDate value for this Bom.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this Bom.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bom)) return false;
        Bom other = (Bom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bomversion==null && other.getBomversion()==null) || 
             (this.bomversion!=null &&
              this.bomversion.equals(other.getBomversion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.givenUnit==null && other.getGivenUnit()==null) || 
             (this.givenUnit!=null &&
              this.givenUnit.equals(other.getGivenUnit()))) &&
            this.master == other.isMaster() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.productNumber==null && other.getProductNumber()==null) || 
             (this.productNumber!=null &&
              this.productNumber.equals(other.getProductNumber()))) &&
            ((this.schemas==null && other.getSchemas()==null) || 
             (this.schemas!=null &&
              java.util.Arrays.equals(this.schemas, other.getSchemas()))) &&
            this.sendFlag == other.isSendFlag() &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getBomversion() != null) {
            _hashCode += getBomversion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getGivenUnit() != null) {
            _hashCode += getGivenUnit().hashCode();
        }
        _hashCode += (isMaster() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getProductNumber() != null) {
            _hashCode += getProductNumber().hashCode();
        }
        if (getSchemas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchemas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchemas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSendFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bom"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bomversion"));
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
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("master");
        elemField.setXmlName(new javax.xml.namespace.QName("", "master"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("productNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
