
package api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Producte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the data property.
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
     * Sets the value of the data property.
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
     * Gets the value of the dataFi property.
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
     * Sets the value of the dataFi property.
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
     * Gets the value of the descripcio property.
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
     * Sets the value of the descripcio property.
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
     * Gets the value of the disponibilitat property.
     * 
     */
    public int getDisponibilitat() {
        return disponibilitat;
    }

    /**
     * Sets the value of the disponibilitat property.
     * 
     */
    public void setDisponibilitat(int value) {
        this.disponibilitat = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nom property.
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
     * Sets the value of the nom property.
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
     * Gets the value of the preu property.
     * 
     */
    public int getPreu() {
        return preu;
    }

    /**
     * Sets the value of the preu property.
     * 
     */
    public void setPreu(int value) {
        this.preu = value;
    }

    /**
     * Gets the value of the propietari property.
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
     * Sets the value of the propietari property.
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
     * Gets the value of the venuts property.
     * 
     */
    public int getVenuts() {
        return venuts;
    }

    /**
     * Sets the value of the venuts property.
     * 
     */
    public void setVenuts(int value) {
        this.venuts = value;
    }

}
