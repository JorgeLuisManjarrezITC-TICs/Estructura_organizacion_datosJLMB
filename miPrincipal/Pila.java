package miPrincipal;
public class Pila<T>{
    private T[] pila;
    private int tope = -1;
    private T dato;
    private int max = 0;

    Pila(int maximo) {
        this.max = maximo;
        this.pila = (T[]) new Object[max];
    }


    public void Borrarpila() {
        tope = -1;
    }

    private boolean Pilallena() {
        boolean res = false;
        if (tope == (max - 1)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    private boolean Pilavacia(){
        boolean res = false;
        if(tope == -1)
            res=true;
        return res;
    }

    public boolean Insertar(T dato){
        boolean res= false;
        if (!Pilallena()){
            tope++;
            pila[tope] = dato;
            res= true;
        }
        return res;
    }

    public T Retirar(){
            T res;
            if (!Pilavacia()){
                res = pila[tope];
                        tope --;
            }else{
                System.out.println("Pila vacia ");
                res = null;
            }
            return res;
    }

    public void Mostrar(){
            for(int i = 0;i < tope + 1; i++){
                System.out.println(pila[i]);
            }
    }

    public void invertirPila() {
        T[] nuevaPila = (T[]) new Object[max];
        int nuevoTope = 0;

        for (int i = tope; i >= 0; i--) {
            nuevaPila[nuevoTope++] = pila[i];
        }

        this.pila = nuevaPila;
        this.tope = nuevoTope - 1;
    }


    public boolean esPalindromo() {
        for (int i = 0; i <= tope / 2; i++) {
            if (!pila[i].equals(pila[tope - i])) {
                return false;
            }
        }
        return true;
    }
}
