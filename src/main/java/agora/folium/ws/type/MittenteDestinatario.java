/**
 * MittenteDestinatario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class MittenteDestinatario  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7401239123757099186L;

	private java.lang.String codiceMezzoSpedizione;

    private java.lang.String denominazione;

    private java.lang.String email;

    private java.lang.String indirizzo;

    private java.lang.Boolean invioPC;

    private java.lang.String codiceMittenteDestinatario;

    private java.lang.String citta;

    private java.lang.String cognome;

    private java.lang.String nome;

    private java.lang.String tipo;

    public MittenteDestinatario() {
    }

    public MittenteDestinatario(
           java.lang.String codiceMezzoSpedizione,
           java.lang.String denominazione,
           java.lang.String email,
           java.lang.String indirizzo,
           java.lang.Boolean invioPC,
           java.lang.String codiceMittenteDestinatario,
           java.lang.String citta,
           java.lang.String cognome,
           java.lang.String nome,
           java.lang.String tipo) {
           this.codiceMezzoSpedizione = codiceMezzoSpedizione;
           this.denominazione = denominazione;
           this.email = email;
           this.indirizzo = indirizzo;
           this.invioPC = invioPC;
           this.codiceMittenteDestinatario = codiceMittenteDestinatario;
           this.citta = citta;
           this.cognome = cognome;
           this.nome = nome;
           this.tipo = tipo;
    }


    /**
     * Gets the codiceMezzoSpedizione value for this MittenteDestinatario.
     * 
     * @return codiceMezzoSpedizione
     */
    public java.lang.String getCodiceMezzoSpedizione() {
        return codiceMezzoSpedizione;
    }


    /**
     * Sets the codiceMezzoSpedizione value for this MittenteDestinatario.
     * 
     * @param codiceMezzoSpedizione
     */
    public void setCodiceMezzoSpedizione(java.lang.String codiceMezzoSpedizione) {
        this.codiceMezzoSpedizione = codiceMezzoSpedizione;
    }


    /**
     * Gets the denominazione value for this MittenteDestinatario.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this MittenteDestinatario.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the email value for this MittenteDestinatario.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MittenteDestinatario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the indirizzo value for this MittenteDestinatario.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this MittenteDestinatario.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the invioPC value for this MittenteDestinatario.
     * 
     * @return invioPC
     */
    public java.lang.Boolean getInvioPC() {
        return invioPC;
    }


    /**
     * Sets the invioPC value for this MittenteDestinatario.
     * 
     * @param invioPC
     */
    public void setInvioPC(java.lang.Boolean invioPC) {
        this.invioPC = invioPC;
    }


    /**
     * Gets the codiceMittenteDestinatario value for this MittenteDestinatario.
     * 
     * @return codiceMittenteDestinatario
     */
    public java.lang.String getCodiceMittenteDestinatario() {
        return codiceMittenteDestinatario;
    }


    /**
     * Sets the codiceMittenteDestinatario value for this MittenteDestinatario.
     * 
     * @param codiceMittenteDestinatario
     */
    public void setCodiceMittenteDestinatario(java.lang.String codiceMittenteDestinatario) {
        this.codiceMittenteDestinatario = codiceMittenteDestinatario;
    }


    /**
     * Gets the citta value for this MittenteDestinatario.
     * 
     * @return citta
     */
    public java.lang.String getCitta() {
        return citta;
    }


    /**
     * Sets the citta value for this MittenteDestinatario.
     * 
     * @param citta
     */
    public void setCitta(java.lang.String citta) {
        this.citta = citta;
    }


    /**
     * Gets the cognome value for this MittenteDestinatario.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this MittenteDestinatario.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the nome value for this MittenteDestinatario.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this MittenteDestinatario.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipo value for this MittenteDestinatario.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this MittenteDestinatario.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MittenteDestinatario)) return false;
        MittenteDestinatario other = (MittenteDestinatario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceMezzoSpedizione==null && other.getCodiceMezzoSpedizione()==null) || 
             (this.codiceMezzoSpedizione!=null &&
              this.codiceMezzoSpedizione.equals(other.getCodiceMezzoSpedizione()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.invioPC==null && other.getInvioPC()==null) || 
             (this.invioPC!=null &&
              this.invioPC.equals(other.getInvioPC()))) &&
            ((this.codiceMittenteDestinatario==null && other.getCodiceMittenteDestinatario()==null) || 
             (this.codiceMittenteDestinatario!=null &&
              this.codiceMittenteDestinatario.equals(other.getCodiceMittenteDestinatario()))) &&
            ((this.citta==null && other.getCitta()==null) || 
             (this.citta!=null &&
              this.citta.equals(other.getCitta()))) &&
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getCodiceMezzoSpedizione() != null) {
            _hashCode += getCodiceMezzoSpedizione().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getInvioPC() != null) {
            _hashCode += getInvioPC().hashCode();
        }
        if (getCodiceMittenteDestinatario() != null) {
            _hashCode += getCodiceMittenteDestinatario().hashCode();
        }
        if (getCitta() != null) {
            _hashCode += getCitta().hashCode();
        }
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MittenteDestinatario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceMezzoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceMezzoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invioPC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invioPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceMittenteDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceMittenteDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
