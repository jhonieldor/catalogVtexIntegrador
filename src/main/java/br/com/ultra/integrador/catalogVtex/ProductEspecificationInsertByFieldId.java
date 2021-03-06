
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
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldValues" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "idProduct",
    "fieldId",
    "fieldValues"
})
@XmlRootElement(name = "ProductEspecificationInsertByFieldId")
public class ProductEspecificationInsertByFieldId {

    protected Integer idProduct;
    protected Integer fieldId;
    @XmlElementRef(name = "fieldValues", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> fieldValues;

    /**
     * Obtém o valor da propriedade idProduct.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProduct() {
        return idProduct;
    }

    /**
     * Define o valor da propriedade idProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProduct(Integer value) {
        this.idProduct = value;
    }

    /**
     * Obtém o valor da propriedade fieldId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldId() {
        return fieldId;
    }

    /**
     * Define o valor da propriedade fieldId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldId(Integer value) {
        this.fieldId = value;
    }

    /**
     * Obtém o valor da propriedade fieldValues.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getFieldValues() {
        return fieldValues;
    }

    /**
     * Define o valor da propriedade fieldValues.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setFieldValues(JAXBElement<ArrayOfstring> value) {
        this.fieldValues = value;
    }

}
