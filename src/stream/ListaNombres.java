package stream;
import java.util.List;
import java.util.stream.Collectors;

public class ListaNombres {

    public ListaNombres(){

    List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

    List<String> nombres = alumnos.stream()
                    .map(Alumno::getNombre)
                    .collect(Collectors.toList());

    System.out.println("Lista de nombres de alumnos:");

    nombres.forEach(System.out::println);

    }

}
