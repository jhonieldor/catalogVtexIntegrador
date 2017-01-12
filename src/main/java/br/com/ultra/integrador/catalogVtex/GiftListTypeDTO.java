
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GiftListTypeDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GiftListTypeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftListTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMessageAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStockImpact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipToListOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DaysToExpireToVisitors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysToExpireToMembers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysToEventMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysToEventMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MemberMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MemberMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MemberTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextTitle1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextTitle2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUnique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftCardRechargeSkuId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftListTypeDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "giftListTypeId",
    "name",
    "description",
    "isMessageAvailable",
    "isStockImpact",
    "shipToListOwner",
    "daysToExpireToVisitors",
    "daysToExpireToMembers",
    "daysToEventMin",
    "daysToEventMax",
    "memberMin",
    "memberMax",
    "memberTitle",
    "textTitle1",
    "textTitle2",
    "isPublic",
    "isProtected",
    "isUnique",
    "isActive",
    "version",
    "giftCardRechargeSkuId"
})
public class GiftListTypeDTO {

    @XmlElementRef(name = "GiftListTypeId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftListTypeId;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "IsMessageAvailable", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMessageAvailable;
    @XmlElementRef(name = "IsStockImpact", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStockImpact;
    @XmlElementRef(name = "ShipToListOwner", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> shipToListOwner;
    @XmlElementRef(name = "DaysToExpireToVisitors", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysToExpireToVisitors;
    @XmlElementRef(name = "DaysToExpireToMembers", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysToExpireToMembers;
    @XmlElementRef(name = "DaysToEventMin", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysToEventMin;
    @XmlElementRef(name = "DaysToEventMax", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysToEventMax;
    @XmlElementRef(name = "MemberMin", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> memberMin;
    @XmlElementRef(name = "MemberMax", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> memberMax;
    @XmlElementRef(name = "MemberTitle", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberTitle;
    @XmlElementRef(name = "TextTitle1", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTitle1;
    @XmlElementRef(name = "TextTitle2", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTitle2;
    @XmlElementRef(name = "IsPublic", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPublic;
    @XmlElementRef(name = "IsProtected", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isProtected;
    @XmlElementRef(name = "IsUnique", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUnique;
    @XmlElementRef(name = "IsActive", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isActive;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> version;
    @XmlElementRef(name = "GiftCardRechargeSkuId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> giftCardRechargeSkuId;

    /**
     * Obtém o valor da propriedade giftListTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListTypeId() {
        return giftListTypeId;
    }

    /**
     * Define o valor da propriedade giftListTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListTypeId(JAXBElement<Integer> value) {
        this.giftListTypeId = value;
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
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade isMessageAvailable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMessageAvailable() {
        return isMessageAvailable;
    }

    /**
     * Define o valor da propriedade isMessageAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMessageAvailable(JAXBElement<Boolean> value) {
        this.isMessageAvailable = value;
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
     * Obtém o valor da propriedade shipToListOwner.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShipToListOwner() {
        return shipToListOwner;
    }

    /**
     * Define o valor da propriedade shipToListOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShipToListOwner(JAXBElement<Boolean> value) {
        this.shipToListOwner = value;
    }

    /**
     * Obtém o valor da propriedade daysToExpireToVisitors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysToExpireToVisitors() {
        return daysToExpireToVisitors;
    }

    /**
     * Define o valor da propriedade daysToExpireToVisitors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysToExpireToVisitors(JAXBElement<Integer> value) {
        this.daysToExpireToVisitors = value;
    }

    /**
     * Obtém o valor da propriedade daysToExpireToMembers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysToExpireToMembers() {
        return daysToExpireToMembers;
    }

    /**
     * Define o valor da propriedade daysToExpireToMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysToExpireToMembers(JAXBElement<Integer> value) {
        this.daysToExpireToMembers = value;
    }

    /**
     * Obtém o valor da propriedade daysToEventMin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysToEventMin() {
        return daysToEventMin;
    }

    /**
     * Define o valor da propriedade daysToEventMin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysToEventMin(JAXBElement<Integer> value) {
        this.daysToEventMin = value;
    }

    /**
     * Obtém o valor da propriedade daysToEventMax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysToEventMax() {
        return daysToEventMax;
    }

    /**
     * Define o valor da propriedade daysToEventMax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysToEventMax(JAXBElement<Integer> value) {
        this.daysToEventMax = value;
    }

    /**
     * Obtém o valor da propriedade memberMin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMemberMin() {
        return memberMin;
    }

    /**
     * Define o valor da propriedade memberMin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMemberMin(JAXBElement<Integer> value) {
        this.memberMin = value;
    }

    /**
     * Obtém o valor da propriedade memberMax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMemberMax() {
        return memberMax;
    }

    /**
     * Define o valor da propriedade memberMax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMemberMax(JAXBElement<Integer> value) {
        this.memberMax = value;
    }

    /**
     * Obtém o valor da propriedade memberTitle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberTitle() {
        return memberTitle;
    }

    /**
     * Define o valor da propriedade memberTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberTitle(JAXBElement<String> value) {
        this.memberTitle = value;
    }

    /**
     * Obtém o valor da propriedade textTitle1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTitle1() {
        return textTitle1;
    }

    /**
     * Define o valor da propriedade textTitle1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTitle1(JAXBElement<String> value) {
        this.textTitle1 = value;
    }

    /**
     * Obtém o valor da propriedade textTitle2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTitle2() {
        return textTitle2;
    }

    /**
     * Define o valor da propriedade textTitle2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTitle2(JAXBElement<String> value) {
        this.textTitle2 = value;
    }

    /**
     * Obtém o valor da propriedade isPublic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPublic() {
        return isPublic;
    }

    /**
     * Define o valor da propriedade isPublic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPublic(JAXBElement<Boolean> value) {
        this.isPublic = value;
    }

    /**
     * Obtém o valor da propriedade isProtected.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsProtected() {
        return isProtected;
    }

    /**
     * Define o valor da propriedade isProtected.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsProtected(JAXBElement<Boolean> value) {
        this.isProtected = value;
    }

    /**
     * Obtém o valor da propriedade isUnique.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUnique() {
        return isUnique;
    }

    /**
     * Define o valor da propriedade isUnique.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUnique(JAXBElement<Boolean> value) {
        this.isUnique = value;
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
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVersion(JAXBElement<Integer> value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade giftCardRechargeSkuId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftCardRechargeSkuId() {
        return giftCardRechargeSkuId;
    }

    /**
     * Define o valor da propriedade giftCardRechargeSkuId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftCardRechargeSkuId(JAXBElement<Integer> value) {
        this.giftCardRechargeSkuId = value;
    }

}
