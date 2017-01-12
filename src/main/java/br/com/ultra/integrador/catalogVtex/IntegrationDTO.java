
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntegrationDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegrationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbacosDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbacosKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbacosWebService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BrandIdDefault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryIdDefault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckoutVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableUtmCampaignOnMultiStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EspecificationSkuOnUniqueProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IVDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IgnoreBrandForExistingProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreCategoryForExistingProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreNameForExistingProductsAndSkus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateDiscountOnItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateEAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateEspecification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateGiftListOnOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateKitComponentOnOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegratePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateTelemarketing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrationWarehouse" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfIntegrationWarehouseDTO" minOccurs="0"/>
 *         &lt;element name="LogSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LogXml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentIdWithoutTaxes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="VtexDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "abacosDecryptKey",
    "abacosKey",
    "abacosWebService",
    "autoIntegration",
    "brandIdDefault",
    "categoryIdDefault",
    "checkoutVersion",
    "clientName",
    "disableUtmCampaignOnMultiStore",
    "especificationSkuOnUniqueProduct",
    "ivDecryptKey",
    "id",
    "ignoreBrandForExistingProducts",
    "ignoreCategoryForExistingProducts",
    "ignoreNameForExistingProductsAndSkus",
    "integrateDescription",
    "integrateDiscountOnItem",
    "integrateEAN",
    "integrateEspecification",
    "integrateGiftListOnOrder",
    "integrateKitComponentOnOrder",
    "integratePrice",
    "integrateTelemarketing",
    "integrationWarehouse",
    "logSuccess",
    "logXml",
    "orderStatus",
    "paymentIdWithoutTaxes",
    "vtexDecryptKey"
})
public class IntegrationDTO {

