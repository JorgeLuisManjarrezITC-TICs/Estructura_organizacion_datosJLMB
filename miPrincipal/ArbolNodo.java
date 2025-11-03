package miPrincipal;

public class ArbolNodo<T extends Comparable<T>> {
    private T dato;        // Dato que almacena el nodo (genérico, pero debe ser comparable)
    private Nodo<T> izquierdo;  // Hijo izquierdo
    private Nodo<T> derecho;    // Hijo derecho

    // Constructor
    public ArbolNodo(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Métodos de acceso (getters y setters)
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo<T> derecho) {
        this.derecho = derecho;
    }

    // Método para obtener el valor como entero (en caso de que T sea Integer)
    public int getValor() {
        return (Integer) dato; // Asumimos que el tipo es Integer para este caso
    }

    // Método para mostrar el dato del nodo
    public void mostrar() {
        System.out.println(dato);
    }
}
