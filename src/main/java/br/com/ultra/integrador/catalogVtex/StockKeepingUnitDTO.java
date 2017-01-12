
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
 * <p>Classe Java de StockKeepingUnitDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StockKeepingUnitDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialConditionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CubicWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDateArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAvaiable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsKit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManufacturerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasurementUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ModalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RealHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RealLength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RealWeightKg" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RealWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RewardValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitEans" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfStockKeepingUnitEanDTO" minOccurs="0"/>
 *         &lt;element name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VenderSeparadamente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WeightKg" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockKeepingUnitDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "commercialConditionId",
    "costPrice",
    "cubicWeight",
    "dateUpdated",
    "estimatedDateArrival",
    "height",
    "id",
    "internalNote",
    "isActive",
    "isAvaiable",
    "isKit",
    "length",
    "listPrice",
    "manufacturerCode",
    "measurementUnit",
    "modalId",
    "modalType",
    "name",
    "price",
    "productId",
    "productName",
    "realHeight",
    "realLength",
    "realWeightKg",
    "realWidth",
    "refId",
    "rewardValue",
    "stockKeepingUnitEans",
    "unitMultiplier",
    "venderSeparadamente",
    "weightKg",
    "width"
})
public class StockKeepingUnitDTO {

    @XmlElementRef(name = "CommercialConditionId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commercialConditionId;
    @XmlElementRef(name = "CostPrice", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costPrice;
    @XmlElementRef(name = "CubicWeight", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cubicWeight;
    @XmlElementRef(name = "DateUpdated", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateUpdated;
    @XmlElementRef(name = "EstimatedDateArrival", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> estimatedDateArrival;
    @XmlElementRef(name = "Height", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> height;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "InternalNote", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalNote;
    @XmlElementRef(name = "IsActive", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isActive;
    @XmlElementRef(name = "IsAvaiable", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAvaiable;
    @XmlElementRef(name = "IsKit", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isKit;
    @XmlElementRef(name = "Length", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> length;
    @XmlElementRef(name = "ListPrice", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> listPrice;
    @XmlElementRef(name = "ManufacturerCode", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturerCode;
    @XmlElementRef(name = "MeasurementUnit", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measurementUnit;
    @XmlElementRef(name = "ModalId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> modalId;
    @XmlElementRef(name = "ModalType", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modalType;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Price", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> price;
    @XmlElementRef(name = "ProductId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> productId;
    @XmlElementRef(name = "ProductName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "RealHeight", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> realHeight;
    @XmlElementRef(name = "RealLength", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> realLength;
    @XmlElementRef(name = "RealWeightKg", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> realWeightKg;
    @XmlElementRef(name = "RealWidth", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> realWidth;
    @XmlElementRef(name = "RefId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refId;
    @XmlElementRef(name = "RewardValue", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rewardValue;
    @XmlElementRef(name = "StockKeepingUnitEans", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockKeepingUnitEanDTO> stockKeepingUnitEans;
    @XmlElementRef(name = "UnitMultiplier", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitMultiplier;
    @XmlElement(name = "VenderSeparadamente")
    protected Boolean venderSeparadamente;
    @XmlElementRef(name = "WeightKg", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> weightKg;
    @XmlElementRef(name = "Width", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> width;

    /**
     * Obtém o valor da propriedade commercialConditionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommercialConditionId() {
        return commercialConditionId;
    }

    /**
     * Define o valor da propriedade commercialConditionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommercialConditionId(JAXBElement<Integer> value) {
        this.commercialConditionId = value;
    }

    /**
     * Obtém o valor da propriedade costPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostPrice() {
        return costPrice;
    }

    /**
     * Define o valor da propriedade costPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostPrice(JAXBElement<BigDecimal> value) {
        this.costPrice = value;
    }

    /**
     * Obtém o valor da propriedade cubicWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCubicWeight() {
        return cubicWeight;
    }

    /**
     * Define o valor da propriedade cubicWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCubicWeight(JAXBElement<BigDecimal> value) {
        this.cubicWeight = value;
    }

    /**
     * Obtém o valor da propriedade dateUpdated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Define o valor da propriedade dateUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateUpdated = value;
    }

    /**
     * Obtém o valor da propriedade estimatedDateArrival.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEstimatedDateArrival() {
        return estimatedDateArrival;
    }

    /**
     * Define o valor da propriedade estimatedDateArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEstimatedDateArrival(JAXBElement<XMLGregorianCalendar> value) {
        this.estimatedDateArrival = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHeight(JAXBElement<BigDecimal> value) {
        this.height = value;
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
     * Obtém o valor da propriedade internalNote.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalNote() {
        return internalNote;
    }

    /**
     * Define o valor da propriedade internalNote.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalNote(JAXBElement<String> value) {
        this.internalNote = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsActive(JAXBElement<Boolean> value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade isAvaiable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAvaiable() {
        return isAvaiable;
    }

    /**
     * Define o valor da propriedade isAvaiable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAvaiable(JAXBElement<Boolean> value) {
        this.isAvaiable = value;
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
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLength(JAXBElement<BigDecimal> value) {
        this.length = value;
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
     * Obtém o valor da propriedade manufacturerCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * Define o valor da propriedade manufacturerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturerCode(JAXBElement<String> value) {
        this.manufacturerCode = value;
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
     * Obtém o valor da propriedade modalId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getModalId() {
        return modalId;
    }

    /**
     * Define o valor da propriedade modalId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setModalId(JAXBElement<Integer> value) {
        this.modalId = value;
    }

    /**
     * Obtém o valor da propriedade modalType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModalType() {
        return modalType;
    }

    /**
     * Define o valor da propriedade modalType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModalType(JAXBElement<String> value) {
        this.modalType = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Obtém o valor da propriedade productName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Define o valor da propriedade productName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Obtém o valor da propriedade realHeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRealHeight() {
        return realHeight;
    }

    /**
     * Define o valor da propriedade realHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRealHeight(JAXBElement<BigDecimal> value) {
        this.realHeight = value;
    }

    /**
     * Obtém o valor da propriedade realLength.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRealLength() {
        return realLength;
    }

    /**
     * Define o valor da propriedade realLength.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRealLength(JAXBElement<BigDecimal> value) {
        this.realLength = value;
    }

    /**
     * Obtém o valor da propriedade realWeightKg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRealWeightKg() {
        return realWeightKg;
    }

    /**
     * Define o valor da propriedade realWeightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRealWeightKg(JAXBElement<BigDecimal> value) {
        this.realWeightKg = value;
    }

    /**
     * Obtém o valor da propriedade realWidth.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRealWidth() {
        return realWidth;
    }

    /**
     * Define o valor da propriedade realWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRealWidth(JAXBElement<BigDecimal> value) {
        this.realWidth = value;
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
     * Obtém o valor da propriedade rewardValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRewardValue() {
        return rewardValue;
    }

    /**
     * Define o valor da propriedade rewardValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRewardValue(JAXBElement<BigDecimal> value) {
        this.rewardValue = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitEans.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockKeepingUnitEanDTO> getStockKeepingUnitEans() {
        return stockKeepingUnitEans;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitEans.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitEans(JAXBElement<ArrayOfStockKeepingUnitEanDTO> value) {
        this.stockKeepingUnitEans = value;
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

    /**
     * Obtém o valor da propriedade venderSeparadamente.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVenderSeparadamente() {
        return venderSeparadamente;
    }

    /**
     * Define o valor da propriedade venderSeparadamente.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVenderSeparadamente(Boolean value) {
        this.venderSeparadamente = value;
    }

    /**
     * Obtém o valor da propriedade weightKg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWeightKg() {
        return weightKg;
    }

    /**
     * Define o valor da propriedade weightKg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWeightKg(JAXBElement<BigDecimal> value) {
        this.weightKg = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWidth(JAXBElement<BigDecimal> value) {
        this.width = value;
    }

}
