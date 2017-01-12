
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
 *         &lt;element name="ServiceGetResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ServiceDTO" minOccurs="0"/>
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
    "serviceGetResult"
})
@XmlRootElement(name = "ServiceGetResponse")
public class ServiceGetResponse {

    @XmlElementRef(name = "ServiceGetResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDTO> serviceGetResult;

    /**
     * Obtém o valor da propriedade serviceGetResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}
     *     
     */
    public JAXBElement<ServiceDTO> getServiceGetResult() {
        return serviceGetResult;
    }

    /**
     * Define o valor da propriedade serviceGetResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}
     *     
     */
    public void setServiceGetResult(JAXBElement<ServiceDTO> value) {
        this.serviceGetResult = value;
    }

}
