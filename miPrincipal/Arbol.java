package miPrincipal;

public class Arbol<T extends Comparable<T>> {
    private ArbolNodo<T> raiz;

    // Constructor
    public Arbol() {
        this.raiz = null;
    }

    // Método para insertar un nuevo valor
    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    // Método recursivo para insertar en el árbol
    private Nodo<T> insertarRecursivo(Nodo<T> raiz, T dato) {
        if (raiz == null) {
            raiz = new Nodo<>(dato);  // Si el nodo está vacío, inserta el nuevo dato
            return raiz;
        }

        // Compara el dato con el nodo actual y decide si ir a la izquierda o a la derecha
        if (dato.compareTo(raiz.getDato()) < 0) {
            raiz.setIzquierdo(insertarRecursivo(raiz.getIzquierdo(), dato));
        } else if (dato.compareTo(raiz.getDato()) > 0) {
            raiz.setDerecho(insertarRecursivo(raiz.getDerecho(), dato));
        }

        return raiz;  // Retorna el nodo (sin cambios si ya existe el dato)
    }

    // Método para mostrar el árbol en preorden
    public void mostrar() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(Nodo<T> nodo) {
        if (nodo != null) {
            nodo.mostrar();  // Muestra el dato
            preordenRecursivo(nodo.getIzquierdo());  // Llama al subárbol izquierdo
            preordenRecursivo(nodo.getDerecho());    // Llama al subárbol derecho
        }
    }

    // 1. Método para buscar un nodo y retornar un booleano (si existe o no)
    public boolean buscarNodo(T dato) {
        return buscarNodoRecursivo(raiz, dato);
    }

    private boolean buscarNodoRecursivo(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return false;
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscarNodoRecursivo(nodo.getIzquierdo(), dato);
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            return buscarNodoRecursivo(nodo.getDerecho(), dato);
        } else {
            return true;  // Nodo encontrado
        }
    }

    // 2. Método para buscar un nodo y retornar la referencia del nodo
    public Nodo<T> buscarNodoReferencia(T dato) {
        return buscarNodoReferenciaRecursivo(raiz, dato);
    }

    private Nodo<T> buscarNodoReferenciaRecursivo(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return null;
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscarNodoReferenciaRecursivo(nodo.getIzquierdo(), dato);
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            return buscarNodoReferenciaRecursivo(nodo.getDerecho(), dato);
        } else {
            return nodo;  // Nodo encontrado
        }
    }

    // 3. Método para buscar el nodo padre de un nodo dado
    public Nodo<T> buscarNodoPadre(T dato) {
        return buscarNodoPadreRecursivo(raiz, null, dato);
    }

    private Nodo<T> buscarNodoPadreRecursivo(Nodo<T> nodo, Nodo<T> padre, T dato) {
        if (nodo == null) {
            return null;
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscarNodoPadreRecursivo(nodo.getIzquierdo(), nodo, dato);
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            return buscarNodoPadreRecursivo(nodo.getDerecho(), nodo, dato);
        } else {
            return padre;  // Retorna el nodo padre
        }
    }

    // 4. Buscar el nodo menor de los mayores (mínimo en el subárbol derecho)
    public Nodo<T> buscarNodoMenorDeLosMayores() {
        return buscarNodoMenorDeLosMayoresRecursivo(raiz);
    }

    private Nodo<T> buscarNodoMenorDeLosMayoresRecursivo(Nodo<T> nodo) {
        if (nodo == null || nodo.getDerecho() == null) {
            return null;
        }

        Nodo<T> actual = nodo.getDerecho();
        while (actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual;  // Retorna el nodo más pequeño en el subárbol derecho
    }

    // 5. Buscar el nodo mayor de los menores (máximo en el subárbol izquierdo)
    public Nodo<T> buscarNodoMayorDeLosMenores() {
        return buscarNodoMayorDeLosMenoresRecursivo(raiz);
    }

    private Nodo<T> buscarNodoMayorDeLosMenoresRecursivo(Nodo<T> nodo) {
        if (nodo == null || nodo.getIzquierdo() == null) {
            return null;
        }

        Nodo<T> actual = nodo.getIzquierdo();
        while (actual.getDerecho() != null) {
            actual = actual.getDerecho();
        }
        return actual;  // Retorna el nodo más grande en el subárbol izquierdo
    }
}
