/**
 * AcceptDataServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public class AcceptDataServiceServiceLocator extends org.apache.axis.client.Service implements com.fujitsu.service.AcceptDataServiceService {

    public AcceptDataServiceServiceLocator() {
    }


    public AcceptDataServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AcceptDataServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AcceptDataServicePort
    private java.lang.String AcceptDataServicePort_address = "http://127.0.0.1:8080/ws/plminterface/acceptData";

    public java.lang.String getAcceptDataServicePortAddress() {
        return AcceptDataServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AcceptDataServicePortWSDDServiceName = "AcceptDataServicePort";

    public java.lang.String getAcceptDataServicePortWSDDServiceName() {
        return AcceptDataServicePortWSDDServiceName;
    }

    public void setAcceptDataServicePortWSDDServiceName(java.lang.String name) {
        AcceptDataServicePortWSDDServiceName = name;
    }

    public com.fujitsu.service.AcceptDataService getAcceptDataServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AcceptDataServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAcceptDataServicePort(endpoint);
    }

    public com.fujitsu.service.AcceptDataService getAcceptDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fujitsu.service.AcceptDataServiceServiceSoapBindingStub _stub = new com.fujitsu.service.AcceptDataServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAcceptDataServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAcceptDataServicePortEndpointAddress(java.lang.String address) {
        AcceptDataServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fujitsu.service.AcceptDataService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fujitsu.service.AcceptDataServiceServiceSoapBindingStub _stub = new com.fujitsu.service.AcceptDataServiceServiceSoapBindingStub(new java.net.URL(AcceptDataServicePort_address), this);
                _stub.setPortName(getAcceptDataServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AcceptDataServicePort".equals(inputPortName)) {
            return getAcceptDataServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "AcceptDataServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cxf.plminterface.mes.taharaiot.com/", "AcceptDataServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AcceptDataServicePort".equals(portName)) {
            setAcceptDataServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
