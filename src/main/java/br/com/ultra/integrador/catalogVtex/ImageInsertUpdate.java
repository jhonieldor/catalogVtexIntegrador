
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
 *         &lt;element name="image" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ImageDTO" minOccurs="0"/>
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
    "image"
})
@XmlRootElement(name = "ImageInsertUpdate")
public class ImageInsertUpdate {

    @XmlElementRef(name = "image", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ImageDTO> image;

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageDTO }{@code >}
     *     
     */
    public JAXBElement<ImageDTO> getImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageDTO }{@code >}
     *     
     */
    public void setImage(JAXBElement<ImageDTO> value) {
        this.image = value;
    }

}
