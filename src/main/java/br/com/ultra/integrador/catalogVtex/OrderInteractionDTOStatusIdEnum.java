
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderInteractionDTO.StatusIdEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderInteractionDTO.StatusIdEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderInteractionDTO.StatusIdEnum", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts")
@XmlEnum
public enum OrderInteractionDTOStatusIdEnum {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    OrderInteractionDTOStatusIdEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderInteractionDTOStatusIdEnum fromValue(String v) {
        for (OrderInteractionDTOStatusIdEnum c: OrderInteractionDTOStatusIdEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
