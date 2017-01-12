
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StockKeepingUnitComplementDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StockKeepingUnitComplementDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComplementType" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitComplementDTO.ComplementTypeEnum" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitComplements" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockKeepingUnitComplementDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "complementType",
    "stockKeepingUnitComplements",
    "stockKeepingUnitId"
})
public class StockKeepingUnitComplementDTO {

    @XmlElement(name = "ComplementType")
    protected StockKeepingUnitComplementDTOComplementTypeEnum complementType;
    @XmlElementRef(name = "StockKeepingUnitComplements", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> stockKeepingUnitComplements;
    @XmlElement(name = "StockKeepingUnitId")
    protected Integer stockKeepingUnitId;

    /**
     * Obtém o valor da propriedade complementType.
     * 
     * @return
     *     possible object is
     *     {@link StockKeepingUnitComplementDTOComplementTypeEnum }
     *     
     */
    public StockKeepingUnitComplementDTOComplementTypeEnum getComplementType() {
        return complementType;
    }

    /**
     * Define o valor da propriedade complementType.
     * 
     * @param value
     *     allowed object is
     *     {@link StockKeepingUnitComplementDTOComplementTypeEnum }
     *     
     */
    public void setComplementType(StockKeepingUnitComplementDTOComplementTypeEnum value) {
        this.complementType = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitComplements.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getStockKeepingUnitComplements() {
        return stockKeepingUnitComplements;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitComplements.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setStockKeepingUnitComplements(JAXBElement<ArrayOfint> value) {
        this.stockKeepingUnitComplements = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitId(Integer value) {
        this.stockKeepingUnitId = value;
    }

}
