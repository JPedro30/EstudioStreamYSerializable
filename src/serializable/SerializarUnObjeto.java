package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarUnObjeto {

    public SerializarUnObjeto(){

        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Libro.dat"))) {

            oos.writeObject(libro);
            System.out.println("Libro serializado y guardado con exito...");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
