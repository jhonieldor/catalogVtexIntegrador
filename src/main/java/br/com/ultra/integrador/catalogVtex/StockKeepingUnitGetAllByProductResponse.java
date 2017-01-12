
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
 *         &lt;element name="StockKeepingUnitGetAllByProductResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfStockKeepingUnitDTO" minOccurs="0"/>
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
    "stockKeepingUnitGetAllByProductResult"
})
@XmlRootElement(name = "StockKeepingUnitGetAllByProductResponse")
public class StockKeepingUnitGetAllByProductResponse {

    @XmlElementRef(name = "StockKeepingUnitGetAllByProductResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockKeepingUnitDTO> stockKeepingUnitGetAllByProductResult;

    /**
     * Obtém o valor da propriedade stockKeepingUnitGetAllByProductResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockKeepingUnitDTO> getStockKeepingUnitGetAllByProductResult() {
        return stockKeepingUnitGetAllByProductResult;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitGetAllByProductResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitGetAllByProductResult(JAXBElement<ArrayOfStockKeepingUnitDTO> value) {
        this.stockKeepingUnitGetAllByProductResult = value;
    }

}
