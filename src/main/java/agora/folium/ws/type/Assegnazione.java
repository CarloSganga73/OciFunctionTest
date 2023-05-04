/**
 * Assegnazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class Assegnazione  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1627747071708738942L;

	private java.lang.String codiceAssegnazione;

    private java.util.Calendar dataScadenza;

    private agora.folium.ws.WSEsito esito;

    private java.lang.Long idProtocollo;

    private java.lang.String note;

    private java.lang.String ufficioAssegnatario;

    private java.lang.String utenteAssegnatario;

    public Assegnazione() {
    }

    public Assegnazione(
           java.lang.String codiceAssegnazione,
           java.util.Calendar dataScadenza,
           agora.folium.ws.WSEsito esito,
           java.lang.Long idProtocollo,
           java.lang.String note,
           java.lang.String ufficioAssegnatario,
           java.lang.String utenteAssegnatario) {
           this.codiceAssegnazione = codiceAssegnazione;
           this.dataScadenza = dataScadenza;
           this.esito = esito;
           this.idProtocollo = idProtocollo;
           this.note = note;
           this.ufficioAssegnatario = ufficioAssegnatario;
           this.utenteAssegnatario = utenteAssegnatario;
    }


    /**
     * Gets the codiceAssegnazione value for this Assegnazione.
     * 
     * @return codiceAssegnazione
     */
    public java.lang.String getCodiceAssegnazione() {
        return codiceAssegnazione;
    }


    /**
     * Sets the codiceAssegnazione value for this Assegnazione.
     * 
     * @param codiceAssegnazione
     */
    public void setCodiceAssegnazione(java.lang.String codiceAssegnazione) {
        this.codiceAssegnazione = codiceAssegnazione;
    }


    /**
     * Gets the dataScadenza value for this Assegnazione.
     * 
     * @return dataScadenza
     */
    public java.util.Calendar getDataScadenza() {
        return dataScadenza;
    }


    /**
     * Sets the dataScadenza value for this Assegnazione.
     * 
     * @param dataScadenza
     */
    public void setDataScadenza(java.util.Calendar dataScadenza) {
        this.dataScadenza = dataScadenza;
    }


    /**
     * Gets the esito value for this Assegnazione.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this Assegnazione.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the idProtocollo value for this Assegnazione.
     * 
     * @return idProtocollo
     */
    public java.lang.Long getIdProtocollo() {
        return idProtocollo;
    }


    /**
     * Sets the idProtocollo value for this Assegnazione.
     * 
     * @param idProtocollo
     */
    public void setIdProtocollo(java.lang.Long idProtocollo) {
        this.idProtocollo = idProtocollo;
    }


    /**
     * Gets the note value for this Assegnazione.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Assegnazione.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the ufficioAssegnatario value for this Assegnazione.
     * 
     * @return ufficioAssegnatario
     */
    public java.lang.String getUfficioAssegnatario() {
        return ufficioAssegnatario;
    }


    /**
     * Sets the ufficioAssegnatario value for this Assegnazione.
     * 
     * @param ufficioAssegnatario
     */
    public void setUfficioAssegnatario(java.lang.String ufficioAssegnatario) {
        this.ufficioAssegnatario = ufficioAssegnatario;
    }


    /**
     * Gets the utenteAssegnatario value for this Assegnazione.
     * 
     * @return utenteAssegnatario
     */
    public java.lang.String getUtenteAssegnatario() {
        return utenteAssegnatario;
    }


    /**
     * Sets the utenteAssegnatario value for this Assegnazione.
     * 
     * @param utenteAssegnatario
     */
    public void setUtenteAssegnatario(java.lang.String utenteAssegnatario) {
        this.utenteAssegnatario = utenteAssegnatario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assegnazione)) return false;
        Assegnazione other = (Assegnazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceAssegnazione==null && other.getCodiceAssegnazione()==null) || 
             (this.codiceAssegnazione!=null &&
              this.codiceAssegnazione.equals(other.getCodiceAssegnazione()))) &&
            ((this.dataScadenza==null && other.getDataScadenza()==null) || 
             (this.dataScadenza!=null &&
              this.dataScadenza.equals(other.getDataScadenza()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.idProtocollo==null && other.getIdProtocollo()==null) || 
             (this.idProtocollo!=null &&
              this.idProtocollo.equals(other.getIdProtocollo()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.ufficioAssegnatario==null && other.getUfficioAssegnatario()==null) || 
             (this.ufficioAssegnatario!=null &&
              this.ufficioAssegnatario.equals(other.getUfficioAssegnatario()))) &&
            ((this.utenteAssegnatario==null && other.getUtenteAssegnatario()==null) || 
             (this.utenteAssegnatario!=null &&
              this.utenteAssegnatario.equals(other.getUtenteAssegnatario())));
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
        if (getCodiceAssegnazione() != null) {
            _hashCode += getCodiceAssegnazione().hashCode();
        }
        if (getDataScadenza() != null) {
            _hashCode += getDataScadenza().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getIdProtocollo() != null) {
            _hashCode += getIdProtocollo().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getUfficioAssegnatario() != null) {
            _hashCode += getUfficioAssegnatario().hashCode();
        }
        if (getUtenteAssegnatario() != null) {
            _hashCode += getUtenteAssegnatario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assegnazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceAssegnazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceAssegnazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataScadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioAssegnatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioAssegnatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utenteAssegnatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utenteAssegnatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
