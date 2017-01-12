
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
 * <p>Classe Java de OrderInvoiceDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderInvoiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Courier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmbeddedInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IssuanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderIdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnits" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderInvoiceStockKeepingUnitDTO" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInvoiceDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "courier",
    "embeddedInvoice",
    "invoiceNumber",
    "invoiceUrl",
    "invoiceValue",
    "issuanceDate",
    "orderId",
    "orderIdV3",
    "stockKeepingUnits",
    "trackingNumber",
    "trackingUrl"
})
public class OrderInvoiceDTO {

    @XmlElementRef(name = "Courier", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> courier;
    @XmlElementRef(name = "EmbeddedInvoice", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embeddedInvoice;
    @XmlElementRef(name = "InvoiceNumber", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNumber;
    @XmlElementRef(name = "InvoiceUrl", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceUrl;
    @XmlElement(name = "InvoiceValue")
    protected BigDecimal invoiceValue;
    @XmlElementRef(name = "IssuanceDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> issuanceDate;
    @XmlElement(name = "OrderId")
    protected Integer orderId;
    @XmlElementRef(name = "OrderIdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdV3;
    @XmlElementRef(name = "StockKeepingUnits", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO> stockKeepingUnits;
    @XmlElementRef(name = "TrackingNumber", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingNumber;
    @XmlElementRef(name = "TrackingUrl", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingUrl;

    /**
     * Obtém o valor da propriedade courier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourier() {
        return courier;
    }

    /**
     * Define o valor da propriedade courier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourier(JAXBElement<String> value) {
        this.courier = value;
    }

    /**
     * Obtém o valor da propriedade embeddedInvoice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbeddedInvoice() {
        return embeddedInvoice;
    }

    /**
     * Define o valor da propriedade embeddedInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbeddedInvoice(JAXBElement<String> value) {
        this.embeddedInvoice = value;
    }

    /**
     * Obtém o valor da propriedade invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define o valor da propriedade invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceNumber(JAXBElement<String> value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtém o valor da propriedade invoiceUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceUrl() {
        return invoiceUrl;
    }

    /**
     * Define o valor da propriedade invoiceUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceUrl(JAXBElement<String> value) {
        this.invoiceUrl = value;
    }

    /**
     * Obtém o valor da propriedade invoiceValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceValue() {
        return invoiceValue;
    }

    /**
     * Define o valor da propriedade invoiceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceValue(BigDecimal value) {
        this.invoiceValue = value;
    }

    /**
     * Obtém o valor da propriedade issuanceDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIssuanceDate() {
        return issuanceDate;
    }

    /**
     * Define o valor da propriedade issuanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIssuanceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.issuanceDate = value;
    }

    /**
     * Obtém o valor da propriedade orderId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Define o valor da propriedade orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * Obtém o valor da propriedade orderIdV3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdV3() {
        return orderIdV3;
    }

    /**
     * Define o valor da propriedade orderIdV3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdV3(JAXBElement<String> value) {
        this.orderIdV3 = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnits.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO> getStockKeepingUnits() {
        return stockKeepingUnits;
    }

    /**
     * Define o valor da propriedade stockKeepingUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderInvoiceStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setStockKeepingUnits(JAXBElement<ArrayOfOrderInvoiceStockKeepingUnitDTO> value) {
        this.stockKeepingUnits = value;
    }

    /**
     * Obtém o valor da propriedade trackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define o valor da propriedade trackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingNumber(JAXBElement<String> value) {
        this.trackingNumber = value;
    }

    /**
     * Obtém o valor da propriedade trackingUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingUrl() {
        return trackingUrl;
    }

    /**
     * Define o valor da propriedade trackingUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingUrl(JAXBElement<String> value) {
        this.trackingUrl = value;
    }

}
