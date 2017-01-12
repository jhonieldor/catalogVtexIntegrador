
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
 *         &lt;element name="giftListTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="giftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventDateSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventDateUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "giftListTypeId",
    "giftListId",
    "clientId",
    "eventDateSince",
    "eventDateUntil",
    "isActive"
})
@XmlRootElement(name = "GiftListV2Filters")
public class GiftListV2Filters {

    @XmlElementRef(name = "giftListTypeId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftListTypeId;
    @XmlElementRef(name = "giftListId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftListId;
    @XmlElementRef(name = "clientId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> clientId;
    @XmlElementRef(name = "eventDateSince", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventDateSince;
    @XmlElementRef(name = "eventDateUntil", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventDateUntil;
    @XmlElementRef(name = "isActive", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isActive;

    /**
     * Obtém o valor da propriedade giftListTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListTypeId() {
        return giftListTypeId;
    }

    /**
     * Define o valor da propriedade giftListTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListTypeId(JAXBElement<Integer> value) {
        this.giftListTypeId = value;
    }

    /**
     * Obtém o valor da propriedade giftListId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListId() {
        return giftListId;
    }

    /**
     * Define o valor da propriedade giftListId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListId(JAXBElement<Integer> value) {
        this.giftListId = value;
    }

    /**
     * Obtém o valor da propriedade clientId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getClientId() {
        return clientId;
    }

    /**
     * Define o valor da propriedade clientId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setClientId(JAXBElement<Integer> value) {
        this.clientId = value;
    }

    /**
     * Obtém o valor da propriedade eventDateSince.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDateSince() {
        return eventDateSince;
    }

    /**
     * Define o valor da propriedade eventDateSince.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDateSince(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDateSince = value;
    }

    /**
     * Obtém o valor da propriedade eventDateUntil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDateUntil() {
        return eventDateUntil;
    }

    /**
     * Define o valor da propriedade eventDateUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDateUntil(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDateUntil = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsActive(JAXBElement<Boolean> value) {
        this.isActive = value;
    }

}
