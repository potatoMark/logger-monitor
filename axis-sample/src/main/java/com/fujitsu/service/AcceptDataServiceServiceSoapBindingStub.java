/**
 * AcceptDataServiceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class AcceptDataServiceServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fujitsu.service.AcceptDataService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "product"), com.fujitsu.service.Product.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerReplaceMaterialGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replaceMaterialGroups"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroupArray"), com.fujitsu.service.ReplaceMaterialGroup[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerTechnology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "technologys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyArray"), com.fujitsu.service.Technology[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaArray"), com.fujitsu.service.Schema[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerMaterial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "materials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "materialArray"), com.fujitsu.service.Material[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaArray"), com.fujitsu.service.Schema[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerBom");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bomArray"), com.fujitsu.service.Bom[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationArray"), com.fujitsu.service.Operation[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerOperationResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operationResources"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResourceArray"), com.fujitsu.service.OperationResource[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelBom");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bomArray"), com.fujitsu.service.Bom[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerOperationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operationTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationTypeArray"), com.fujitsu.service.OperationType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refreshSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaArray"), com.fujitsu.service.Schema[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelTechnology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "technologys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyArray"), com.fujitsu.service.Technology[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage"));
        oper.setReturnClass(com.fujitsu.service.ResultMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

    }

    public AcceptDataServiceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AcceptDataServiceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AcceptDataServiceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bom");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Bom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bomArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Bom[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "bom");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "material");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Material.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "materialArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Material[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "material");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operation");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Operation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operation");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResource");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.OperationResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResourceArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.OperationResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationResource");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationType");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationTypeArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.OperationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "operationType");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "product");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroup");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.ReplaceMaterialGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroupArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.ReplaceMaterialGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "replaceMaterialGroup");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "resultMessage");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.ResultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schema");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Schema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Schema[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schema");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomComponent");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.SchemaBomComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "schemaBomResourceComponent");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.SchemaBomResourceComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technology");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Technology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyArray");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.Technology[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technology");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "technologyOperationComponent");
            cachedSerQNames.add(qName);
            cls = com.fujitsu.service.TechnologyOperationComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fujitsu.service.ResultMessage registerProduct(com.fujitsu.service.Product product) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerReplaceMaterialGroup(com.fujitsu.service.ReplaceMaterialGroup[] replaceMaterialGroups) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerReplaceMaterialGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {replaceMaterialGroups});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerTechnology(com.fujitsu.service.Technology[] technologys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerTechnology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {technologys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerMaterial(com.fujitsu.service.Material[] materials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerMaterial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {materials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage cancelSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "cancelSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerBom(com.fujitsu.service.Bom[] boms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerBom"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {boms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerOperation(com.fujitsu.service.Operation[] operations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerOperationResource(com.fujitsu.service.OperationResource[] operationResources) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerOperationResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operationResources});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage cancelBom(com.fujitsu.service.Bom[] boms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "cancelBom"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {boms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage registerOperationType(com.fujitsu.service.OperationType[] operationTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "registerOperationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operationTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage refreshSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "refreshSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fujitsu.service.ResultMessage cancelTechnology(com.fujitsu.service.Technology[] technologys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "cancelTechnology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {technologys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fujitsu.service.ResultMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fujitsu.service.ResultMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.fujitsu.service.ResultMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
