
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
 *         &lt;element name="ServiceInsertUpdateResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ServiceDTO" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "serviceInsertUpdateResult",
    "serviceId"
})
@XmlRootElement(name = "ServiceInsertUpdateResponse")
public class ServiceInsertUpdateResponse {

    @XmlElementRef(name = "ServiceInsertUpdateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDTO> serviceInsertUpdateResult;
    @XmlElementRef(name = "serviceId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceId;

    /**
     * Obtém o valor da propriedade serviceInsertUpdateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}
     *     
     */
    public JAXBElement<ServiceDTO> getServiceInsertUpdateResult() {
        return serviceInsertUpdateResult;
    }

    /**
     * Define o valor da propriedade serviceInsertUpdateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDTO }{@code >}
     *     
     */
    public void setServiceInsertUpdateResult(JAXBElement<ServiceDTO> value) {
        this.serviceInsertUpdateResult = value;
    }

    /**
     * Obtém o valor da propriedade serviceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceId() {
        return serviceId;
    }

    /**
     * Define o valor da propriedade serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceId(JAXBElement<Integer> value) {
        this.serviceId = value;
    }

}
