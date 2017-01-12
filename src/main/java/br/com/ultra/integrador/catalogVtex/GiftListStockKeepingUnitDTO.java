
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de GiftListStockKeepingUnitDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GiftListStockKeepingUnitDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DatePurchased" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FreightAndServicesValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GiftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftListSkuId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsertedByClientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsertedByProfileSystemUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OmsOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderMessageFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderMessageTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkuId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WishedByClientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WishedByProfileSystemUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_IsOrderFinished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftListStockKeepingUnitDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "dateCreated",
    "datePurchased",
    "freightAndServicesValue",
    "giftListId",
    "giftListSkuId",
    "insertedByClientId",
    "insertedByProfileSystemUserId",
    "itemValue",
    "omsOrderId",
    "orderId",
    "orderMessage",
    "orderMessageFrom",
    "orderMessageTo",
    "orderResponseMessage",
    "skuId",
    "wishedByClientId",
    "wishedByProfileSystemUserId",
    "isOrderFinished"
})
public class GiftListStockKeepingUnitDTO {

    @XmlElementRef(name = "DateCreated", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateCreated;
    @XmlElementRef(name = "DatePurchased", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datePurchased;
    @XmlElementRef(name = "FreightAndServicesValue", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> freightAndServicesValue;
    @XmlElementRef(name = "GiftListId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftListId;
    @XmlElementRef(name = "GiftListSkuId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftListSkuId;
    @XmlElementRef(name = "InsertedByClientId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> insertedByClientId;
    @XmlElementRef(name = "InsertedByProfileSystemUserId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insertedByProfileSystemUserId;
    @XmlElementRef(name = "ItemValue", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> itemValue;
    @XmlElementRef(name = "OmsOrderId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omsOrderId;
    @XmlElementRef(name = "OrderId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderId;
    @XmlElementRef(name = "OrderMessage", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderMessage;
    @XmlElementRef(name = "OrderMessageFrom", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderMessageFrom;
    @XmlElementRef(name = "OrderMessageTo", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderMessageTo;
    @XmlElementRef(name = "OrderResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderResponseMessage;
    @XmlElementRef(name = "SkuId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> skuId;
    @XmlElementRef(name = "WishedByClientId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wishedByClientId;
    @XmlElementRef(name = "WishedByProfileSystemUserId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wishedByProfileSystemUserId;
    @XmlElementRef(name = "_IsOrderFinished", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isOrderFinished;

    /**
     * Obtém o valor da propriedade dateCreated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateCreated() {
        return dateCreated;
    }

    /**
     * Define o valor da propriedade dateCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateCreated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateCreated = value;
    }

    /**
     * Obtém o valor da propriedade datePurchased.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatePurchased() {
        return datePurchased;
    }

    /**
     * Define o valor da propriedade datePurchased.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatePurchased(JAXBElement<XMLGregorianCalendar> value) {
        this.datePurchased = value;
    }

    /**
     * Obtém o valor da propriedade freightAndServicesValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFreightAndServicesValue() {
        return freightAndServicesValue;
    }

    /**
     * Define o valor da propriedade freightAndServicesValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFreightAndServicesValue(JAXBElement<BigDecimal> value) {
        this.freightAndServicesValue = value;
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
     * Obtém o valor da propriedade giftListSkuId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListSkuId() {
        return giftListSkuId;
    }

    /**
     * Define o valor da propriedade giftListSkuId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListSkuId(JAXBElement<Integer> value) {
        this.giftListSkuId = value;
    }

    /**
     * Obtém o valor da propriedade insertedByClientId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInsertedByClientId() {
        return insertedByClientId;
    }

    /**
     * Define o valor da propriedade insertedByClientId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInsertedByClientId(JAXBElement<Integer> value) {
        this.insertedByClientId = value;
    }

    /**
     * Obtém o valor da propriedade insertedByProfileSystemUserId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsertedByProfileSystemUserId() {
        return insertedByProfileSystemUserId;
    }

    /**
     * Define o valor da propriedade insertedByProfileSystemUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsertedByProfileSystemUserId(JAXBElement<String> value) {
        this.insertedByProfileSystemUserId = value;
    }

    /**
     * Obtém o valor da propriedade itemValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getItemValue() {
        return itemValue;
    }

    /**
     * Define o valor da propriedade itemValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setItemValue(JAXBElement<BigDecimal> value) {
        this.itemValue = value;
    }

    /**
     * Obtém o valor da propriedade omsOrderId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmsOrderId() {
        return omsOrderId;
    }

    /**
     * Define o valor da propriedade omsOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmsOrderId(JAXBElement<String> value) {
        this.omsOrderId = value;
    }

    /**
     * Obtém o valor da propriedade orderId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderId() {
        return orderId;
    }

    /**
     * Define o valor da propriedade orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderId(JAXBElement<Integer> value) {
        this.orderId = value;
    }

    /**
     * Obtém o valor da propriedade orderMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderMessage() {
        return orderMessage;
    }

    /**
     * Define o valor da propriedade orderMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderMessage(JAXBElement<String> value) {
        this.orderMessage = value;
    }

    /**
     * Obtém o valor da propriedade orderMessageFrom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderMessageFrom() {
        return orderMessageFrom;
    }

    /**
     * Define o valor da propriedade orderMessageFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderMessageFrom(JAXBElement<String> value) {
        this.orderMessageFrom = value;
    }

    /**
     * Obtém o valor da propriedade orderMessageTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderMessageTo() {
        return orderMessageTo;
    }

    /**
     * Define o valor da propriedade orderMessageTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderMessageTo(JAXBElement<String> value) {
        this.orderMessageTo = value;
    }

    /**
     * Obtém o valor da propriedade orderResponseMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderResponseMessage() {
        return orderResponseMessage;
    }

    /**
     * Define o valor da propriedade orderResponseMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderResponseMessage(JAXBElement<String> value) {
        this.orderResponseMessage = value;
    }

    /**
     * Obtém o valor da propriedade skuId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSkuId() {
        return skuId;
    }

    /**
     * Define o valor da propriedade skuId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSkuId(JAXBElement<Integer> value) {
        this.skuId = value;
    }

    /**
     * Obtém o valor da propriedade wishedByClientId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWishedByClientId() {
        return wishedByClientId;
    }

    /**
     * Define o valor da propriedade wishedByClientId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWishedByClientId(JAXBElement<Integer> value) {
        this.wishedByClientId = value;
    }

    /**
     * Obtém o valor da propriedade wishedByProfileSystemUserId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWishedByProfileSystemUserId() {
        return wishedByProfileSystemUserId;
    }

    /**
     * Define o valor da propriedade wishedByProfileSystemUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWishedByProfileSystemUserId(JAXBElement<String> value) {
        this.wishedByProfileSystemUserId = value;
    }

    /**
     * Obtém o valor da propriedade isOrderFinished.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsOrderFinished() {
        return isOrderFinished;
    }

    /**
     * Define o valor da propriedade isOrderFinished.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsOrderFinished(JAXBElement<Boolean> value) {
        this.isOrderFinished = value;
    }

}
