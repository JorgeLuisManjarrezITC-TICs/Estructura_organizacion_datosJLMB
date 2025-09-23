package miPrincipal;

public class Nodo<T>{
    private T dato;
    private Nodo sig;

    public Nodo(T dato){
        this.dato = dato;
    }

    public T getDato(){
        return dato;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    public Nodo getSig(){
        return this.sig;
    }
    public void setSig(Nodo sig){
        this.sig = sig;
    }

    // Métodos compatibles con ListaOrdenada.java
    public int getValor() {
        return (Integer) dato;
    }

    public Nodo getSiguiente() {
        return sig;
    }

    public void setSiguiente(Nodo siguiente) {
        this.sig = siguiente;
    }

    public void mostrar() {
        System.out.println(dato);
    }


}