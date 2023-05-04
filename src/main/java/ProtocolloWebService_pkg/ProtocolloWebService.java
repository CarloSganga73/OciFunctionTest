/**
 * ProtocolloWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ProtocolloWebService_pkg;

public interface ProtocolloWebService extends java.rmi.Remote {
    public agora.folium.ws.type.VoceTitolario[] ricercaTitolarioPerCodiceDescrizione(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.VoceTitolario voceTitolario) throws java.rmi.RemoteException;
    public byte[] getContenutoDocumento(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato inserisciAllegato(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException;
    public byte[] getContenutoAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException;
    public java.util.Vector estraiFlussiLavorazioneDocumento(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciContenutoDaDocumentale(agora.folium.ws.WSAuthentication authentication, java.lang.Long idProfiloProveniente, java.lang.Long idProfiloDestinazione, boolean timbro) throws java.rmi.RemoteException;
    public agora.folium.ws.type.ImmagineDocumentale recuperaContenuto(agora.folium.ws.WSAuthentication authentication, long idDocumento) throws java.rmi.RemoteException;
    public agora.folium.ws.type.ImmagineDocumentale inserisciContenuto(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.ImmagineDocumentale contenuto, boolean timbro) throws java.rmi.RemoteException;
    public agora.folium.ws.type.DocumentoProtocollato[] ricercaProtocolli(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Ricerca ricerca) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciAllegatoDaFascicolo(agora.folium.ws.WSAuthentication authentication, java.lang.Long idProfiloProveniente, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciAllegatoZip(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Allegato allegato) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito protocollaProfilo(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.DatiProtocollo datiProtocollo) throws java.rmi.RemoteException;
    public agora.folium.ws.type.DocumentoProtocollato protocolla(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.DocumentoProtocollato documentoProtocollato) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato[] getAllegati(agora.folium.ws.WSAuthentication authentication, long idProtocollo) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito testLogin(agora.folium.ws.WSAuthentication authentication) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito testStato(agora.folium.ws.WSAuthentication authentication) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Assegnazione assegna(agora.folium.ws.WSAuthentication authentication, agora.folium.ws.type.Assegnazione assegnazione) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato getAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato rimuoviAllegato(agora.folium.ws.WSAuthentication authentication, long idAllegato) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito recuperaImpronta(agora.folium.ws.WSAuthentication authentication, long idDocumento, int tipo) throws java.rmi.RemoteException;
}
