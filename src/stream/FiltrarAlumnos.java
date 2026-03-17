package stream;
import java.util.List;

public class FiltrarAlumnos {

    public FiltrarAlumnos(){

        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

        System.out.println("Alumnos con nota superior a 7:");

        alumnos.stream()
            .filter(alumno -> alumno.getNotaMedia() > 7)
            .forEach(System.out::println);
    }
}
