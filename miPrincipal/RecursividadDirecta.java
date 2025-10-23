package miPrincipal;

public class RecursividadDirecta {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("La suma de los primeros " + n + " números es: " + suma(n));
        System.out.println("El factorial de " + n + " es: " + factorial(n));
        System.out.println("El resultado de " + n + " elevado a la 2 es: " + potencia(n, 2));
        System.out.println("El número Fibonacci en la posición " + n + " es: " + fibonacci(n));

        System.out.println("\nTabla de multiplicar del 7:");
        imprimir(7, 1);

        System.out.println("\nCadena invertida de 'Jorge Luis' es: " + invertir("Jorge Luis"));

        int[] numeros = {2, 4, 6, 8, 10};
        System.out.println("\nLa suma de los elementos del arreglo es: " + sumarArreglo(numeros, 0));

        int valor = 8;
        int posicion = buscarElemento(numeros, valor, 0);
        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + valor + " no se encontró en el arreglo");
        }

        int numero = 12345;
        System.out.println("\nEl número " + numero + " tiene " + contarDigitos(numero) + " dígitos");
    }

    // --------------------------------------------------------------------
    // Métodos Recursivos
    // --------------------------------------------------------------------

    // Sumar los primeros n números naturales
    public static int suma(int n) {
        if (n == 0) { // Caso base
            return 0;
        } else {      // Caso recursivo
            return n + suma(n - 1);
        }
    }

    // Calcular el factorial de un número
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Caso base
            return 1;
        } else {                // Caso recursivo
            return n * factorial(n - 1);
        }
    }

    // Calcular potencia (n^e)
    public static int potencia(int n, int e) {
        if (e == 0) { // Caso base
            return 1;
        } else {      // Caso recursivo
            return n * potencia(n, e - 1);
        }
    }

    // Serie de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // Casos base
            return n;
        } else {                // Caso recursivo
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Imprimir tabla de multiplicar de un número
    public static void imprimir(int n, int i) {
        if (i > 10) { // Caso base
            return;
        } else {
            System.out.println(n + " * " + i + " = " + (n * i));
            imprimir(n, i + 1); // Caso recursivo
        }
    }

    // Invertir una cadena
    public static String invertir(String cadena) {
        if (cadena.length() <= 1) { // Caso base
            return cadena;
        } else {                    // Caso recursivo
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

    // Sumar los elementos de un arreglo
    public static int sumarArreglo(int[] arreglo, int indice) {
        if (indice == arreglo.length) { // Caso base
            return 0;
        } else {                        // Caso recursivo
            return arreglo[indice] + sumarArreglo(arreglo, indice + 1);
        }
    }

    // Buscar un elemento en un arreglo
    public static int buscarElemento(int[] arreglo, int valorBuscado, int indice) {
        if (indice == arreglo.length) { // Caso base: no encontrado
            return -1;
        } else if (arreglo[indice] == valorBuscado) { // Caso base: encontrado
            return indice;
        } else { // Caso recursivo
            return buscarElemento(arreglo, valorBuscado, indice + 1);
        }
    }

    // Contar los dígitos de un número
    public static int contarDigitos(int n) {
        if (n < 0) n = -n; // Convertir a positivo si es necesario

        if (n < 10) { // Caso base
            return 1;
        } else {      // Caso recursivo
            return 1 + contarDigitos(n / 10);
        }
    }
}
