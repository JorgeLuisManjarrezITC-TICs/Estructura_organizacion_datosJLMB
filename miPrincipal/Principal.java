package miPrincipal;
import java.util.*;

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
        listaOrdenada.insertar(8);
        listaOrdenada.insertar(1);
        listaOrdenada.insertar(3);
        listaOrdenada.mostrar();
        System.out.println(listaOrdenada.buscar(8));
        System.out.println(listaOrdenada.buscar(10));
        listaOrdenada.mostrar();
        listaOrdenada.insertar(2);
        listaOrdenada.mostrar();
        listaOrdenada.eliminar(3);
        listaOrdenada.eliminar(1);
        listaOrdenada.mostrar();
        listaOrdenada.eliminar(8);
        listaOrdenada.mostrar();
        listaOrdenada.eliminar(2);
        listaOrdenada.mostrar();
        listaOrdenada.eliminar(5);
        listaOrdenada.mostrar();


        //menu de agenda
        Scanner leer = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do{
            System.out.println("-----Menu de Agenda-----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine(); //limpiar buffer

            switch(opcion){
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = leer.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = leer.nextLine();
                    System.out.print("Email: ");
                    String email = leer.nextLine();
                    Contacto nuevo = new Contacto(nombre, telefono, email);
                    if (agenda.agregarContacto(nuevo)) {
                    System.out.println("Contacto agregado.");
                    } else {
                    System.out.println("Error: Ya existe un contacto con ese número de teléfono.");
                    }
                    break;
                case 2:
                    System.out.print("Nombre del contacto a buscar: ");
                    nombre = leer.nextLine();
                    Contacto c = agenda.buscarContacto(nombre);
                    if (c != null) {
                        System.out.println("Contacto encontrado: " + c);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del contacto a modificar: ");
                    nombre = leer.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    telefono = leer.nextLine();
                    System.out.print("Nuevo email: ");
                    email = leer.nextLine();
                    if (agenda.modificarContacto(nombre, telefono, email)) {
                        System.out.println("Contacto modificado.");
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nombre del contacto a eliminar: ");
                    nombre = leer.nextLine();
                    if (agenda.eliminarContacto(nombre)) {
                        System.out.println("Contacto eliminado.");
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 5:
                    agenda.mostrarContactos();
                    break;
                case 0: 
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");    
            }
        } while (opcion !=0);
        leer.close();


    }
}
