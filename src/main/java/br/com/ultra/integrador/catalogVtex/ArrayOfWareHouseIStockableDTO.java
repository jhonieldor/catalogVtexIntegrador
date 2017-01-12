
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWareHouseIStockableDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWareHouseIStockableDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WareHouseIStockableDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}WareHouseIStockableDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWareHouseIStockableDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "wareHouseIStockableDTO"
})
public class ArrayOfWareHouseIStockableDTO {

    @XmlElement(name = "WareHouseIStockableDTO", nillable = true)
    protected List<WareHouseIStockableDTO> wareHouseIStockableDTO;

    /**
     * Gets the value of the wareHouseIStockableDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wareHouseIStockableDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWareHouseIStockableDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WareHouseIStockableDTO }
     * 
     * 
     */
    public List<WareHouseIStockableDTO> getWareHouseIStockableDTO() {
        if (wareHouseIStockableDTO == null) {
            wareHouseIStockableDTO = new ArrayList<WareHouseIStockableDTO>();
        }
        return this.wareHouseIStockableDTO;
    }

}
