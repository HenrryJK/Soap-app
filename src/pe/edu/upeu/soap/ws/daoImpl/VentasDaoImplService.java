
package pe.edu.upeu.soap.ws.daoImpl;

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
@WebServiceClient(name = "VentasDaoImplService", targetNamespace = "http://daoImpl.ws.soap.upeu.edu.pe/", wsdlLocation = "http://localhost:3131/soap/ventas/id?wsdl")
public class VentasDaoImplService
    extends Service
{

    private final static URL VENTASDAOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENTASDAOIMPLSERVICE_EXCEPTION;
    private final static QName VENTASDAOIMPLSERVICE_QNAME = new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "VentasDaoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:3131/soap/ventas/id?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENTASDAOIMPLSERVICE_WSDL_LOCATION = url;
        VENTASDAOIMPLSERVICE_EXCEPTION = e;
    }

    public VentasDaoImplService() {
        super(__getWsdlLocation(), VENTASDAOIMPLSERVICE_QNAME);
    }

    public VentasDaoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENTASDAOIMPLSERVICE_QNAME, features);
    }

    public VentasDaoImplService(URL wsdlLocation) {
        super(wsdlLocation, VENTASDAOIMPLSERVICE_QNAME);
    }

    public VentasDaoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENTASDAOIMPLSERVICE_QNAME, features);
    }

    public VentasDaoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VentasDaoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VentasDao
     */
    @WebEndpoint(name = "VentasDaoImplPort")
    public VentasDao getVentasDaoImplPort() {
        return super.getPort(new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "VentasDaoImplPort"), VentasDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VentasDao
     */
    @WebEndpoint(name = "VentasDaoImplPort")
    public VentasDao getVentasDaoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "VentasDaoImplPort"), VentasDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENTASDAOIMPLSERVICE_EXCEPTION!= null) {
            throw VENTASDAOIMPLSERVICE_EXCEPTION;
        }
        return VENTASDAOIMPLSERVICE_WSDL_LOCATION;
    }

}
