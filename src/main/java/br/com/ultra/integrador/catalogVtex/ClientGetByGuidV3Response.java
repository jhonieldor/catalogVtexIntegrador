
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
 *         &lt;element name="ClientGetByGuidV3Result" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ClientDTO" minOccurs="0"/>
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
    "clientGetByGuidV3Result"
})
@XmlRootElement(name = "ClientGetByGuidV3Response")
public class ClientGetByGuidV3Response {

    @XmlElementRef(name = "ClientGetByGuidV3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientDTO> clientGetByGuidV3Result;

    /**
     * Obtém o valor da propriedade clientGetByGuidV3Result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}
     *     
     */
    public JAXBElement<ClientDTO> getClientGetByGuidV3Result() {
        return clientGetByGuidV3Result;
    }

    /**
     * Define o valor da propriedade clientGetByGuidV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientDTO }{@code >}
     *     
     */
    public void setClientGetByGuidV3Result(JAXBElement<ClientDTO> value) {
        this.clientGetByGuidV3Result = value;
    }

}
