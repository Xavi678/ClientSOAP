
package api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Producte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Producte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataFi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disponibilitat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="propietari" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="venuts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producte", propOrder = {
    "data",
    "dataFi",
    "descripcio",
    "disponibilitat",
    "id",
    "nom",
    "preu",
    "propietari",
    "venuts"
})
public class Producte {

    @XmlElement(required = true, nillable = true)
    protected String data;
    @XmlElement(required = true, nillable = true)
    protected String dataFi;
    @XmlElement(required = true, nillable = true)
    protected String descripcio;
    protected int disponibilitat;
    protected int id;
    @XmlElement(required = true, nillable = true)
    protected String nom;
    protected int preu;
    @XmlElement(required = true, nillable = true)
    protected String propietari;
    protected int venuts;

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad dataFi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFi() {
        return dataFi;
    }

    /**
     * Define el valor de la propiedad dataFi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFi(String value) {
        this.dataFi = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Define el valor de la propiedad descripcio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcio(String value) {
        this.descripcio = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilitat.
     * 
     */
    public int getDisponibilitat() {
        return disponibilitat;
    }

    /**
     * Define el valor de la propiedad disponibilitat.
     * 
     */
    public void setDisponibilitat(int value) {
        this.disponibilitat = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Define el valor de la propiedad nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtiene el valor de la propiedad preu.
     * 
     */
    public int getPreu() {
        return preu;
    }

    /**
     * Define el valor de la propiedad preu.
     * 
     */
    public void setPreu(int value) {
        this.preu = value;
    }

    /**
     * Obtiene el valor de la propiedad propietari.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropietari() {
        return propietari;
    }

    /**
     * Define el valor de la propiedad propietari.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropietari(String value) {
        this.propietari = value;
    }

    /**
     * Obtiene el valor de la propiedad venuts.
     * 
     */
    public int getVenuts() {
        return venuts;
    }

    /**
     * Define el valor de la propiedad venuts.
     * 
     */
    public void setVenuts(int value) {
        this.venuts = value;
    }

}
