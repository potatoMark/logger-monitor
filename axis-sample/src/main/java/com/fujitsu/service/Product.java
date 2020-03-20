/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class Product  implements java.io.Serializable {
    private com.fujitsu.service.Bom[] boms;

    private com.fujitsu.service.Material[] materials;

    private com.fujitsu.service.OperationResource[] operationResources;

    private com.fujitsu.service.OperationType[] operationTypes;

    private java.lang.String productNumber;

    private com.fujitsu.service.ReplaceMaterialGroup[] replaceMaterialGroups;

    private com.fujitsu.service.Technology[] technologys;

    public Product() {
    }

    public Product(
           com.fujitsu.service.Bom[] boms,
           com.fujitsu.service.Material[] materials,
           com.fujitsu.service.OperationResource[] operationResources,
           com.fujitsu.service.OperationType[] operationTypes,
           java.lang.String productNumber,
           com.fujitsu.service.ReplaceMaterialGroup[] replaceMaterialGroups,
           com.fujitsu.service.Technology[] technologys) {
           this.boms = boms;
           this.materials = materials;
           this.operationResources = operationResources;
           this.operationTypes = operationTypes;
           this.productNumber = productNumber;
           this.replaceMaterialGroups = replaceMaterialGroups;
           this.technologys = technologys;
    }


    /**
     * Gets the boms value for this Product.
     * 
     * @return boms
     */
    public com.fujitsu.service.Bom[] getBoms() {
        return boms;
    }


    /**
     * Sets the boms value for this Product.
     * 
     * @param boms
     */
    public void setBoms(com.fujitsu.service.Bom[] boms) {
        this.boms = boms;
    }

    public com.fujitsu.service.Bom getBoms(int i) {
        return this.boms[i];
    }

    public void setBoms(int i, com.fujitsu.service.Bom _value) {
        this.boms[i] = _value;
    }


    /**
     * Gets the materials value for this Product.
     * 
     * @return materials
     */
    public com.fujitsu.service.Material[] getMaterials() {
        return materials;
    }


    /**
     * Sets the materials value for this Product.
     * 
     * @param materials
     */
    public void setMaterials(com.fujitsu.service.Material[] materials) {
        this.materials = materials;
    }

    public com.fujitsu.service.Material getMaterials(int i) {
        return this.materials[i];
    }

    public void setMaterials(int i, com.fujitsu.service.Material _value) {
        this.materials[i] = _value;
    }


    /**
     * Gets the operationResources value for this Product.
     * 
     * @return operationResources
     */
    public com.fujitsu.service.OperationResource[] getOperationResources() {
        return operationResources;
    }


    /**
     * Sets the operationResources value for this Product.
     * 
     * @param operationResources
     */
    public void setOperationResources(com.fujitsu.service.OperationResource[] operationResources) {
        this.operationResources = operationResources;
    }

    public com.fujitsu.service.OperationResource getOperationResources(int i) {
        return this.operationResources[i];
    }

    public void setOperationResources(int i, com.fujitsu.service.OperationResource _value) {
        this.operationResources[i] = _value;
    }


    /**
     * Gets the operationTypes value for this Product.
     * 
     * @return operationTypes
     */
    public com.fujitsu.service.OperationType[] getOperationTypes() {
        return operationTypes;
    }


    /**
     * Sets the operationTypes value for this Product.
     * 
     * @param operationTypes
     */
    public void setOperationTypes(com.fujitsu.service.OperationType[] operationTypes) {
        this.operationTypes = operationTypes;
    }

    public com.fujitsu.service.OperationType getOperationTypes(int i) {
        return this.operationTypes[i];
    }

    public void setOperationTypes(int i, com.fujitsu.service.OperationType _value) {
        this.operationTypes[i] = _value;
    }


    /**
     * Gets the productNumber value for this Product.
     * 
     * @return productNumber
     */
    public java.lang.String getProductNumber() {
        return productNumber;
    }


    /**
     * Sets the productNumber value for this Product.
     * 
     * @param productNumber
     */
    public void setProductNumber(java.lang.String productNumber) {
        this.productNumber = productNumber;
    }


    /**
     * Gets the replaceMaterialGroups value for this Product.
     * 
     * @return replaceMaterialGroups
     */
    public com.fujitsu.service.ReplaceMaterialGroup[] getReplaceMaterialGroups() {
        return replaceMaterialGroups;
    }


    /**
     * Sets the replaceMaterialGroups value for this Product.
     * 
     * @param replaceMaterialGroups
     */
    public void setReplaceMaterialGroups(com.fujitsu.service.ReplaceMaterialGroup[] replaceMaterialGroups) {
        this.replaceMaterialGroups = replaceMaterialGroups;
    }

    public com.fujitsu.service.ReplaceMaterialGroup getReplaceMaterialGroups(int i) {
        return this.replaceMaterialGroups[i];
    }

    public void setReplaceMaterialGroups(int i, com.fujitsu.service.ReplaceMaterialGroup _value) {
        this.replaceMaterialGroups[i] = _value;
    }


    /**
     * Gets the technologys value for this Product.
     * 
     * @return technologys
     */
    public com.fujitsu.service.Technology[] getTechnologys() {
        return technologys;
    }


    /**
     * Sets the technologys value for this Product.
     * 
     * @param technologys
     */
    public void setTechnologys(com.fujitsu.service.Technology[] technologys) {
        this.technologys = technologys;
    }

    public com.fujitsu.service.Technology getTechnologys(int i) {
        return this.technologys[i];
    }

    public void setTechnologys(int i, com.fujitsu.service.Technology _value) {
        this.technologys[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boms==null && other.getBoms()==null) || 
             (this.boms!=null &&
              java.util.Arrays.equals(this.boms, other.getBoms()))) &&
            ((this.materials==null && other.getMaterials()==null) || 
             (this.materials!=null &&
              java.util.Arrays.equals(this.materials, other.getMaterials()))) &&
            ((this.operationResources==null && other.getOperationResources()==null) || 
             (this.operationResources!=null &&
              java.util.Arrays.equals(this.operationResources, other.getOperationResources()))) &&
            ((this.operationTypes==null && other.getOperationTypes()==null) || 
             (this.operationTypes!=null &&
              java.util.Arrays.equals(this.operationTypes, other.getOperationTypes()))) &&
            ((this.productNumber==null && other.getProductNumber()==null) || 
             (this.productNumber!=null &&
              this.productNumber.equals(other.getProductNumber()))) &&
            ((this.replaceMaterialGroups==null && other.getReplaceMaterialGroups()==null) || 
             (this.replaceMaterialGroups!=null &&
              java.util.Arrays.equals(this.replaceMaterialGroups, other.getReplaceMaterialGroups()))) &&
            ((this.technologys==null && other.getTechnologys()==null) || 
             (this.technologys!=null &&
              java.util.Arrays.equals(this.technologys, other.getTechnologys())));
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
        if (getBoms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductNumber() != null) {
            _hashCode += getProductNumber().hashCode();
        }
        if (getReplaceMaterialGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReplaceMaterialGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReplaceMaterialGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTechnologys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTechnologys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTechnologys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "material"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaceMaterialGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replaceMaterialGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technologys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "technologys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
