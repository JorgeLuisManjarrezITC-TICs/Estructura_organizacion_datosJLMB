package miPrincipal;
import java.util.*;

public class ExamenUII {
    public static void main(String[] args){
        /*
         * El proyecto utiliza una estructura de datos para almacenar las calificaciones de un grupo de estudiantes.
        · Permite ingresar calificaciones de manera secuencial.
        · Realiza operaciones básicas de análisis como:
        o Suma de todas las calificaciones.
        o Cálculo del promedio general.
        o Identificación de la calificación máxima y mínima.
        o Conteo de aprobados y reprobados según un umbral establecido (>=70 aprobado).
        o mostrar las calificaciones en para visualizar de menor a mayor.
         */
        EvaluacionExamenes calificaciones = new EvaluacionExamenes();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones de los estudiantes:");
        int cantidad = 10;  
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            int calificacion = leer.nextInt();
            calificaciones.ingresarCalificacion(calificacion);
        }

        System.out.println("\n--- Resultados ---");
        calificaciones.mostrarResultados();
    }

}
    

