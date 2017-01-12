
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
 *         &lt;element name="WareHouseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SkuId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "wareHouseId",
    "skuId"
})
@XmlRootElement(name = "WareHouseIStockableGetByStockKeepingUnit")
public class WareHouseIStockableGetByStockKeepingUnit {

    @XmlElement(name = "WareHouseId")
    protected Integer wareHouseId;
    @XmlElement(name = "SkuId")
    protected Integer skuId;

    /**
     * Obtém o valor da propriedade wareHouseId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWareHouseId() {
        return wareHouseId;
    }

    /**
     * Define o valor da propriedade wareHouseId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWareHouseId(Integer value) {
        this.wareHouseId = value;
    }

    /**
     * Obtém o valor da propriedade skuId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * Define o valor da propriedade skuId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkuId(Integer value) {
        this.skuId = value;
    }

}
