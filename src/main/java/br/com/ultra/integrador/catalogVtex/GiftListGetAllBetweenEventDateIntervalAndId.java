
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="eventDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startingGiftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="topRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "eventDateBegin",
    "eventDateEnd",
    "startingGiftListId",
    "topRows"
})
@XmlRootElement(name = "GiftListGetAllBetweenEventDateIntervalAndId")
public class GiftListGetAllBetweenEventDateIntervalAndId {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateBegin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateEnd;
    @XmlElementRef(name = "startingGiftListId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> startingGiftListId;
    protected Integer topRows;

    /**
     * Obtém o valor da propriedade eventDateBegin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateBegin() {
        return eventDateBegin;
    }

    /**
     * Define o valor da propriedade eventDateBegin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateBegin(XMLGregorianCalendar value) {
        this.eventDateBegin = value;
    }

    /**
     * Obtém o valor da propriedade eventDateEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateEnd() {
        return eventDateEnd;
    }

    /**
     * Define o valor da propriedade eventDateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateEnd(XMLGregorianCalendar value) {
        this.eventDateEnd = value;
    }

    /**
     * Obtém o valor da propriedade startingGiftListId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStartingGiftListId() {
        return startingGiftListId;
    }

    /**
     * Define o valor da propriedade startingGiftListId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStartingGiftListId(JAXBElement<Integer> value) {
        this.startingGiftListId = value;
    }

    /**
     * Obtém o valor da propriedade topRows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopRows() {
        return topRows;
    }

    /**
     * Define o valor da propriedade topRows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopRows(Integer value) {
        this.topRows = value;
    }

}
