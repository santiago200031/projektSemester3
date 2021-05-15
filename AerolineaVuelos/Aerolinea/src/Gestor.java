
public class Gestor {

    ListaSEC vuelos;
    ListaCiudad ciudades;
    ListaSEC pasajeros;

    Gestor() {
        this.vuelos = new ListaSEC();
        this.ciudades = new ListaCiudad();
        this.pasajeros = new ListaSEC();
        crearCiudades();
        crearRutaCiudades();
        insertarVuelos();
    }

    boolean insertarVuelo(Vuelo vuelo) {
        return this.vuelos.insertar(vuelo);
    }

    boolean insertarPasajero(Pasajero pasajero) {
        return this.pasajeros.insertar(pasajero);
    }

    boolean insertarCiudad(String nombre) {
        return this.ciudades.insertar(nombre);
    }

    void insertarVuelos() {
        /*
        NO SE COMO CREAR UN VUELO :'v (en el 3er parámetro que pide una ruta)
         */
    }

    void crearCiudades() {
        this.ciudades.insertar("ESMERALDAS");
        this.ciudades.insertar("TULCAN");
        this.ciudades.insertar("QUITO");
        this.ciudades.insertar("MANTA");
        this.ciudades.insertar("PORTOVIEJO");
        this.ciudades.insertar("AMBATO");
        this.ciudades.insertar("GUAYAQUIL");
        this.ciudades.insertar("MACAS");
        this.ciudades.insertar("CUENCA");
        this.ciudades.insertar("LOJA");
        this.ciudades.insertar("MACARA");
        this.ciudades.insertar("GALAPAGOS");
        System.out.println("Se insertaron correctamente las Ciudades. ☺");
    }

