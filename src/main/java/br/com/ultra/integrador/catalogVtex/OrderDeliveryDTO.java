
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de OrderDeliveryDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderDeliveryDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateExpectedDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DaysForDistributionCenterProcessing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysForFreightDelivery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysForStockProcessing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DistributionCenter" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}DistributionCenterDTO" minOccurs="0"/>
 *         &lt;element name="FreightId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreightIdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderItems" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderItemDTO" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}OrderStatusDTO" minOccurs="0"/>
 *         &lt;element name="OrderStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledShift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusAdministratorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StausChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDeliveryDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "dateExpectedDelivery",
    "daysForDistributionCenterProcessing",
    "daysForFreightDelivery",
    "daysForStockProcessing",
    "deliveryDate",
    "distributionCenter",
    "freightId",
    "freightIdV3",
    "freightName",
    "freightTypeId",
    "id",
    "invoiceNumber",
    "managementId",
    "orderId",
    "orderItems",
    "orderStatus",
    "orderStatusId",
    "scheduledDate",
    "scheduledShift",
    "statusAdministratorId",
    "stausChangeDate",
    "trackingNumber"
})
public class OrderDeliveryDTO {

    @XmlElementRef(name = "DateExpectedDelivery", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateExpectedDelivery;
    @XmlElementRef(name = "DaysForDistributionCenterProcessing", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysForDistributionCenterProcessing;
    @XmlElementRef(name = "DaysForFreightDelivery", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysForFreightDelivery;
    @XmlElementRef(name = "DaysForStockProcessing", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysForStockProcessing;
    @XmlElementRef(name = "DeliveryDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deliveryDate;
    @XmlElementRef(name = "DistributionCenter", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DistributionCenterDTO> distributionCenter;
    @XmlElementRef(name = "FreightId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> freightId;
    @XmlElementRef(name = "FreightIdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightIdV3;
    @XmlElementRef(name = "FreightName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightName;
    @XmlElementRef(name = "FreightTypeId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> freightTypeId;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "InvoiceNumber", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNumber;
    @XmlElementRef(name = "ManagementId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> managementId;
    @XmlElementRef(name = "OrderId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderId;
    @XmlElementRef(name = "OrderItems", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderItemDTO> orderItems;
    @XmlElementRef(name = "OrderStatus", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderStatusDTO> orderStatus;
    @XmlElementRef(name = "OrderStatusId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderStatusId;
    @XmlElementRef(name = "ScheduledDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduledDate;
    @XmlElementRef(name = "ScheduledShift", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scheduledShift;
    @XmlElementRef(name = "StatusAdministratorId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> statusAdministratorId;
    @XmlElementRef(name = "StausChangeDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stausChangeDate;
    @XmlElementRef(name = "TrackingNumber", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingNumber;

    /**
     * Obtém o valor da propriedade dateExpectedDelivery.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateExpectedDelivery() {
        return dateExpectedDelivery;
    }

    /**
     * Define o valor da propriedade dateExpectedDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateExpectedDelivery(JAXBElement<XMLGregorianCalendar> value) {
        this.dateExpectedDelivery = value;
    }

    /**
     * Obtém o valor da propriedade daysForDistributionCenterProcessing.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysForDistributionCenterProcessing() {
        return daysForDistributionCenterProcessing;
    }

    /**
     * Define o valor da propriedade daysForDistributionCenterProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysForDistributionCenterProcessing(JAXBElement<Integer> value) {
        this.daysForDistributionCenterProcessing = value;
    }

    /**
     * Obtém o valor da propriedade daysForFreightDelivery.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysForFreightDelivery() {
        return daysForFreightDelivery;
    }

    /**
     * Define o valor da propriedade daysForFreightDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysForFreightDelivery(JAXBElement<Integer> value) {
        this.daysForFreightDelivery = value;
    }

    /**
     * Obtém o valor da propriedade daysForStockProcessing.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysForStockProcessing() {
        return daysForStockProcessing;
    }

    /**
     * Define o valor da propriedade daysForStockProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysForStockProcessing(JAXBElement<Integer> value) {
        this.daysForStockProcessing = value;
    }

    /**
     * Obtém o valor da propriedade deliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Define o valor da propriedade deliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeliveryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.deliveryDate = value;
    }

    /**
     * Obtém o valor da propriedade distributionCenter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistributionCenterDTO }{@code >}
     *     
     */
    public JAXBElement<DistributionCenterDTO> getDistributionCenter() {
        return distributionCenter;
    }

    /**
     * Define o valor da propriedade distributionCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistributionCenterDTO }{@code >}
     *     
     */
    public void setDistributionCenter(JAXBElement<DistributionCenterDTO> value) {
        this.distributionCenter = value;
    }

    /**
     * Obtém o valor da propriedade freightId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFreightId() {
        return freightId;
    }

    /**
     * Define o valor da propriedade freightId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFreightId(JAXBElement<Integer> value) {
        this.freightId = value;
    }

    /**
     * Obtém o valor da propriedade freightIdV3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightIdV3() {
        return freightIdV3;
    }

    /**
     * Define o valor da propriedade freightIdV3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightIdV3(JAXBElement<String> value) {
        this.freightIdV3 = value;
    }

    /**
     * Obtém o valor da propriedade freightName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightName() {
        return freightName;
    }

    /**
     * Define o valor da propriedade freightName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightName(JAXBElement<String> value) {
        this.freightName = value;
    }

    /**
     * Obtém o valor da propriedade freightTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFreightTypeId() {
        return freightTypeId;
    }

    /**
     * Define o valor da propriedade freightTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFreightTypeId(JAXBElement<Integer> value) {
        this.freightTypeId = value;
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
     * Obtém o valor da propriedade managementId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManagementId() {
        return managementId;
    }

    /**
     * Define o valor da propriedade managementId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManagementId(JAXBElement<Integer> value) {
        this.managementId = value;
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
     * Obtém o valor da propriedade orderItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemDTO> getOrderItems() {
        return orderItems;
    }

    /**
     * Define o valor da propriedade orderItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDTO }{@code >}
     *     
     */
    public void setOrderItems(JAXBElement<ArrayOfOrderItemDTO> value) {
        this.orderItems = value;
    }

    /**
     * Obtém o valor da propriedade orderStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderStatusDTO }{@code >}
     *     
     */
    public JAXBElement<OrderStatusDTO> getOrderStatus() {
        return orderStatus;
    }

    /**
     * Define o valor da propriedade orderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderStatusDTO }{@code >}
     *     
     */
    public void setOrderStatus(JAXBElement<OrderStatusDTO> value) {
        this.orderStatus = value;
    }

    /**
     * Obtém o valor da propriedade orderStatusId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderStatusId() {
        return orderStatusId;
    }

    /**
     * Define o valor da propriedade orderStatusId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderStatusId(JAXBElement<String> value) {
        this.orderStatusId = value;
    }

    /**
     * Obtém o valor da propriedade scheduledDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
        return scheduledDate;
    }

    /**
     * Define o valor da propriedade scheduledDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduledDate = value;
    }

    /**
     * Obtém o valor da propriedade scheduledShift.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScheduledShift() {
        return scheduledShift;
    }

    /**
     * Define o valor da propriedade scheduledShift.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScheduledShift(JAXBElement<String> value) {
        this.scheduledShift = value;
    }

    /**
     * Obtém o valor da propriedade statusAdministratorId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatusAdministratorId() {
        return statusAdministratorId;
    }

    /**
     * Define o valor da propriedade statusAdministratorId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatusAdministratorId(JAXBElement<Integer> value) {
        this.statusAdministratorId = value;
    }

    /**
     * Obtém o valor da propriedade stausChangeDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStausChangeDate() {
        return stausChangeDate;
    }

    /**
     * Define o valor da propriedade stausChangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStausChangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.stausChangeDate = value;
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

}
