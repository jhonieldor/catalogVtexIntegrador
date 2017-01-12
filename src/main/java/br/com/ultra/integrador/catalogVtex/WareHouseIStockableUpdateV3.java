
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
 *         &lt;element name="wareHouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="availableQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateOfAvailability" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "wareHouseId",
    "itemId",
    "availableQuantity",
    "dateOfAvailability"
})
@XmlRootElement(name = "WareHouseIStockableUpdateV3")
public class WareHouseIStockableUpdateV3 {

    @XmlElementRef(name = "wareHouseId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wareHouseId;
    protected Integer itemId;
    protected Integer availableQuantity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfAvailability;

    /**
     * Obtém o valor da propriedade wareHouseId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWareHouseId() {
        return wareHouseId;
    }

    /**
     * Define o valor da propriedade wareHouseId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWareHouseId(JAXBElement<String> value) {
        this.wareHouseId = value;
    }

    /**
     * Obtém o valor da propriedade itemId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Define o valor da propriedade itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Obtém o valor da propriedade availableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Define o valor da propriedade availableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableQuantity(Integer value) {
        this.availableQuantity = value;
    }

    /**
     * Obtém o valor da propriedade dateOfAvailability.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAvailability() {
        return dateOfAvailability;
    }

    /**
     * Define o valor da propriedade dateOfAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfAvailability(XMLGregorianCalendar value) {
        this.dateOfAvailability = value;
    }

}
