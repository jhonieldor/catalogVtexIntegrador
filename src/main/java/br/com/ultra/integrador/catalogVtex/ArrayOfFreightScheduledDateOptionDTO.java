
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfFreightScheduledDateOptionDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFreightScheduledDateOptionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreightScheduledDateOptionDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}FreightScheduledDateOptionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFreightScheduledDateOptionDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "freightScheduledDateOptionDTO"
})
public class ArrayOfFreightScheduledDateOptionDTO {

    @XmlElement(name = "FreightScheduledDateOptionDTO", nillable = true)
    protected List<FreightScheduledDateOptionDTO> freightScheduledDateOptionDTO;

    /**
     * Gets the value of the freightScheduledDateOptionDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightScheduledDateOptionDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightScheduledDateOptionDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightScheduledDateOptionDTO }
     * 
     * 
     */
    public List<FreightScheduledDateOptionDTO> getFreightScheduledDateOptionDTO() {
        if (freightScheduledDateOptionDTO == null) {
            freightScheduledDateOptionDTO = new ArrayList<FreightScheduledDateOptionDTO>();
        }
        return this.freightScheduledDateOptionDTO;
    }

}
