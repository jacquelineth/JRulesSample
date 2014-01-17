
package RuleApp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the RuleApp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rules_QNAME = new QName("http://RuleApp", "Rules");
    private final static QName _RulesResponse_QNAME = new QName("http://RuleApp/", "RulesResponse");
    private final static QName _RulesetExecutionException_QNAME = new QName("http://RuleApp", "RulesetExecutionException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: RuleApp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link RulesResult }
     * 
     */
    public RulesResult createRulesResult() {
        return new RulesResult();
    }

    /**
     * Create an instance of {@link Portfolio }
     * 
     */
    public Portfolio createPortfolio() {
        return new Portfolio();
    }

    /**
     * Create an instance of {@link RulesetExecutionException }
     * 
     */
    public RulesetExecutionException createRulesetExecutionException() {
        return new RulesetExecutionException();
    }

    /**
     * Create an instance of {@link RulesRequest }
     * 
     */
    public RulesRequest createRulesRequest() {
        return new RulesRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RuleApp", name = "Rules")
    public JAXBElement<RulesRequest> createRules(RulesRequest value) {
        return new JAXBElement<RulesRequest>(_Rules_QNAME, RulesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RuleApp/", name = "RulesResponse")
    public JAXBElement<RulesResult> createRulesResponse(RulesResult value) {
        return new JAXBElement<RulesResult>(_RulesResponse_QNAME, RulesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesetExecutionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RuleApp", name = "RulesetExecutionException")
    public JAXBElement<RulesetExecutionException> createRulesetExecutionException(RulesetExecutionException value) {
        return new JAXBElement<RulesetExecutionException>(_RulesetExecutionException_QNAME, RulesetExecutionException.class, null, value);
    }

}
