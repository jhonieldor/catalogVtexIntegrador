
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
 *         &lt;element name="StockKeepingUnitServiceInsertUpdateResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitServiceDTO" minOccurs="0"/>
 *         &lt;element name="stockKeepingUnitServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "stockKeepingUnitServiceInsertUpdateResult",
    "stockKeepingUnitServiceId"
})
@XmlRootElement(name = "StockKeepingUnitServiceInsertUpdateResponse")
public class StockKeepingUnitServiceInsertUpdateResponse {

    @XmlElementRef(name = "StockKeepingUnitServiceInsertUpdateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<StockKeepingUnitServiceDTO> stockKeepingUnitServiceInsertUpdateResult;
    @XmlElementRef(name = "stockKeepingUnitServiceId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stockKeepingUnitServiceId;

    /**
     * Obtém o valor da propriedade stockKeepingUnitServiceInsertUpdateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}
     *     
     */
    public JAXBElement<StockKeepingUnitServiceDTO> getStockKeepingUnitServiceInsertUpdateResult() {
        return stockKeepingUnitServiceInsertUpdateResult;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitServiceInsertUpdateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitServiceDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitServiceInsertUpdateResult(JAXBElement<StockKeepingUnitServiceDTO> value) {
        this.stockKeepingUnitServiceInsertUpdateResult = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitServiceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitServiceId() {
        return stockKeepingUnitServiceId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitServiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitServiceId(JAXBElement<Integer> value) {
        this.stockKeepingUnitServiceId = value;
    }

}
