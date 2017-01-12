
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de IntegrationInterfaceDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegrationInterfaceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateLastError" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateLastSuccess" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InterfaceEnum" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ErrorType" minOccurs="0"/>
 *         &lt;element name="InterfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationInterfaceDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "dateLastError",
    "dateLastSuccess",
    "interfaceEnum",
    "interfaceName"
})
public class IntegrationInterfaceDTO {

    @XmlElementRef(name = "DateLastError", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateLastError;
    @XmlElementRef(name = "DateLastSuccess", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateLastSuccess;
    @XmlElementRef(name = "InterfaceEnum", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorType> interfaceEnum;
    @XmlElementRef(name = "InterfaceName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceName;

    /**
     * Obtém o valor da propriedade dateLastError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateLastError() {
        return dateLastError;
    }

    /**
     * Define o valor da propriedade dateLastError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateLastError(JAXBElement<XMLGregorianCalendar> value) {
        this.dateLastError = value;
    }

    /**
     * Obtém o valor da propriedade dateLastSuccess.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateLastSuccess() {
        return dateLastSuccess;
    }

    /**
     * Define o valor da propriedade dateLastSuccess.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateLastSuccess(JAXBElement<XMLGregorianCalendar> value) {
        this.dateLastSuccess = value;
    }

    /**
     * Obtém o valor da propriedade interfaceEnum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     *     
     */
    public JAXBElement<ErrorType> getInterfaceEnum() {
        return interfaceEnum;
    }

    /**
     * Define o valor da propriedade interfaceEnum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     *     
     */
    public void setInterfaceEnum(JAXBElement<ErrorType> value) {
        this.interfaceEnum = value;
    }

    /**
     * Obtém o valor da propriedade interfaceName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceName() {
        return interfaceName;
    }

    /**
     * Define o valor da propriedade interfaceName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceName(JAXBElement<String> value) {
        this.interfaceName = value;
    }

}
