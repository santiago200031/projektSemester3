
class ListaCiudad {

    NodoCiudad primero;

    ListaCiudad() {
        this.primero = null;
    }

    boolean insertar(String nombre) {
        try {
            if (this.primero == null) { //la lista está vacía
                this.primero = new NodoCiudad(nombre);
                return true;
            }
            NodoCiudad aux = this.primero;
            while (aux.siguiente != null) //no he llegado al último de los nodos
            {
                aux = aux.siguiente;
            }
            aux.siguiente = new NodoCiudad(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    void imprimir() {
        try {
            NodoCiudad aux = this.primero;
            while (aux != null) {
                System.out.println(aux.nombre.toString());
                aux = aux.siguiente;
            }
        } catch (Exception e) {
            System.out.println("***Error imprimir(): " + e);
        }
    }

    NodoCiudad buscar(String nombre) {
        if (this.primero == null) {
            return null;
        }
        if (this.primero.nombre.equals(nombre)) {
            return this.primero;
        }
        NodoCiudad aux = this.primero;
        while (aux != null) {
            if (aux.nombre.equals(nombre)) {
                return aux;
            }
            aux = aux.siguiente;
        }
        return null;

    }

    boolean insertarRuta(String ciudadStart, String ciudadEnd, float distancia) {
        try {
            NodoCiudad start = this.buscar(ciudadStart.toUpperCase());
            NodoCiudad end = this.buscar(ciudadEnd.toUpperCase());
            if (start == null || end == null) {
                System.out.println("No se encontro la ciudad.");
                return false;
            }
            start.insertarRuta(end, distancia);
            return true;
        } catch (Exception e) {
            System.out.println("***Error buscarPasajeroNomApe(): " + e);
        }
        return false;
    }
}
