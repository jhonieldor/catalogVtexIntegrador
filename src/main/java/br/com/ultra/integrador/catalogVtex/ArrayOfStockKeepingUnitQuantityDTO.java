
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfStockKeepingUnitQuantityDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStockKeepingUnitQuantityDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockKeepingUnitQuantityDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitQuantityDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStockKeepingUnitQuantityDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "stockKeepingUnitQuantityDTO"
})
public class ArrayOfStockKeepingUnitQuantityDTO {

    @XmlElement(name = "StockKeepingUnitQuantityDTO", nillable = true)
    protected List<StockKeepingUnitQuantityDTO> stockKeepingUnitQuantityDTO;

    /**
     * Gets the value of the stockKeepingUnitQuantityDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockKeepingUnitQuantityDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockKeepingUnitQuantityDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockKeepingUnitQuantityDTO }
     * 
     * 
     */
    public List<StockKeepingUnitQuantityDTO> getStockKeepingUnitQuantityDTO() {
        if (stockKeepingUnitQuantityDTO == null) {
            stockKeepingUnitQuantityDTO = new ArrayList<StockKeepingUnitQuantityDTO>();
        }
        return this.stockKeepingUnitQuantityDTO;
    }

}
