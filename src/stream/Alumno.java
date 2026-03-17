package stream;
public class Alumno {

    private String nombre;
    private String curso;
    private double notaMedia;

    public Alumno(String nombre, String curso, double notaMedia) {
        this.nombre = nombre;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getNombre() { 
        return nombre; 
    }

    public String getCurso() {
        return curso; 
    }

    public double getNotaMedia() {
        return notaMedia; 
    }

    @Override
    public String toString() {
    return nombre + " - " + curso + " - Nota Media: " + notaMedia;
    }
}
