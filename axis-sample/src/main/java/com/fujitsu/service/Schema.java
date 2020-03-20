/**
 * Schema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class Schema  implements java.io.Serializable {
    private java.lang.String bomNumber;

    private java.lang.String description;

    private java.lang.String details_1;

    private java.lang.String details_10;

    private java.lang.String details_2;

    private java.lang.String details_3;

    private java.lang.String details_4;

    private java.lang.String details_5;

    private java.lang.String details_6;

    private java.lang.String details_7;

    private java.lang.String details_8;

    private java.lang.String details_9;

    private java.lang.String name;

    private java.lang.String number;

    private com.fujitsu.service.SchemaBomResourceComponent[] resourceComponents;

    private com.fujitsu.service.SchemaBomComponent root;

    public Schema() {
    }

    public Schema(
           java.lang.String bomNumber,
           java.lang.String description,
           java.lang.String details_1,
           java.lang.String details_10,
           java.lang.String details_2,
           java.lang.String details_3,
           java.lang.String details_4,
           java.lang.String details_5,
           java.lang.String details_6,
           java.lang.String details_7,
           java.lang.String details_8,
           java.lang.String details_9,
           java.lang.String name,
           java.lang.String number,
           com.fujitsu.service.SchemaBomResourceComponent[] resourceComponents,
           com.fujitsu.service.SchemaBomComponent root) {
           this.bomNumber = bomNumber;
           this.description = description;
           this.details_1 = details_1;
           this.details_10 = details_10;
           this.details_2 = details_2;
           this.details_3 = details_3;
           this.details_4 = details_4;
           this.details_5 = details_5;
           this.details_6 = details_6;
           this.details_7 = details_7;
           this.details_8 = details_8;
           this.details_9 = details_9;
           this.name = name;
           this.number = number;
           this.resourceComponents = resourceComponents;
           this.root = root;
    }


    /**
     * Gets the bomNumber value for this Schema.
     * 
     * @return bomNumber
     */
    public java.lang.String getBomNumber() {
        return bomNumber;
    }


    /**
     * Sets the bomNumber value for this Schema.
     * 
     * @param bomNumber
     */
    public void setBomNumber(java.lang.String bomNumber) {
        this.bomNumber = bomNumber;
    }


    /**
     * Gets the description value for this Schema.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Schema.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the details_1 value for this Schema.
     * 
     * @return details_1
     */
    public java.lang.String getDetails_1() {
        return details_1;
    }


    /**
     * Sets the details_1 value for this Schema.
     * 
     * @param details_1
     */
    public void setDetails_1(java.lang.String details_1) {
        this.details_1 = details_1;
    }


    /**
     * Gets the details_10 value for this Schema.
     * 
     * @return details_10
     */
    public java.lang.String getDetails_10() {
        return details_10;
    }


    /**
     * Sets the details_10 value for this Schema.
     * 
     * @param details_10
     */
    public void setDetails_10(java.lang.String details_10) {
        this.details_10 = details_10;
    }


    /**
     * Gets the details_2 value for this Schema.
     * 
     * @return details_2
     */
    public java.lang.String getDetails_2() {
        return details_2;
    }


    /**
     * Sets the details_2 value for this Schema.
     * 
     * @param details_2
     */
    public void setDetails_2(java.lang.String details_2) {
        this.details_2 = details_2;
    }


    /**
     * Gets the details_3 value for this Schema.
     * 
     * @return details_3
     */
    public java.lang.String getDetails_3() {
        return details_3;
    }


    /**
     * Sets the details_3 value for this Schema.
     * 
     * @param details_3
     */
    public void setDetails_3(java.lang.String details_3) {
        this.details_3 = details_3;
    }


    /**
     * Gets the details_4 value for this Schema.
     * 
     * @return details_4
     */
    public java.lang.String getDetails_4() {
        return details_4;
    }


    /**
     * Sets the details_4 value for this Schema.
     * 
     * @param details_4
     */
    public void setDetails_4(java.lang.String details_4) {
        this.details_4 = details_4;
    }


    /**
     * Gets the details_5 value for this Schema.
     * 
     * @return details_5
     */
    public java.lang.String getDetails_5() {
        return details_5;
    }


    /**
     * Sets the details_5 value for this Schema.
     * 
     * @param details_5
     */
    public void setDetails_5(java.lang.String details_5) {
        this.details_5 = details_5;
    }


    /**
     * Gets the details_6 value for this Schema.
     * 
     * @return details_6
     */
    public java.lang.String getDetails_6() {
        return details_6;
    }


    /**
     * Sets the details_6 value for this Schema.
     * 
     * @param details_6
     */
    public void setDetails_6(java.lang.String details_6) {
        this.details_6 = details_6;
    }


    /**
     * Gets the details_7 value for this Schema.
     * 
     * @return details_7
     */
    public java.lang.String getDetails_7() {
        return details_7;
    }


    /**
     * Sets the details_7 value for this Schema.
     * 
     * @param details_7
     */
    public void setDetails_7(java.lang.String details_7) {
        this.details_7 = details_7;
    }


    /**
     * Gets the details_8 value for this Schema.
     * 
     * @return details_8
     */
    public java.lang.String getDetails_8() {
        return details_8;
    }


    /**
     * Sets the details_8 value for this Schema.
     * 
     * @param details_8
     */
    public void setDetails_8(java.lang.String details_8) {
        this.details_8 = details_8;
    }


    /**
     * Gets the details_9 value for this Schema.
     * 
     * @return details_9
     */
    public java.lang.String getDetails_9() {
        return details_9;
    }


    /**
     * Sets the details_9 value for this Schema.
     * 
     * @param details_9
     */
    public void setDetails_9(java.lang.String details_9) {
        this.details_9 = details_9;
    }


    /**
     * Gets the name value for this Schema.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Schema.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this Schema.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Schema.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the resourceComponents value for this Schema.
     * 
     * @return resourceComponents
     */
    public com.fujitsu.service.SchemaBomResourceComponent[] getResourceComponents() {
        return resourceComponents;
    }


    /**
     * Sets the resourceComponents value for this Schema.
     * 
     * @param resourceComponents
     */
    public void setResourceComponents(com.fujitsu.service.SchemaBomResourceComponent[] resourceComponents) {
        this.resourceComponents = resourceComponents;
    }

    public com.fujitsu.service.SchemaBomResourceComponent getResourceComponents(int i) {
        return this.resourceComponents[i];
    }

    public void setResourceComponents(int i, com.fujitsu.service.SchemaBomResourceComponent _value) {
        this.resourceComponents[i] = _value;
    }


    /**
     * Gets the root value for this Schema.
     * 
     * @return root
     */
    public com.fujitsu.service.SchemaBomComponent getRoot() {
        return root;
    }


    /**
     * Sets the root value for this Schema.
     * 
     * @param root
     */
    public void setRoot(com.fujitsu.service.SchemaBomComponent root) {
        this.root = root;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Schema)) return false;
        Schema other = (Schema) obj;
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
            ((this.details_1==null && other.getDetails_1()==null) || 
             (this.details_1!=null &&
              this.details_1.equals(other.getDetails_1()))) &&
            ((this.details_10==null && other.getDetails_10()==null) || 
             (this.details_10!=null &&
              this.details_10.equals(other.getDetails_10()))) &&
            ((this.details_2==null && other.getDetails_2()==null) || 
             (this.details_2!=null &&
              this.details_2.equals(other.getDetails_2()))) &&
            ((this.details_3==null && other.getDetails_3()==null) || 
             (this.details_3!=null &&
              this.details_3.equals(other.getDetails_3()))) &&
            ((this.details_4==null && other.getDetails_4()==null) || 
             (this.details_4!=null &&
              this.details_4.equals(other.getDetails_4()))) &&
            ((this.details_5==null && other.getDetails_5()==null) || 
             (this.details_5!=null &&
              this.details_5.equals(other.getDetails_5()))) &&
            ((this.details_6==null && other.getDetails_6()==null) || 
             (this.details_6!=null &&
              this.details_6.equals(other.getDetails_6()))) &&
            ((this.details_7==null && other.getDetails_7()==null) || 
             (this.details_7!=null &&
              this.details_7.equals(other.getDetails_7()))) &&
            ((this.details_8==null && other.getDetails_8()==null) || 
             (this.details_8!=null &&
              this.details_8.equals(other.getDetails_8()))) &&
            ((this.details_9==null && other.getDetails_9()==null) || 
             (this.details_9!=null &&
              this.details_9.equals(other.getDetails_9()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.resourceComponents==null && other.getResourceComponents()==null) || 
             (this.resourceComponents!=null &&
              java.util.Arrays.equals(this.resourceComponents, other.getResourceComponents()))) &&
            ((this.root==null && other.getRoot()==null) || 
             (this.root!=null &&
              this.root.equals(other.getRoot())));
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
        if (getDetails_1() != null) {
            _hashCode += getDetails_1().hashCode();
        }
        if (getDetails_10() != null) {
            _hashCode += getDetails_10().hashCode();
        }
        if (getDetails_2() != null) {
            _hashCode += getDetails_2().hashCode();
        }
        if (getDetails_3() != null) {
            _hashCode += getDetails_3().hashCode();
        }
        if (getDetails_4() != null) {
            _hashCode += getDetails_4().hashCode();
        }
        if (getDetails_5() != null) {
            _hashCode += getDetails_5().hashCode();
        }
        if (getDetails_6() != null) {
            _hashCode += getDetails_6().hashCode();
        }
        if (getDetails_7() != null) {
            _hashCode += getDetails_7().hashCode();
        }
        if (getDetails_8() != null) {
            _hashCode += getDetails_8().hashCode();
        }
        if (getDetails_9() != null) {
            _hashCode += getDetails_9().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getResourceComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoot() != null) {
            _hashCode += getRoot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Schema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schema"));
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
        elemField.setFieldName("details_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details_9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details_9"));
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
        elemField.setFieldName("resourceComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomResourceComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root");
        elemField.setXmlName(new javax.xml.namespace.QName("", "root"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomComponent"));
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
