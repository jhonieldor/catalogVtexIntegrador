
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
 *         &lt;element name="dateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startingStockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "dateUpdated",
    "startingStockKeepingUnitId",
    "topRows"
})
@XmlRootElement(name = "StockKeepingUnitGetAllFromUpdatedDateAndId")
public class StockKeepingUnitGetAllFromUpdatedDateAndId {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;
    @XmlElementRef(name = "startingStockKeepingUnitId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> startingStockKeepingUnitId;
    protected Integer topRows;

    /**
     * Obtém o valor da propriedade dateUpdated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Define o valor da propriedade dateUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
        this.dateUpdated = value;
    }

    /**
     * Obtém o valor da propriedade startingStockKeepingUnitId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStartingStockKeepingUnitId() {
        return startingStockKeepingUnitId;
    }

    /**
     * Define o valor da propriedade startingStockKeepingUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStartingStockKeepingUnitId(JAXBElement<Integer> value) {
        this.startingStockKeepingUnitId = value;
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
