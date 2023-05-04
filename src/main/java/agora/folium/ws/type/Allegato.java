/**
 * Allegato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class Allegato  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4161119047788336533L;

	private java.lang.String collocazione;

    private byte[] contenuto;

    private java.lang.String descrizione;

    private agora.folium.ws.WSEsito esito;

    private java.lang.Long id;

    private java.lang.Long idProfilo;

    private java.lang.String nomeFile;

    public Allegato() {
    }

    public Allegato(
           java.lang.String collocazione,
           byte[] contenuto,
           java.lang.String descrizione,
           agora.folium.ws.WSEsito esito,
           java.lang.Long id,
           java.lang.Long idProfilo,
           java.lang.String nomeFile) {
           this.collocazione = collocazione;
           this.contenuto = contenuto;
           this.descrizione = descrizione;
           this.esito = esito;
           this.id = id;
           this.idProfilo = idProfilo;
           this.nomeFile = nomeFile;
    }


    /**
     * Gets the collocazione value for this Allegato.
     * 
     * @return collocazione
     */
    public java.lang.String getCollocazione() {
        return collocazione;
    }


    /**
     * Sets the collocazione value for this Allegato.
     * 
     * @param collocazione
     */
    public void setCollocazione(java.lang.String collocazione) {
        this.collocazione = collocazione;
    }


    /**
     * Gets the contenuto value for this Allegato.
     * 
     * @return contenuto
     */
    public byte[] getContenuto() {
        return contenuto;
    }


    /**
     * Sets the contenuto value for this Allegato.
     * 
     * @param contenuto
     */
    public void setContenuto(byte[] contenuto) {
        this.contenuto = contenuto;
    }


    /**
     * Gets the descrizione value for this Allegato.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this Allegato.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the esito value for this Allegato.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this Allegato.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the id value for this Allegato.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Allegato.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the idProfilo value for this Allegato.
     * 
     * @return idProfilo
     */
    public java.lang.Long getIdProfilo() {
        return idProfilo;
    }


    /**
     * Sets the idProfilo value for this Allegato.
     * 
     * @param idProfilo
     */
    public void setIdProfilo(java.lang.Long idProfilo) {
        this.idProfilo = idProfilo;
    }


    /**
     * Gets the nomeFile value for this Allegato.
     * 
     * @return nomeFile
     */
    public java.lang.String getNomeFile() {
        return nomeFile;
    }


    /**
     * Sets the nomeFile value for this Allegato.
     * 
     * @param nomeFile
     */
    public void setNomeFile(java.lang.String nomeFile) {
        this.nomeFile = nomeFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Allegato)) return false;
        Allegato other = (Allegato) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collocazione==null && other.getCollocazione()==null) || 
             (this.collocazione!=null &&
              this.collocazione.equals(other.getCollocazione()))) &&
            ((this.contenuto==null && other.getContenuto()==null) || 
             (this.contenuto!=null &&
              java.util.Arrays.equals(this.contenuto, other.getContenuto()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idProfilo==null && other.getIdProfilo()==null) || 
             (this.idProfilo!=null &&
              this.idProfilo.equals(other.getIdProfilo()))) &&
            ((this.nomeFile==null && other.getNomeFile()==null) || 
             (this.nomeFile!=null &&
              this.nomeFile.equals(other.getNomeFile())));
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
        if (getCollocazione() != null) {
            _hashCode += getCollocazione().hashCode();
        }
        if (getContenuto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContenuto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContenuto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdProfilo() != null) {
            _hashCode += getIdProfilo().hashCode();
        }
        if (getNomeFile() != null) {
            _hashCode += getNomeFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Allegato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collocazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collocazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProfilo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProfilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFile"));
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
