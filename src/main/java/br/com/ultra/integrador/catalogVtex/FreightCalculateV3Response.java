
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
 *         &lt;element name="FreightCalculateV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfFreightStockKeepingUnitDTO" minOccurs="0"/>
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
    "freightCalculateV3Result"
})
@XmlRootElement(name = "FreightCalculateV3Response")
public class FreightCalculateV3Response {

    @XmlElementRef(name = "FreightCalculateV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFreightStockKeepingUnitDTO> freightCalculateV3Result;

    /**
     * Obtém o valor da propriedade freightCalculateV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFreightStockKeepingUnitDTO> getFreightCalculateV3Result() {
        return freightCalculateV3Result;
    }

    /**
     * Define o valor da propriedade freightCalculateV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setFreightCalculateV3Result(JAXBElement<ArrayOfFreightStockKeepingUnitDTO> value) {
        this.freightCalculateV3Result = value;
    }

}
