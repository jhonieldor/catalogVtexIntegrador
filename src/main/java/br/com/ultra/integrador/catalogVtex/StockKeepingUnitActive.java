
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
 *         &lt;element name="idStockKeepingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "idStockKeepingUnit"
})
@XmlRootElement(name = "StockKeepingUnitActive")
public class StockKeepingUnitActive {

    protected Integer idStockKeepingUnit;

    /**
     * Obtém o valor da propriedade idStockKeepingUnit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStockKeepingUnit() {
        return idStockKeepingUnit;
    }

    /**
     * Define o valor da propriedade idStockKeepingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStockKeepingUnit(Integer value) {
        this.idStockKeepingUnit = value;
    }

}
