package miPrincipal;

public class Principal {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>(8);

        pila.Insertar("Uno");
        pila.Insertar("Dos");
        pila.Insertar("Tres");

        System.out.println("Contenido de la pila:");
        pila.Mostrar();

        System.out.println("Elemento retirado: " + pila.Retirar());

        System.out.println("Contenido de la pila después de retirar:");
        pila.Mostrar();

        Cola<Object> cola = new Cola<>(5);
        cola.insertar("jose");
        cola.insertar(10.0);
        cola.insertar(20.0);
        cola.insertar(30.0);

        cola.mostrar(); 

        cola.eliminar();
        cola.eliminar();
        cola.mostrar(); 
        cola.insertar("jano");
        cola.insertar("memo");
        cola.mostrar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar(); 


    }
}
