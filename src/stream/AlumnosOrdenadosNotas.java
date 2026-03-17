package stream;
import java.util.Comparator;
import java.util.List;

public class AlumnosOrdenadosNotas {

    public AlumnosOrdenadosNotas(){

        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

        System.out.println("Alumnos ordenados por nota (descendente):");

        alumnos.stream()
            .sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed())
            .forEach(System.out::println);

    }

}
