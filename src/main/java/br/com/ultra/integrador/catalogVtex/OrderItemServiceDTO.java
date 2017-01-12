
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderItemServiceDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderItemServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftCardFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftCardMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftCardTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitService" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitServiceDTO" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemServiceDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "archiveId",
    "giftCardFrom",
    "giftCardMessage",
    "giftCardTo",
    "id",
    "listPrice",
    "orderItemId",
    "price",
    "stockKeepingUnitService",
    "stockKeepingUnitServiceId"
})
public class OrderItemServiceDTO {

    @XmlElementRef(name = "ArchiveId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> archiveId;
    @XmlElementRef(name = "GiftCardFrom", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCardFrom;
    @XmlElementRef(name = "GiftCardMessage", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCardMessage;
    @XmlElementRef(name = "GiftCardTo", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCardTo;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "ListPrice", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> listPrice;
    @XmlElementRef(name = "OrderItemId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderItemId;
    @XmlElementRef(name = "Price", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> price;
    @XmlElementRef(name = "StockKeepingUnitService", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StockKeepingUnitServiceDTO> stockKeepingUnitService;
    @XmlElementRef(name = "StockKeepingUnitServiceId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stockKeepingUnitServiceId;

    /**
     * Obtém o valor da propriedade archiveId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getArchiveId() {
        return archiveId;
    }

    /**
     * Define o valor da propriedade archiveId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setArchiveId(JAXBElement<Integer> value) {
        this.archiveId = value;
    }

    /**
     * Obtém o valor da propriedade giftCardFrom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCardFrom() {
        return giftCardFrom;
    }

    /**
     * Define o valor da propriedade giftCardFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCardFrom(JAXBElement<String> value) {
        this.giftCardFrom = value;
    }

    /**
     * Obtém o valor da propriedade giftCardMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCardMessage() {
        return giftCardMessage;
    }

    /**
     * Define o valor da propriedade giftCardMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCardMessage(JAXBElement<String> value) {
        this.giftCardMessage = value;
    }

    /**
     * Obtém o valor da propriedade giftCardTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCardTo() {
        return giftCardTo;
    }

    /**
     * Define o valor da propriedade giftCardTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCardTo(JAXBElement<String> value) {
        this.giftCardTo = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade listPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getListPrice() {
        return listPrice;
    }

    /**
     * Define o valor da propriedade listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setListPrice(JAXBElement<BigDecimal> value) {
        this.listPrice = value;
    }

    /**
     * Obtém o valor da propriedade orderItemId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderItemId() {
        return orderItemId;
    }

    /**
     * Define o valor da propriedade orderItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderItemId(JAXBElement<Integer> value) {
        this.orderItemId = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrice(JAXBElement<BigDecimal> value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}
     *     
     */
    public JAXBElement<StockKeepingUnitServiceDTO> getStockKeepingUnitService() {
        return stockKeepingUnitService;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitService(JAXBElement<StockKeepingUnitServiceDTO> value) {
        this.stockKeepingUnitService = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitServiceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitServiceId() {
        return stockKeepingUnitServiceId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitServiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitServiceId(JAXBElement<Integer> value) {
        this.stockKeepingUnitServiceId = value;
    }

}
