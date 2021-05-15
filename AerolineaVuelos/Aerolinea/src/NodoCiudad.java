
public class NodoCiudad {

    String nombre;
    ListaSEC rutas;
    NodoCiudad siguiente;

    public NodoCiudad(String nombre) {
        this.nombre = nombre.toUpperCase();
        this.rutas = new ListaSEC();
        this.siguiente = null;
    }

    boolean insertarRuta(NodoCiudad ciudadEnd, float distancia) {
        return this.rutas.insertar(new Ruta(this, ciudadEnd, distancia));
    }
}
