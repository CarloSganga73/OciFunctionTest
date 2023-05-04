/**
 * ImmagineDocumentale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class ImmagineDocumentale  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8719624597232865356L;

	private byte[] contenuto;

    private java.lang.Long id;

    private java.lang.String nomeFile;

    private agora.folium.ws.WSEsito esito;

    public ImmagineDocumentale() {
    }

    public ImmagineDocumentale(
           byte[] contenuto,
           java.lang.Long id,
           java.lang.String nomeFile,
           agora.folium.ws.WSEsito esito) {
           this.contenuto = contenuto;
           this.id = id;
           this.nomeFile = nomeFile;
           this.esito = esito;
    }


    /**
     * Gets the contenuto value for this ImmagineDocumentale.
     * 
     * @return contenuto
     */
    public byte[] getContenuto() {
        return contenuto;
    }


    /**
     * Sets the contenuto value for this ImmagineDocumentale.
     * 
     * @param contenuto
     */
    public void setContenuto(byte[] contenuto) {
        this.contenuto = contenuto;
    }


    /**
     * Gets the id value for this ImmagineDocumentale.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ImmagineDocumentale.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nomeFile value for this ImmagineDocumentale.
     * 
     * @return nomeFile
     */
    public java.lang.String getNomeFile() {
        return nomeFile;
    }


    /**
     * Sets the nomeFile value for this ImmagineDocumentale.
     * 
     * @param nomeFile
     */
    public void setNomeFile(java.lang.String nomeFile) {
        this.nomeFile = nomeFile;
    }


    /**
     * Gets the esito value for this ImmagineDocumentale.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this ImmagineDocumentale.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImmagineDocumentale)) return false;
        ImmagineDocumentale other = (ImmagineDocumentale) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nomeFile==null && other.getNomeFile()==null) || 
             (this.nomeFile!=null &&
              this.nomeFile.equals(other.getNomeFile()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNomeFile() != null) {
            _hashCode += getNomeFile().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImmagineDocumentale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenuto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contenuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
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
