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

        cola.insertar(10.0);
        cola.insertar(20.0);
        cola.insertar(30.0);

        cola.mostrar(); // Cola: 10 20 30

        cola.eliminar();
        cola.mostrar(); // Cola: 20 30

        ColaCircular<Object> circular = new ColaCircular<>(4);

        circular.insertar("memo");
        circular.insertar("dos");
        circular.insertar(2);
        circular.insertar(4.8);

        circular.mostrar();
        circular.eliminar();
        circular.mostrar();
        circular.insertar("jano");
        circular.eliminar();
        circular.mostrar();
        circular.eliminar();
        circular.eliminar();
        circular.insertar("jose");
        circular.insertar(4);
        circular.mostrar();


    }
}
