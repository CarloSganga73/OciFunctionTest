/**
 * Ricerca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class Ricerca  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5753651720205709733L;

	private java.lang.String codiceTitolario;

    private java.util.Calendar dataDocumentoA;

    private java.util.Calendar dataDocumentoDa;

    private java.util.Calendar dataProtocolloA;

    private java.util.Calendar dataProtocolloDa;

    private java.lang.String mittDest;

    private java.lang.String modalita;

    private java.lang.String numeroA;

    private java.lang.String numeroDa;

    private java.lang.String oggetto;

    private java.lang.String registro;

    private java.lang.String ufficioCompetente;

    public Ricerca() {
    }

    public Ricerca(
           java.lang.String codiceTitolario,
           java.util.Calendar dataDocumentoA,
           java.util.Calendar dataDocumentoDa,
           java.util.Calendar dataProtocolloA,
           java.util.Calendar dataProtocolloDa,
           java.lang.String mittDest,
           java.lang.String modalita,
           java.lang.String numeroA,
           java.lang.String numeroDa,
           java.lang.String oggetto,
           java.lang.String registro,
           java.lang.String ufficioCompetente) {
           this.codiceTitolario = codiceTitolario;
           this.dataDocumentoA = dataDocumentoA;
           this.dataDocumentoDa = dataDocumentoDa;
           this.dataProtocolloA = dataProtocolloA;
           this.dataProtocolloDa = dataProtocolloDa;
           this.mittDest = mittDest;
           this.modalita = modalita;
           this.numeroA = numeroA;
           this.numeroDa = numeroDa;
           this.oggetto = oggetto;
           this.registro = registro;
           this.ufficioCompetente = ufficioCompetente;
    }


    /**
     * Gets the codiceTitolario value for this Ricerca.
     * 
     * @return codiceTitolario
     */
    public java.lang.String getCodiceTitolario() {
        return codiceTitolario;
    }


    /**
     * Sets the codiceTitolario value for this Ricerca.
     * 
     * @param codiceTitolario
     */
    public void setCodiceTitolario(java.lang.String codiceTitolario) {
        this.codiceTitolario = codiceTitolario;
    }


    /**
     * Gets the dataDocumentoA value for this Ricerca.
     * 
     * @return dataDocumentoA
     */
    public java.util.Calendar getDataDocumentoA() {
        return dataDocumentoA;
    }


    /**
     * Sets the dataDocumentoA value for this Ricerca.
     * 
     * @param dataDocumentoA
     */
    public void setDataDocumentoA(java.util.Calendar dataDocumentoA) {
        this.dataDocumentoA = dataDocumentoA;
    }


    /**
     * Gets the dataDocumentoDa value for this Ricerca.
     * 
     * @return dataDocumentoDa
     */
    public java.util.Calendar getDataDocumentoDa() {
        return dataDocumentoDa;
    }


    /**
     * Sets the dataDocumentoDa value for this Ricerca.
     * 
     * @param dataDocumentoDa
     */
    public void setDataDocumentoDa(java.util.Calendar dataDocumentoDa) {
        this.dataDocumentoDa = dataDocumentoDa;
    }


    /**
     * Gets the dataProtocolloA value for this Ricerca.
     * 
     * @return dataProtocolloA
     */
    public java.util.Calendar getDataProtocolloA() {
        return dataProtocolloA;
    }


    /**
     * Sets the dataProtocolloA value for this Ricerca.
     * 
     * @param dataProtocolloA
     */
    public void setDataProtocolloA(java.util.Calendar dataProtocolloA) {
        this.dataProtocolloA = dataProtocolloA;
    }


    /**
     * Gets the dataProtocolloDa value for this Ricerca.
     * 
     * @return dataProtocolloDa
     */
    public java.util.Calendar getDataProtocolloDa() {
        return dataProtocolloDa;
    }


    /**
     * Sets the dataProtocolloDa value for this Ricerca.
     * 
     * @param dataProtocolloDa
     */
    public void setDataProtocolloDa(java.util.Calendar dataProtocolloDa) {
        this.dataProtocolloDa = dataProtocolloDa;
    }


    /**
     * Gets the mittDest value for this Ricerca.
     * 
     * @return mittDest
     */
    public java.lang.String getMittDest() {
        return mittDest;
    }


    /**
     * Sets the mittDest value for this Ricerca.
     * 
     * @param mittDest
     */
    public void setMittDest(java.lang.String mittDest) {
        this.mittDest = mittDest;
    }


    /**
     * Gets the modalita value for this Ricerca.
     * 
     * @return modalita
     */
    public java.lang.String getModalita() {
        return modalita;
    }


    /**
     * Sets the modalita value for this Ricerca.
     * 
     * @param modalita
     */
    public void setModalita(java.lang.String modalita) {
        this.modalita = modalita;
    }


    /**
     * Gets the numeroA value for this Ricerca.
     * 
     * @return numeroA
     */
    public java.lang.String getNumeroA() {
        return numeroA;
    }


    /**
     * Sets the numeroA value for this Ricerca.
     * 
     * @param numeroA
     */
    public void setNumeroA(java.lang.String numeroA) {
        this.numeroA = numeroA;
    }


    /**
     * Gets the numeroDa value for this Ricerca.
     * 
     * @return numeroDa
     */
    public java.lang.String getNumeroDa() {
        return numeroDa;
    }


    /**
     * Sets the numeroDa value for this Ricerca.
     * 
     * @param numeroDa
     */
    public void setNumeroDa(java.lang.String numeroDa) {
        this.numeroDa = numeroDa;
    }


    /**
     * Gets the oggetto value for this Ricerca.
     * 
     * @return oggetto
     */
    public java.lang.String getOggetto() {
        return oggetto;
    }


    /**
     * Sets the oggetto value for this Ricerca.
     * 
     * @param oggetto
     */
    public void setOggetto(java.lang.String oggetto) {
        this.oggetto = oggetto;
    }


    /**
     * Gets the registro value for this Ricerca.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this Ricerca.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the ufficioCompetente value for this Ricerca.
     * 
     * @return ufficioCompetente
     */
    public java.lang.String getUfficioCompetente() {
        return ufficioCompetente;
    }


    /**
     * Sets the ufficioCompetente value for this Ricerca.
     * 
     * @param ufficioCompetente
     */
    public void setUfficioCompetente(java.lang.String ufficioCompetente) {
        this.ufficioCompetente = ufficioCompetente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ricerca)) return false;
        Ricerca other = (Ricerca) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceTitolario==null && other.getCodiceTitolario()==null) || 
             (this.codiceTitolario!=null &&
              this.codiceTitolario.equals(other.getCodiceTitolario()))) &&
            ((this.dataDocumentoA==null && other.getDataDocumentoA()==null) || 
             (this.dataDocumentoA!=null &&
              this.dataDocumentoA.equals(other.getDataDocumentoA()))) &&
            ((this.dataDocumentoDa==null && other.getDataDocumentoDa()==null) || 
             (this.dataDocumentoDa!=null &&
              this.dataDocumentoDa.equals(other.getDataDocumentoDa()))) &&
            ((this.dataProtocolloA==null && other.getDataProtocolloA()==null) || 
             (this.dataProtocolloA!=null &&
              this.dataProtocolloA.equals(other.getDataProtocolloA()))) &&
            ((this.dataProtocolloDa==null && other.getDataProtocolloDa()==null) || 
             (this.dataProtocolloDa!=null &&
              this.dataProtocolloDa.equals(other.getDataProtocolloDa()))) &&
            ((this.mittDest==null && other.getMittDest()==null) || 
             (this.mittDest!=null &&
              this.mittDest.equals(other.getMittDest()))) &&
            ((this.modalita==null && other.getModalita()==null) || 
             (this.modalita!=null &&
              this.modalita.equals(other.getModalita()))) &&
            ((this.numeroA==null && other.getNumeroA()==null) || 
             (this.numeroA!=null &&
              this.numeroA.equals(other.getNumeroA()))) &&
            ((this.numeroDa==null && other.getNumeroDa()==null) || 
             (this.numeroDa!=null &&
              this.numeroDa.equals(other.getNumeroDa()))) &&
            ((this.oggetto==null && other.getOggetto()==null) || 
             (this.oggetto!=null &&
              this.oggetto.equals(other.getOggetto()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.ufficioCompetente==null && other.getUfficioCompetente()==null) || 
             (this.ufficioCompetente!=null &&
              this.ufficioCompetente.equals(other.getUfficioCompetente())));
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
        if (getCodiceTitolario() != null) {
            _hashCode += getCodiceTitolario().hashCode();
        }
        if (getDataDocumentoA() != null) {
            _hashCode += getDataDocumentoA().hashCode();
        }
        if (getDataDocumentoDa() != null) {
            _hashCode += getDataDocumentoDa().hashCode();
        }
        if (getDataProtocolloA() != null) {
            _hashCode += getDataProtocolloA().hashCode();
        }
        if (getDataProtocolloDa() != null) {
            _hashCode += getDataProtocolloDa().hashCode();
        }
        if (getMittDest() != null) {
            _hashCode += getMittDest().hashCode();
        }
        if (getModalita() != null) {
            _hashCode += getModalita().hashCode();
        }
        if (getNumeroA() != null) {
            _hashCode += getNumeroA().hashCode();
        }
        if (getNumeroDa() != null) {
            _hashCode += getNumeroDa().hashCode();
        }
        if (getOggetto() != null) {
            _hashCode += getOggetto().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getUfficioCompetente() != null) {
            _hashCode += getUfficioCompetente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ricerca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Ricerca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTitolario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceTitolario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDocumentoA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDocumentoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDocumentoDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDocumentoDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolloA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolloA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolloDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolloDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittDest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalita");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDa"));
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
        elemField.setFieldName("ufficioCompetente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioCompetente"));
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