    @XmlElementRef(name = "AbacosDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abacosDecryptKey;
    @XmlElementRef(name = "AbacosKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abacosKey;
    @XmlElementRef(name = "AbacosWebService", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abacosWebService;
    @XmlElement(name = "AutoIntegration")
    protected Boolean autoIntegration;
    @XmlElement(name = "BrandIdDefault")
    protected Integer brandIdDefault;
    @XmlElement(name = "CategoryIdDefault")
    protected Integer categoryIdDefault;
    @XmlElement(name = "CheckoutVersion")
    protected Integer checkoutVersion;
    @XmlElementRef(name = "ClientName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientName;
    @XmlElement(name = "DisableUtmCampaignOnMultiStore")
    protected Boolean disableUtmCampaignOnMultiStore;
    @XmlElement(name = "EspecificationSkuOnUniqueProduct")
    protected Boolean especificationSkuOnUniqueProduct;
    @XmlElementRef(name = "IVDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ivDecryptKey;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElement(name = "IgnoreBrandForExistingProducts")
    protected Boolean ignoreBrandForExistingProducts;
    @XmlElement(name = "IgnoreCategoryForExistingProducts")
    protected Boolean ignoreCategoryForExistingProducts;
    @XmlElement(name = "IgnoreNameForExistingProductsAndSkus")
    protected Boolean ignoreNameForExistingProductsAndSkus;
    @XmlElement(name = "IntegrateDescription")
    protected Boolean integrateDescription;
    @XmlElement(name = "IntegrateDiscountOnItem")
    protected Boolean integrateDiscountOnItem;
    @XmlElement(name = "IntegrateEAN")
    protected Boolean integrateEAN;
    @XmlElement(name = "IntegrateEspecification")
    protected Boolean integrateEspecification;
    @XmlElement(name = "IntegrateGiftListOnOrder")
    protected Boolean integrateGiftListOnOrder;
    @XmlElement(name = "IntegrateKitComponentOnOrder")
    protected Boolean integrateKitComponentOnOrder;
    @XmlElement(name = "IntegratePrice")
    protected Boolean integratePrice;
    @XmlElement(name = "IntegrateTelemarketing")
    protected Boolean integrateTelemarketing;
    @XmlElementRef(name = "IntegrationWarehouse", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIntegrationWarehouseDTO> integrationWarehouse;
    @XmlElement(name = "LogSuccess")
    protected Boolean logSuccess;
    @XmlElement(name = "LogXml")
    protected Boolean logXml;
    @XmlElementRef(name = "OrderStatus", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderStatus;
    @XmlElementRef(name = "PaymentIdWithoutTaxes", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> paymentIdWithoutTaxes;
    @XmlElementRef(name = "VtexDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vtexDecryptKey;

    /**
     * Obtém o valor da propriedade abacosDecryptKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosDecryptKey() {
        return abacosDecryptKey;
    }

    /**
     * Define o valor da propriedade abacosDecryptKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosDecryptKey(JAXBElement<String> value) {
        this.abacosDecryptKey = value;
    }

    /**
     * Obtém o valor da propriedade abacosKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosKey() {
        return abacosKey;
    }

    /**
     * Define o valor da propriedade abacosKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosKey(JAXBElement<String> value) {
        this.abacosKey = value;
    }

    /**
     * Obtém o valor da propriedade abacosWebService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosWebService() {
        return abacosWebService;
    }

    /**
     * Define o valor da propriedade abacosWebService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosWebService(JAXBElement<String> value) {
        this.abacosWebService = value;
    }

    /**
     * Obtém o valor da propriedade autoIntegration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoIntegration() {
        return autoIntegration;
    }

    /**
     * Define o valor da propriedade autoIntegration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoIntegration(Boolean value) {
        this.autoIntegration = value;
    }

    /**
     * Obtém o valor da propriedade brandIdDefault.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrandIdDefault() {
        return brandIdDefault;
    }

    /**
     * Define o valor da propriedade brandIdDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrandIdDefault(Integer value) {
        this.brandIdDefault = value;
    }

    /**
     * Obtém o valor da propriedade categoryIdDefault.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryIdDefault() {
        return categoryIdDefault;
    }

    /**
     * Define o valor da propriedade categoryIdDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryIdDefault(Integer value) {
        this.categoryIdDefault = value;
    }

    /**
     * Obtém o valor da propriedade checkoutVersion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckoutVersion() {
        return checkoutVersion;
    }

    /**
     * Define o valor da propriedade checkoutVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckoutVersion(Integer value) {
        this.checkoutVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientName() {
        return clientName;
    }

    /**
     * Define o valor da propriedade clientName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientName(JAXBElement<String> value) {
        this.clientName = value;
    }

    /**
     * Obtém o valor da propriedade disableUtmCampaignOnMultiStore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableUtmCampaignOnMultiStore() {
        return disableUtmCampaignOnMultiStore;
    }

    /**
     * Define o valor da propriedade disableUtmCampaignOnMultiStore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableUtmCampaignOnMultiStore(Boolean value) {
        this.disableUtmCampaignOnMultiStore = value;
    }

    /**
     * Obtém o valor da propriedade especificationSkuOnUniqueProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEspecificationSkuOnUniqueProduct() {
        return especificationSkuOnUniqueProduct;
    }

    /**
     * Define o valor da propriedade especificationSkuOnUniqueProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEspecificationSkuOnUniqueProduct(Boolean value) {
        this.especificationSkuOnUniqueProduct = value;
    }

    /**
     * Obtém o valor da propriedade ivDecryptKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIVDecryptKey() {
        return ivDecryptKey;
    }

    /**
     * Define o valor da propriedade ivDecryptKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIVDecryptKey(JAXBElement<String> value) {
        this.ivDecryptKey = value;
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
     * Obtém o valor da propriedade ignoreBrandForExistingProducts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreBrandForExistingProducts() {
        return ignoreBrandForExistingProducts;
    }

    /**
     * Define o valor da propriedade ignoreBrandForExistingProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBrandForExistingProducts(Boolean value) {
        this.ignoreBrandForExistingProducts = value;
    }

    /**
     * Obtém o valor da propriedade ignoreCategoryForExistingProducts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCategoryForExistingProducts() {
        return ignoreCategoryForExistingProducts;
    }

    /**
     * Define o valor da propriedade ignoreCategoryForExistingProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCategoryForExistingProducts(Boolean value) {
        this.ignoreCategoryForExistingProducts = value;
    }

    /**
     * Obtém o valor da propriedade ignoreNameForExistingProductsAndSkus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNameForExistingProductsAndSkus() {
        return ignoreNameForExistingProductsAndSkus;
    }

    /**
     * Define o valor da propriedade ignoreNameForExistingProductsAndSkus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNameForExistingProductsAndSkus(Boolean value) {
        this.ignoreNameForExistingProductsAndSkus = value;
    }

    /**
     * Obtém o valor da propriedade integrateDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateDescription() {
        return integrateDescription;
    }

    /**
     * Define o valor da propriedade integrateDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateDescription(Boolean value) {
        this.integrateDescription = value;
    }

    /**
     * Obtém o valor da propriedade integrateDiscountOnItem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateDiscountOnItem() {
        return integrateDiscountOnItem;
    }

    /**
     * Define o valor da propriedade integrateDiscountOnItem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateDiscountOnItem(Boolean value) {
        this.integrateDiscountOnItem = value;
    }

    /**
     * Obtém o valor da propriedade integrateEAN.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateEAN() {
        return integrateEAN;
    }

    /**
     * Define o valor da propriedade integrateEAN.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateEAN(Boolean value) {
        this.integrateEAN = value;
    }

    /**
     * Obtém o valor da propriedade integrateEspecification.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateEspecification() {
        return integrateEspecification;
    }

    /**
     * Define o valor da propriedade integrateEspecification.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateEspecification(Boolean value) {
        this.integrateEspecification = value;
    }

    /**
     * Obtém o valor da propriedade integrateGiftListOnOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateGiftListOnOrder() {
        return integrateGiftListOnOrder;
    }

    /**
     * Define o valor da propriedade integrateGiftListOnOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateGiftListOnOrder(Boolean value) {
        this.integrateGiftListOnOrder = value;
    }

    /**
     * Obtém o valor da propriedade integrateKitComponentOnOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateKitComponentOnOrder() {
        return integrateKitComponentOnOrder;
    }

    /**
     * Define o valor da propriedade integrateKitComponentOnOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateKitComponentOnOrder(Boolean value) {
        this.integrateKitComponentOnOrder = value;
    }

    /**
     * Obtém o valor da propriedade integratePrice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratePrice() {
        return integratePrice;
    }

    /**
     * Define o valor da propriedade integratePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratePrice(Boolean value) {
        this.integratePrice = value;
    }

    /**
     * Obtém o valor da propriedade integrateTelemarketing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateTelemarketing() {
        return integrateTelemarketing;
    }

    /**
     * Define o valor da propriedade integrateTelemarketing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateTelemarketing(Boolean value) {
        this.integrateTelemarketing = value;
    }

    /**
     * Obtém o valor da propriedade integrationWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIntegrationWarehouseDTO> getIntegrationWarehouse() {
        return integrationWarehouse;
    }

    /**
     * Define o valor da propriedade integrationWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}
     *     
     */
    public void setIntegrationWarehouse(JAXBElement<ArrayOfIntegrationWarehouseDTO> value) {
        this.integrationWarehouse = value;
    }

    /**
     * Obtém o valor da propriedade logSuccess.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogSuccess() {
        return logSuccess;
    }

    /**
     * Define o valor da propriedade logSuccess.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogSuccess(Boolean value) {
        this.logSuccess = value;
    }

    /**
     * Obtém o valor da propriedade logXml.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogXml() {
        return logXml;
    }

    /**
     * Define o valor da propriedade logXml.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogXml(Boolean value) {
        this.logXml = value;
    }

    /**
     * Obtém o valor da propriedade orderStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderStatus() {
        return orderStatus;
    }

    /**
     * Define o valor da propriedade orderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderStatus(JAXBElement<String> value) {
        this.orderStatus = value;
    }

    /**
     * Obtém o valor da propriedade paymentIdWithoutTaxes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPaymentIdWithoutTaxes() {
        return paymentIdWithoutTaxes;
    }

    /**
     * Define o valor da propriedade paymentIdWithoutTaxes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPaymentIdWithoutTaxes(JAXBElement<ArrayOfint> value) {
        this.paymentIdWithoutTaxes = value;
    }

    /**
     * Obtém o valor da propriedade vtexDecryptKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVtexDecryptKey() {
        return vtexDecryptKey;
    }

    /**
     * Define o valor da propriedade vtexDecryptKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVtexDecryptKey(JAXBElement<String> value) {
        this.vtexDecryptKey = value;
    }

}
