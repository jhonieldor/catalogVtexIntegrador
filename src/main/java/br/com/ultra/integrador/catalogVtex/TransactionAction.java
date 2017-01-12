
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransactionAction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Debit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionAction", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts")
@XmlEnum
public enum TransactionAction {

    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Debit")
    DEBIT("Debit");
    private final String value;

    TransactionAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionAction fromValue(String v) {
        for (TransactionAction c: TransactionAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
