
package RuleApp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rulesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rulesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exectime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="executionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="myMainportfolio" type="{http://RuleApp}portfolio" minOccurs="0"/>
 *         &lt;element name="mySecondaryportfolio" type="{http://RuleApp}portfolio" minOccurs="0"/>
 *         &lt;element name="outputString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="store" type="{http://RuleApp}store" minOccurs="0"/>
 *         &lt;element name="userdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rulesResult", propOrder = {
    "exectime",
    "executionId",
    "myMainportfolio",
    "mySecondaryportfolio",
    "outputString",
    "store",
    "userdata"
})
public class RulesResult {

    protected long exectime;
    protected String executionId;
    protected Portfolio myMainportfolio;
    protected Portfolio mySecondaryportfolio;
    protected String outputString;
    protected Store store;
    protected String userdata;

    /**
     * Gets the value of the exectime property.
     * 
     */
    public long getExectime() {
        return exectime;
    }

    /**
     * Sets the value of the exectime property.
     * 
     */
    public void setExectime(long value) {
        this.exectime = value;
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

    /**
     * Gets the value of the outputString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputString() {
        return outputString;
    }

    /**
     * Sets the value of the outputString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputString(String value) {
        this.outputString = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link Store }
     *     
     */
    public Store getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link Store }
     *     
     */
    public void setStore(Store value) {
        this.store = value;
    }

    /**
     * Gets the value of the userdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdata() {
        return userdata;
    }

    /**
     * Sets the value of the userdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdata(String value) {
        this.userdata = value;
    }

}
