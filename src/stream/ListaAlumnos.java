package stream;
import java.util.Arrays;
import java.util.List;

public class ListaAlumnos {

    public static List<Alumno> obtenerListaAlumnos() {
        return Arrays.asList(
            new Alumno("Ana", "1º DAM", 8.5),
            new Alumno("Pedro", "2º DAM", 5.3),
            new Alumno("Lucía", "1º DAW", 7.8),
            new Alumno("Carlos", "2º DAW", 6.9),
            new Alumno("Sofía", "1º DAM", 9.1),
            new Alumno("Juan", "2º DAW", 4.5)
        );
    }
}
