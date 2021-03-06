
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
 *         &lt;element name="AddressGetByClientIdV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfAddressDTO" minOccurs="0"/>
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
    "addressGetByClientIdV3Result"
})
@XmlRootElement(name = "AddressGetByClientIdV3Response")
public class AddressGetByClientIdV3Response {

    @XmlElementRef(name = "AddressGetByClientIdV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddressDTO> addressGetByClientIdV3Result;

    /**
     * Obtém o valor da propriedade addressGetByClientIdV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddressDTO> getAddressGetByClientIdV3Result() {
        return addressGetByClientIdV3Result;
    }

    /**
     * Define o valor da propriedade addressGetByClientIdV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddressDTO }{@code >}
     *     
     */
    public void setAddressGetByClientIdV3Result(JAXBElement<ArrayOfAddressDTO> value) {
        this.addressGetByClientIdV3Result = value;
    }

}
