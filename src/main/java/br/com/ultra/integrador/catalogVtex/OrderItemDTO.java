
package br.com.ultra.integrador.catalogVtex;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderItemDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyTogetherDiscountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostOff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CupomValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CupomValueOff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discounts" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderItemDiscountDTO" minOccurs="0"/>
 *         &lt;element name="GiftDiscountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsGift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsKit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStockImpact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeasurementUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDeliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderItemServices" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderItemServiceDTO" minOccurs="0"/>
 *         &lt;element name="ParentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShippingCostOff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockLikelyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockLikelyIdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "buyTogetherDiscountId",
    "cost",
    "costOff",
    "cupomValue",
    "cupomValueOff",
    "discounts",
    "giftDiscountId",
    "id",
    "isGift",
    "isKit",
    "isStockImpact",
    "itemId",
    "listPrice",
    "measurementUnit",
    "orderDeliveryId",
    "orderItemServices",
    "parentOrderItemId",
    "productId",
    "productRefId",
    "refId",
    "shippingCost",
    "shippingCostOff",
    "stockLikelyId",
    "stockLikelyIdV3",
    "unitMultiplier"
})
public class OrderItemDTO {

    @XmlElementRef(name = "BuyTogetherDiscountId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> buyTogetherDiscountId;
    @XmlElementRef(name = "Cost", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cost;
    @XmlElementRef(name = "CostOff", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costOff;
    @XmlElementRef(name = "CupomValue", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cupomValue;
    @XmlElementRef(name = "CupomValueOff", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cupomValueOff;
    @XmlElementRef(name = "Discounts", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderItemDiscountDTO> discounts;
    @XmlElementRef(name = "GiftDiscountId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftDiscountId;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "IsGift", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isGift;
    @XmlElementRef(name = "IsKit", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isKit;
    @XmlElementRef(name = "IsStockImpact", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStockImpact;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> itemId;
    @XmlElementRef(name = "ListPrice", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> listPrice;
    @XmlElementRef(name = "MeasurementUnit", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measurementUnit;
    @XmlElementRef(name = "OrderDeliveryId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderDeliveryId;
    @XmlElementRef(name = "OrderItemServices", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderItemServiceDTO> orderItemServices;
    @XmlElementRef(name = "ParentOrderItemId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> parentOrderItemId;
    @XmlElementRef(name = "ProductId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> productId;
    @XmlElementRef(name = "ProductRefId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productRefId;
    @XmlElementRef(name = "RefId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refId;
    @XmlElementRef(name = "ShippingCost", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shippingCost;
    @XmlElementRef(name = "ShippingCostOff", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shippingCostOff;
    @XmlElementRef(name = "StockLikelyId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stockLikelyId;
    @XmlElementRef(name = "StockLikelyIdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stockLikelyIdV3;
    @XmlElementRef(name = "UnitMultiplier", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitMultiplier;

    /**
     * Obtém o valor da propriedade buyTogetherDiscountId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBuyTogetherDiscountId() {
        return buyTogetherDiscountId;
    }

    /**
     * Define o valor da propriedade buyTogetherDiscountId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBuyTogetherDiscountId(JAXBElement<Integer> value) {
        this.buyTogetherDiscountId = value;
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
     * Obtém o valor da propriedade costOff.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostOff() {
        return costOff;
    }

    /**
     * Define o valor da propriedade costOff.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostOff(JAXBElement<BigDecimal> value) {
        this.costOff = value;
    }

    /**
     * Obtém o valor da propriedade cupomValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCupomValue() {
        return cupomValue;
    }

    /**
     * Define o valor da propriedade cupomValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCupomValue(JAXBElement<BigDecimal> value) {
        this.cupomValue = value;
    }

    /**
     * Obtém o valor da propriedade cupomValueOff.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCupomValueOff() {
        return cupomValueOff;
    }

    /**
     * Define o valor da propriedade cupomValueOff.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCupomValueOff(JAXBElement<BigDecimal> value) {
        this.cupomValueOff = value;
    }

    /**
     * Obtém o valor da propriedade discounts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDiscountDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemDiscountDTO> getDiscounts() {
        return discounts;
    }

    /**
     * Define o valor da propriedade discounts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDiscountDTO }{@code >}
     *     
     */
    public void setDiscounts(JAXBElement<ArrayOfOrderItemDiscountDTO> value) {
        this.discounts = value;
    }

    /**
     * Obtém o valor da propriedade giftDiscountId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftDiscountId() {
        return giftDiscountId;
    }

    /**
     * Define o valor da propriedade giftDiscountId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftDiscountId(JAXBElement<Integer> value) {
        this.giftDiscountId = value;
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
     * Obtém o valor da propriedade isGift.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsGift() {
        return isGift;
    }

    /**
     * Define o valor da propriedade isGift.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsGift(JAXBElement<Boolean> value) {
        this.isGift = value;
    }

    /**
     * Obtém o valor da propriedade isKit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsKit() {
        return isKit;
    }

    /**
     * Define o valor da propriedade isKit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsKit(JAXBElement<Boolean> value) {
        this.isKit = value;
    }

    /**
     * Obtém o valor da propriedade isStockImpact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStockImpact() {
        return isStockImpact;
    }

    /**
     * Define o valor da propriedade isStockImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStockImpact(JAXBElement<Boolean> value) {
        this.isStockImpact = value;
    }

    /**
     * Obtém o valor da propriedade itemId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getItemId() {
        return itemId;
    }

    /**
     * Define o valor da propriedade itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setItemId(JAXBElement<Integer> value) {
        this.itemId = value;
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
     * Obtém o valor da propriedade measurementUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Define o valor da propriedade measurementUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasurementUnit(JAXBElement<String> value) {
        this.measurementUnit = value;
    }

    /**
     * Obtém o valor da propriedade orderDeliveryId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderDeliveryId() {
        return orderDeliveryId;
    }

    /**
     * Define o valor da propriedade orderDeliveryId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderDeliveryId(JAXBElement<Integer> value) {
        this.orderDeliveryId = value;
    }

    /**
     * Obtém o valor da propriedade orderItemServices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemServiceDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemServiceDTO> getOrderItemServices() {
        return orderItemServices;
    }

    /**
     * Define o valor da propriedade orderItemServices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemServiceDTO }{@code >}
     *     
     */
    public void setOrderItemServices(JAXBElement<ArrayOfOrderItemServiceDTO> value) {
        this.orderItemServices = value;
    }

    /**
     * Obtém o valor da propriedade parentOrderItemId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Define o valor da propriedade parentOrderItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParentOrderItemId(JAXBElement<Integer> value) {
        this.parentOrderItemId = value;
    }

    /**
     * Obtém o valor da propriedade productId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProductId(JAXBElement<Integer> value) {
        this.productId = value;
    }

    /**
     * Obtém o valor da propriedade productRefId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductRefId() {
        return productRefId;
    }

    /**
     * Define o valor da propriedade productRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductRefId(JAXBElement<String> value) {
        this.productRefId = value;
    }

    /**
     * Obtém o valor da propriedade refId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefId() {
        return refId;
    }

    /**
     * Define o valor da propriedade refId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefId(JAXBElement<String> value) {
        this.refId = value;
    }

    /**
     * Obtém o valor da propriedade shippingCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShippingCost() {
        return shippingCost;
    }

    /**
     * Define o valor da propriedade shippingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShippingCost(JAXBElement<BigDecimal> value) {
        this.shippingCost = value;
    }

    /**
     * Obtém o valor da propriedade shippingCostOff.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShippingCostOff() {
        return shippingCostOff;
    }

    /**
     * Define o valor da propriedade shippingCostOff.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShippingCostOff(JAXBElement<BigDecimal> value) {
        this.shippingCostOff = value;
    }

    /**
     * Obtém o valor da propriedade stockLikelyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockLikelyId() {
        return stockLikelyId;
    }

    /**
     * Define o valor da propriedade stockLikelyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockLikelyId(JAXBElement<Integer> value) {
        this.stockLikelyId = value;
    }

    /**
     * Obtém o valor da propriedade stockLikelyIdV3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockLikelyIdV3() {
        return stockLikelyIdV3;
    }

    /**
     * Define o valor da propriedade stockLikelyIdV3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockLikelyIdV3(JAXBElement<String> value) {
        this.stockLikelyIdV3 = value;
    }

    /**
     * Obtém o valor da propriedade unitMultiplier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Define o valor da propriedade unitMultiplier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUnitMultiplier(JAXBElement<BigDecimal> value) {
        this.unitMultiplier = value;
    }

}
