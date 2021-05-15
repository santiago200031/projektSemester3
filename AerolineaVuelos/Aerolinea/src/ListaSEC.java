

public class ListaSEC {
    public Nodo primero;

    public ListaSEC() {
        this.primero = null;
    }

    boolean insertar(Object info) {
        try {
            if (this.primero == null) { //la lista está vacía
                this.primero = new Nodo(info);
                return true;
            }
            Nodo aux = this.primero;
            while (aux.siguiente != null) //no he llegado al último de los nodos
            {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo(info);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    boolean eliminar(int pos) {
        if (this.primero == null || pos < 0) {
            return false;
        }
        if (pos == 0) {
            this.primero = this.primero.siguiente;
            return true;
        }
        int posActual = 1;
        Nodo aux = this.primero;
        while (posActual < pos && aux != null) {
            aux = aux.siguiente;
            posActual++;
        }
        if (aux != null && aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente;
            return true;
        } else {
            return false;
        }
    }

    void imprimir() {
        try{
        Nodo aux = this.primero;
        while (aux != null) {
            System.out.println(aux.inf.toString());
            aux = aux.siguiente;
        }
        }catch(Exception e){
            System.out.println("***Error imprimir(): " + e);
        }
    }

    boolean eliminarObject(Object inf) {
        if (this.primero == null) {
            return false;
        }
        Nodo aux = this.primero;

        if (aux.inf.equals(inf)) {
            this.primero = this.primero.siguiente;
            return true;
        }
        while (aux.siguiente != null) {
            if (aux.siguiente.inf.equals(inf)) {
                aux.siguiente = aux.siguiente.siguiente;
                return true;
            } else {
                aux = aux.siguiente;

            }
        }
        return false;

    }

    void cambiarOrden() {
        if (this.primero == null) {
            return;
        }
        Nodo aux = this.primero;
        while (aux.siguiente != null) {
            aux = aux.siguiente;

        }
        Nodo aux3 = aux;
        while (aux != null) {
            Nodo aux2 = buscarAnterior(aux);
            aux.siguiente = aux2;
            aux = aux2;
        }

        this.primero = aux3;
    }

    private Nodo buscarAnterior(Nodo nodo) {
        Nodo aux = this.primero;
        if (aux.inf.equals(nodo.inf))
            return null;
        while (aux.siguiente != null) {
            if (aux.siguiente.inf.equals(nodo.inf)) {
                return aux;
            }
            aux = aux.siguiente;
        }
        return null;
    }
}
