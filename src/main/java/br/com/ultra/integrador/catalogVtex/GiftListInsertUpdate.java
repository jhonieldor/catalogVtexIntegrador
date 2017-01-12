
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
 *         &lt;element name="giftList" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}GiftListDTO" minOccurs="0"/>
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
    "giftList"
})
@XmlRootElement(name = "GiftListInsertUpdate")
public class GiftListInsertUpdate {

    @XmlElementRef(name = "giftList", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<GiftListDTO> giftList;

    /**
     * Obtém o valor da propriedade giftList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}
     *     
     */
    public JAXBElement<GiftListDTO> getGiftList() {
        return giftList;
    }

    /**
     * Define o valor da propriedade giftList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GiftListDTO }{@code >}
     *     
     */
    public void setGiftList(JAXBElement<GiftListDTO> value) {
        this.giftList = value;
    }

}
