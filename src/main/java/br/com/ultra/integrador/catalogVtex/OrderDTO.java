
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de OrderDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}AddressOrderDTO" minOccurs="0"/>
 *         &lt;element name="AffiliateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ClientDTO" minOccurs="0"/>
 *         &lt;element name="ClientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftListStockKeepingUnits" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfGiftListStockKeepingUnitDTO" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGiftList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultiStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOrderDiscount" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderDiscountDTO" minOccurs="0"/>
 *         &lt;element name="Media" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDeliveries" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderDeliveryDTO" minOccurs="0"/>
 *         &lt;element name="OrderInvoices" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderInvoiceDTO" minOccurs="0"/>
 *         &lt;element name="OrderPayments" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderPaymentDTO" minOccurs="0"/>
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PurchaseDateUtc" type="{http://schemas.datacontract.org/2004/07/System}DateTimeOffset" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TelemarketingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TelemarketingLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelemarketingObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelemarketingStoreLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelemarketingStoreLocatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_CostFinal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "address",
    "affiliateId",
    "campaign",
    "client",
    "clientIP",
    "clientId",
    "coupon",
    "giftListStockKeepingUnits",
    "id",
    "idV3",
    "isGiftList",
    "isMultiStore",
    "keywords",
    "listOrderDiscount",
    "media",
    "orderDeliveries",
    "orderInvoices",
    "orderPayments",
    "purchaseDate",
    "purchaseDateUtc",
    "source",
    "storeId",
    "storeName",
    "tax",
    "telemarketingId",
    "telemarketingLogin",
    "telemarketingObservation",
    "telemarketingStoreLocatorCode",
    "telemarketingStoreLocatorName",
    "cost",
    "costFinal"
})
public class OrderDTO {

    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressOrderDTO> address;
    @XmlElementRef(name = "AffiliateId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affiliateId;
    @XmlElementRef(name = "Campaign", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaign;
    @XmlElementRef(name = "Client", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientDTO> client;
    @XmlElementRef(name = "ClientIP", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIP;
    @XmlElementRef(name = "ClientId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> clientId;
    @XmlElementRef(name = "Coupon", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coupon;
    @XmlElementRef(name = "GiftListStockKeepingUnits", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> giftListStockKeepingUnits;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "IdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idV3;
    @XmlElement(name = "IsGiftList")
    protected Boolean isGiftList;
    @XmlElement(name = "IsMultiStore")
    protected Boolean isMultiStore;
    @XmlElementRef(name = "Keywords", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElementRef(name = "ListOrderDiscount", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderDiscountDTO> listOrderDiscount;
    @XmlElementRef(name = "Media", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> media;
    @XmlElementRef(name = "OrderDeliveries", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderDeliveryDTO> orderDeliveries;
    @XmlElementRef(name = "OrderInvoices", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderInvoiceDTO> orderInvoices;
    @XmlElementRef(name = "OrderPayments", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderPaymentDTO> orderPayments;
    @XmlElementRef(name = "PurchaseDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> purchaseDate;
    @XmlElementRef(name = "PurchaseDateUtc", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeOffset> purchaseDateUtc;
    @XmlElementRef(name = "Source", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElement(name = "StoreId")
    protected Integer storeId;
    @XmlElementRef(name = "StoreName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeName;
    @XmlElementRef(name = "Tax", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tax;
    @XmlElementRef(name = "TelemarketingId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> telemarketingId;
    @XmlElementRef(name = "TelemarketingLogin", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telemarketingLogin;
    @XmlElementRef(name = "TelemarketingObservation", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telemarketingObservation;
    @XmlElementRef(name = "TelemarketingStoreLocatorCode", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telemarketingStoreLocatorCode;
    @XmlElementRef(name = "TelemarketingStoreLocatorName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telemarketingStoreLocatorName;
    @XmlElementRef(name = "_Cost", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cost;
    @XmlElementRef(name = "_CostFinal", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costFinal;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressOrderDTO }{@code >}
     *     
     */
    public JAXBElement<AddressOrderDTO> getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressOrderDTO }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AddressOrderDTO> value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade affiliateId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffiliateId() {
        return affiliateId;
    }

    /**
     * Define o valor da propriedade affiliateId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffiliateId(JAXBElement<String> value) {
        this.affiliateId = value;
    }

    /**
     * Obtém o valor da propriedade campaign.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaign() {
        return campaign;
    }

    /**
     * Define o valor da propriedade campaign.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<String> value) {
        this.campaign = value;
    }

    /**
     * Obtém o valor da propriedade client.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}
     *     
     */
    public JAXBElement<ClientDTO> getClient() {
        return client;
    }

    /**
     * Define o valor da propriedade client.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}
     *     
     */
    public void setClient(JAXBElement<ClientDTO> value) {
        this.client = value;
    }

    /**
     * Obtém o valor da propriedade clientIP.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIP() {
        return clientIP;
    }

    /**
     * Define o valor da propriedade clientIP.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIP(JAXBElement<String> value) {
        this.clientIP = value;
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
     * Obtém o valor da propriedade coupon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoupon() {
        return coupon;
    }

    /**
     * Define o valor da propriedade coupon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoupon(JAXBElement<String> value) {
        this.coupon = value;
    }

    /**
     * Obtém o valor da propriedade giftListStockKeepingUnits.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> getGiftListStockKeepingUnits() {
        return giftListStockKeepingUnits;
    }

    /**
     * Define o valor da propriedade giftListStockKeepingUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setGiftListStockKeepingUnits(JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> value) {
        this.giftListStockKeepingUnits = value;
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
     * Obtém o valor da propriedade idV3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdV3() {
        return idV3;
    }

    /**
     * Define o valor da propriedade idV3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdV3(JAXBElement<String> value) {
        this.idV3 = value;
    }

    /**
     * Obtém o valor da propriedade isGiftList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGiftList() {
        return isGiftList;
    }

    /**
     * Define o valor da propriedade isGiftList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGiftList(Boolean value) {
        this.isGiftList = value;
    }

    /**
     * Obtém o valor da propriedade isMultiStore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiStore() {
        return isMultiStore;
    }

    /**
     * Define o valor da propriedade isMultiStore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiStore(Boolean value) {
        this.isMultiStore = value;
    }

    /**
     * Obtém o valor da propriedade keywords.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Define o valor da propriedade keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * Obtém o valor da propriedade listOrderDiscount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDiscountDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderDiscountDTO> getListOrderDiscount() {
        return listOrderDiscount;
    }

    /**
     * Define o valor da propriedade listOrderDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDiscountDTO }{@code >}
     *     
     */
    public void setListOrderDiscount(JAXBElement<ArrayOfOrderDiscountDTO> value) {
        this.listOrderDiscount = value;
    }

    /**
     * Obtém o valor da propriedade media.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedia() {
        return media;
    }

    /**
     * Define o valor da propriedade media.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedia(JAXBElement<String> value) {
        this.media = value;
    }

    /**
     * Obtém o valor da propriedade orderDeliveries.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDeliveryDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderDeliveryDTO> getOrderDeliveries() {
        return orderDeliveries;
    }

    /**
     * Define o valor da propriedade orderDeliveries.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDeliveryDTO }{@code >}
     *     
     */
    public void setOrderDeliveries(JAXBElement<ArrayOfOrderDeliveryDTO> value) {
        this.orderDeliveries = value;
    }

    /**
     * Obtém o valor da propriedade orderInvoices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderInvoiceDTO> getOrderInvoices() {
        return orderInvoices;
    }

    /**
     * Define o valor da propriedade orderInvoices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceDTO }{@code >}
     *     
     */
    public void setOrderInvoices(JAXBElement<ArrayOfOrderInvoiceDTO> value) {
        this.orderInvoices = value;
    }

    /**
     * Obtém o valor da propriedade orderPayments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderPaymentDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderPaymentDTO> getOrderPayments() {
        return orderPayments;
    }

    /**
     * Define o valor da propriedade orderPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderPaymentDTO }{@code >}
     *     
     */
    public void setOrderPayments(JAXBElement<ArrayOfOrderPaymentDTO> value) {
        this.orderPayments = value;
    }

    /**
     * Obtém o valor da propriedade purchaseDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Define o valor da propriedade purchaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPurchaseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.purchaseDate = value;
    }

    /**
     * Obtém o valor da propriedade purchaseDateUtc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}
     *     
     */
    public JAXBElement<DateTimeOffset> getPurchaseDateUtc() {
        return purchaseDateUtc;
    }

    /**
     * Define o valor da propriedade purchaseDateUtc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeOffset }{@code >}
     *     
     */
    public void setPurchaseDateUtc(JAXBElement<DateTimeOffset> value) {
        this.purchaseDateUtc = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade storeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * Define o valor da propriedade storeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreId(Integer value) {
        this.storeId = value;
    }

    /**
     * Obtém o valor da propriedade storeName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreName() {
        return storeName;
    }

    /**
     * Define o valor da propriedade storeName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreName(JAXBElement<String> value) {
        this.storeName = value;
    }

    /**
     * Obtém o valor da propriedade tax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTax() {
        return tax;
    }

    /**
     * Define o valor da propriedade tax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTax(JAXBElement<BigDecimal> value) {
        this.tax = value;
    }

    /**
     * Obtém o valor da propriedade telemarketingId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTelemarketingId() {
        return telemarketingId;
    }

    /**
     * Define o valor da propriedade telemarketingId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTelemarketingId(JAXBElement<Integer> value) {
        this.telemarketingId = value;
    }

    /**
     * Obtém o valor da propriedade telemarketingLogin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelemarketingLogin() {
        return telemarketingLogin;
    }

    /**
     * Define o valor da propriedade telemarketingLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelemarketingLogin(JAXBElement<String> value) {
        this.telemarketingLogin = value;
    }

    /**
     * Obtém o valor da propriedade telemarketingObservation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelemarketingObservation() {
        return telemarketingObservation;
    }

    /**
     * Define o valor da propriedade telemarketingObservation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelemarketingObservation(JAXBElement<String> value) {
        this.telemarketingObservation = value;
    }

    /**
     * Obtém o valor da propriedade telemarketingStoreLocatorCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelemarketingStoreLocatorCode() {
        return telemarketingStoreLocatorCode;
    }

    /**
     * Define o valor da propriedade telemarketingStoreLocatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelemarketingStoreLocatorCode(JAXBElement<String> value) {
        this.telemarketingStoreLocatorCode = value;
    }

    /**
     * Obtém o valor da propriedade telemarketingStoreLocatorName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelemarketingStoreLocatorName() {
        return telemarketingStoreLocatorName;
    }

    /**
     * Define o valor da propriedade telemarketingStoreLocatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelemarketingStoreLocatorName(JAXBElement<String> value) {
        this.telemarketingStoreLocatorName = value;
    }

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCost(JAXBElement<BigDecimal> value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade costFinal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostFinal() {
        return costFinal;
    }

    /**
     * Define o valor da propriedade costFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostFinal(JAXBElement<BigDecimal> value) {
        this.costFinal = value;
    }

}
