
package br.com.ultra.integrador.catalogVtex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StockKeepingUnitComplementDTO.ComplementTypeEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StockKeepingUnitComplementDTO.ComplementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accessory"/>
 *     &lt;enumeration value="Sugestion"/>
 *     &lt;enumeration value="Similarly"/>
 *     &lt;enumeration value="Generic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockKeepingUnitComplementDTO.ComplementTypeEnum", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts")
@XmlEnum
public enum StockKeepingUnitComplementDTOComplementTypeEnum {

    @XmlEnumValue("Accessory")
    ACCESSORY("Accessory"),
    @XmlEnumValue("Sugestion")
    SUGESTION("Sugestion"),
    @XmlEnumValue("Similarly")
    SIMILARLY("Similarly"),
    @XmlEnumValue("Generic")
    GENERIC("Generic");
    private final String value;

    StockKeepingUnitComplementDTOComplementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockKeepingUnitComplementDTOComplementTypeEnum fromValue(String v) {
        for (StockKeepingUnitComplementDTOComplementTypeEnum c: StockKeepingUnitComplementDTOComplementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
