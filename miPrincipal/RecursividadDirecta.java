package miPrincipal;

public class RecursividadDirecta{
    public static void main(String[] args){
        int n = 5;
        System.out.println("la suma de los primeros " + n + " numeros es: " + suma(n));
        System.out.println("el factrorial de " + n + " es: " + factorial(n));
        System.out.println("El resultado de " + n + " elevado a la 2 es: "+ potencia(n, 2));
        System.out.println("El numero fibonacci en la posicion " + n + " es: " + fibonacci(n));
        imprimir(10);

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
        if (n==1){
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

    //metodo recursivo para imprimir 10 veces hola
    public static void imprimir(int n){
        if (n==0){
            System.out.println("hola");
        }else{
            System.out.println("hola");
            imprimir(n-1);
        }
    }
    }

