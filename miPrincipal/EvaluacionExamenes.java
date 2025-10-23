package miPrincipal;
import java.util.*;

public class EvaluacionExamenes {

    private ListaOrdenada listaCalificaciones;

    public EvaluacionExamenes() {
        listaCalificaciones = new ListaOrdenada();
    }

   
    public void ingresarCalificacion(int calificacion) {
        listaCalificaciones.insertar(calificacion);
    }


    public int sumaRecursiva(Nodo nodo) {
        if (nodo == null) return 0;
        return nodo.getValor() + sumaRecursiva(nodo.getSiguiente());
    }

    public double promedio() {
        if (listaCalificaciones.getSize() == 0) return 0;
        return (double) sumaRecursiva(listaCalificaciones.getCabeza()) / listaCalificaciones.getSize();
    }


    public int maximoRecursivo(Nodo nodo, int maxActual) {
        if (nodo == null) return maxActual;
        return maximoRecursivo(nodo.getSiguiente(), Math.max(maxActual, nodo.getValor()));
    }

    public int minimoRecursivo(Nodo nodo, int minActual) {
        if (nodo == null) return minActual;
        return minimoRecursivo(nodo.getSiguiente(), Math.min(minActual, nodo.getValor()));
    }

    public int contarAprobados(Nodo nodo) {
        if (nodo == null) return 0;
        return (nodo.getValor() >= 70 ? 1 : 0) + contarAprobados(nodo.getSiguiente());
    }

    public int contarReprobados(Nodo nodo) {
        if (nodo == null) return 0;
        return (nodo.getValor() < 70 ? 1 : 0) + contarReprobados(nodo.getSiguiente());
    }

    public void mostrarCalificaciones(Nodo nodo) {
        if (nodo == null) {
            System.out.println("Fin de la lista.");
            return;
        }
        System.out.print(nodo.getValor() + " ");
        mostrarCalificaciones(nodo.getSiguiente());
    }

    // Mostrar todos los resultados
    public void mostrarResultados() {
        System.out.println("Suma total: " + sumaRecursiva(listaCalificaciones.getCabeza()));
        System.out.printf("Promedio :" + promedio() + "\n");
        System.out.println("Calificación máxima: " + maximoRecursivo(listaCalificaciones.getCabeza(), Integer.MIN_VALUE));
        System.out.println("Calificación mínima: " + minimoRecursivo(listaCalificaciones.getCabeza(), Integer.MAX_VALUE));
        System.out.println("Aprobados (>=70): " + contarAprobados(listaCalificaciones.getCabeza()));
        System.out.println("Reprobados (<70): " + contarReprobados(listaCalificaciones.getCabeza()));
        System.out.print("Calificaciones ordenadas: ");
        mostrarCalificaciones(listaCalificaciones.getCabeza());
    }
}