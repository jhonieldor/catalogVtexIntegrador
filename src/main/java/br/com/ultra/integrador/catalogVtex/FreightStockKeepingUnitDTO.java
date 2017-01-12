
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FreightStockKeepingUnitDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FreightStockKeepingUnitDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreightAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FreightScheduledDateOptions" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfFreightScheduledDateOptionDTO" minOccurs="0"/>
 *         &lt;element name="FreightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightStockKeepingUnitDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "deliveryTime",
    "freightAdditionalInfo",
    "freightPrice",
    "freightScheduledDateOptions",
    "freightType",
    "freightTypeId",
    "quantity",
    "stockKeepingUnitId"
})
public class FreightStockKeepingUnitDTO {

    @XmlElement(name = "DeliveryTime")
    protected Integer deliveryTime;
    @XmlElementRef(name = "FreightAdditionalInfo", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightAdditionalInfo;
    @XmlElement(name = "FreightPrice")
    protected BigDecimal freightPrice;
    @XmlElementRef(name = "FreightScheduledDateOptions", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFreightScheduledDateOptionDTO> freightScheduledDateOptions;
    @XmlElementRef(name = "FreightType", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightType;
    @XmlElementRef(name = "FreightTypeId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightTypeId;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "StockKeepingUnitId")
    protected Integer stockKeepingUnitId;

    /**
     * Obtém o valor da propriedade deliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Define o valor da propriedade deliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryTime(Integer value) {
        this.deliveryTime = value;
    }

    /**
     * Obtém o valor da propriedade freightAdditionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightAdditionalInfo() {
        return freightAdditionalInfo;
    }

    /**
     * Define o valor da propriedade freightAdditionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightAdditionalInfo(JAXBElement<String> value) {
        this.freightAdditionalInfo = value;
    }

    /**
     * Obtém o valor da propriedade freightPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * Define o valor da propriedade freightPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightPrice(BigDecimal value) {
        this.freightPrice = value;
    }

    /**
     * Obtém o valor da propriedade freightScheduledDateOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightScheduledDateOptionDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFreightScheduledDateOptionDTO> getFreightScheduledDateOptions() {
        return freightScheduledDateOptions;
    }

    /**
     * Define o valor da propriedade freightScheduledDateOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightScheduledDateOptionDTO }{@code >}
     *     
     */
    public void setFreightScheduledDateOptions(JAXBElement<ArrayOfFreightScheduledDateOptionDTO> value) {
        this.freightScheduledDateOptions = value;
    }

    /**
     * Obtém o valor da propriedade freightType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightType() {
        return freightType;
    }

    /**
     * Define o valor da propriedade freightType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightType(JAXBElement<String> value) {
        this.freightType = value;
    }

    /**
     * Obtém o valor da propriedade freightTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightTypeId() {
        return freightTypeId;
    }

    /**
     * Define o valor da propriedade freightTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightTypeId(JAXBElement<String> value) {
        this.freightTypeId = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitId(Integer value) {
        this.stockKeepingUnitId = value;
    }

}
