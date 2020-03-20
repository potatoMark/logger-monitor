/**
 * SchemaBomComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class SchemaBomComponent  implements java.io.Serializable {
    private java.lang.String bomNumber;

    private com.fujitsu.service.SchemaBomComponent[] children;

    private java.lang.String description;

    private java.lang.String givenUnit;

    private java.lang.String id;

    private java.lang.String materialPosition;

    private java.lang.String operationNumber;

    private java.lang.String p_id;

    private int priority;

    private java.lang.String productNumber;

    private java.lang.String productSide;

    private double quantity;

    private java.lang.String replaceProductGroupNumber;

    private java.lang.String schemaNumber;

    private java.lang.String subSchemaNumber;

    public SchemaBomComponent() {
    }

    public SchemaBomComponent(
           java.lang.String bomNumber,
           com.fujitsu.service.SchemaBomComponent[] children,
           java.lang.String description,
           java.lang.String givenUnit,
           java.lang.String id,
           java.lang.String materialPosition,
           java.lang.String operationNumber,
           java.lang.String p_id,
           int priority,
           java.lang.String productNumber,
           java.lang.String productSide,
           double quantity,
           java.lang.String replaceProductGroupNumber,
           java.lang.String schemaNumber,
           java.lang.String subSchemaNumber) {
           this.bomNumber = bomNumber;
           this.children = children;
           this.description = description;
           this.givenUnit = givenUnit;
           this.id = id;
           this.materialPosition = materialPosition;
           this.operationNumber = operationNumber;
           this.p_id = p_id;
           this.priority = priority;
           this.productNumber = productNumber;
           this.productSide = productSide;
           this.quantity = quantity;
           this.replaceProductGroupNumber = replaceProductGroupNumber;
           this.schemaNumber = schemaNumber;
           this.subSchemaNumber = subSchemaNumber;
    }


    /**
     * Gets the bomNumber value for this SchemaBomComponent.
     * 
     * @return bomNumber
     */
    public java.lang.String getBomNumber() {
        return bomNumber;
    }


    /**
     * Sets the bomNumber value for this SchemaBomComponent.
     * 
     * @param bomNumber
     */
    public void setBomNumber(java.lang.String bomNumber) {
        this.bomNumber = bomNumber;
    }


    /**
     * Gets the children value for this SchemaBomComponent.
     * 
     * @return children
     */
    public com.fujitsu.service.SchemaBomComponent[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this SchemaBomComponent.
     * 
     * @param children
     */
    public void setChildren(com.fujitsu.service.SchemaBomComponent[] children) {
        this.children = children;
    }

    public com.fujitsu.service.SchemaBomComponent getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.fujitsu.service.SchemaBomComponent _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the description value for this SchemaBomComponent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SchemaBomComponent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the givenUnit value for this SchemaBomComponent.
     * 
     * @return givenUnit
     */
    public java.lang.String getGivenUnit() {
        return givenUnit;
    }


    /**
     * Sets the givenUnit value for this SchemaBomComponent.
     * 
     * @param givenUnit
     */
    public void setGivenUnit(java.lang.String givenUnit) {
        this.givenUnit = givenUnit;
    }


    /**
     * Gets the id value for this SchemaBomComponent.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SchemaBomComponent.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the materialPosition value for this SchemaBomComponent.
     * 
     * @return materialPosition
     */
    public java.lang.String getMaterialPosition() {
        return materialPosition;
    }


    /**
     * Sets the materialPosition value for this SchemaBomComponent.
     * 
     * @param materialPosition
     */
    public void setMaterialPosition(java.lang.String materialPosition) {
        this.materialPosition = materialPosition;
    }


    /**
     * Gets the operationNumber value for this SchemaBomComponent.
     * 
     * @return operationNumber
     */
    public java.lang.String getOperationNumber() {
        return operationNumber;
    }


    /**
     * Sets the operationNumber value for this SchemaBomComponent.
     * 
     * @param operationNumber
     */
    public void setOperationNumber(java.lang.String operationNumber) {
        this.operationNumber = operationNumber;
    }


    /**
     * Gets the p_id value for this SchemaBomComponent.
     * 
     * @return p_id
     */
    public java.lang.String getP_id() {
        return p_id;
    }


    /**
     * Sets the p_id value for this SchemaBomComponent.
     * 
     * @param p_id
     */
    public void setP_id(java.lang.String p_id) {
        this.p_id = p_id;
    }


    /**
     * Gets the priority value for this SchemaBomComponent.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SchemaBomComponent.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the productNumber value for this SchemaBomComponent.
     * 
     * @return productNumber
     */
    public java.lang.String getProductNumber() {
        return productNumber;
    }


    /**
     * Sets the productNumber value for this SchemaBomComponent.
     * 
     * @param productNumber
     */
    public void setProductNumber(java.lang.String productNumber) {
        this.productNumber = productNumber;
    }


    /**
     * Gets the productSide value for this SchemaBomComponent.
     * 
     * @return productSide
     */
    public java.lang.String getProductSide() {
        return productSide;
    }


    /**
     * Sets the productSide value for this SchemaBomComponent.
     * 
     * @param productSide
     */
    public void setProductSide(java.lang.String productSide) {
        this.productSide = productSide;
    }


    /**
     * Gets the quantity value for this SchemaBomComponent.
     * 
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SchemaBomComponent.
     * 
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the replaceProductGroupNumber value for this SchemaBomComponent.
     * 
     * @return replaceProductGroupNumber
     */
    public java.lang.String getReplaceProductGroupNumber() {
        return replaceProductGroupNumber;
    }


    /**
     * Sets the replaceProductGroupNumber value for this SchemaBomComponent.
     * 
     * @param replaceProductGroupNumber
     */
    public void setReplaceProductGroupNumber(java.lang.String replaceProductGroupNumber) {
        this.replaceProductGroupNumber = replaceProductGroupNumber;
    }


    /**
     * Gets the schemaNumber value for this SchemaBomComponent.
     * 
     * @return schemaNumber
     */
    public java.lang.String getSchemaNumber() {
        return schemaNumber;
    }


    /**
     * Sets the schemaNumber value for this SchemaBomComponent.
     * 
     * @param schemaNumber
     */
    public void setSchemaNumber(java.lang.String schemaNumber) {
        this.schemaNumber = schemaNumber;
    }


    /**
     * Gets the subSchemaNumber value for this SchemaBomComponent.
     * 
     * @return subSchemaNumber
     */
    public java.lang.String getSubSchemaNumber() {
        return subSchemaNumber;
    }


    /**
     * Sets the subSchemaNumber value for this SchemaBomComponent.
     * 
     * @param subSchemaNumber
     */
    public void setSubSchemaNumber(java.lang.String subSchemaNumber) {
        this.subSchemaNumber = subSchemaNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchemaBomComponent)) return false;
        SchemaBomComponent other = (SchemaBomComponent) obj;
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
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.givenUnit==null && other.getGivenUnit()==null) || 
             (this.givenUnit!=null &&
              this.givenUnit.equals(other.getGivenUnit()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.materialPosition==null && other.getMaterialPosition()==null) || 
             (this.materialPosition!=null &&
              this.materialPosition.equals(other.getMaterialPosition()))) &&
            ((this.operationNumber==null && other.getOperationNumber()==null) || 
             (this.operationNumber!=null &&
              this.operationNumber.equals(other.getOperationNumber()))) &&
            ((this.p_id==null && other.getP_id()==null) || 
             (this.p_id!=null &&
              this.p_id.equals(other.getP_id()))) &&
            this.priority == other.getPriority() &&
            ((this.productNumber==null && other.getProductNumber()==null) || 
             (this.productNumber!=null &&
              this.productNumber.equals(other.getProductNumber()))) &&
            ((this.productSide==null && other.getProductSide()==null) || 
             (this.productSide!=null &&
              this.productSide.equals(other.getProductSide()))) &&
            this.quantity == other.getQuantity() &&
            ((this.replaceProductGroupNumber==null && other.getReplaceProductGroupNumber()==null) || 
             (this.replaceProductGroupNumber!=null &&
              this.replaceProductGroupNumber.equals(other.getReplaceProductGroupNumber()))) &&
            ((this.schemaNumber==null && other.getSchemaNumber()==null) || 
             (this.schemaNumber!=null &&
              this.schemaNumber.equals(other.getSchemaNumber()))) &&
            ((this.subSchemaNumber==null && other.getSubSchemaNumber()==null) || 
             (this.subSchemaNumber!=null &&
              this.subSchemaNumber.equals(other.getSubSchemaNumber())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGivenUnit() != null) {
            _hashCode += getGivenUnit().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMaterialPosition() != null) {
            _hashCode += getMaterialPosition().hashCode();
        }
        if (getOperationNumber() != null) {
            _hashCode += getOperationNumber().hashCode();
        }
        if (getP_id() != null) {
            _hashCode += getP_id().hashCode();
        }
        _hashCode += getPriority();
        if (getProductNumber() != null) {
            _hashCode += getProductNumber().hashCode();
        }
        if (getProductSide() != null) {
            _hashCode += getProductSide().hashCode();
        }
        _hashCode += new Double(getQuantity()).hashCode();
        if (getReplaceProductGroupNumber() != null) {
            _hashCode += getReplaceProductGroupNumber().hashCode();
        }
        if (getSchemaNumber() != null) {
            _hashCode += getSchemaNumber().hashCode();
        }
        if (getSubSchemaNumber() != null) {
            _hashCode += getSubSchemaNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchemaBomComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bomNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materialPosition"));
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
        elemField.setFieldName("p_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("productSide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaceProductGroupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replaceProductGroupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemaNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSchemaNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subSchemaNumber"));
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