    void crearRutaCiudades() {
        //ESMERALDAS
        this.ciudades.insertarRuta("ESMERALDAS", "TULCAN", (float) 213.30);
        this.ciudades.insertarRuta("ESMERALDAS", "QUITO", (float) 179.75);
        this.ciudades.insertarRuta("ESMERALDAS", "MANTA", (float) 247.32);
        this.ciudades.insertarRuta("ESMERALDAS", "PORTOVIEJO", (float) 246.37);
        this.ciudades.insertarRuta("ESMERALDAS", "AMBATO", (float) 273.13);
        this.ciudades.insertarRuta("ESMERALDAS", "GUAYAQUIL", (float) 353.55);
        this.ciudades.insertarRuta("ESMERALDAS", "MACAS", (float) 402.22);
        this.ciudades.insertarRuta("ESMERALDAS", "CUENCA", (float) 437.64);
        this.ciudades.insertarRuta("ESMERALDAS", "LOJA", (float) 555.44);
        this.ciudades.insertarRuta("ESMERALDAS", "MACARA", (float) 596.91);
        this.ciudades.insertarRuta("ESMERALDAS", "GALAPAGOS", (float) 1194.42);
        //TULCAN
        this.ciudades.insertarRuta("TULCAN", "ESMERALDAS", (float) 213.30);
        this.ciudades.insertarRuta("TULCAN", "QUITO", (float) 50.00);
        this.ciudades.insertarRuta("TULCAN", "MANTA", (float) 384.05);
        this.ciudades.insertarRuta("TULCAN", "PORTOVIEJO", (float) 370.14);
        this.ciudades.insertarRuta("TULCAN", "AMBATO", (float) 243.83);
        this.ciudades.insertarRuta("TULCAN", "GUAYAQUIL", (float) 778.05);
        this.ciudades.insertarRuta("TULCAN", "MACAS", (float) 349.55);
        this.ciudades.insertarRuta("TULCAN", "CUENCA", (float) 784.96);
        this.ciudades.insertarRuta("TULCAN", "LOJA", (float) 566.75);
        this.ciudades.insertarRuta("TULCAN", "MACARA", (float) 629.89);
        this.ciudades.insertarRuta("TULCAN", "GALAPAGOS", (float) 1404.67);
        //QUITO
        this.ciudades.insertarRuta("QUITO", "ESMERALDAS", (float) 179.75);
        this.ciudades.insertarRuta("QUITO", "TULCAN", (float) 50.00);
        this.ciudades.insertarRuta("QUITO", "MANTA", (float) 277.42);
        this.ciudades.insertarRuta("QUITO", "PORTOVIEJO", (float) 255.04);
        this.ciudades.insertarRuta("QUITO", "AMBATO", (float) 130.52);
        this.ciudades.insertarRuta("QUITO", "GUAYAQUIL", (float) 287.53);
        this.ciudades.insertarRuta("QUITO", "MACAS", (float) 244.62);
        this.ciudades.insertarRuta("QUITO", "CUENCA", (float) 317.90);
        this.ciudades.insertarRuta("QUITO", "LOJA", (float) 441.84);
        this.ciudades.insertarRuta("QUITO", "MACARA", (float) 506.06);
        this.ciudades.insertarRuta("QUITO", "GALAPAGOS", (float) 1325.95);
        //MANTA
        this.ciudades.insertarRuta("MANTA", "ESMERALDAS", (float) 247.32);
        this.ciudades.insertarRuta("MANTA", "TULCAN", (float) 384.05);
        this.ciudades.insertarRuta("MANTA", "QUITO", (float) 277.42);
        this.ciudades.insertarRuta("MANTA", "PORTOVIEJO", (float) 28.04);
        this.ciudades.insertarRuta("MANTA", "AMBATO", (float) 231.95);
        this.ciudades.insertarRuta("MANTA", "GUAYAQUIL", (float) 163.04);
        this.ciudades.insertarRuta("MANTA", "MACAS", (float) 321.34);
        this.ciudades.insertarRuta("MANTA", "CUENCA", (float) 285.81);
        this.ciudades.insertarRuta("MANTA", "LOJA", (float) 377.24);
        this.ciudades.insertarRuta("MANTA", "MACARA", (float) 389.98);
        this.ciudades.insertarRuta("MANTA", "GALAPAGOS", (float) 1070.38);
        //PORTOVIEJO
        this.ciudades.insertarRuta("PORTOVIEJO", "ESMERALDAS", (float) 246.37);
        this.ciudades.insertarRuta("PORTOVIEJO", "TULCAN", (float) 370.14);
        this.ciudades.insertarRuta("PORTOVIEJO", "QUITO", (float) 255.04);
        this.ciudades.insertarRuta("PORTOVIEJO", "MANTA", (float) 28.04);
        this.ciudades.insertarRuta("PORTOVIEJO", "AMBATO", (float) 207.08);
        this.ciudades.insertarRuta("PORTOVIEJO", "GUAYAQUIL", (float) 141.30);
        this.ciudades.insertarRuta("PORTOVIEJO", "MACAS", (float) 295.82);
        this.ciudades.insertarRuta("PORTOVIEJO", "CUENCA", (float) 261.44);
        this.ciudades.insertarRuta("PORTOVIEJO", "LOJA", (float) 356.05);
        this.ciudades.insertarRuta("PORTOVIEJO", "MACARA", (float) 374.21);
        this.ciudades.insertarRuta("PORTOVIEJO", "GALAPAGOS", (float) 1091.72);
        //AMBATO
        this.ciudades.insertarRuta("AMBATO", "ESMERALDAS", (float) 273.13);
        this.ciudades.insertarRuta("AMBATO", "TULCAN", (float) 243.83);
        this.ciudades.insertarRuta("AMBATO", "QUITO", (float) 130.52);
        this.ciudades.insertarRuta("AMBATO", "MANTA", (float) 231.95);
        this.ciudades.insertarRuta("AMBATO", "PORTOVIEJO", (float) 207.08);
        this.ciudades.insertarRuta("AMBATO", "GUAYAQUIL", (float) 175.67);
        this.ciudades.insertarRuta("AMBATO", "MACAS", (float) 130.66);
        this.ciudades.insertarRuta("AMBATO", "CUENCA", (float) 187.54);
        this.ciudades.insertarRuta("AMBATO", "LOJA", (float) 312.90);
        this.ciudades.insertarRuta("AMBATO", "MACARA", (float) 377.62);
        this.ciudades.insertarRuta("AMBATO", "GALAPAGOS", (float) 1299.26);
        //GUAYAQUIL
        this.ciudades.insertarRuta("GUAYAQUIL", "ESMERALDAS", (float) 353.55);
        this.ciudades.insertarRuta("GUAYAQUIL", "TULCAN", (float) 778.05);
        this.ciudades.insertarRuta("GUAYAQUIL", "QUITO", (float) 287.53);
        this.ciudades.insertarRuta("GUAYAQUIL", "MANTA", (float) 163.04);
        this.ciudades.insertarRuta("GUAYAQUIL", "PORTOVIEJO", (float) 141.30);
        this.ciudades.insertarRuta("GUAYAQUIL", "AMBATO", (float) 175.67);
        this.ciudades.insertarRuta("GUAYAQUIL", "MACAS", (float) 196.96);
        this.ciudades.insertarRuta("GUAYAQUIL", "CUENCA", (float) 126.18);
        this.ciudades.insertarRuta("GUAYAQUIL", "LOJA", (float) 214.47);
        this.ciudades.insertarRuta("GUAYAQUIL", "MACARA", (float) 242.53);
        this.ciudades.insertarRuta("GUAYAQUIL", "GALAPAGOS", (float) 1167.64);
        //MACAS
        this.ciudades.insertarRuta("MACAS", "ESMERALDAS", (float) 402.22);
        this.ciudades.insertarRuta("MACAS", "TULCAN", (float) 349.55);
        this.ciudades.insertarRuta("MACAS", "QUITO", (float) 244.62);
        this.ciudades.insertarRuta("MACAS", "MANTA", (float) 321.34);
        this.ciudades.insertarRuta("MACAS", "PORTOVIEJO", (float) 295.82);
        this.ciudades.insertarRuta("MACAS", "AMBATO", (float) 130.66);
        this.ciudades.insertarRuta("MACAS", "GUAYAQUIL", (float) 196.96);
        this.ciudades.insertarRuta("MACAS", "CUENCA", (float) 118.30);
        this.ciudades.insertarRuta("MACAS", "LOJA", (float) 377.24);
        this.ciudades.insertarRuta("MACAS", "MACARA", (float) 306.47);
        this.ciudades.insertarRuta("MACAS", "GALAPAGOS", (float) 1365.70);
        //CUENCA
        this.ciudades.insertarRuta("CUENCA", "ESMERALDAS", (float) 437.64);
        this.ciudades.insertarRuta("CUENCA", "TULCAN", (float) 784.96);
        this.ciudades.insertarRuta("CUENCA", "QUITO", (float) 317.90);
        this.ciudades.insertarRuta("CUENCA", "MANTA", (float) 285.81);
        this.ciudades.insertarRuta("CUENCA", "PORTOVIEJO", (float) 261.44);
        this.ciudades.insertarRuta("CUENCA", "AMBATO", (float) 187.54);
        this.ciudades.insertarRuta("CUENCA", "GUAYAQUIL", (float) 126.18);
        this.ciudades.insertarRuta("CUENCA", "MACAS", (float) 118.30);
        this.ciudades.insertarRuta("CUENCA", "LOJA", (float) 126.62);
        this.ciudades.insertarRuta("CUENCA", "MACARA", (float) 195.54);
        this.ciudades.insertarRuta("CUENCA", "GALAPAGOS", (float) 1282.45);
        //LOJA
        this.ciudades.insertarRuta("LOJA", "ESMERALDAS", (float) 555.44);
        this.ciudades.insertarRuta("LOJA", "TULCAN", (float) 566.75);
        this.ciudades.insertarRuta("LOJA", "QUITO", (float) 441.84);
        this.ciudades.insertarRuta("LOJA", "MANTA", (float) 377.24);
        this.ciudades.insertarRuta("LOJA", "PORTOVIEJO", (float) 356.05);
        this.ciudades.insertarRuta("LOJA", "AMBATO", (float) 312.90);
        this.ciudades.insertarRuta("LOJA", "GUAYAQUIL", (float) 214.47);
        this.ciudades.insertarRuta("LOJA", "MACAS", (float) 377.24);
        this.ciudades.insertarRuta("LOJA", "CUENCA", (float) 126.62);
        this.ciudades.insertarRuta("LOJA", "MACARA", (float) 91.16);
        this.ciudades.insertarRuta("LOJA", "GALAPAGOS", (float) 1270.00);
        //MACARA
        this.ciudades.insertarRuta("MACARA", "ESMERALDAS", (float) 596.91);
        this.ciudades.insertarRuta("MACARA", "TULCAN", (float) 629.89);
        this.ciudades.insertarRuta("MACARA", "QUITO", (float) 506.06);
        this.ciudades.insertarRuta("MACARA", "MANTA", (float) 389.98);
        this.ciudades.insertarRuta("MACARA", "PORTOVIEJO", (float) 374.21);
        this.ciudades.insertarRuta("MACARA", "AMBATO", (float) 377.62);
        this.ciudades.insertarRuta("MACARA", "GUAYAQUIL", (float) 242.53);
        this.ciudades.insertarRuta("MACARA", "MACAS", (float) 306.47);
        this.ciudades.insertarRuta("MACARA", "CUENCA", (float) 195.54);
        this.ciudades.insertarRuta("MACARA", "LOJA", (float) 91.16);
        this.ciudades.insertarRuta("MACARA", "GALAPAGOS", (float) 2480.00);
        //GALAPAGOS
        this.ciudades.insertarRuta("GALAPAGOS", "ESMERALDAS", (float) 1194.42);
        this.ciudades.insertarRuta("GALAPAGOS", "TULCAN", (float) 1404.67);
        this.ciudades.insertarRuta("GALAPAGOS", "QUITO", (float) 1325.95);
        this.ciudades.insertarRuta("GALAPAGOS", "MANTA", (float) 1070.38);
        this.ciudades.insertarRuta("GALAPAGOS", "PORTOVIEJO", (float) 1091.72);
        this.ciudades.insertarRuta("GALAPAGOS", "AMBATO", (float) 1299.26);
        this.ciudades.insertarRuta("GALAPAGOS", "GUAYAQUIL", (float) 1167.64);
        this.ciudades.insertarRuta("GALAPAGOS", "MACAS", (float) 1365.70);
        this.ciudades.insertarRuta("GALAPAGOS", "CUENCA", (float) 1282.45);
        this.ciudades.insertarRuta("GALAPAGOS", "LOJA", (float) 1270.00);
        this.ciudades.insertarRuta("GALAPAGOS", "MACARA", (float) 2480.00);
        System.out.println("Se insertaron las rutas correctamente. ☺");
    }

