
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
 *         &lt;element name="servicePrice" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ServicePriceDTO" minOccurs="0"/>
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
    "servicePrice"
})
@XmlRootElement(name = "ServicePriceInsertUpdate")
public class ServicePriceInsertUpdate {

    @XmlElementRef(name = "servicePrice", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePriceDTO> servicePrice;

    /**
     * Obtém o valor da propriedade servicePrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}
     *     
     */
    public JAXBElement<ServicePriceDTO> getServicePrice() {
        return servicePrice;
    }

    /**
     * Define o valor da propriedade servicePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}
     *     
     */
    public void setServicePrice(JAXBElement<ServicePriceDTO> value) {
        this.servicePrice = value;
    }

}
