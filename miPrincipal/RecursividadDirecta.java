package miPrincipal;

public class RecursividadDirecta{
    public static void main(String[] args){
        int n = 5;
        System.out.println("la suma de los primeros " + n + " numeros es: " + suma(n));

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
}