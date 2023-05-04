package it.ised.prosa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ProtocolloWebService_pkg.ProtocolloWebService;
import ProtocolloWebService_pkg.ProtocolloWebServiceServiceLocator;
import agora.folium.ws.WSAuthentication;
import agora.folium.ws.WSEsito;
import agora.folium.ws.type.DocumentoProtocollato;
import agora.folium.ws.type.MittenteDestinatario;
import org.json.simple.JSONObject;

public class TestProtocollazione {
	
	public static void main(String[] args) {
		JSONObject jo_input = new JSONObject();
		jo_input.put("submissionid", "235413246");
		
		JSONObject jo_output = new JSONObject();
		
	}

	public JSONObject handleRequest(JSONObject input) {

		String ret_val = new String("-");
		JSONObject jo = new JSONObject();
		System.out.println("Chiamata Per Protocollazione Prosa");
		System.setProperty("https.protocols", "TLSv1.2");

		String submissionid = null;

		ProtocolloWebServiceServiceLocator secServer = new ProtocolloWebServiceServiceLocator();
		System.out.println("connesso a:" + secServer.getProtocolloWebServiceAddress());
		try {
			
			submissionid = (String) input.get("submissionid");
			
			ProtocolloWebService wsProsa = secServer.getProtocolloWebService();

			// WSAuthentication auth = new WSAuthentication("AOO","Applicazione","Ente","<PASSWORD>","<USERNAME>");
			WSAuthentication auth = new WSAuthentication("REGLAZIO", "Prosa", "REGIONE.LAZIO", "password", "prosa.hcm");

			DocumentoProtocollato documento = new DocumentoProtocollato();
			documento.setTipoProtocollo("I");
			documento.setOggetto("Documento di test 1");

			MittenteDestinatario[] mittenti = new MittenteDestinatario[1];
			MittenteDestinatario mittente = new MittenteDestinatario();
			mittente.setDenominazione("Pinko Pallo s.r.l.");
			mittente.setInvioPC(false);
			mittenti[0] = mittente;
			documento.setMittentiDestinatari(mittenti);
			documento.setIsContenuto(false);
			documento.setTimbro(true);

			DocumentoProtocollato documentoProtocollato = wsProsa.protocolla(auth, documento);
			WSEsito risposta = documentoProtocollato.getEsito();
			System.out.println("Esito: " + risposta.getDescrizioneEsito() + ", " + risposta.getCodiceEsito());

			ret_val = new String("Risposta: " + documentoProtocollato.getId() + ", " + documentoProtocollato.getRegistro());

			System.out.println(ret_val);
			
			jo.put("submissionid", submissionid);
			if(risposta.getCodiceEsito().equalsIgnoreCase("107"))
			{
				jo.put("status", "ERROR");
				jo.put("exception", risposta.getDescrizioneEsito());
			}
			else
			{
				jo.put("status", "OK");
				jo.put("id", documentoProtocollato.getId());
				jo.put("registro", documentoProtocollato.getRegistro());
			}



		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();

			jo.put("submissionid", submissionid);
			jo.put("status", "ERROR");
			jo.put("exception", e.toString());

		}

		return jo;
	}
}
