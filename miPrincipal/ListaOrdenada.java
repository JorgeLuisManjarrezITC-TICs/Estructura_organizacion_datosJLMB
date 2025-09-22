package miPrincipal;
public class ListaOrdenada{
    private Nodo cabeza;
    private int size;

    public ListaOrdenada() {
        this.cabeza = null;
        this.size = 0;
    }
   


    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null || cabeza.getDato() >= valor) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null && actual.getSiguiente().getValor() < valor) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
        size++;
    }

    public boolean eliminar(int valor) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getValor() == valor) {
            cabeza = cabeza.getSiguiente();
            size--;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && actual.getSiguiente().getValor() < valor) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() != null && actual.getSiguiente().getValor() == valor) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            size--;
            return true;
        }
        return false;
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null && actual.getValor() <= valor) {
            if (actual.getValor() == valor) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}