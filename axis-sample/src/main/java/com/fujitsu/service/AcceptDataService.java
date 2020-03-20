/**
 * AcceptDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fujitsu.service;

public interface AcceptDataService extends java.rmi.Remote {
    public com.fujitsu.service.ResultMessage registerProduct(com.fujitsu.service.Product product) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerReplaceMaterialGroup(com.fujitsu.service.ReplaceMaterialGroup[] replaceMaterialGroups) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerTechnology(com.fujitsu.service.Technology[] technologys) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerMaterial(com.fujitsu.service.Material[] materials) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage cancelSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerBom(com.fujitsu.service.Bom[] boms) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerOperation(com.fujitsu.service.Operation[] operations) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerOperationResource(com.fujitsu.service.OperationResource[] operationResources) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage cancelBom(com.fujitsu.service.Bom[] boms) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage registerOperationType(com.fujitsu.service.OperationType[] operationTypes) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage refreshSchema(com.fujitsu.service.Schema[] schemas) throws java.rmi.RemoteException;
    public com.fujitsu.service.ResultMessage cancelTechnology(com.fujitsu.service.Technology[] technologys) throws java.rmi.RemoteException;
}
