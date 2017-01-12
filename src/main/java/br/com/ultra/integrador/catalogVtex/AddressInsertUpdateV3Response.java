
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
 *         &lt;element name="AddressInsertUpdateV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}AddressDTO" minOccurs="0"/>
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
    "addressInsertUpdateV3Result"
})
@XmlRootElement(name = "AddressInsertUpdateV3Response")
public class AddressInsertUpdateV3Response {

    @XmlElementRef(name = "AddressInsertUpdateV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressDTO> addressInsertUpdateV3Result;

    /**
     * Obtém o valor da propriedade addressInsertUpdateV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}
     *     
     */
    public JAXBElement<AddressDTO> getAddressInsertUpdateV3Result() {
        return addressInsertUpdateV3Result;
    }

    /**
     * Define o valor da propriedade addressInsertUpdateV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressDTO }{@code >}
     *     
     */
    public void setAddressInsertUpdateV3Result(JAXBElement<AddressDTO> value) {
        this.addressInsertUpdateV3Result = value;
    }

}
