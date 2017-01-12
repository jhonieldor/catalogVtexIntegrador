
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "clientName",
    "clientSurname",
    "eventLocation",
    "eventCity",
    "eventDate"
})
@XmlRootElement(name = "GiftListSearchWithSurname")
public class GiftListSearchWithSurname {

    @XmlElementRef(name = "clientName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientName;
    @XmlElementRef(name = "clientSurname", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientSurname;
    @XmlElementRef(name = "eventLocation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventLocation;
    @XmlElementRef(name = "eventCity", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventCity;
    @XmlElementRef(name = "eventDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventDate;

    /**
     * Obtém o valor da propriedade clientName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientName() {
        return clientName;
    }

    /**
     * Define o valor da propriedade clientName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientName(JAXBElement<String> value) {
        this.clientName = value;
    }

    /**
     * Obtém o valor da propriedade clientSurname.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientSurname() {
        return clientSurname;
    }

    /**
     * Define o valor da propriedade clientSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientSurname(JAXBElement<String> value) {
        this.clientSurname = value;
    }

    /**
     * Obtém o valor da propriedade eventLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventLocation() {
        return eventLocation;
    }

    /**
     * Define o valor da propriedade eventLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventLocation(JAXBElement<String> value) {
        this.eventLocation = value;
    }

    /**
     * Obtém o valor da propriedade eventCity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventCity() {
        return eventCity;
    }

    /**
     * Define o valor da propriedade eventCity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventCity(JAXBElement<String> value) {
        this.eventCity = value;
    }

    /**
     * Obtém o valor da propriedade eventDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDate() {
        return eventDate;
    }

    /**
     * Define o valor da propriedade eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDate(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDate = value;
    }

}
