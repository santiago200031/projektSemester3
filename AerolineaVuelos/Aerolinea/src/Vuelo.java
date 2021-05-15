
public class Vuelo {

    int id;
    String tipo;
    Pasajero[] pasajeros;
    RutaVuelo ruta;
    final int CANT_PASAJEROS = 40;
    int CANT_PASAJEROS_DISP = 40;

    Vuelo(int id, String tipo, RutaVuelo ruta) {
        this.id = id;
        this.tipo = tipo.toUpperCase();
        this.pasajeros = new Pasajero[CANT_PASAJEROS];
        this.ruta = ruta;
    }

    public boolean registrarPasajero(Pasajero pasajero) {
        try {
            for (int i = 0; i < pasajeros.length; i++) {
                if (pasajeros[i] == null) {
                    pasajeros[i] = pasajero;
                    this.CANT_PASAJEROS_DISP -= 1;
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public Pasajero buscarPasajeroCI(String ci) {
        try {
            for (Pasajero i : pasajeros) {
                if (i.ci.equals(ci.toUpperCase())) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.println("***Error: " + e);
        }
        return null;
    }

    public void imprimirVuelo() {
        if(this.buscarciudadOriDes()== null){
            return;
        }
        String ciudadOri = this.buscarciudadOriDes()[0];
        String ciudadDes = this.buscarciudadOriDes()[1];
        
        System.out.println("*** Vuelo de " + ciudadOri.toUpperCase() + " a " + ciudadDes.toUpperCase());
        System.out.println("Vuelo: " + this.id
                + "\nTipo: " + this.tipo
                + "\nCantidad Pasajeros Disp.: " + this.CANT_PASAJEROS_DISP);
        this.ruta.imprimirRutaVuelo();
        System.out.println("Distancia Total : " + this.distanciaTotal());
        System.out.println("Precio : " + this.calcularPrecio());
    }

    /*
    TERMINAR METODO
     */
    public String [] buscarciudadOriDes(){
         String[] ciudades= new String [2];
        if (this.ruta.rutas.primero == null) {
            System.out.println("No existe ruta");
            return null;
        } else {
          
            Nodo aux = this.ruta.rutas.primero;
            Ruta ruta = (Ruta) aux.inf;
            ciudades[0]= ruta.ciudadStart.nombre;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            Ruta ruta1 = (Ruta) aux.inf;
            ciudades[1] = ruta1.ciudadEnd.nombre;
        }
        return ciudades;
    }
    public String infoRutas() {
        try {
            if (this.ruta != null) {

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    //Mensajes a mostrar
    public void infoAvion() {
        System.out.println(this.toString());
    }

    public void cantidadDisponible() {
        if (CANT_PASAJEROS_DISP > 0) {
            System.out.println(CANT_PASAJEROS_DISP + " puestos disponibles.");
            return;
        }
        System.out.println("Vuelo lleno.");
    }

    float calcularPrecio() {
        float distancia = this.distanciaTotal();
        if (this.tipo.equals("DIRECTO")) {
            return (float) (distancia * 0.8);
        } else {
            return (float) (distancia * 0.2);
        }
    }

    /*
    RECORRER EN EL WHILE
     */
    float distanciaTotal() {
        if (this.ruta.rutas.primero == null) {
            return -1;
        }
        Nodo aux = this.ruta.rutas.primero;
        float distancia = 0;
        while (aux != null) {
            Ruta ruta = (Ruta) aux.inf;
            distancia += ruta.distancia;
            aux = aux.siguiente;
        }
        return distancia;
    }
}
