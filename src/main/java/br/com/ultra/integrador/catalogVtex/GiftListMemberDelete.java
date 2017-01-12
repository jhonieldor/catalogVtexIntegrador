
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GiftListMemberId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "giftListMemberId",
    "giftListId"
})
@XmlRootElement(name = "GiftListMemberDelete")
public class GiftListMemberDelete {

    @XmlElement(name = "GiftListMemberId")
    protected Integer giftListMemberId;
    @XmlElement(name = "GiftListId")
    protected Integer giftListId;

    /**
     * Obtém o valor da propriedade giftListMemberId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftListMemberId() {
        return giftListMemberId;
    }

    /**
     * Define o valor da propriedade giftListMemberId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftListMemberId(Integer value) {
        this.giftListMemberId = value;
    }

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

}
