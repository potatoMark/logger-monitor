/**
 * SchemaBomResourceComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class SchemaBomResourceComponent  implements java.io.Serializable {
    private java.lang.String bomNumber;

    private java.lang.String description;

    private java.lang.String equipmentTypeNumber;

    private java.lang.String givenUnit;

    private java.lang.String operationNumber;

    private java.lang.String productSide;

    private int quantity;

    private java.lang.String schemaNumber;

    public SchemaBomResourceComponent() {
    }

    public SchemaBomResourceComponent(
           java.lang.String bomNumber,
           java.lang.String description,
           java.lang.String equipmentTypeNumber,
           java.lang.String givenUnit,
           java.lang.String operationNumber,
           java.lang.String productSide,
           int quantity,
           java.lang.String schemaNumber) {
           this.bomNumber = bomNumber;
           this.description = description;
           this.equipmentTypeNumber = equipmentTypeNumber;
           this.givenUnit = givenUnit;
           this.operationNumber = operationNumber;
           this.productSide = productSide;
           this.quantity = quantity;
           this.schemaNumber = schemaNumber;
    }


    /**
     * Gets the bomNumber value for this SchemaBomResourceComponent.
     * 
     * @return bomNumber
     */
    public java.lang.String getBomNumber() {
        return bomNumber;
    }


    /**
     * Sets the bomNumber value for this SchemaBomResourceComponent.
     * 
     * @param bomNumber
     */
    public void setBomNumber(java.lang.String bomNumber) {
        this.bomNumber = bomNumber;
    }


    /**
     * Gets the description value for this SchemaBomResourceComponent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SchemaBomResourceComponent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the equipmentTypeNumber value for this SchemaBomResourceComponent.
     * 
     * @return equipmentTypeNumber
     */
    public java.lang.String getEquipmentTypeNumber() {
        return equipmentTypeNumber;
    }


    /**
     * Sets the equipmentTypeNumber value for this SchemaBomResourceComponent.
     * 
     * @param equipmentTypeNumber
     */
    public void setEquipmentTypeNumber(java.lang.String equipmentTypeNumber) {
        this.equipmentTypeNumber = equipmentTypeNumber;
    }


    /**
     * Gets the givenUnit value for this SchemaBomResourceComponent.
     * 
     * @return givenUnit
     */
    public java.lang.String getGivenUnit() {
        return givenUnit;
    }


    /**
     * Sets the givenUnit value for this SchemaBomResourceComponent.
     * 
     * @param givenUnit
     */
    public void setGivenUnit(java.lang.String givenUnit) {
        this.givenUnit = givenUnit;
    }


    /**
     * Gets the operationNumber value for this SchemaBomResourceComponent.
     * 
     * @return operationNumber
     */
    public java.lang.String getOperationNumber() {
        return operationNumber;
    }


    /**
     * Sets the operationNumber value for this SchemaBomResourceComponent.
     * 
     * @param operationNumber
     */
    public void setOperationNumber(java.lang.String operationNumber) {
        this.operationNumber = operationNumber;
    }


    /**
     * Gets the productSide value for this SchemaBomResourceComponent.
     * 
     * @return productSide
     */
    public java.lang.String getProductSide() {
        return productSide;
    }


    /**
     * Sets the productSide value for this SchemaBomResourceComponent.
     * 
     * @param productSide
     */
    public void setProductSide(java.lang.String productSide) {
        this.productSide = productSide;
    }


    /**
     * Gets the quantity value for this SchemaBomResourceComponent.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SchemaBomResourceComponent.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the schemaNumber value for this SchemaBomResourceComponent.
     * 
     * @return schemaNumber
     */
    public java.lang.String getSchemaNumber() {
        return schemaNumber;
    }


    /**
     * Sets the schemaNumber value for this SchemaBomResourceComponent.
     * 
     * @param schemaNumber
     */
    public void setSchemaNumber(java.lang.String schemaNumber) {
        this.schemaNumber = schemaNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchemaBomResourceComponent)) return false;
        SchemaBomResourceComponent other = (SchemaBomResourceComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bomNumber==null && other.getBomNumber()==null) || 
             (this.bomNumber!=null &&
              this.bomNumber.equals(other.getBomNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.equipmentTypeNumber==null && other.getEquipmentTypeNumber()==null) || 
             (this.equipmentTypeNumber!=null &&
              this.equipmentTypeNumber.equals(other.getEquipmentTypeNumber()))) &&
            ((this.givenUnit==null && other.getGivenUnit()==null) || 
             (this.givenUnit!=null &&
              this.givenUnit.equals(other.getGivenUnit()))) &&
            ((this.operationNumber==null && other.getOperationNumber()==null) || 
             (this.operationNumber!=null &&
              this.operationNumber.equals(other.getOperationNumber()))) &&
            ((this.productSide==null && other.getProductSide()==null) || 
             (this.productSide!=null &&
              this.productSide.equals(other.getProductSide()))) &&
            this.quantity == other.getQuantity() &&
            ((this.schemaNumber==null && other.getSchemaNumber()==null) || 
             (this.schemaNumber!=null &&
              this.schemaNumber.equals(other.getSchemaNumber())));
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
        if (getBomNumber() != null) {
            _hashCode += getBomNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEquipmentTypeNumber() != null) {
            _hashCode += getEquipmentTypeNumber().hashCode();
        }
        if (getGivenUnit() != null) {
            _hashCode += getGivenUnit().hashCode();
        }
        if (getOperationNumber() != null) {
            _hashCode += getOperationNumber().hashCode();
        }
        if (getProductSide() != null) {
            _hashCode += getProductSide().hashCode();
        }
        _hashCode += getQuantity();
        if (getSchemaNumber() != null) {
            _hashCode += getSchemaNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchemaBomResourceComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomResourceComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bomNumber"));
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
        elemField.setFieldName("equipmentTypeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipmentTypeNumber"));
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
        elemField.setFieldName("operationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemaNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
