
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
 *         &lt;element name="ServicePriceInsertUpdateResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ServicePriceDTO" minOccurs="0"/>
 *         &lt;element name="servicePriceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "servicePriceInsertUpdateResult",
    "servicePriceId"
})
@XmlRootElement(name = "ServicePriceInsertUpdateResponse")
public class ServicePriceInsertUpdateResponse {

    @XmlElementRef(name = "ServicePriceInsertUpdateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePriceDTO> servicePriceInsertUpdateResult;
    @XmlElementRef(name = "servicePriceId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> servicePriceId;

    /**
     * Obtém o valor da propriedade servicePriceInsertUpdateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}
     *     
     */
    public JAXBElement<ServicePriceDTO> getServicePriceInsertUpdateResult() {
        return servicePriceInsertUpdateResult;
    }

    /**
     * Define o valor da propriedade servicePriceInsertUpdateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePriceDTO }{@code >}
     *     
     */
    public void setServicePriceInsertUpdateResult(JAXBElement<ServicePriceDTO> value) {
        this.servicePriceInsertUpdateResult = value;
    }

    /**
     * Obtém o valor da propriedade servicePriceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServicePriceId() {
        return servicePriceId;
    }

    /**
     * Define o valor da propriedade servicePriceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServicePriceId(JAXBElement<Integer> value) {
        this.servicePriceId = value;
    }

}
