//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantacion de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderan si se vuelve a compilar el esquema de origen. 
// Generado el: AM.12.22 a las 10:39:37 AM CET 
//


package clase;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alumnos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alumnos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alumno" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="edad">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;maxExclusive value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{}comentario" minOccurs="0"/>
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alumnos", propOrder = {
    "alumno"
})
public class Alumnos {

    @XmlElement(required = true)
    protected List<Alumnos.Alumno> alumno;

    /**
     * Gets the value of the alumno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alumno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlumno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alumnos.Alumno }
     * 
     * 
     */
    public List<Alumnos.Alumno> getAlumno() {
        if (alumno == null) {
            alumno = new ArrayList<Alumnos.Alumno>();
        }
        return this.alumno;
    }


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
     *         &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="edad">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;maxExclusive value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{}comentario" minOccurs="0"/>
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
        "nombreAlumno",
        "edad",
        "direccion",
        "comentario",
        "telefono"
    })
    public static class Alumno {

        @XmlElement(required = true)
        protected String nombreAlumno;
        protected int edad;
        @XmlElement(required = true)
        protected String direccion;
        protected String comentario;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger telefono;

        /**
         * Obtiene el valor de la propiedad nombreAlumno.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreAlumno() {
            return nombreAlumno;
        }

        /**
         * Define el valor de la propiedad nombreAlumno.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreAlumno(String value) {
            this.nombreAlumno = value;
        }

        /**
         * Obtiene el valor de la propiedad edad.
         * 
         */
        public int getEdad() {
            return edad;
        }

        /**
         * Define el valor de la propiedad edad.
         * 
         */
        public void setEdad(int value) {
            this.edad = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad comentario.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComentario() {
            return comentario;
        }

        /**
         * Define el valor de la propiedad comentario.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComentario(String value) {
            this.comentario = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTelefono(BigInteger value) {
            this.telefono = value;
        }

    }

}
