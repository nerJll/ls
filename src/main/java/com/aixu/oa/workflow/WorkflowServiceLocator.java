/**
 * WorkflowServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aixu.oa.workflow;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class WorkflowServiceLocator extends Service implements com.aixu.oa.workflow.WorkflowService {

    public WorkflowServiceLocator() {
    }


    public WorkflowServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public WorkflowServiceLocator(java.lang.String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkflowServiceHttpPort
    private java.lang.String WorkflowServiceHttpPort_address = "http://121.9.9.37//services/WorkflowService";

    public java.lang.String getWorkflowServiceHttpPortAddress() {
        return WorkflowServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowServiceHttpPortWSDDServiceName = "WorkflowServiceHttpPort";

    public java.lang.String getWorkflowServiceHttpPortWSDDServiceName() {
        return WorkflowServiceHttpPortWSDDServiceName;
    }

    public void setWorkflowServiceHttpPortWSDDServiceName(java.lang.String name) {
        WorkflowServiceHttpPortWSDDServiceName = name;
    }

    public com.aixu.oa.workflow.WorkflowServicePortType getWorkflowServiceHttpPort() throws ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getWorkflowServiceHttpPort(endpoint);
    }

    public com.aixu.oa.workflow.WorkflowServicePortType getWorkflowServiceHttpPort(java.net.URL portAddress) throws ServiceException {
        try {
        	com.aixu.oa.workflow.WorkflowServiceHttpBindingStub _stub = new com.aixu.oa.workflow.WorkflowServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getWorkflowServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setWorkflowServiceHttpPortEndpointAddress(java.lang.String address) {
        WorkflowServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (com.aixu.oa.workflow.WorkflowServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
            	com.aixu.oa.workflow.WorkflowServiceHttpBindingStub _stub = new com.aixu.oa.workflow.WorkflowServiceHttpBindingStub(new java.net.URL(WorkflowServiceHttpPort_address), this);
                _stub.setPortName(getWorkflowServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkflowServiceHttpPort".equals(inputPortName)) {
            return getWorkflowServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("webservices.services.weaver.com.cn", "WorkflowService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("webservices.services.weaver.com.cn", "WorkflowServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws ServiceException {
        
if ("WorkflowServiceHttpPort".equals(portName)) {
            setWorkflowServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, java.lang.String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
