
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WareHouseIStockableDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WareHouseIStockableDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WareHouseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WareHouseIdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WareHouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WareHouseIStockableDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "availableQuantity",
    "reservedQuantity",
    "stockKeepingUnitId",
    "totalQuantity",
    "wareHouseId",
    "wareHouseIdV3",
    "wareHouseName"
})
public class WareHouseIStockableDTO {

    @XmlElementRef(name = "AvailableQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> availableQuantity;
    @XmlElementRef(name = "ReservedQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reservedQuantity;
    @XmlElementRef(name = "StockKeepingUnitId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stockKeepingUnitId;
    @XmlElementRef(name = "TotalQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalQuantity;
    @XmlElementRef(name = "WareHouseId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wareHouseId;
    @XmlElementRef(name = "WareHouseIdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wareHouseIdV3;
    @XmlElementRef(name = "WareHouseName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wareHouseName;

    /**
     * Obtém o valor da propriedade availableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Define o valor da propriedade availableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvailableQuantity(JAXBElement<Integer> value) {
        this.availableQuantity = value;
    }

    /**
     * Obtém o valor da propriedade reservedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReservedQuantity() {
        return reservedQuantity;
    }

    /**
     * Define o valor da propriedade reservedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReservedQuantity(JAXBElement<Integer> value) {
        this.reservedQuantity = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitId(JAXBElement<Integer> value) {
        this.stockKeepingUnitId = value;
    }

    /**
     * Obtém o valor da propriedade totalQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Define o valor da propriedade totalQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalQuantity(JAXBElement<Integer> value) {
        this.totalQuantity = value;
    }

    /**
     * Obtém o valor da propriedade wareHouseId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWareHouseId() {
        return wareHouseId;
    }

    /**
     * Define o valor da propriedade wareHouseId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWareHouseId(JAXBElement<Integer> value) {
        this.wareHouseId = value;
    }

    /**
     * Obtém o valor da propriedade wareHouseIdV3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWareHouseIdV3() {
        return wareHouseIdV3;
    }

    /**
     * Define o valor da propriedade wareHouseIdV3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWareHouseIdV3(JAXBElement<String> value) {
        this.wareHouseIdV3 = value;
    }

    /**
     * Obtém o valor da propriedade wareHouseName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWareHouseName() {
        return wareHouseName;
    }

    /**
     * Define o valor da propriedade wareHouseName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWareHouseName(JAXBElement<String> value) {
        this.wareHouseName = value;
    }

}
