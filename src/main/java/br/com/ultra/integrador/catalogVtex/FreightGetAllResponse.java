
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
 *         &lt;element name="FreightGetAllResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfFreightDTO" minOccurs="0"/>
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
    "freightGetAllResult"
})
@XmlRootElement(name = "FreightGetAllResponse")
public class FreightGetAllResponse {

    @XmlElementRef(name = "FreightGetAllResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFreightDTO> freightGetAllResult;

    /**
     * Obtém o valor da propriedade freightGetAllResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFreightDTO> getFreightGetAllResult() {
        return freightGetAllResult;
    }

    /**
     * Define o valor da propriedade freightGetAllResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFreightDTO }{@code >}
     *     
     */
    public void setFreightGetAllResult(JAXBElement<ArrayOfFreightDTO> value) {
        this.freightGetAllResult = value;
    }

}
