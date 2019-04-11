
package api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obtenirProducteReturn" type="{http://api}Producte"/>
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
    "obtenirProducteReturn"
})
@XmlRootElement(name = "obtenirProducteResponse")
public class ObtenirProducteResponse {

    @XmlElement(required = true)
    protected Producte obtenirProducteReturn;

    /**
     * Gets the value of the obtenirProducteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Producte }
     *     
     */
    public Producte getObtenirProducteReturn() {
        return obtenirProducteReturn;
    }

    /**
     * Sets the value of the obtenirProducteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Producte }
     *     
     */
    public void setObtenirProducteReturn(Producte value) {
        this.obtenirProducteReturn = value;
    }

}
