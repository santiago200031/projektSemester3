

class Pasajero {
    String ci;
    String nombre;
    String apellido;
    Vuelo vuelo;

    public Pasajero(String ci, String nombre, String apellido, Vuelo vuelo) {
        this.ci = ci.toUpperCase();
        this.nombre = nombre.toUpperCase();
        this.apellido = apellido.toUpperCase();
        this.vuelo = null;
    }

    
    public void imprimirPasajero() {
        System.out.println("CI: " + this.ci.toUpperCase() +
                "\nNombre: " + this.nombre.toUpperCase() +
                "\nApellido: " + this.apellido.toUpperCase());
        this.vuelo.imprimirVuelo();
                
    }

    public void infoPasajero() {
        System.out.println(this.toString());
    }


}