    Ruta buscarRuta(String ciudadStart, String ciudadEnd) {
        try {
            if (this.ciudades.primero == null) {
                return null;
            }
            NodoCiudad aux = this.ciudades.primero;
            while (!aux.nombre.toUpperCase().equals(ciudadStart.toUpperCase())) {
                aux = aux.siguiente;
            }
            Ruta ruta = null;
            Nodo aux2 = aux.rutas.primero;
            boolean encontrado = true;
            while (encontrado) {
                ruta = (Ruta) aux2.inf;
                if (ruta.ciudadEnd.nombre.equals(ciudadEnd)) {
                    encontrado = false;
                }
                aux2 = aux2.siguiente;
            }
            return ruta;

        } catch (Exception e) {
            System.out.println("***Error: " + e);
        }
        return null;
    }

    Vuelo buscarVuelo(int id) {
        try {
            if (this.vuelos.primero == null) {
                return null;
            }
            Nodo aux = this.vuelos.primero;
            while (aux != null) {
                Vuelo vuelo = (Vuelo) aux.inf;
                if (vuelo.id == id) {
                    return vuelo;
                }
                aux = aux.siguiente;
            }
        } catch (Exception e) {
            System.out.println("***Error (buscarVuelo): " + e);
        }
        return null;
    }

