/**
 * ProtocolloWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ProtocolloWebService_pkg;

public class ProtocolloWebServiceServiceLocator extends org.apache.axis.client.Service implements ProtocolloWebService_pkg.ProtocolloWebServiceService {

    public ProtocolloWebServiceServiceLocator() {
    }


    public ProtocolloWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProtocolloWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtocolloWebService
    private java.lang.String ProtocolloWebService_address = "https://collprosa.regione.lazio.it/collprosa/services/ProtocolloWebService";

    public java.lang.String getProtocolloWebServiceAddress() {
        return ProtocolloWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtocolloWebServiceWSDDServiceName = "ProtocolloWebService";

    public java.lang.String getProtocolloWebServiceWSDDServiceName() {
        return ProtocolloWebServiceWSDDServiceName;
    }

    public void setProtocolloWebServiceWSDDServiceName(java.lang.String name) {
        ProtocolloWebServiceWSDDServiceName = name;
    }

    public ProtocolloWebService_pkg.ProtocolloWebService getProtocolloWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtocolloWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtocolloWebService(endpoint);
    }

    public ProtocolloWebService_pkg.ProtocolloWebService getProtocolloWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ProtocolloWebService_pkg.ProtocolloWebServiceSoapBindingStub _stub = new ProtocolloWebService_pkg.ProtocolloWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProtocolloWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtocolloWebServiceEndpointAddress(java.lang.String address) {
        ProtocolloWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ProtocolloWebService_pkg.ProtocolloWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                ProtocolloWebService_pkg.ProtocolloWebServiceSoapBindingStub _stub = new ProtocolloWebService_pkg.ProtocolloWebServiceSoapBindingStub(new java.net.URL(ProtocolloWebService_address), this);
                _stub.setPortName(getProtocolloWebServiceWSDDServiceName());
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
        if ("ProtocolloWebService".equals(inputPortName)) {
            return getProtocolloWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ProtocolloWebService", "ProtocolloWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ProtocolloWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtocolloWebService".equals(portName)) {
            setProtocolloWebServiceEndpointAddress(address);
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
