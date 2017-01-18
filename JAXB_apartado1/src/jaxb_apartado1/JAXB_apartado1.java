/*
 *Clase creada por DMIAPER 22-12-2016
 */

package jaxb_apartado1;

import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import clase.* ;
import java.math.BigInteger;
import java.util.List;

public class JAXB_apartado1{

    public static void main(String[] args) {
        try {

            // Crear una instancia de la clase JAXBContext para
            // poder manipular las clases generadas en el paquete jaxb.clase
            // La clase JAXBContext proporciona a clase un punto de entrada a la API JAXB
            // Facilita una abstracción para manejar la información generada para
            // implementar las operaciones del JAXB binding framework como unmarshal y marshal
            // unmarshal: consiste en convertir datos XML en un árbol de objetos Java
            // marshal: consiste en convertir un árbol de objetos Java a datos XML
            JAXBContext jaxbContext = JAXBContext.newInstance("clase");

            // Crear un objeto de tipo Unmarshaller para convertir datos XML en un árbol de objetos Java
            Unmarshaller u = jaxbContext.createUnmarshaller();

            // La clase JAXBElement representa a un elemento de un documento XML
            // en este caso a un elemento del documento clase.xml
            JAXBElement jaxbElement = (JAXBElement) u.unmarshal(new FileInputStream("C:\\tarea02\\clase.xml"));

            // El método getValue() retorna el modelo de contenido (content model) y el valor de los atributos del elemento
            CursoType curso = (CursoType) jaxbElement.getValue();
   
            //Se obtine todos los alumnos con los atributos de los elmentos
            Alumnos alum =  curso.getAlumnos();
            //se crea una Lista para obtener el arbol de los alumnos
            List<Alumnos.Alumno> al = alum.getAlumno();
    
            //se crea un objeto alumno
            Alumnos.Alumno  alumno= new Alumnos.Alumno();
   
            //se introducen los datos del nuevo alumno en el objeto
            alumno.setNombreAlumno("Javier Cuersta");
            alumno.setEdad(25);
            alumno.setDireccion("Plaza España 21");
            alumno.setComentario("Alumno4");
            alumno.setTelefono(BigInteger.valueOf(965897874));
   
            //se añade al final de la lista el alumno creado
            al.add(alumno);
   
   
            // Crear un objeto de tipo Marshaller para posteriormente convertir un
            // el árbol de objetos Java a datos XML
            Marshaller m = jaxbContext.createMarshaller();

            // El método setProperty(String nombrePropiedad, Object value) recibe en este
            // caso la propiedad "jaxb.formatted.output". Esta propiedad controla si al
            // realizar un marshal, debe formatear el resultado XML con saltos de linea
            // e indentaciones para que las personas podamos leerlo cómodamente. Por defecto
            // su valor es falso es decir el XML creado no está formateado
            // El argumento value en este caso tiene que ser concretamente de tipo Boolean
            // para indicar si queremos que el resultado XML esté formateado o no
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // El método marshall(Object elementoJAXB, OutputStream os) recibe un objeto
            // de tipo JAXBElement para que su contenido lo muestre en la salida estándar
            // debido a que este método está sobrecargo, si miramos la documentación de
            //la API podemos ver como podemos mostrar o escribir el resultado XML de
            //diferentes maneras
            m.marshal(jaxbElement, System.out);
  
        } catch (JAXBException je) {
            System.out.println(je.getCause()) ;
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
