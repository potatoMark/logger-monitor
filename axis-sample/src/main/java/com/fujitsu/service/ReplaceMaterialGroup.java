/**
 * ReplaceMaterialGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class ReplaceMaterialGroup  implements java.io.Serializable {
    private java.lang.String groupNumber;

    private java.lang.String materialNumber;

    private java.lang.String[] replaceMaterialNumbers;

    private boolean sendFlag;

    public ReplaceMaterialGroup() {
    }

    public ReplaceMaterialGroup(
           java.lang.String groupNumber,
           java.lang.String materialNumber,
           java.lang.String[] replaceMaterialNumbers,
           boolean sendFlag) {
           this.groupNumber = groupNumber;
           this.materialNumber = materialNumber;
           this.replaceMaterialNumbers = replaceMaterialNumbers;
           this.sendFlag = sendFlag;
    }


    /**
     * Gets the groupNumber value for this ReplaceMaterialGroup.
     * 
     * @return groupNumber
     */
    public java.lang.String getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this ReplaceMaterialGroup.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(java.lang.String groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the materialNumber value for this ReplaceMaterialGroup.
     * 
     * @return materialNumber
     */
    public java.lang.String getMaterialNumber() {
        return materialNumber;
    }


    /**
     * Sets the materialNumber value for this ReplaceMaterialGroup.
     * 
     * @param materialNumber
     */
    public void setMaterialNumber(java.lang.String materialNumber) {
        this.materialNumber = materialNumber;
    }


    /**
     * Gets the replaceMaterialNumbers value for this ReplaceMaterialGroup.
     * 
     * @return replaceMaterialNumbers
     */
    public java.lang.String[] getReplaceMaterialNumbers() {
        return replaceMaterialNumbers;
    }


    /**
     * Sets the replaceMaterialNumbers value for this ReplaceMaterialGroup.
     * 
     * @param replaceMaterialNumbers
     */
    public void setReplaceMaterialNumbers(java.lang.String[] replaceMaterialNumbers) {
        this.replaceMaterialNumbers = replaceMaterialNumbers;
    }

    public java.lang.String getReplaceMaterialNumbers(int i) {
        return this.replaceMaterialNumbers[i];
    }

    public void setReplaceMaterialNumbers(int i, java.lang.String _value) {
        this.replaceMaterialNumbers[i] = _value;
    }


    /**
     * Gets the sendFlag value for this ReplaceMaterialGroup.
     * 
     * @return sendFlag
     */
    public boolean isSendFlag() {
        return sendFlag;
    }


    /**
     * Sets the sendFlag value for this ReplaceMaterialGroup.
     * 
     * @param sendFlag
     */
    public void setSendFlag(boolean sendFlag) {
        this.sendFlag = sendFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplaceMaterialGroup)) return false;
        ReplaceMaterialGroup other = (ReplaceMaterialGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.materialNumber==null && other.getMaterialNumber()==null) || 
             (this.materialNumber!=null &&
              this.materialNumber.equals(other.getMaterialNumber()))) &&
            ((this.replaceMaterialNumbers==null && other.getReplaceMaterialNumbers()==null) || 
             (this.replaceMaterialNumbers!=null &&
              java.util.Arrays.equals(this.replaceMaterialNumbers, other.getReplaceMaterialNumbers()))) &&
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
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getMaterialNumber() != null) {
            _hashCode += getMaterialNumber().hashCode();
        }
        if (getReplaceMaterialNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReplaceMaterialNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReplaceMaterialNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(ReplaceMaterialGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaceMaterialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replaceMaterialNumbers"));
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
