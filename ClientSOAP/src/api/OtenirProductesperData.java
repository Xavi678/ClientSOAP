
package api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inici" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "inici",
    "fi"
})
@XmlRootElement(name = "otenirProductesperData")
public class OtenirProductesperData {

    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String inici;
    @XmlElement(required = true)
    protected String fi;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad inici.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInici() {
        return inici;
    }

    /**
     * Define el valor de la propiedad inici.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInici(String value) {
        this.inici = value;
    }

    /**
     * Obtiene el valor de la propiedad fi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFi() {
        return fi;
    }

    /**
     * Define el valor de la propiedad fi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFi(String value) {
        this.fi = value;
    }

}
