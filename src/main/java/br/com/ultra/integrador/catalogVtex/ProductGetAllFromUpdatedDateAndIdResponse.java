
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
 *         &lt;element name="ProductGetAllFromUpdatedDateAndIdResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfProductDTO" minOccurs="0"/>
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
    "productGetAllFromUpdatedDateAndIdResult"
})
@XmlRootElement(name = "ProductGetAllFromUpdatedDateAndIdResponse")
public class ProductGetAllFromUpdatedDateAndIdResponse {

    @XmlElementRef(name = "ProductGetAllFromUpdatedDateAndIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductDTO> productGetAllFromUpdatedDateAndIdResult;

    /**
     * Obtém o valor da propriedade productGetAllFromUpdatedDateAndIdResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductDTO> getProductGetAllFromUpdatedDateAndIdResult() {
        return productGetAllFromUpdatedDateAndIdResult;
    }

    /**
     * Define o valor da propriedade productGetAllFromUpdatedDateAndIdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public void setProductGetAllFromUpdatedDateAndIdResult(JAXBElement<ArrayOfProductDTO> value) {
        this.productGetAllFromUpdatedDateAndIdResult = value;
    }

}
