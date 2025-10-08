package miPrincipal;
import java.util.*;

public class Agenda{
       //este proyecto consiste en implementar una agenda digital donde el usuario
        //pueda registrar, buscar, modificar y eliminar contactos.
        //cada contacto debe tener un nombre, un número de teléfono y una dirección de correo electrónico
        //la lista se utilizara para almacenar  y recorrer los contactos de manera dinamica
        private ArrayList<Contacto> contactos;

        public Agenda(){
                contactos = new ArrayList<>();
        }

        public boolean agregarContacto(Contacto contacto){
            for (Contacto c : contactos) {
                if (c.getTelefono().equals(contacto.getTelefono())) {
                // Ya existe un contacto con ese número
                return false;
                }
        }
            contactos.add(contacto);
                return true;
        }

        public Contacto buscarContacto(String nombre) {
            for (Contacto c : contactos) {
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    return c;
                }
            }
            return null;
        }

    public boolean eliminarContacto(String nombre) {
        Contacto c = buscarContacto(nombre);
        if (c != null) {
            contactos.remove(c);
            return true;
        }
        return false;
    }

    public boolean modificarContacto(String nombre, String nuevoTelefono, String nuevoEmail) {
        Contacto c = buscarContacto(nombre);
        if (c != null) {
            c.setTelefono(nuevoTelefono);
            c.setEmail(nuevoEmail);
            return true;
        }
        return false;
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            for (Contacto c : contactos) {
                System.out.println(c);
            }
        }
    }
    
}