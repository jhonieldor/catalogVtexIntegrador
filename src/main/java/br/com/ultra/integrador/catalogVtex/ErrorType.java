
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ErrorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CATEGORIA"/>
 *     &lt;enumeration value="CLIENTE"/>
 *     &lt;enumeration value="ESTOQUE"/>
 *     &lt;enumeration value="IMAGEM"/>
 *     &lt;enumeration value="KIT"/>
 *     &lt;enumeration value="MARCA"/>
 *     &lt;enumeration value="PEDIDO"/>
 *     &lt;enumeration value="PRODUTO"/>
 *     &lt;enumeration value="SKU"/>
 *     &lt;enumeration value="SERVICO"/>
 *     &lt;enumeration value="ENTREGA"/>
 *     &lt;enumeration value="TRACKING"/>
 *     &lt;enumeration value="FRETE"/>
 *     &lt;enumeration value="FRETEVALOR"/>
 *     &lt;enumeration value="GIFTCARD"/>
 *     &lt;enumeration value="EMAILQUEUE"/>
 *     &lt;enumeration value="GIFTLIST"/>
 *     &lt;enumeration value="GIFTLISTSKU"/>
 *     &lt;enumeration value="BUYTOGETHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorType", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts")
@XmlEnum
public enum ErrorType {

    CATEGORIA,
    CLIENTE,
    ESTOQUE,
    IMAGEM,
    KIT,
    MARCA,
    PEDIDO,
    PRODUTO,
    SKU,
    SERVICO,
    ENTREGA,
    TRACKING,
    FRETE,
    FRETEVALOR,
    GIFTCARD,
    EMAILQUEUE,
    GIFTLIST,
    GIFTLISTSKU,
    BUYTOGETHER;

    public String value() {
        return name();
    }

    public static ErrorType fromValue(String v) {
        return valueOf(v);
    }

}
