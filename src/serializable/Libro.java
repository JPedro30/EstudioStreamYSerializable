package serializable;

import java.io.Serializable;

public class Libro implements Serializable{

    private static final long serialVersionUID = 1L; // Versión de la clase
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + "', autor='" + autor + "'}";
    }

}
