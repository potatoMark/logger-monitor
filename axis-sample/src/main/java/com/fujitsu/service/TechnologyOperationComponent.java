/**
 * TechnologyOperationComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class TechnologyOperationComponent  implements java.io.Serializable {
    private com.fujitsu.service.TechnologyOperationComponent[] children;

    private java.lang.String mandatory;

    private java.lang.String operationNumber;

    private int priority;

    private java.lang.String productSide;

    public TechnologyOperationComponent() {
    }

    public TechnologyOperationComponent(
           com.fujitsu.service.TechnologyOperationComponent[] children,
           java.lang.String mandatory,
           java.lang.String operationNumber,
           int priority,
           java.lang.String productSide) {
           this.children = children;
           this.mandatory = mandatory;
           this.operationNumber = operationNumber;
           this.priority = priority;
           this.productSide = productSide;
    }


    /**
     * Gets the children value for this TechnologyOperationComponent.
     * 
     * @return children
     */
    public com.fujitsu.service.TechnologyOperationComponent[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this TechnologyOperationComponent.
     * 
     * @param children
     */
    public void setChildren(com.fujitsu.service.TechnologyOperationComponent[] children) {
        this.children = children;
    }

    public com.fujitsu.service.TechnologyOperationComponent getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.fujitsu.service.TechnologyOperationComponent _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the mandatory value for this TechnologyOperationComponent.
     * 
     * @return mandatory
     */
    public java.lang.String getMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this TechnologyOperationComponent.
     * 
     * @param mandatory
     */
    public void setMandatory(java.lang.String mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the operationNumber value for this TechnologyOperationComponent.
     * 
     * @return operationNumber
     */
    public java.lang.String getOperationNumber() {
        return operationNumber;
    }


    /**
     * Sets the operationNumber value for this TechnologyOperationComponent.
     * 
     * @param operationNumber
     */
    public void setOperationNumber(java.lang.String operationNumber) {
        this.operationNumber = operationNumber;
    }


    /**
     * Gets the priority value for this TechnologyOperationComponent.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TechnologyOperationComponent.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the productSide value for this TechnologyOperationComponent.
     * 
     * @return productSide
     */
    public java.lang.String getProductSide() {
        return productSide;
    }


    /**
     * Sets the productSide value for this TechnologyOperationComponent.
     * 
     * @param productSide
     */
    public void setProductSide(java.lang.String productSide) {
        this.productSide = productSide;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TechnologyOperationComponent)) return false;
        TechnologyOperationComponent other = (TechnologyOperationComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.mandatory==null && other.getMandatory()==null) || 
             (this.mandatory!=null &&
              this.mandatory.equals(other.getMandatory()))) &&
            ((this.operationNumber==null && other.getOperationNumber()==null) || 
             (this.operationNumber!=null &&
              this.operationNumber.equals(other.getOperationNumber()))) &&
            this.priority == other.getPriority() &&
            ((this.productSide==null && other.getProductSide()==null) || 
             (this.productSide!=null &&
              this.productSide.equals(other.getProductSide())));
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
        if (getMandatory() != null) {
            _hashCode += getMandatory().hashCode();
        }
        if (getOperationNumber() != null) {
            _hashCode += getOperationNumber().hashCode();
        }
        _hashCode += getPriority();
        if (getProductSide() != null) {
            _hashCode += getProductSide().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TechnologyOperationComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyOperationComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyOperationComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mandatory"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSide"));
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