    Pasajero buscarPasajeroCI(String ci) {
        try{
        if (this.pasajeros.primero == null) {
            return null;
        }
        Nodo aux = this.pasajeros.primero;
        while (aux != null) {
            Pasajero pasajero = (Pasajero) aux.inf;
            if (pasajero.ci.equals(ci)) {
                return pasajero;
            }
            aux = aux.siguiente;
        }
        }catch(Exception e){
            System.out.println("***Error (buscarPasajeroCI(): "+e);
        }
        return null;
    }

    public Pasajero buscarPasajeroNomApe(String nombre, String apellido) {
        if (this.pasajeros.primero == null) {
            return null;
        }
        Nodo aux = this.pasajeros.primero;
        while (aux != null) {
            Pasajero pasajero = (Pasajero) aux.inf;
            if (pasajero.nombre.equals(nombre) && pasajero.apellido.equals(apellido)) {
                return pasajero;
            }
            aux = aux.siguiente;
        }
        return null;
    }
    public void buscarVueloRuta(String ciudadOri,String ciudadDes){
        if(this.vuelos.primero==null){
            System.out.println("No existen Vuelos");
            return ;
        }
        Nodo aux= this.vuelos.primero;
        
        while(aux != null){
            Vuelo vuelo = (Vuelo)aux.inf;
            String ciudad1=vuelo.buscarciudadOriDes()[0];
            String ciudad2=vuelo.buscarciudadOriDes()[1];
            if(ciudad1.equals(ciudadOri) && ciudad2.equals(ciudadDes)){
                vuelo.imprimirVuelo();
            }
            aux=aux.siguiente;
        }
        
    }

