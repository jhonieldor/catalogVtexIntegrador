
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
 *         &lt;element name="OrderGetNext50FromIdV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfOrderDTO" minOccurs="0"/>
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
    "orderGetNext50FromIdV3Result"
})
@XmlRootElement(name = "OrderGetNext50FromIdV3Response")
public class OrderGetNext50FromIdV3Response {

    @XmlElementRef(name = "OrderGetNext50FromIdV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderDTO> orderGetNext50FromIdV3Result;

    /**
     * Obtém o valor da propriedade orderGetNext50FromIdV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderDTO> getOrderGetNext50FromIdV3Result() {
        return orderGetNext50FromIdV3Result;
    }

    /**
     * Define o valor da propriedade orderGetNext50FromIdV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}
     *     
     */
    public void setOrderGetNext50FromIdV3Result(JAXBElement<ArrayOfOrderDTO> value) {
        this.orderGetNext50FromIdV3Result = value;
    }

}
