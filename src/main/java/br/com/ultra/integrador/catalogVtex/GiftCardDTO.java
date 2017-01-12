
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
 * <p>Classe Java de GiftCardDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GiftCardDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpiringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Funds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultipleCredits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultipleRedemptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedeptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictedToOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatusId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCardDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "emissionDate",
    "expiringDate",
    "funds",
    "id",
    "multipleCredits",
    "multipleRedemptions",
    "ownerId",
    "redeptionCode",
    "restrictedToOwner",
    "statusId"
})
public class GiftCardDTO {

    @XmlElementRef(name = "EmissionDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> emissionDate;
    @XmlElementRef(name = "ExpiringDate", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiringDate;
    @XmlElement(name = "Funds")
    protected BigDecimal funds;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElement(name = "MultipleCredits")
    protected Boolean multipleCredits;
    @XmlElement(name = "MultipleRedemptions")
    protected Boolean multipleRedemptions;
    @XmlElementRef(name = "OwnerId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "RedeptionCode", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redeptionCode;
    @XmlElement(name = "RestrictedToOwner")
    protected Boolean restrictedToOwner;
    @XmlElementRef(name = "StatusId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> statusId;

    /**
     * Obtém o valor da propriedade emissionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEmissionDate() {
        return emissionDate;
    }

    /**
     * Define o valor da propriedade emissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEmissionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.emissionDate = value;
    }

    /**
     * Obtém o valor da propriedade expiringDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiringDate() {
        return expiringDate;
    }

    /**
     * Define o valor da propriedade expiringDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiringDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiringDate = value;
    }

    /**
     * Obtém o valor da propriedade funds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFunds() {
        return funds;
    }

    /**
     * Define o valor da propriedade funds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFunds(BigDecimal value) {
        this.funds = value;
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
     * Obtém o valor da propriedade multipleCredits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleCredits() {
        return multipleCredits;
    }

    /**
     * Define o valor da propriedade multipleCredits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleCredits(Boolean value) {
        this.multipleCredits = value;
    }

    /**
     * Obtém o valor da propriedade multipleRedemptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleRedemptions() {
        return multipleRedemptions;
    }

    /**
     * Define o valor da propriedade multipleRedemptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleRedemptions(Boolean value) {
        this.multipleRedemptions = value;
    }

    /**
     * Obtém o valor da propriedade ownerId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerId() {
        return ownerId;
    }

    /**
     * Define o valor da propriedade ownerId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerId(JAXBElement<String> value) {
        this.ownerId = value;
    }

    /**
     * Obtém o valor da propriedade redeptionCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedeptionCode() {
        return redeptionCode;
    }

    /**
     * Define o valor da propriedade redeptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedeptionCode(JAXBElement<String> value) {
        this.redeptionCode = value;
    }

    /**
     * Obtém o valor da propriedade restrictedToOwner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToOwner() {
        return restrictedToOwner;
    }

    /**
     * Define o valor da propriedade restrictedToOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToOwner(Boolean value) {
        this.restrictedToOwner = value;
    }

    /**
     * Obtém o valor da propriedade statusId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getStatusId() {
        return statusId;
    }

    /**
     * Define o valor da propriedade statusId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setStatusId(JAXBElement<Short> value) {
        this.statusId = value;
    }

}
