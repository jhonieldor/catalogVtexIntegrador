
package br.com.ultra.integrador.catalogVtex;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://webservice-emporiopalotina.vtexcommerce.com.br/service.svc?wsdl")
public class Service
    extends javax.xml.ws.Service
{

    private final static URL SERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICE_EXCEPTION;
    private final static QName SERVICE_QNAME = new QName("http://tempuri.org/", "Service");

    static {
        Config config = new Config().getConfig();
        Authenticator myAuth = new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(config.getUsername(), config.getPassword().toCharArray());
            }
        };

        Authenticator.setDefault(myAuth);
        
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(config.getWsdlURL());
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE_WSDL_LOCATION = url;
        SERVICE_EXCEPTION = e;
    }

    public Service() {
        super(__getWsdlLocation(), SERVICE_QNAME);
    }

    public Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE_QNAME, features);
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE_QNAME);
    }

    public Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE_QNAME, features);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "BasicHttpBinding_IService")
    public IService getBasicHttpBindingIService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService"), IService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "BasicHttpBinding_IService")
    public IService getBasicHttpBindingIService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService"), IService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE_EXCEPTION!= null) {
            throw SERVICE_EXCEPTION;
        }
        return SERVICE_WSDL_LOCATION;
    }

}
