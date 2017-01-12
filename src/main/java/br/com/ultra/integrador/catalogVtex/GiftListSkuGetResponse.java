
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
 *         &lt;element name="GiftListSkuGetResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfGiftListStockKeepingUnitDTO" minOccurs="0"/>
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
    "giftListSkuGetResult"
})
@XmlRootElement(name = "GiftListSkuGetResponse")
public class GiftListSkuGetResponse {

    @XmlElementRef(name = "GiftListSkuGetResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> giftListSkuGetResult;

    /**
     * Obtém o valor da propriedade giftListSkuGetResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> getGiftListSkuGetResult() {
        return giftListSkuGetResult;
    }

    /**
     * Define o valor da propriedade giftListSkuGetResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftListStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setGiftListSkuGetResult(JAXBElement<ArrayOfGiftListStockKeepingUnitDTO> value) {
        this.giftListSkuGetResult = value;
    }

}
