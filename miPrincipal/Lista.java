package miPrincipal;

public class Lista<T> {
    Nodo inicio;
    Nodo fin;
    int tamanio;

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
        tamanio++;
    }
    public void insertarFinal(T elemento){
        Nodo nodo = new Nodo(elemento);
        if(listaVacia()){
            inicio = nodo;
            fin = nodo;
        }
        fin.setSig(nodo);
        fin = nodo;
        tamanio++;
    }
    public Nodo retirarInicio(){
        Nodo aux;
        if(!listaVacia()){
            aux = inicio;
            if(inicio == fin) {
                inicio = null;
                fin = null;
                tamanio--;
            }else{
                inicio = inicio.getSig();
                aux.setSig(null);
                tamanio--;
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
}