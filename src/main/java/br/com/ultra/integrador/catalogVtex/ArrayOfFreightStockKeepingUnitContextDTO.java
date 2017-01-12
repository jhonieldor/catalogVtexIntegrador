
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfFreightStockKeepingUnitContextDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFreightStockKeepingUnitContextDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreightStockKeepingUnitContextDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}FreightStockKeepingUnitContextDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFreightStockKeepingUnitContextDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "freightStockKeepingUnitContextDTO"
})
public class ArrayOfFreightStockKeepingUnitContextDTO {

    @XmlElement(name = "FreightStockKeepingUnitContextDTO", nillable = true)
    protected List<FreightStockKeepingUnitContextDTO> freightStockKeepingUnitContextDTO;

    /**
     * Gets the value of the freightStockKeepingUnitContextDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightStockKeepingUnitContextDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightStockKeepingUnitContextDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightStockKeepingUnitContextDTO }
     * 
     * 
     */
    public List<FreightStockKeepingUnitContextDTO> getFreightStockKeepingUnitContextDTO() {
        if (freightStockKeepingUnitContextDTO == null) {
            freightStockKeepingUnitContextDTO = new ArrayList<FreightStockKeepingUnitContextDTO>();
        }
        return this.freightStockKeepingUnitContextDTO;
    }

}
