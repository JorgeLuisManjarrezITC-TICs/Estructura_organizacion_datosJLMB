package miPrincipal;

public class Lista<T> {
    Nodo inicio;
    Nodo fin;

    public boolean listaVacia(){
        return (inicio == null && fin == null);
    }

    public void insertarInicio(T elemento){
        Nodo nodo = new Nodo(elemento);
        if(listaVacia()){
            inicio = nodo;
            fin = nodo;
        }
        nodo.setSig(inicio);
        inicio = nodo;
    }
    public void insertarFinal(T elemento){
        Nodo nodo = new Nodo(elemento);
        if(listaVacia()){
            inicio = nodo;
            fin = nodo;
        }
        fin.setSig(nodo);
        fin = nodo;
        }
    public Nodo retirarInicio(){
        Nodo aux;
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
    public Nodo retirarFin(){
            Nodo aux = inicio;
            while(aux.getSig()!=fin){
                System.out.println(aux);
                aux = aux.getSig();
            }
            fin = aux;
            aux = aux.getSig();
            fin.setSig(null);
            return aux;
    }
    public mostrar(){
        nodo aux = inicio;
        while(aux != null){
            aux.mostrar();
            aux = aux.sig;
    }
}
}