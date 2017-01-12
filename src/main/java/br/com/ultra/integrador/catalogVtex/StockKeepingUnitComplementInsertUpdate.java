
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
 *         &lt;element name="objStockKeepingUnitComplementDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitComplementDTO" minOccurs="0"/>
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
    "objStockKeepingUnitComplementDTO"
})
@XmlRootElement(name = "StockKeepingUnitComplementInsertUpdate")
public class StockKeepingUnitComplementInsertUpdate {

    @XmlElementRef(name = "objStockKeepingUnitComplementDTO", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<StockKeepingUnitComplementDTO> objStockKeepingUnitComplementDTO;

    /**
     * Obtém o valor da propriedade objStockKeepingUnitComplementDTO.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitComplementDTO }{@code >}
     *     
     */
    public JAXBElement<StockKeepingUnitComplementDTO> getObjStockKeepingUnitComplementDTO() {
        return objStockKeepingUnitComplementDTO;
    }

    /**
     * Define o valor da propriedade objStockKeepingUnitComplementDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitComplementDTO }{@code >}
     *     
     */
    public void setObjStockKeepingUnitComplementDTO(JAXBElement<StockKeepingUnitComplementDTO> value) {
        this.objStockKeepingUnitComplementDTO = value;
    }

}
