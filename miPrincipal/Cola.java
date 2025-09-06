package miprincipal;
public class Cola<T>{
    private T[] cola;
    private int frente;
    private int fin;
    private int max;

    public Cola(int maximo){
        max = maximo;
        cola = (T[]) new Object[max];
    }

    public boolean vacia(){
        return frente == -1 && fin == -1;
    }
    public boolean llena(){
        return (fin == max-1) || (frente == 0 && fin == max-1) || (fin == frente-1);
    }

    public void insertar(T dato){
        if(!llena()){
            if(vacia()){
                frente++;
            }
            if(frente > 0 && fin == max-1){
                fin = 0;
                cola[fin] = dato;
            }else{
                fin++;
                cola[fin] = dato;
            }
        }else{
            System.out.println("La cola esta llena. no se puede insertar");
        }
    }

    public T eliminar(){
        if(!vacia()){
            T dato = cola[frente];
            cola[frente] = null;
            if (frente == fin){
                frente = -1;
                fin = -1;
            }if(frente > fin && frente == max-1){
                frente = 0;
            }else{
                frente++;
            }
            return dato;
        }else{
            System.out.println("La cola esta vacia, no hay elementos para eliminar");
            return null;
        }
    }

    public void mostrar(){
        if (!vacia()) {
            System.out.print("Cola: ");
            for (int i = frente; i <= fin; i++) {
                System.out.print(cola[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("La cola está vacía.");
        }
    }

}
    
