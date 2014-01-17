
package RuleApp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rulesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rulesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="executionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="myMainportfolio" type="{http://RuleApp}portfolio" minOccurs="0"/>
 *         &lt;element name="mySecondaryportfolio" type="{http://RuleApp}portfolio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rulesRequest", propOrder = {
    "counter",
    "executionId",
    "myMainportfolio",
    "mySecondaryportfolio"
})
public class RulesRequest {

    protected short counter;
    protected String executionId;
    protected Portfolio myMainportfolio;
    protected Portfolio mySecondaryportfolio;

    /**
     * Gets the value of the counter property.
     * 
     */
    public short getCounter() {
        return counter;
    }

    /**
     * Sets the value of the counter property.
     * 
     */
    public void setCounter(short value) {
        this.counter = value;
    }

    /**
     * Gets the value of the executionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * Sets the value of the executionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionId(String value) {
        this.executionId = value;
    }

    /**
     * Gets the value of the myMainportfolio property.
     * 
     * @return
     *     possible object is
     *     {@link Portfolio }
     *     
     */
    public Portfolio getMyMainportfolio() {
        return myMainportfolio;
    }

    /**
     * Sets the value of the myMainportfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portfolio }
     *     
     */
    public void setMyMainportfolio(Portfolio value) {
        this.myMainportfolio = value;
    }

    /**
     * Gets the value of the mySecondaryportfolio property.
     * 
     * @return
     *     possible object is
     *     {@link Portfolio }
     *     
     */
    public Portfolio getMySecondaryportfolio() {
        return mySecondaryportfolio;
    }

    /**
     * Sets the value of the mySecondaryportfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portfolio }
     *     
     */
    public void setMySecondaryportfolio(Portfolio value) {
        this.mySecondaryportfolio = value;
    }

}
