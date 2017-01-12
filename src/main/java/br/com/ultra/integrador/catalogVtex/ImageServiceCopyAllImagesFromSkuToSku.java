
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="stockKeepingUnitIdFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stockKeepingUnitIdTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "stockKeepingUnitIdFrom",
    "stockKeepingUnitIdTo"
})
@XmlRootElement(name = "ImageServiceCopyAllImagesFromSkuToSku")
public class ImageServiceCopyAllImagesFromSkuToSku {

    protected Integer stockKeepingUnitIdFrom;
    protected Integer stockKeepingUnitIdTo;

    /**
     * Obtém o valor da propriedade stockKeepingUnitIdFrom.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitIdFrom() {
        return stockKeepingUnitIdFrom;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitIdFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitIdFrom(Integer value) {
        this.stockKeepingUnitIdFrom = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitIdTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitIdTo() {
        return stockKeepingUnitIdTo;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitIdTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitIdTo(Integer value) {
        this.stockKeepingUnitIdTo = value;
    }

}
