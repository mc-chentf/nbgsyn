
package com.nbport.ediesb.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.0.9
 * 2016-07-25T17:03:01.576+08:00
 * Generated source version: 3.0.9
 * 
 */
public final class EDIESBServicePortType_EDIESBServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ediesb.nbport.com/", "EDIESBService");

    private EDIESBServicePortType_EDIESBServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EDIESBService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EDIESBService ss = new EDIESBService(wsdlURL, SERVICE_NAME);
        EDIESBServicePortType port = ss.getEDIESBServicePort();  
        
        {
        System.out.println("Invoking callEDIESBPub...");
        java.lang.String _callEDIESBPub_arg0 = "";
        java.lang.String _callEDIESBPub_arg1 = "";
        java.lang.String _callEDIESBPub_arg2 = "";
        java.lang.String _callEDIESBPub_arg3 = "";
        java.lang.String _callEDIESBPub_arg4 = "";
        java.lang.String _callEDIESBPub_arg5 = "";
        java.lang.String _callEDIESBPub__return = port.callEDIESBPub(_callEDIESBPub_arg0, _callEDIESBPub_arg1, _callEDIESBPub_arg2, _callEDIESBPub_arg3, _callEDIESBPub_arg4, _callEDIESBPub_arg5);
        System.out.println("callEDIESBPub.result=" + _callEDIESBPub__return);


        }
        {
        System.out.println("Invoking callEDIESB...");
        java.lang.String _callEDIESB_arg0 = "";
        java.lang.String _callEDIESB_arg1 = "";
        java.lang.String _callEDIESB_arg2 = "";
        java.lang.String _callEDIESB_arg3 = "";
        java.lang.String _callEDIESB_arg4 = "";
        java.lang.String _callEDIESB__return = port.callEDIESB(_callEDIESB_arg0, _callEDIESB_arg1, _callEDIESB_arg2, _callEDIESB_arg3, _callEDIESB_arg4);
        System.out.println("callEDIESB.result=" + _callEDIESB__return);


        }

        System.exit(0);
    }

}
