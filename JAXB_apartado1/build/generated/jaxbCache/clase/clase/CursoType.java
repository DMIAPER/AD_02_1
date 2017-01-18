//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.12.22 a las 10:39:37 AM CET 
//


package clase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CursoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CursoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profesor" type="{}DatosProf"/>
 *         &lt;element ref="{}comentario" minOccurs="0"/>
 *         &lt;element name="alumnos" type="{}alumnos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CursoType", propOrder = {
    "profesor",
    "comentario",
    "alumnos"
})
public class CursoType {

    @XmlElement(required = true)
    protected DatosProf profesor;
    protected String comentario;
    @XmlElement(required = true)
    protected Alumnos alumnos;

    /**
     * Obtiene el valor de la propiedad profesor.
     * 
     * @return
     *     possible object is
     *     {@link DatosProf }
     *     
     */
    public DatosProf getProfesor() {
        return profesor;
    }

    /**
     * Define el valor de la propiedad profesor.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosProf }
     *     
     */
    public void setProfesor(DatosProf value) {
        this.profesor = value;
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
     * Obtiene el valor de la propiedad alumnos.
     * 
     * @return
     *     possible object is
     *     {@link Alumnos }
     *     
     */
    public Alumnos getAlumnos() {
        return alumnos;
    }

    /**
     * Define el valor de la propiedad alumnos.
     * 
     * @param value
     *     allowed object is
     *     {@link Alumnos }
     *     
     */
    public void setAlumnos(Alumnos value) {
        this.alumnos = value;
    }

}
