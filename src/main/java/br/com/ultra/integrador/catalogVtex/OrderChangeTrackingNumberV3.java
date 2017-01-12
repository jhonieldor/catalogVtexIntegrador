
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idOrder",
    "trackingNumber",
    "invoiceNumber"
})
@XmlRootElement(name = "OrderChangeTrackingNumberV3")
public class OrderChangeTrackingNumberV3 {

    protected Integer idOrder;
    @XmlElementRef(name = "trackingNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingNumber;
    @XmlElementRef(name = "invoiceNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNumber;

    /**
     * Obtém o valor da propriedade idOrder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOrder() {
        return idOrder;
    }

    /**
     * Define o valor da propriedade idOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOrder(Integer value) {
        this.idOrder = value;
    }

    /**
     * Obtém o valor da propriedade trackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define o valor da propriedade trackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingNumber(JAXBElement<String> value) {
        this.trackingNumber = value;
    }

    /**
     * Obtém o valor da propriedade invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define o valor da propriedade invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceNumber(JAXBElement<String> value) {
        this.invoiceNumber = value;
    }

}
