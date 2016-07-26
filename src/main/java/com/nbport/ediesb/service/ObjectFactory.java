
package com.nbport.ediesb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nbport.ediesb.service package. 
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

    private final static QName _CallEDIESBPub_QNAME = new QName("http://service.ediesb.nbport.com/", "callEDIESBPub");
    private final static QName _CallEDIESBPubResponse_QNAME = new QName("http://service.ediesb.nbport.com/", "callEDIESBPubResponse");
    private final static QName _CallEDIESB_QNAME = new QName("http://service.ediesb.nbport.com/", "callEDIESB");
    private final static QName _CallEDIESBResponse_QNAME = new QName("http://service.ediesb.nbport.com/", "callEDIESBResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nbport.ediesb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallEDIESBPub }
     * 
     */
    public CallEDIESBPub createCallEDIESBPub() {
        return new CallEDIESBPub();
    }

    /**
     * Create an instance of {@link CallEDIESBPubResponse }
     * 
     */
    public CallEDIESBPubResponse createCallEDIESBPubResponse() {
        return new CallEDIESBPubResponse();
    }

    /**
     * Create an instance of {@link CallEDIESB }
     * 
     */
    public CallEDIESB createCallEDIESB() {
        return new CallEDIESB();
    }

    /**
     * Create an instance of {@link CallEDIESBResponse }
     * 
     */
    public CallEDIESBResponse createCallEDIESBResponse() {
        return new CallEDIESBResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallEDIESBPub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ediesb.nbport.com/", name = "callEDIESBPub")
    public JAXBElement<CallEDIESBPub> createCallEDIESBPub(CallEDIESBPub value) {
        return new JAXBElement<CallEDIESBPub>(_CallEDIESBPub_QNAME, CallEDIESBPub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallEDIESBPubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ediesb.nbport.com/", name = "callEDIESBPubResponse")
    public JAXBElement<CallEDIESBPubResponse> createCallEDIESBPubResponse(CallEDIESBPubResponse value) {
        return new JAXBElement<CallEDIESBPubResponse>(_CallEDIESBPubResponse_QNAME, CallEDIESBPubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallEDIESB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ediesb.nbport.com/", name = "callEDIESB")
    public JAXBElement<CallEDIESB> createCallEDIESB(CallEDIESB value) {
        return new JAXBElement<CallEDIESB>(_CallEDIESB_QNAME, CallEDIESB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallEDIESBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ediesb.nbport.com/", name = "callEDIESBResponse")
    public JAXBElement<CallEDIESBResponse> createCallEDIESBResponse(CallEDIESBResponse value) {
        return new JAXBElement<CallEDIESBResponse>(_CallEDIESBResponse_QNAME, CallEDIESBResponse.class, null, value);
    }

}
