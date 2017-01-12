
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
 *         &lt;element name="WareHouseIStockableGetByStockKeepingUnitV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfWareHouseIStockableDTO" minOccurs="0"/>
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
    "wareHouseIStockableGetByStockKeepingUnitV3Result"
})
@XmlRootElement(name = "WareHouseIStockableGetByStockKeepingUnitV3Response")
public class WareHouseIStockableGetByStockKeepingUnitV3Response {

    @XmlElementRef(name = "WareHouseIStockableGetByStockKeepingUnitV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWareHouseIStockableDTO> wareHouseIStockableGetByStockKeepingUnitV3Result;

    /**
     * Obtém o valor da propriedade wareHouseIStockableGetByStockKeepingUnitV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWareHouseIStockableDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWareHouseIStockableDTO> getWareHouseIStockableGetByStockKeepingUnitV3Result() {
        return wareHouseIStockableGetByStockKeepingUnitV3Result;
    }

    /**
     * Define o valor da propriedade wareHouseIStockableGetByStockKeepingUnitV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWareHouseIStockableDTO }{@code >}
     *     
     */
    public void setWareHouseIStockableGetByStockKeepingUnitV3Result(JAXBElement<ArrayOfWareHouseIStockableDTO> value) {
        this.wareHouseIStockableGetByStockKeepingUnitV3Result = value;
    }

}
