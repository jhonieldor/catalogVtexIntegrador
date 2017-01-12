
package br.com.ultra.integrador.catalogVtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOrderInvoiceStockKeepingUnitDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderInvoiceStockKeepingUnitDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderInvoiceStockKeepingUnitDTO" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}OrderInvoiceStockKeepingUnitDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderInvoiceStockKeepingUnitDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "orderInvoiceStockKeepingUnitDTO"
})
public class ArrayOfOrderInvoiceStockKeepingUnitDTO {

    @XmlElement(name = "OrderInvoiceStockKeepingUnitDTO", nillable = true)
    protected List<OrderInvoiceStockKeepingUnitDTO> orderInvoiceStockKeepingUnitDTO;

    /**
     * Gets the value of the orderInvoiceStockKeepingUnitDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderInvoiceStockKeepingUnitDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderInvoiceStockKeepingUnitDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderInvoiceStockKeepingUnitDTO }
     * 
     * 
     */
    public List<OrderInvoiceStockKeepingUnitDTO> getOrderInvoiceStockKeepingUnitDTO() {
        if (orderInvoiceStockKeepingUnitDTO == null) {
            orderInvoiceStockKeepingUnitDTO = new ArrayList<OrderInvoiceStockKeepingUnitDTO>();
        }
        return this.orderInvoiceStockKeepingUnitDTO;
    }

}
