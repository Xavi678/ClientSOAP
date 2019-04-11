
package api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServeiCarroService", targetNamespace = "http://api", wsdlLocation = "http://localhost:8080/ServeiSOAP/services/ServeiCarro?wsdl")
public class ServeiCarroService
    extends Service
{

    private final static URL SERVEICARROSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVEICARROSERVICE_EXCEPTION;
    private final static QName SERVEICARROSERVICE_QNAME = new QName("http://api", "ServeiCarroService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServeiSOAP/services/ServeiCarro?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVEICARROSERVICE_WSDL_LOCATION = url;
        SERVEICARROSERVICE_EXCEPTION = e;
    }

    public ServeiCarroService() {
        super(__getWsdlLocation(), SERVEICARROSERVICE_QNAME);
    }

    public ServeiCarroService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVEICARROSERVICE_QNAME, features);
    }

    public ServeiCarroService(URL wsdlLocation) {
        super(wsdlLocation, SERVEICARROSERVICE_QNAME);
    }

    public ServeiCarroService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVEICARROSERVICE_QNAME, features);
    }

    public ServeiCarroService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServeiCarroService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServeiCarro
     */
    @WebEndpoint(name = "ServeiCarro")
    public ServeiCarro getServeiCarro() {
        return super.getPort(new QName("http://api", "ServeiCarro"), ServeiCarro.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServeiCarro
     */
    @WebEndpoint(name = "ServeiCarro")
    public ServeiCarro getServeiCarro(WebServiceFeature... features) {
        return super.getPort(new QName("http://api", "ServeiCarro"), ServeiCarro.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVEICARROSERVICE_EXCEPTION!= null) {
            throw SERVEICARROSERVICE_EXCEPTION;
        }
        return SERVEICARROSERVICE_WSDL_LOCATION;
    }

}