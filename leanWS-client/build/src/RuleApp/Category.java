
package RuleApp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Centurion"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="Distinguished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "category")
@XmlEnum
public enum Category {

    @XmlEnumValue("Centurion")
    CENTURION("Centurion"),
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),
    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Express")
    EXPRESS("Express"),
    @XmlEnumValue("Distinguished")
    DISTINGUISHED("Distinguished");
    private final String value;

    Category(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Category fromValue(String v) {
        for (Category c: Category.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
