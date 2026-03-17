package stream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparAlumnosCurso {

    public AgruparAlumnosCurso(){

        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
        
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                        .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("Alumnos agrupados por curso:");
        alumnosPorCurso.forEach((curso, lista) -> {
            System.out.println(curso + ":");
                lista.forEach(System.out::println);
                    System.out.println("----------------------------------");
        });

    }
}
