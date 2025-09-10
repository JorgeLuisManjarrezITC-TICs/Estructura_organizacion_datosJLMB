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

}