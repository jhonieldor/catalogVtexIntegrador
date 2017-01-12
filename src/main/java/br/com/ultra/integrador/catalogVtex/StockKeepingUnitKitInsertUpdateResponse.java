
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
 *         &lt;element name="StockKeepingUnitKitInsertUpdateResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitKitDTO" minOccurs="0"/>
 *         &lt;element name="stockKeepingUnitKitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "stockKeepingUnitKitInsertUpdateResult",
    "stockKeepingUnitKitId"
})
@XmlRootElement(name = "StockKeepingUnitKitInsertUpdateResponse")
public class StockKeepingUnitKitInsertUpdateResponse {

    @XmlElementRef(name = "StockKeepingUnitKitInsertUpdateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<StockKeepingUnitKitDTO> stockKeepingUnitKitInsertUpdateResult;
    @XmlElementRef(name = "stockKeepingUnitKitId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stockKeepingUnitKitId;

    /**
     * Obtém o valor da propriedade stockKeepingUnitKitInsertUpdateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}
     *     
     */
    public JAXBElement<StockKeepingUnitKitDTO> getStockKeepingUnitKitInsertUpdateResult() {
        return stockKeepingUnitKitInsertUpdateResult;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitKitInsertUpdateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitKitInsertUpdateResult(JAXBElement<StockKeepingUnitKitDTO> value) {
        this.stockKeepingUnitKitInsertUpdateResult = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitKitId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitKitId() {
        return stockKeepingUnitKitId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitKitId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitKitId(JAXBElement<Integer> value) {
        this.stockKeepingUnitKitId = value;
    }

}
