package miPrincipal;

public class RecursividadDirecta{
    public static void main(String[] args){
        int n = 5;
        System.out.println("la suma de los primeros " + n + " numeros es: " + suma(n));
        System.out.println("el factrorial de " + n + " es: " + factorial(n));
        System.out.println("El resultado de " + n + " elevado a la 2 es: "+ potencia(n, 2));
        System.out.println("El numero fibonacci en la posicion " + n + " es: " + fibonacci(n));
        imprimir(7, 1);

        System.out.println("Cadena invertida de 'Jorge Luis' es: " + invertir("Jorge Luis"));

        int[] numeros = {2, 4, 6, 8, 10};
        System.out.println("La suma de los elementos del arreglo es: " + sumarArreglo(numeros, 0));
        
        int valor = 8;
        int posicion = buscarElemento(numeros, valor, 0);
        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + valor + " no se encontró en el arreglo");
        }
        
        int numero = 12345;
            System.out.println("El número " + numero + " tiene " + contarDigitos(numero) + " dígitos");

    }

        

    

    public static int suma (int n){
        //caso base
        if (n==0){
            return 0;
        }
        //caso recursivo
        else{
            return n + suma(n-1);
    }
}

    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n* factorial(n-1);
        }
    }

    public static int potencia(int n, int e){
        if (e==0){
            return 1;

        }else{
            return n* potencia(n, e-1);
        }

    }

    //metodo fibonacci
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    //metodo recursivo para imprimir una tabla de multiplicar
    public static void imprimir(int n, int i){
        if (i>10){
            return;
        }else{
            System.out.println(n + " * " + i + " = " + (n*i));
            imprimir(n, i+1);
        }
       
    }

    //invertir cadena recursivamente
    public static String invertir(String cadena) {
    if (cadena.length() <= 1) {
        return cadena;
    } else {
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
}

    //sumar los elementos de un arreglo recursivamente
    public static int sumarArreglo(int[] arreglo, int indice) {
    if (indice == arreglo.length) {
        return 0; // Caso base: llegamos al final
    } else {
        return arreglo[indice] + sumarArreglo(arreglo, indice + 1);
    }
    }

    //Buscar un elemento en un arreglo recursivamente
    public static int buscarElemento(int[] arreglo, int valorBuscado, int indice) 
    {
    if (indice == arreglo.length) {
        return -1; // Caso base: no encontrado
    } else if (arreglo[indice] == valorBuscado) {
        return indice; // Caso base: encontrado
    } else {
        return buscarElemento(arreglo, valorBuscado, indice + 1); // Caso recursivo
    }
    }

    public static int contarDigitos(int n) {
    if (n < 10 && n >= 0) {
        return 1; // Caso base: solo un dígito
    } else {
        return 1 + contarDigitos(n / 10); // Caso recursivo
    }
}




}









