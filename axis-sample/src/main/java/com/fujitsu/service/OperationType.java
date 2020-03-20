/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class OperationType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String number;

    private java.lang.String[] operationNumbers;

    private boolean sendFlag;

    public OperationType() {
    }

    public OperationType(
           java.lang.String name,
           java.lang.String number,
           java.lang.String[] operationNumbers,
           boolean sendFlag) {
           this.name = name;
           this.number = number;
           this.operationNumbers = operationNumbers;
           this.sendFlag = sendFlag;
    }


    /**
     * Gets the name value for this OperationType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperationType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this OperationType.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OperationType.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the operationNumbers value for this OperationType.
     * 
     * @return operationNumbers
     */
    public java.lang.String[] getOperationNumbers() {
        return operationNumbers;
    }


    /**
     * Sets the operationNumbers value for this OperationType.
     * 
     * @param operationNumbers
     */
    public void setOperationNumbers(java.lang.String[] operationNumbers) {
        this.operationNumbers = operationNumbers;
    }

    public java.lang.String getOperationNumbers(int i) {
        return this.operationNumbers[i];
    }

    public void setOperationNumbers(int i, java.lang.String _value) {
        this.operationNumbers[i] = _value;
    }


    /**
     * Gets the sendFlag value for this OperationType.
     * 
     * @return sendFlag
     */
    public boolean isSendFlag() {
        return sendFlag;
    }


    /**
     * Sets the sendFlag value for this OperationType.
     * 
     * @param sendFlag
     */
    public void setSendFlag(boolean sendFlag) {
        this.sendFlag = sendFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationType)) return false;
        OperationType other = (OperationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.operationNumbers==null && other.getOperationNumbers()==null) || 
             (this.operationNumbers!=null &&
              java.util.Arrays.equals(this.operationNumbers, other.getOperationNumbers()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOperationNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSendFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("operationNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
