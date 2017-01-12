
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
 *         &lt;element name="freightSkuContext" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfFreightStockKeepingUnitContextDTO" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "freightSkuContext",
    "zipCode"
})
@XmlRootElement(name = "FreightCalculateV3")
public class FreightCalculateV3 {

    @XmlElementRef(name = "freightSkuContext", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO> freightSkuContext;
    @XmlElementRef(name = "zipCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;

    /**
     * Obtém o valor da propriedade freightSkuContext.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitContextDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO> getFreightSkuContext() {
        return freightSkuContext;
    }

    /**
     * Define o valor da propriedade freightSkuContext.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitContextDTO }{@code >}
     *     
     */
    public void setFreightSkuContext(JAXBElement<ArrayOfFreightStockKeepingUnitContextDTO> value) {
        this.freightSkuContext = value;
    }

    /**
     * Obtém o valor da propriedade zipCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipCode() {
        return zipCode;
    }

    /**
     * Define o valor da propriedade zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipCode(JAXBElement<String> value) {
        this.zipCode = value;
    }

}
