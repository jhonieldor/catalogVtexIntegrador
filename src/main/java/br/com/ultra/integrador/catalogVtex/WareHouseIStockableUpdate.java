
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="IdEstoque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdSku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Quantidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateOfAvailability" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "idEstoque",
    "idSku",
    "quantidade",
    "dateOfAvailability"
})
@XmlRootElement(name = "WareHouseIStockableUpdate")
public class WareHouseIStockableUpdate {

    @XmlElement(name = "IdEstoque")
    protected Integer idEstoque;
    @XmlElement(name = "IdSku")
    protected Integer idSku;
    @XmlElement(name = "Quantidade")
    protected Integer quantidade;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfAvailability;

    /**
     * Obtém o valor da propriedade idEstoque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEstoque() {
        return idEstoque;
    }

    /**
     * Define o valor da propriedade idEstoque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEstoque(Integer value) {
        this.idEstoque = value;
    }

    /**
     * Obtém o valor da propriedade idSku.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSku() {
        return idSku;
    }

    /**
     * Define o valor da propriedade idSku.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSku(Integer value) {
        this.idSku = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidade(Integer value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade dateOfAvailability.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAvailability() {
        return dateOfAvailability;
    }

    /**
     * Define o valor da propriedade dateOfAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfAvailability(XMLGregorianCalendar value) {
        this.dateOfAvailability = value;
    }

}
