
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
 *         &lt;element name="GiftCardTransactionItemInsertResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "giftCardTransactionItemInsertResult"
})
@XmlRootElement(name = "GiftCardTransactionItemInsertResponse")
public class GiftCardTransactionItemInsertResponse {

    @XmlElement(name = "GiftCardTransactionItemInsertResult")
    protected Boolean giftCardTransactionItemInsertResult;

    /**
     * Obtém o valor da propriedade giftCardTransactionItemInsertResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiftCardTransactionItemInsertResult() {
        return giftCardTransactionItemInsertResult;
    }

    /**
     * Define o valor da propriedade giftCardTransactionItemInsertResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiftCardTransactionItemInsertResult(Boolean value) {
        this.giftCardTransactionItemInsertResult = value;
    }

}
