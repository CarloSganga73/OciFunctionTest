/**
 * WSAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws;

public class WSAuthentication  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2358380205678432787L;

	private java.lang.String aoo;

    private java.lang.String applicazione;

    private java.lang.String ente;

    private java.lang.String password;

    private java.lang.String username;

    public WSAuthentication() {
    }

    public WSAuthentication(
           java.lang.String aoo,
           java.lang.String applicazione,
           java.lang.String ente,
           java.lang.String password,
           java.lang.String username) {
           this.aoo = aoo;
           this.applicazione = applicazione;
           this.ente = ente;
           this.password = password;
           this.username = username;
    }


    /**
     * Gets the aoo value for this WSAuthentication.
     * 
     * @return aoo
     */
    public java.lang.String getAoo() {
        return aoo;
    }


    /**
     * Sets the aoo value for this WSAuthentication.
     * 
     * @param aoo
     */
    public void setAoo(java.lang.String aoo) {
        this.aoo = aoo;
    }


    /**
     * Gets the applicazione value for this WSAuthentication.
     * 
     * @return applicazione
     */
    public java.lang.String getApplicazione() {
        return applicazione;
    }


    /**
     * Sets the applicazione value for this WSAuthentication.
     * 
     * @param applicazione
     */
    public void setApplicazione(java.lang.String applicazione) {
        this.applicazione = applicazione;
    }


    /**
     * Gets the ente value for this WSAuthentication.
     * 
     * @return ente
     */
    public java.lang.String getEnte() {
        return ente;
    }


    /**
     * Sets the ente value for this WSAuthentication.
     * 
     * @param ente
     */
    public void setEnte(java.lang.String ente) {
        this.ente = ente;
    }


    /**
     * Gets the password value for this WSAuthentication.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this WSAuthentication.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the username value for this WSAuthentication.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this WSAuthentication.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAuthentication)) return false;
        WSAuthentication other = (WSAuthentication) obj;
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
            ((this.applicazione==null && other.getApplicazione()==null) || 
             (this.applicazione!=null &&
              this.applicazione.equals(other.getApplicazione()))) &&
            ((this.ente==null && other.getEnte()==null) || 
             (this.ente!=null &&
              this.ente.equals(other.getEnte()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getApplicazione() != null) {
            _hashCode += getApplicazione().hashCode();
        }
        if (getEnte() != null) {
            _hashCode += getEnte().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aoo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
