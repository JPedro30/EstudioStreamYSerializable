package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContarAlumnosCurso {

    public ContarAlumnosCurso(){

        List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

        Map<String, Long> alumnosPorCurso = alumnos.parallelStream() // utiliza distintos hilos para hacer la lectura
            .collect(Collectors.groupingBy(Alumno::getCurso, Collectors.counting()));

        System.out.println(alumnosPorCurso);

    }

}
