//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.12.22 a las 10:39:37 AM CET 
//


package clase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clase package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Curso_QNAME = new QName("", "curso");
    private final static QName _Comentario_QNAME = new QName("", "comentario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alumnos }
     * 
     */
    public Alumnos createAlumnos() {
        return new Alumnos();
    }

    /**
     * Create an instance of {@link CursoType }
     * 
     */
    public CursoType createCursoType() {
        return new CursoType();
    }

    /**
     * Create an instance of {@link DatosProf }
     * 
     */
    public DatosProf createDatosProf() {
        return new DatosProf();
    }

    /**
     * Create an instance of {@link Alumnos.Alumno }
     * 
     */
    public Alumnos.Alumno createAlumnosAlumno() {
        return new Alumnos.Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "curso")
    public JAXBElement<CursoType> createCurso(CursoType value) {
        return new JAXBElement<CursoType>(_Curso_QNAME, CursoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comentario")
    public JAXBElement<String> createComentario(String value) {
        return new JAXBElement<String>(_Comentario_QNAME, String.class, null, value);
    }

}
