/**
 * DocumentoProtocollato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class DocumentoProtocollato  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1324107606723195060L;

	private byte[] contenuto;

    private java.util.Calendar dataDocumento;

    private java.util.Calendar dataProtocollo;

    private agora.folium.ws.WSEsito esito;

    private java.lang.Long id;

    private boolean isContenuto;

    private agora.folium.ws.type.MittenteDestinatario[] mittentiDestinatari;

    private java.lang.String nomeFileContenuto;

    private java.lang.String note;

    private java.lang.String numeroProtocollo;

    private java.lang.String numeroProtocolloEsterno;

    private java.lang.String oggetto;

    private java.lang.String registro;

    private boolean timbro;

    private java.lang.String tipoProtocollo;

    private java.lang.String ufficioCompetente;

    private java.lang.String[] vociTitolario;

    public DocumentoProtocollato() {
    }

    public DocumentoProtocollato(
           byte[] contenuto,
           java.util.Calendar dataDocumento,
           java.util.Calendar dataProtocollo,
           agora.folium.ws.WSEsito esito,
           java.lang.Long id,
           boolean isContenuto,
           agora.folium.ws.type.MittenteDestinatario[] mittentiDestinatari,
           java.lang.String nomeFileContenuto,
           java.lang.String note,
           java.lang.String numeroProtocollo,
           java.lang.String numeroProtocolloEsterno,
           java.lang.String oggetto,
           java.lang.String registro,
           boolean timbro,
           java.lang.String tipoProtocollo,
           java.lang.String ufficioCompetente,
           java.lang.String[] vociTitolario) {
           this.contenuto = contenuto;
           this.dataDocumento = dataDocumento;
           this.dataProtocollo = dataProtocollo;
           this.esito = esito;
           this.id = id;
           this.isContenuto = isContenuto;
           this.mittentiDestinatari = mittentiDestinatari;
           this.nomeFileContenuto = nomeFileContenuto;
           this.note = note;
           this.numeroProtocollo = numeroProtocollo;
           this.numeroProtocolloEsterno = numeroProtocolloEsterno;
           this.oggetto = oggetto;
           this.registro = registro;
           this.timbro = timbro;
           this.tipoProtocollo = tipoProtocollo;
           this.ufficioCompetente = ufficioCompetente;
           this.vociTitolario = vociTitolario;
    }


    /**
     * Gets the contenuto value for this DocumentoProtocollato.
     * 
     * @return contenuto
     */
    public byte[] getContenuto() {
        return contenuto;
    }


    /**
     * Sets the contenuto value for this DocumentoProtocollato.
     * 
     * @param contenuto
     */
    public void setContenuto(byte[] contenuto) {
        this.contenuto = contenuto;
    }


    /**
     * Gets the dataDocumento value for this DocumentoProtocollato.
     * 
     * @return dataDocumento
     */
    public java.util.Calendar getDataDocumento() {
        return dataDocumento;
    }


    /**
     * Sets the dataDocumento value for this DocumentoProtocollato.
     * 
     * @param dataDocumento
     */
    public void setDataDocumento(java.util.Calendar dataDocumento) {
        this.dataDocumento = dataDocumento;
    }


    /**
     * Gets the dataProtocollo value for this DocumentoProtocollato.
     * 
     * @return dataProtocollo
     */
    public java.util.Calendar getDataProtocollo() {
        return dataProtocollo;
    }


    /**
     * Sets the dataProtocollo value for this DocumentoProtocollato.
     * 
     * @param dataProtocollo
     */
    public void setDataProtocollo(java.util.Calendar dataProtocollo) {
        this.dataProtocollo = dataProtocollo;
    }


    /**
     * Gets the esito value for this DocumentoProtocollato.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this DocumentoProtocollato.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the id value for this DocumentoProtocollato.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this DocumentoProtocollato.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isContenuto value for this DocumentoProtocollato.
     * 
     * @return isContenuto
     */
    public boolean isIsContenuto() {
        return isContenuto;
    }


    /**
     * Sets the isContenuto value for this DocumentoProtocollato.
     * 
     * @param isContenuto
     */
    public void setIsContenuto(boolean isContenuto) {
        this.isContenuto = isContenuto;
    }


    /**
     * Gets the mittentiDestinatari value for this DocumentoProtocollato.
     * 
     * @return mittentiDestinatari
     */
    public agora.folium.ws.type.MittenteDestinatario[] getMittentiDestinatari() {
        return mittentiDestinatari;
    }


    /**
     * Sets the mittentiDestinatari value for this DocumentoProtocollato.
     * 
     * @param mittentiDestinatari
     */
    public void setMittentiDestinatari(agora.folium.ws.type.MittenteDestinatario[] mittentiDestinatari) {
        this.mittentiDestinatari = mittentiDestinatari;
    }


    /**
     * Gets the nomeFileContenuto value for this DocumentoProtocollato.
     * 
     * @return nomeFileContenuto
     */
    public java.lang.String getNomeFileContenuto() {
        return nomeFileContenuto;
    }


    /**
     * Sets the nomeFileContenuto value for this DocumentoProtocollato.
     * 
     * @param nomeFileContenuto
     */
    public void setNomeFileContenuto(java.lang.String nomeFileContenuto) {
        this.nomeFileContenuto = nomeFileContenuto;
    }


    /**
     * Gets the note value for this DocumentoProtocollato.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this DocumentoProtocollato.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the numeroProtocollo value for this DocumentoProtocollato.
     * 
     * @return numeroProtocollo
     */
    public java.lang.String getNumeroProtocollo() {
        return numeroProtocollo;
    }


    /**
     * Sets the numeroProtocollo value for this DocumentoProtocollato.
     * 
     * @param numeroProtocollo
     */
    public void setNumeroProtocollo(java.lang.String numeroProtocollo) {
        this.numeroProtocollo = numeroProtocollo;
    }


    /**
     * Gets the numeroProtocolloEsterno value for this DocumentoProtocollato.
     * 
     * @return numeroProtocolloEsterno
     */
    public java.lang.String getNumeroProtocolloEsterno() {
        return numeroProtocolloEsterno;
    }


    /**
     * Sets the numeroProtocolloEsterno value for this DocumentoProtocollato.
     * 
     * @param numeroProtocolloEsterno
     */
    public void setNumeroProtocolloEsterno(java.lang.String numeroProtocolloEsterno) {
        this.numeroProtocolloEsterno = numeroProtocolloEsterno;
    }


    /**
     * Gets the oggetto value for this DocumentoProtocollato.
     * 
     * @return oggetto
     */
    public java.lang.String getOggetto() {
        return oggetto;
    }


    /**
     * Sets the oggetto value for this DocumentoProtocollato.
     * 
     * @param oggetto
     */
    public void setOggetto(java.lang.String oggetto) {
        this.oggetto = oggetto;
    }


    /**
     * Gets the registro value for this DocumentoProtocollato.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this DocumentoProtocollato.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the timbro value for this DocumentoProtocollato.
     * 
     * @return timbro
     */
    public boolean isTimbro() {
        return timbro;
    }


    /**
     * Sets the timbro value for this DocumentoProtocollato.
     * 
     * @param timbro
     */
    public void setTimbro(boolean timbro) {
        this.timbro = timbro;
    }


    /**
     * Gets the tipoProtocollo value for this DocumentoProtocollato.
     * 
     * @return tipoProtocollo
     */
    public java.lang.String getTipoProtocollo() {
        return tipoProtocollo;
    }


    /**
     * Sets the tipoProtocollo value for this DocumentoProtocollato.
     * 
     * @param tipoProtocollo
     */
    public void setTipoProtocollo(java.lang.String tipoProtocollo) {
        this.tipoProtocollo = tipoProtocollo;
    }


    /**
     * Gets the ufficioCompetente value for this DocumentoProtocollato.
     * 
     * @return ufficioCompetente
     */
    public java.lang.String getUfficioCompetente() {
        return ufficioCompetente;
    }


    /**
     * Sets the ufficioCompetente value for this DocumentoProtocollato.
     * 
     * @param ufficioCompetente
     */
    public void setUfficioCompetente(java.lang.String ufficioCompetente) {
        this.ufficioCompetente = ufficioCompetente;
    }


    /**
     * Gets the vociTitolario value for this DocumentoProtocollato.
     * 
     * @return vociTitolario
     */
    public java.lang.String[] getVociTitolario() {
        return vociTitolario;
    }


    /**
     * Sets the vociTitolario value for this DocumentoProtocollato.
     * 
     * @param vociTitolario
     */
    public void setVociTitolario(java.lang.String[] vociTitolario) {
        this.vociTitolario = vociTitolario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentoProtocollato)) return false;
        DocumentoProtocollato other = (DocumentoProtocollato) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contenuto==null && other.getContenuto()==null) || 
             (this.contenuto!=null &&
              java.util.Arrays.equals(this.contenuto, other.getContenuto()))) &&
            ((this.dataDocumento==null && other.getDataDocumento()==null) || 
             (this.dataDocumento!=null &&
              this.dataDocumento.equals(other.getDataDocumento()))) &&
            ((this.dataProtocollo==null && other.getDataProtocollo()==null) || 
             (this.dataProtocollo!=null &&
              this.dataProtocollo.equals(other.getDataProtocollo()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.isContenuto == other.isIsContenuto() &&
            ((this.mittentiDestinatari==null && other.getMittentiDestinatari()==null) || 
             (this.mittentiDestinatari!=null &&
              java.util.Arrays.equals(this.mittentiDestinatari, other.getMittentiDestinatari()))) &&
            ((this.nomeFileContenuto==null && other.getNomeFileContenuto()==null) || 
             (this.nomeFileContenuto!=null &&
              this.nomeFileContenuto.equals(other.getNomeFileContenuto()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.numeroProtocollo==null && other.getNumeroProtocollo()==null) || 
             (this.numeroProtocollo!=null &&
              this.numeroProtocollo.equals(other.getNumeroProtocollo()))) &&
            ((this.numeroProtocolloEsterno==null && other.getNumeroProtocolloEsterno()==null) || 
             (this.numeroProtocolloEsterno!=null &&
              this.numeroProtocolloEsterno.equals(other.getNumeroProtocolloEsterno()))) &&
            ((this.oggetto==null && other.getOggetto()==null) || 
             (this.oggetto!=null &&
              this.oggetto.equals(other.getOggetto()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            this.timbro == other.isTimbro() &&
            ((this.tipoProtocollo==null && other.getTipoProtocollo()==null) || 
             (this.tipoProtocollo!=null &&
              this.tipoProtocollo.equals(other.getTipoProtocollo()))) &&
            ((this.ufficioCompetente==null && other.getUfficioCompetente()==null) || 
             (this.ufficioCompetente!=null &&
              this.ufficioCompetente.equals(other.getUfficioCompetente()))) &&
            ((this.vociTitolario==null && other.getVociTitolario()==null) || 
             (this.vociTitolario!=null &&
              java.util.Arrays.equals(this.vociTitolario, other.getVociTitolario())));
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
        if (getDataDocumento() != null) {
            _hashCode += getDataDocumento().hashCode();
        }
        if (getDataProtocollo() != null) {
            _hashCode += getDataProtocollo().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isIsContenuto() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMittentiDestinatari() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMittentiDestinatari());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMittentiDestinatari(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNomeFileContenuto() != null) {
            _hashCode += getNomeFileContenuto().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getNumeroProtocollo() != null) {
            _hashCode += getNumeroProtocollo().hashCode();
        }
        if (getNumeroProtocolloEsterno() != null) {
            _hashCode += getNumeroProtocolloEsterno().hashCode();
        }
        if (getOggetto() != null) {
            _hashCode += getOggetto().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        _hashCode += (isTimbro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTipoProtocollo() != null) {
            _hashCode += getTipoProtocollo().hashCode();
        }
        if (getUfficioCompetente() != null) {
            _hashCode += getUfficioCompetente().hashCode();
        }
        if (getVociTitolario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVociTitolario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVociTitolario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentoProtocollato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocollo"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isContenuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isContenuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittentiDestinatari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittentiDestinatari"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFileContenuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFileContenuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloEsterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloEsterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timbro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timbro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioCompetente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioCompetente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vociTitolario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vociTitolario"));
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
