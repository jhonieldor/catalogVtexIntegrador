
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfGiftListMemberDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGiftListMemberDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftListMemberDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}GiftListMemberDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGiftListMemberDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "giftListMemberDTO"
})
public class ArrayOfGiftListMemberDTO {

    @XmlElement(name = "GiftListMemberDTO", nillable = true)
    protected List<GiftListMemberDTO> giftListMemberDTO;

    /**
     * Gets the value of the giftListMemberDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftListMemberDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftListMemberDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftListMemberDTO }
     * 
     * 
     */
    public List<GiftListMemberDTO> getGiftListMemberDTO() {
        if (giftListMemberDTO == null) {
            giftListMemberDTO = new ArrayList<GiftListMemberDTO>();
        }
        return this.giftListMemberDTO;
    }

}
