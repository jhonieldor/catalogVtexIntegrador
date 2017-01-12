
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
 *         &lt;element name="giftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="skuQuantity" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfStockKeepingUnitQuantityDTO" minOccurs="0"/>
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
    "giftListId",
    "skuQuantity"
})
@XmlRootElement(name = "GiftListSkuDeleteByList")
public class GiftListSkuDeleteByList {

    protected Integer giftListId;
    @XmlElementRef(name = "skuQuantity", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockKeepingUnitQuantityDTO> skuQuantity;

    /**
     * Obtém o valor da propriedade giftListId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftListId() {
        return giftListId;
    }

    /**
     * Define o valor da propriedade giftListId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftListId(Integer value) {
        this.giftListId = value;
    }

    /**
     * Obtém o valor da propriedade skuQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitQuantityDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockKeepingUnitQuantityDTO> getSkuQuantity() {
        return skuQuantity;
    }

    /**
     * Define o valor da propriedade skuQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitQuantityDTO }{@code >}
     *     
     */
    public void setSkuQuantity(JAXBElement<ArrayOfStockKeepingUnitQuantityDTO> value) {
        this.skuQuantity = value;
    }

}
