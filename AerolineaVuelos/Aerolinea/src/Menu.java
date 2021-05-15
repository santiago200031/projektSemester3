
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {

    static void menuGeneral(Gestor g) throws IOException {
        int option;
        try {
            do {
                Scanner tecla = new Scanner(System.in);
                System.out.println("***************** Agencia de Viajes *****************");
                System.out.println("1.* Añadir Nueva Ciudad");
                System.out.println("2.* Añadir Ruta");
                System.out.println("3.* Crear Vuelo");
                System.out.println("4.* Buscar Vuelo");
                System.out.println("5.* Vuelos Disponibles");
                System.out.println("6.* Vender Boleto");
                System.out.println("7.* Buscar Pasajero");
                System.out.println("8.* Lista de Pasajeros de un Vuelo");
                System.out.println("9.*Buscar Vuelo por Ruta");
                System.out.println("10.* Salir\n");
                System.out.print("Opcion : ");
                option = tecla.nextInt();
                switch (option) {
                    case 1:
                        insertarCiudad(g);
                        break;
                    case 2:
                        insertarRuta(g);
                        break;
                    case 3:
                        insertarVuelo(g);
                        break;
                    case 4:
                        buscarVuelo(g);
                        break;
                    case 5:
                        buscarVueloDisponibles(g);
                        break;
                    case 6:
                        venderBoleto(g);
                        break;
                    case 7:
                        buscarPasajero(g);
                        break;
                    case 8:
                        listaPasajeros(g);
                        break;
                    case 9:
                        buscarVueloRuta(g);
                        break;
                    case 10 :
                         System.out.println("Adios ..........");
                }

            } while (option != 10);
        } catch (Exception e) {
            System.out.println("***Error menuGeneral() : " + e);
        }
    }

    private static void insertarCiudad(Gestor g) {
        System.out.println("**** Añadir Ciudad ****");
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        try {
            String nombre = tecla.nextLine();
            g.ciudades.insertar(nombre);
        } catch (Exception e) {
            System.out.println("***Error insertarCiudad(): " + e);
        }
    }

    private static void insertarRuta(Gestor g) {
        try {
            Scanner tecla = new Scanner(System.in);
            System.out.println("**** Añadir Ruta **** ");
            System.out.print("Ciudad inicial: ");
            String ciudad1 = tecla.nextLine();
            System.out.print("Ciudad Final: ");
            String ciudad2 = tecla.nextLine();
            System.out.print("Distancia: ");
            float distancia = Float.valueOf(tecla.nextLine());
            if (g.ciudades.insertarRuta(ciudad2.toUpperCase(), ciudad2.toUpperCase(), distancia)) {
                System.out.println("Ruta insertada con Exito.");
            }
        } catch (NumberFormatException e) {
            System.out.println("***Error insertarRuta(): " + e);
        }
    }

    private static void insertarVuelo(Gestor g) throws IOException {
        try{
        BufferedReader tecla = new BufferedReader(new InputStreamReader(System.in));
        char op = 'S';
        System.out.println("**** Crear Vuelo ****");
        System.out.print("ID: ");
        int id = Integer.valueOf(tecla.readLine());
        System.out.println("Tipo de vuelo:");
        System.out.println("1.-Directo");
        System.out.println("2.-Escala");
        System.out.print("Opcion (1/2): ");
        int option = Integer.valueOf(tecla.readLine());
        String tipo = option == 1 ? "DIRECTO" : "ESCALA";
        if (tipo.equals("DIRECTO")) {
            System.out.print("Ciudad Origen: ");
            String ciudad1 = tecla.readLine();
            System.out.print("Ciudad Destino: ");
            String ciudad2 = tecla.readLine();
            Ruta ruta = g.buscarRuta(ciudad1.toUpperCase(), ciudad2.toUpperCase());
            RutaVuelo rutaVuelo = new RutaVuelo();
            rutaVuelo.insertarRutaVuelo(ruta);
            g.insertarVuelo(new Vuelo(id, tipo, rutaVuelo));
        } else {
            RutaVuelo rutaVuelo = new RutaVuelo();

            while (op == 'S') {
                int i = 1;
                System.out.println("*** Escalas del Vuelo ***");
                System.out.println("Escala " + i);
                System.out.print("Ciudad Origen:");
                String ciudad1 = tecla.readLine();
                System.out.print("Ciudad Destino:");
                String ciudad2 = tecla.readLine();
                Ruta ruta = g.buscarRuta(ciudad1.toUpperCase(), ciudad2.toUpperCase());
                rutaVuelo.insertarRutaVuelo(ruta);
                System.out.print("Insertar otra Ruta (S/N): ");
                op = tecla.readLine().toUpperCase().charAt(0);
                i++;
            }
            g.insertarVuelo(new Vuelo(id, tipo, rutaVuelo));
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("***Error insertarVuelo(): " + e);
        }

    }

    private static void buscarVuelo(Gestor g) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("**** Buscar Vuelo ****");
        System.out.print("Id del vuelo: ");
        int id = Integer.valueOf(tecla.nextLine());
        try {
            Vuelo vuelo = g.buscarVuelo(id);
            vuelo.imprimirVuelo();
        } catch (Exception e) {
            System.out.println("Vuelo no encontrado. \n***Error: " + e);
        }
    }

    /*
    COMPROBAR LA CANTIDAD DE PASAJEROS_DISP
     */
    private static void buscarVueloDisponibles(Gestor g) {
        System.out.println("**** Buscar Vuelo Disponible****");
        try {
            Nodo aux = g.vuelos.primero;
            while (aux != null) {
                Vuelo vuelo = (Vuelo) aux.inf;

                vuelo.imprimirVuelo();
                System.out.println(" ");
                System.out.println(" ");
                aux = aux.siguiente;
            }
        } catch (Exception e) {
            System.out.println("***Error: " + e);
        }
    }

    private static void venderBoleto(Gestor g) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("*** Datos del Pasajero ***");
        try {
            System.out.print("CI: ");
            String ci = tecla.nextLine();
            System.out.print("Nombre: ");
            String nombre = tecla.nextLine();
            System.out.print("Apellido: ");
            String apellido = tecla.nextLine();
            System.out.print("Id del Vuelo: ");
            int id = Integer.valueOf(tecla.nextLine());
            Vuelo vuelo = g.buscarVuelo(id);
            Pasajero pasajero = new Pasajero(ci, nombre, apellido, vuelo);
            vuelo.registrarPasajero(pasajero);
            pasajero.imprimirPasajero();
        } catch (Exception e) {
            System.out.println("***Error: " + e);
        }
    }

    private static void buscarPasajero(Gestor g) {
        Scanner tecla = new Scanner(System.in);
        Pasajero pasajero;
        System.out.println("*** Buscar Pasajero ***");
        System.out.println("1.* CI\n2.* Nombre Apellido\n3.* Regresar");
        try {
            int opc;
            do {
                System.out.print("Opcion: ");
                opc = Integer.valueOf(tecla.nextLine());
                switch (opc) {
                    case 1:
                        System.out.print("CI: ");
                        String ci = tecla.nextLine();
                        pasajero = g.buscarPasajeroCI(ci);
                        pasajero.imprimirPasajero();
                        break;
                    case 2:
                        System.out.print("Nombre: ");
                        String nombre = tecla.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = tecla.nextLine();
                        pasajero = g.buscarPasajeroNomApe(nombre, apellido);
                        pasajero.imprimirPasajero();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Valor no válido.");
                }
            } while (opc != 1 && opc != 2 && opc != 3);
        } catch (Exception e) {
            System.out.println("Pasajero no encontrado.\n***Error: " + e);
        }
    }

    private static void listaPasajeros(Gestor g) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Id del vuelo: ");
        int id = tecla.nextInt();
        try {
            Vuelo vuelo = g.buscarVuelo(id);
            for (int i = 0; i < vuelo.pasajeros.length; i++) {
                if (vuelo.pasajeros[i] != null) {
                    System.out.println("Pasajero Nº :" + (i + 1));
                    vuelo.pasajeros[i].imprimirPasajero();
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("***Error:" + e);
        }
    }

    private static void buscarVueloRuta(Gestor g) {
        try{
            Scanner tecla = new Scanner(System.in);
            System.out.println("**** Añadir Ruta **** ");
            System.out.print("Ciudad Origen: ");
            String ciudad1 = tecla.nextLine().toUpperCase();
            System.out.print("Ciudad Final: ");
            String ciudad2 = tecla.nextLine().toUpperCase();
            g.buscarVueloRuta(ciudad1, ciudad2);
        }catch(Exception e){
            System.out.println("Error : "+e);
        }
    }

}