    /*
    public boolean insertarVueloPasajerCI(String ci, int cantPersonas, int idVuelo) {
        try {
            Pasajero pasajero = buscarPasajeroCI(ci.toUpperCase());
            Vuelo vuelo = buscarVuelo(idVuelo);
            if (pasajero != null) {
                if (vuelo != null) {
                    vuelo.registrarPasajero(cantPersonas, pasajero);
                    return true;
                }
                System.out.println("*** Vuelo no registrado. ***");
                return false;
            }
            System.out.println("*** Pasajero no registrado. ***");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean insertarVueloPasajeroNomApe(String nombre, String apellido, int cantPersonas, int idVuelo) {
        try {
            Pasajero pasajero = buscarPasajeroNomApe(nombre.toUpperCase(), apellido.toUpperCase());
            Vuelo vuelo = buscarVuelo(idVuelo);
            if (pasajero != null) {
                if (vuelo != null) {
                    vuelo.registrarPasajero(cantPersonas, pasajero);
                    return true;
                }
                System.out.println("*** Vuelo no registrado. ***");
                return false;
            }
            System.out.println("*** Pasajero no registrado. ***");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    /*
                  IMPRESIONES
     */

 /* public void infoPasajeroCI(String ci) {
        try {
            buscarPasajeroCI(ci).infoPasajero();
        } catch (Exception e) {
            System.out.println("Pasajero no encontrado: " + e);
        }
        System.out.println();
    }

    public void infoPasajeroNomApe(String nombre, String apellido) {
        try {
            buscarPasajeroNomApe(nombre, apellido).infoPasajero();
        } catch (Exception e) {
            System.out.println("Pasajero no encontrado: " + e);
        }
        System.out.println();
    }

    public void infoVuelo(int idVuelo) {
        try {
            buscarVuelo(idVuelo).infoAvion();
        } catch (Exception e) {
            System.out.println("Vuelo no encontrado: " + e);
        }
        System.out.println();
    }

    public void infoCiudad(String ciudad) {
        String auxCiudad = buscarCiudad(ciudad);
        if (auxCiudad != null) {
            System.out.println(auxCiudad);
        } else {
            System.out.println(ciudad + " no tiene aeropuerto.");
        }
        System.out.println();
    }


    /*
                   BUSQUEDAS
     */

 /*
    private Pasajero buscarPasajeroCI(String ci) {
        if (this.pasajeros != null) {
            for (Pasajero i : pasajeros) {
                if (i.ci.equals(ci.toUpperCase())) {
                    return i;
                }
            }
            return null;
        }
        return null;
    }

    private Pasajero buscarPasajeroNomApe(String nombre, String apellido) {
        if (pasajeros != null) {
            for (Pasajero i : pasajeros) {
                if (i.nombre.equals(nombre.toUpperCase()) && i.apellido.equals(apellido.toUpperCase())) {
                    return i;
                }
            }
        }
        return null;
    }

    private String buscarCiudad(String ciudad) {
        if (ciudades != null) {
            for (String i : ciudades) {
                if (i.equals(ciudad.toUpperCase())) {
                    return i;
                }
            }
        }
        return null;
    }

    public Vuelo buscarVuelo(int idVuelo) {
        if (vuelos != null) {
            for (Vuelo i : vuelos) {
                if (i.id == idVuelo) {
                    return i;
                }
            }
        }
        return null;
    }


    /*
                          DATOS REGISTRADOS
     */

