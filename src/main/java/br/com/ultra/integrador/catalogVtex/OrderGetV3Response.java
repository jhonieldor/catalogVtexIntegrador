
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
 *         &lt;element name="OrderGetV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}OrderDTO" minOccurs="0"/>
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
    "orderGetV3Result"
})
@XmlRootElement(name = "OrderGetV3Response")
public class OrderGetV3Response {

    @XmlElementRef(name = "OrderGetV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderDTO> orderGetV3Result;

    /**
     * Obtém o valor da propriedade orderGetV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}
     *     
     */
    public JAXBElement<OrderDTO> getOrderGetV3Result() {
        return orderGetV3Result;
    }

    /**
     * Define o valor da propriedade orderGetV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}
     *     
     */
    public void setOrderGetV3Result(JAXBElement<OrderDTO> value) {
        this.orderGetV3Result = value;
    }

}
