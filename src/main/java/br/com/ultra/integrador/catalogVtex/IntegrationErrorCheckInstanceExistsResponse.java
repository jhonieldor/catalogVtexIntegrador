
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="IntegrationErrorCheckInstanceExistsResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "integrationErrorCheckInstanceExistsResult"
})
@XmlRootElement(name = "IntegrationErrorCheckInstanceExistsResponse")
public class IntegrationErrorCheckInstanceExistsResponse {

    @XmlElement(name = "IntegrationErrorCheckInstanceExistsResult")
    protected Boolean integrationErrorCheckInstanceExistsResult;

    /**
     * Obtém o valor da propriedade integrationErrorCheckInstanceExistsResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrationErrorCheckInstanceExistsResult() {
        return integrationErrorCheckInstanceExistsResult;
    }

    /**
     * Define o valor da propriedade integrationErrorCheckInstanceExistsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrationErrorCheckInstanceExistsResult(Boolean value) {
        this.integrationErrorCheckInstanceExistsResult = value;
    }

}
