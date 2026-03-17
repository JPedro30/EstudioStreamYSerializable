package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarUnObjeto {

    public DeserializarUnObjeto(){

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libro.dat"))) {

            Libro libro = (Libro) ois.readObject();
            System.out.println("Libro encontrado: "+libro);
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
