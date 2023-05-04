/**
 * DatiProtocollo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class DatiProtocollo  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7696825770598466199L;

	private java.lang.String aoo;

    private java.lang.String casellaemail;

    private java.lang.Long idProfilo;

    private java.lang.String modalita;

    private java.lang.String registro;

    private boolean stampaTimbro;

    public DatiProtocollo() {
    }

    public DatiProtocollo(
           java.lang.String aoo,
           java.lang.String casellaemail,
           java.lang.Long idProfilo,
           java.lang.String modalita,
           java.lang.String registro,
           boolean stampaTimbro) {
           this.aoo = aoo;
           this.casellaemail = casellaemail;
           this.idProfilo = idProfilo;
           this.modalita = modalita;
           this.registro = registro;
           this.stampaTimbro = stampaTimbro;
    }


    /**
     * Gets the aoo value for this DatiProtocollo.
     * 
     * @return aoo
     */
    public java.lang.String getAoo() {
        return aoo;
    }


    /**
     * Sets the aoo value for this DatiProtocollo.
     * 
     * @param aoo
     */
    public void setAoo(java.lang.String aoo) {
        this.aoo = aoo;
    }


    /**
     * Gets the casellaemail value for this DatiProtocollo.
     * 
     * @return casellaemail
     */
    public java.lang.String getCasellaemail() {
        return casellaemail;
    }


    /**
     * Sets the casellaemail value for this DatiProtocollo.
     * 
     * @param casellaemail
     */
    public void setCasellaemail(java.lang.String casellaemail) {
        this.casellaemail = casellaemail;
    }


    /**
     * Gets the idProfilo value for this DatiProtocollo.
     * 
     * @return idProfilo
     */
    public java.lang.Long getIdProfilo() {
        return idProfilo;
    }


    /**
     * Sets the idProfilo value for this DatiProtocollo.
     * 
     * @param idProfilo
     */
    public void setIdProfilo(java.lang.Long idProfilo) {
        this.idProfilo = idProfilo;
    }


    /**
     * Gets the modalita value for this DatiProtocollo.
     * 
     * @return modalita
     */
    public java.lang.String getModalita() {
        return modalita;
    }


    /**
     * Sets the modalita value for this DatiProtocollo.
     * 
     * @param modalita
     */
    public void setModalita(java.lang.String modalita) {
        this.modalita = modalita;
    }


    /**
     * Gets the registro value for this DatiProtocollo.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this DatiProtocollo.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the stampaTimbro value for this DatiProtocollo.
     * 
     * @return stampaTimbro
     */
    public boolean isStampaTimbro() {
        return stampaTimbro;
    }


    /**
     * Sets the stampaTimbro value for this DatiProtocollo.
     * 
     * @param stampaTimbro
     */
    public void setStampaTimbro(boolean stampaTimbro) {
        this.stampaTimbro = stampaTimbro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatiProtocollo)) return false;
        DatiProtocollo other = (DatiProtocollo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aoo==null && other.getAoo()==null) || 
             (this.aoo!=null &&
              this.aoo.equals(other.getAoo()))) &&
            ((this.casellaemail==null && other.getCasellaemail()==null) || 
             (this.casellaemail!=null &&
              this.casellaemail.equals(other.getCasellaemail()))) &&
            ((this.idProfilo==null && other.getIdProfilo()==null) || 
             (this.idProfilo!=null &&
              this.idProfilo.equals(other.getIdProfilo()))) &&
            ((this.modalita==null && other.getModalita()==null) || 
             (this.modalita!=null &&
              this.modalita.equals(other.getModalita()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            this.stampaTimbro == other.isStampaTimbro();
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
        if (getAoo() != null) {
            _hashCode += getAoo().hashCode();
        }
        if (getCasellaemail() != null) {
            _hashCode += getCasellaemail().hashCode();
        }
        if (getIdProfilo() != null) {
            _hashCode += getIdProfilo().hashCode();
        }
        if (getModalita() != null) {
            _hashCode += getModalita().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        _hashCode += (isStampaTimbro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatiProtocollo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "DatiProtocollo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aoo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casellaemail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casellaemail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProfilo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProfilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalita");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalita"));
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
        elemField.setFieldName("stampaTimbro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stampaTimbro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
