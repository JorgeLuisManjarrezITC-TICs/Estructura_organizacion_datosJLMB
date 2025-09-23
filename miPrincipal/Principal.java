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

        Cola<Object> cola = new Cola<>(8);
        cola.insertar("jose");
        cola.insertar(10.0);
        cola.insertar(20.0);
        cola.insertar(30.0);
        cola.mostrar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar(); 
        cola.insertar("jano");
        cola.mostrar();
        cola.insertar("jorge");
        cola.insertar("memo");
        cola.mostrar(); 

        Lista<Object> lista = new Lista<>(6);
        lista.insertarInicio("jano");
        lista.insertarInicio(10.0);
        lista.insertarInicio(20.0);
        lista.insertarFinal("jose");
        lista.insertarFinal("jorge");
        lista.mostrar();
        lista.retirarInicio();
        lista.mostrar();
        lista.retirarFin();
        lista.mostrar();


        System.out.println("------------------Lista Ordenada------------------");
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertar(5);
        listaOrdenada.insertar(2);
        listaOrdenada.insertar(5);
        listaOrdenada.mostrar();
        listaOrdenada.eliminar(5);
        listaOrdenada.mostrar();


    }
}
