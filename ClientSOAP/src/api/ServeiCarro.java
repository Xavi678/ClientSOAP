
package api;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServeiCarro", targetNamespace = "http://api")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServeiCarro {


    /**
     * 
     * @param passwd
     * @param nom
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "autenticarReturn", targetNamespace = "http://api")
    @RequestWrapper(localName = "autenticar", targetNamespace = "http://api", className = "api.Autenticar")
    @ResponseWrapper(localName = "autenticarResponse", targetNamespace = "http://api", className = "api.AutenticarResponse")
    public String autenticar(
        @WebParam(name = "nom", targetNamespace = "http://api")
        String nom,
        @WebParam(name = "passwd", targetNamespace = "http://api")
        String passwd);

    /**
     * 
     * @param user
     * @param producte
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "afegirProducteReturn", targetNamespace = "http://api")
    @RequestWrapper(localName = "afegirProducte", targetNamespace = "http://api", className = "api.AfegirProducte")
    @ResponseWrapper(localName = "afegirProducteResponse", targetNamespace = "http://api", className = "api.AfegirProducteResponse")
    public boolean afegirProducte(
        @WebParam(name = "user", targetNamespace = "http://api")
        String user,
        @WebParam(name = "producte", targetNamespace = "http://api")
        Producte producte);

    /**
     * 
     * @param product
     * @param user
     * @return
     *     returns api.Producte
     */
    @WebMethod
    @WebResult(name = "obtenirProducteReturn", targetNamespace = "http://api")
    @RequestWrapper(localName = "obtenirProducte", targetNamespace = "http://api", className = "api.ObtenirProducte")
    @ResponseWrapper(localName = "obtenirProducteResponse", targetNamespace = "http://api", className = "api.ObtenirProducteResponse")
    public Producte obtenirProducte(
        @WebParam(name = "user", targetNamespace = "http://api")
        String user,
        @WebParam(name = "product", targetNamespace = "http://api")
        String product);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<api.Producte>
     */
    @WebMethod
    @WebResult(name = "obtenirProductesReturn", targetNamespace = "http://api")
    @RequestWrapper(localName = "obtenirProductes", targetNamespace = "http://api", className = "api.ObtenirProductes")
    @ResponseWrapper(localName = "obtenirProductesResponse", targetNamespace = "http://api", className = "api.ObtenirProductesResponse")
    public List<Producte> obtenirProductes(
        @WebParam(name = "user", targetNamespace = "http://api")
        String user);

    /**
     * 
     * @param inici
     * @param fi
     * @param user
     * @return
     *     returns java.util.List<api.Producte>
     */
    @WebMethod
    @WebResult(name = "otenirProductesperDataReturn", targetNamespace = "http://api")
    @RequestWrapper(localName = "otenirProductesperData", targetNamespace = "http://api", className = "api.OtenirProductesperData")
    @ResponseWrapper(localName = "otenirProductesperDataResponse", targetNamespace = "http://api", className = "api.OtenirProductesperDataResponse")
    public List<Producte> otenirProductesperData(
        @WebParam(name = "user", targetNamespace = "http://api")
        String user,
        @WebParam(name = "inici", targetNamespace = "http://api")
        String inici,
        @WebParam(name = "fi", targetNamespace = "http://api")
        String fi);

}
