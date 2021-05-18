
package pe.edu.upeu.soap.ws.dao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ventas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ventas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idventa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipodoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventas", propOrder = {
    "fecha",
    "idcliente",
    "idventa",
    "numdoc",
    "tipodoc"
})
public class Ventas {

    protected String fecha;
    protected int idcliente;
    protected int idventa;
    protected String numdoc;
    protected String tipodoc;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idcliente.
     * 
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     */
    public void setIdcliente(int value) {
        this.idcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idventa.
     * 
     */
    public int getIdventa() {
        return idventa;
    }

    /**
     * Define el valor de la propiedad idventa.
     * 
     */
    public void setIdventa(int value) {
        this.idventa = value;
    }

    /**
     * Obtiene el valor de la propiedad numdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumdoc() {
        return numdoc;
    }

    /**
     * Define el valor de la propiedad numdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumdoc(String value) {
        this.numdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipodoc() {
        return tipodoc;
    }

    /**
     * Define el valor de la propiedad tipodoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipodoc(String value) {
        this.tipodoc = value;
    }

}
