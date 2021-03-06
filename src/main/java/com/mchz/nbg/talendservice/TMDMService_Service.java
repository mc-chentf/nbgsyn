package com.mchz.nbg.talendservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-05-18T14:28:43.130+08:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "TMDMService", 
                  wsdlLocation = "file:/d:/talend/soap.wsdl",
                  targetNamespace = "http://www.talend.com/mdm") 
public class TMDMService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.talend.com/mdm", "TMDMService");
    public final static QName TMDMPort = new QName("http://www.talend.com/mdm", "TMDMPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/c:/talend/soap.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TMDMService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/d:/talend/soap.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TMDMService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TMDMService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TMDMService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TMDMService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TMDMService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TMDMService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns TMDMService
     */
    @WebEndpoint(name = "TMDMPort")
    public TMDMService getTMDMPort() {
        return super.getPort(TMDMPort, TMDMService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TMDMService
     */
    @WebEndpoint(name = "TMDMPort")
    public TMDMService getTMDMPort(WebServiceFeature... features) {
        return super.getPort(TMDMPort, TMDMService.class, features);
    }

}
