package miPrincipal;


public class Lista<T> {
    Nodo<T> inicio;
    Nodo<T> fin;

    public Lista(int capacidad) {
        // Si necesitas usar la capacidad, agrégala como campo y úsala aquí
    }

    public boolean listaVacia(){
        return (inicio == null && fin == null);
    }

    public void insertarInicio(T elemento){
        Nodo<T> nodo = new Nodo<>(elemento);
        if(listaVacia()){
            inicio = nodo;
            fin = nodo;
        }
        nodo.setSig(inicio);
        inicio = nodo;
    }
    public void insertarFinal(T elemento){
        Nodo<T> nodo = new Nodo<>(elemento);
        if(listaVacia()){
            inicio = nodo;
            fin = nodo;
        }
        fin.setSig(nodo);
        fin = nodo;
    }
    public Nodo<T> retirarInicio(){
        Nodo<T> aux;
        if(!listaVacia()){
            aux = inicio;
            if(inicio == fin) {
                inicio = null;
                fin = null;
            }else{
                inicio = inicio.getSig();
                aux.setSig(null);
            }
            return aux;
        }else
            return null;
    }
    public Nodo<T> retirarFin(){
        Nodo<T> aux = inicio;
        while(aux.getSig()!=fin){
            aux = aux.getSig();
        }
        fin = aux;
        aux = aux.getSig();
        fin.setSig(null);
        return aux;
    }
    public void mostrar(){
        Nodo<T> aux = inicio;
        while(aux != null){
            aux.mostrar();
            aux = aux.getSig();
        }
    }
}