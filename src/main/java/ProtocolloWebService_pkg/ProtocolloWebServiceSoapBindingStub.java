/**
 * ProtocolloWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ProtocolloWebService_pkg;

public class ProtocolloWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements ProtocolloWebService_pkg.ProtocolloWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaTitolarioPerCodiceDescrizione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "voceTitolario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario"), agora.folium.ws.type.VoceTitolario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_VoceTitolario"));
        oper.setReturnClass(agora.folium.ws.type.VoceTitolario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ricercaTitolarioPerCodiceDescrizioneReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContenutoDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContenutoDocumentoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"), agora.folium.ws.type.Allegato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(agora.folium.ws.type.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContenutoAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idAllegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContenutoAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("estraiFlussiLavorazioneDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Vector"));
        oper.setReturnClass(java.util.Vector.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "estraiFlussiLavorazioneDocumentoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciContenutoDaDocumentale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProfiloProveniente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"), java.lang.Long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProfiloDestinazione"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"), java.lang.Long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timbro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciContenutoDaDocumentaleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaContenuto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"));
        oper.setReturnClass(agora.folium.ws.type.ImmagineDocumentale.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "recuperaContenutoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciContenuto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contenuto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"), agora.folium.ws.type.ImmagineDocumentale.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timbro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"));
        oper.setReturnClass(agora.folium.ws.type.ImmagineDocumentale.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciContenutoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaProtocolli");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ricerca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Ricerca"), agora.folium.ws.type.Ricerca.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_DocumentoProtocollato"));
        oper.setReturnClass(agora.folium.ws.type.DocumentoProtocollato[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ricercaProtocolliReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAllegatoDaFascicolo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProfiloProveniente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"), java.lang.Long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"), agora.folium.ws.type.Allegato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciAllegatoDaFascicoloReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAllegatoZip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"), agora.folium.ws.type.Allegato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciAllegatoZipReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("protocollaProfilo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datiProtocollo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "DatiProtocollo"), agora.folium.ws.type.DatiProtocollo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "protocollaProfiloReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("protocolla");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentoProtocollato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato"), agora.folium.ws.type.DocumentoProtocollato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato"));
        oper.setReturnClass(agora.folium.ws.type.DocumentoProtocollato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "protocollaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllegati");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProtocollo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Allegato"));
        oper.setReturnClass(agora.folium.ws.type.Allegato[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllegatiReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "testLoginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testStato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "testStatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assegna");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assegnazione"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione"), agora.folium.ws.type.Assegnazione.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione"));
        oper.setReturnClass(agora.folium.ws.type.Assegnazione.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "assegnaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idAllegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(agora.folium.ws.type.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rimuoviAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idAllegato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(agora.folium.ws.type.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rimuoviAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaImpronta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "recuperaImprontaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    public ProtocolloWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProtocolloWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProtocolloWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.Allegato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.Assegnazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "DatiProtocollo");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.DatiProtocollo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.DocumentoProtocollato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.ImmagineDocumentale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.MittenteDestinatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Ricerca");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.Ricerca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.VoceTitolario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.WSAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.WSEsito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Allegato");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.Allegato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_DocumentoProtocollato");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.DocumentoProtocollato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_MittenteDestinatario");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.MittenteDestinatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_VoceTitolario");
            cachedSerQNames.add(qName);
            cls = agora.folium.ws.type.VoceTitolario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public agora.folium.ws.type.VoceTitolario[] ricercaTitolarioPerCodiceDescrizione(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.VoceTitolario voceTitolario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ricercaTitolarioPerCodiceDescrizione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, voceTitolario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.VoceTitolario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.VoceTitolario[]) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.VoceTitolario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getContenutoDocumento(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getContenutoDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idDocumento)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.Allegato inserisciAllegato(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, allegato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getContenutoAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getContenutoAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idAllegato)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Vector estraiFlussiLavorazioneDocumento(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "estraiFlussiLavorazioneDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idDocumento)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Vector) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Vector) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Vector.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito inserisciContenutoDaDocumentale(agora.folium.ws.WSAuthentication authentication, java.lang.Long idProfiloProveniente, java.lang.Long idProfiloDestinazione, boolean timbro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciContenutoDaDocumentale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, idProfiloProveniente, idProfiloDestinazione, new java.lang.Boolean(timbro)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.ImmagineDocumentale recuperaContenuto(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "recuperaContenuto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idDocumento)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.ImmagineDocumentale) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.ImmagineDocumentale) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.ImmagineDocumentale.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.ImmagineDocumentale inserisciContenuto(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.ImmagineDocumentale contenuto, boolean timbro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciContenuto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, contenuto, new java.lang.Boolean(timbro)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.ImmagineDocumentale) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.ImmagineDocumentale) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.ImmagineDocumentale.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.DocumentoProtocollato[] ricercaProtocolli(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Ricerca ricerca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ricercaProtocolli"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, ricerca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.DocumentoProtocollato[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.DocumentoProtocollato[]) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.DocumentoProtocollato[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito inserisciAllegatoDaFascicolo(agora.folium.ws.WSAuthentication authentication, java.lang.Long idProfiloProveniente, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciAllegatoDaFascicolo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, idProfiloProveniente, allegato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito inserisciAllegatoZip(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciAllegatoZip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, allegato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito protocollaProfilo(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.DatiProtocollo datiProtocollo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "protocollaProfilo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, datiProtocollo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.DocumentoProtocollato protocolla(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.DocumentoProtocollato documentoProtocollato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "protocolla"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, documentoProtocollato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.DocumentoProtocollato) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.DocumentoProtocollato) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.DocumentoProtocollato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.Allegato[] getAllegati(agora.folium.ws.WSAuthentication authentication, long idProtocollo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getAllegati"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idProtocollo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.Allegato[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.Allegato[]) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.Allegato[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito testLogin(agora.folium.ws.WSAuthentication authentication) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "testLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito testStato(agora.folium.ws.WSAuthentication authentication) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "testStato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.Assegnazione assegna(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Assegnazione assegnazione) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "assegna"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, assegnazione});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.Assegnazione) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.Assegnazione) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.Assegnazione.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.Allegato getAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idAllegato)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.type.Allegato rimuoviAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "rimuoviAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idAllegato)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.type.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.type.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.type.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium.ws.WSEsito recuperaImpronta(agora.folium.ws.WSAuthentication authentication, long idDocumento, int tipo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "recuperaImpronta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, new java.lang.Long(idDocumento), new java.lang.Integer(tipo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
