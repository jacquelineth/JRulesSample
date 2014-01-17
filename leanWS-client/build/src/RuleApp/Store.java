
package RuleApp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for store complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="store">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalStockValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="computedValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store", propOrder = {
    "legalStockValue",
    "computedValue"
})
public class Store {

    protected Integer legalStockValue;
    protected int computedValue;

    /**
     * Gets the value of the legalStockValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegalStockValue() {
        return legalStockValue;
    }

    /**
     * Sets the value of the legalStockValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegalStockValue(Integer value) {
        this.legalStockValue = value;
    }

    /**
     * Gets the value of the computedValue property.
     * 
     */
    public int getComputedValue() {
        return computedValue;
    }

    /**
     * Sets the value of the computedValue property.
     * 
     */
    public void setComputedValue(int value) {
        this.computedValue = value;
    }

}
