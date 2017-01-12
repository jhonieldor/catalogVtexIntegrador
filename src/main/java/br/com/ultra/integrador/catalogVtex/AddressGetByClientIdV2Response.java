
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressGetByClientIdV2Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfAddressDTO2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressGetByClientIdV2Result"
})
@XmlRootElement(name = "AddressGetByClientIdV2Response")
public class AddressGetByClientIdV2Response {

    @XmlElementRef(name = "AddressGetByClientIdV2Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddressDTO2> addressGetByClientIdV2Result;

    /**
     * Obtém o valor da propriedade addressGetByClientIdV2Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddressDTO2> getAddressGetByClientIdV2Result() {
        return addressGetByClientIdV2Result;
    }

    /**
     * Define o valor da propriedade addressGetByClientIdV2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO2 }{@code >}
     *     
     */
    public void setAddressGetByClientIdV2Result(JAXBElement<ArrayOfAddressDTO2> value) {
        this.addressGetByClientIdV2Result = value;
    }

}
