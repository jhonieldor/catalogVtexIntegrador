
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
 *         &lt;element name="productVO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ProductDTO" minOccurs="0"/>
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
    "productVO"
})
@XmlRootElement(name = "ProductInsertUpdate")
public class ProductInsertUpdate {

    @XmlElementRef(name = "productVO", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductDTO> productVO;

    /**
     * Obtém o valor da propriedade productVO.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}
     *     
     */
    public JAXBElement<ProductDTO> getProductVO() {
        return productVO;
    }

    /**
     * Define o valor da propriedade productVO.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}
     *     
     */
    public void setProductVO(JAXBElement<ProductDTO> value) {
        this.productVO = value;
    }

}
