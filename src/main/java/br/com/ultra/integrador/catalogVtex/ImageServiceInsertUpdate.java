
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
 *         &lt;element name="urlImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "urlImage",
    "imageName",
    "stockKeepingUnitId",
    "fileId"
})
@XmlRootElement(name = "ImageServiceInsertUpdate")
public class ImageServiceInsertUpdate {

    @XmlElementRef(name = "urlImage", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlImage;
    @XmlElementRef(name = "imageName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageName;
    protected Integer stockKeepingUnitId;
    @XmlElementRef(name = "fileId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fileId;

    /**
     * Obtém o valor da propriedade urlImage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlImage() {
        return urlImage;
    }

    /**
     * Define o valor da propriedade urlImage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlImage(JAXBElement<String> value) {
        this.urlImage = value;
    }

    /**
     * Obtém o valor da propriedade imageName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageName() {
        return imageName;
    }

    /**
     * Define o valor da propriedade imageName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageName(JAXBElement<String> value) {
        this.imageName = value;
    }

    /**
     * Obtém o valor da propriedade stockKeepingUnitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Define o valor da propriedade stockKeepingUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitId(Integer value) {
        this.stockKeepingUnitId = value;
    }

    /**
     * Obtém o valor da propriedade fileId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFileId() {
        return fileId;
    }

    /**
     * Define o valor da propriedade fileId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFileId(JAXBElement<Integer> value) {
        this.fileId = value;
    }

}
