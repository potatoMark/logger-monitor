/**
 * OperationResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class OperationResource  implements java.io.Serializable {
    private int advanceCount;

    private int maxCount;

    private int maxTime;

    private java.lang.String name;

    private java.lang.String number;

    private java.lang.String[] operationTypeNumbers;

    private java.lang.String resourceType;

    private boolean sendFlag;

    public OperationResource() {
    }

    public OperationResource(
           int advanceCount,
           int maxCount,
           int maxTime,
           java.lang.String name,
           java.lang.String number,
           java.lang.String[] operationTypeNumbers,
           java.lang.String resourceType,
           boolean sendFlag) {
           this.advanceCount = advanceCount;
           this.maxCount = maxCount;
           this.maxTime = maxTime;
           this.name = name;
           this.number = number;
           this.operationTypeNumbers = operationTypeNumbers;
           this.resourceType = resourceType;
           this.sendFlag = sendFlag;
    }


    /**
     * Gets the advanceCount value for this OperationResource.
     * 
     * @return advanceCount
     */
    public int getAdvanceCount() {
        return advanceCount;
    }


    /**
     * Sets the advanceCount value for this OperationResource.
     * 
     * @param advanceCount
     */
    public void setAdvanceCount(int advanceCount) {
        this.advanceCount = advanceCount;
    }


    /**
     * Gets the maxCount value for this OperationResource.
     * 
     * @return maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }


    /**
     * Sets the maxCount value for this OperationResource.
     * 
     * @param maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }


    /**
     * Gets the maxTime value for this OperationResource.
     * 
     * @return maxTime
     */
    public int getMaxTime() {
        return maxTime;
    }


    /**
     * Sets the maxTime value for this OperationResource.
     * 
     * @param maxTime
     */
    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }


    /**
     * Gets the name value for this OperationResource.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperationResource.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this OperationResource.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OperationResource.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the operationTypeNumbers value for this OperationResource.
     * 
     * @return operationTypeNumbers
     */
    public java.lang.String[] getOperationTypeNumbers() {
        return operationTypeNumbers;
    }


    /**
     * Sets the operationTypeNumbers value for this OperationResource.
     * 
     * @param operationTypeNumbers
     */
    public void setOperationTypeNumbers(java.lang.String[] operationTypeNumbers) {
        this.operationTypeNumbers = operationTypeNumbers;
    }

    public java.lang.String getOperationTypeNumbers(int i) {
        return this.operationTypeNumbers[i];
    }

    public void setOperationTypeNumbers(int i, java.lang.String _value) {
        this.operationTypeNumbers[i] = _value;
    }


    /**
     * Gets the resourceType value for this OperationResource.
     * 
     * @return resourceType
     */
    public java.lang.String getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this OperationResource.
     * 
     * @param resourceType
     */
    public void setResourceType(java.lang.String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * Gets the sendFlag value for this OperationResource.
     * 
     * @return sendFlag
     */
    public boolean isSendFlag() {
        return sendFlag;
    }


    /**
     * Sets the sendFlag value for this OperationResource.
     * 
     * @param sendFlag
     */
    public void setSendFlag(boolean sendFlag) {
        this.sendFlag = sendFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResource)) return false;
        OperationResource other = (OperationResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.advanceCount == other.getAdvanceCount() &&
            this.maxCount == other.getMaxCount() &&
            this.maxTime == other.getMaxTime() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.operationTypeNumbers==null && other.getOperationTypeNumbers()==null) || 
             (this.operationTypeNumbers!=null &&
              java.util.Arrays.equals(this.operationTypeNumbers, other.getOperationTypeNumbers()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType()))) &&
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
        _hashCode += getAdvanceCount();
        _hashCode += getMaxCount();
        _hashCode += getMaxTime();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOperationTypeNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationTypeNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationTypeNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        _hashCode += (isSendFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advanceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("operationTypeNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationTypeNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceType"));
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