 /*  public void inicializarRegs() {
        ciudadesReg();
        vuelosReg();
        pasajerosReg();
        rutasReg();
    }

    private void ciudadesReg() {
        ciudades.add("ESMERALDAS");
        ciudades.add("TULCAN");
        ciudades.add("QUITO");
        ciudades.add("MANTA");
        ciudades.add("PORTOVIEJO");
        ciudades.add("AMBATO");
        ciudades.add("GUAYAQUIL");
        ciudades.add("MACAS");
        ciudades.add("CUENCA");
        ciudades.add("LOJA");
        ciudades.add("MACARA");
        ciudades.add("GALAPAGOS");
    }

    private void vuelosReg() {
        vuelos.add(new Vuelo(1801, "INTERPROVINCIAL"));
        vuelos.add(new Vuelo(815, "INTERNACIONAL"));
        vuelos.add(new Vuelo(1712, "INTERPROVINCIAL"));
        vuelos.add(new Vuelo(1514, "INTERNACIONAL"));
        vuelos.add(new Vuelo(1214, "INTERNACIONAL"));
        vuelos.add(new Vuelo(1970, "INTERPROVINCIAL"));
        vuelos.add(new Vuelo(1605, "INTERNACIONAL"));
    }

    private void pasajerosReg() {
        pasajeros.add(new Pasajero("1801010101", "REBECCA", "WUERTH"));
        pasajeros.add(new Pasajero("1848482093", "JUAN", "PEREZ"));
    }

    private void rutasReg() {
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("TULCAN"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("QUITO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("MANTA"), 100));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("PORTOVIEJO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("AMBATO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("GUAYAQUIL"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("MACAS"), 100));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("ESMERALDAS"), buscarCiudad("GALAPAGOS"), 100));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("QUITO"), (float) 50.00));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("MANTA"), (float) 949.87));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("PORTOVIEJO"), (float) 370.14));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("AMBATO"), (float) 243.83));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("GUAYAQUIL"), (float) 778.05));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("MACAS"), (float) 349.55));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("CUENCA"), (float) 784.96));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("LOJA"), (float) 566.75));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("MACARA"), 10000));
        rutas.add(new Ruta(buscarCiudad("TULCAN"), buscarCiudad("GALAPAGOS"), (float) 1408.67));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("MANTA"), (float) 273.56));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("PORTOVIEJO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("AMBATO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("GUAYAQUIL"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("MACAS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("QUITO"), buscarCiudad("GALAPAGOS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("PORTOVIEJO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("AMBATO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("GUAYAQUIL"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("MACAS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MANTA"), buscarCiudad("GALAPAGOS"), (float) 1070.38));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("AMBATO"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("GUAYAQUIL"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("MACAS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("PORTOVIEJO"), buscarCiudad("GALAPAGOS"), (float) 1091.72));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("GUAYAQUIL"), 1000000));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("MACAS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("AMBATO"), buscarCiudad("GALAPAGOS"), (float) 1299.26));
        rutas.add(new Ruta(buscarCiudad("GUAYAQUIL"), buscarCiudad("MACAS"), 1000000));
        rutas.add(new Ruta(buscarCiudad("GUAYAQUIL"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("GUAYAQUIL"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("GUAYAQUIL"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("GUAYAQUIL"), buscarCiudad("GALAPAGOS"), (float) 1167.64));
        rutas.add(new Ruta(buscarCiudad("MACAS"), buscarCiudad("CUENCA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MACAS"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MACAS"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("MACAS"), buscarCiudad("GALAPAGOS"), (float) 1365.70));
        rutas.add(new Ruta(buscarCiudad("CUENCA"), buscarCiudad("LOJA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("CUENCA"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("CUENCA"), buscarCiudad("GALAPAGOS"), (float) 1282.45));
        rutas.add(new Ruta(buscarCiudad("LOJA"), buscarCiudad("MACARA"), 1000000));
        rutas.add(new Ruta(buscarCiudad("LOJA"), buscarCiudad("GALAPAGOS"), (float) 1270.00));
        rutas.add(new Ruta(buscarCiudad("MACARA"), buscarCiudad("GALAPAGOS"), (float) 2480.00));
    }*/
}
