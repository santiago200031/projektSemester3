
public class Ruta {
    NodoCiudad ciudadStart;
    NodoCiudad ciudadEnd;
    float distancia;

    public Ruta(NodoCiudad ciudadStart, NodoCiudad ciudadEnd, float distancia) {
        this.ciudadStart = ciudadStart;
        this.ciudadEnd = ciudadEnd;
        this.distancia = distancia;
    }

    //Corregir (Imprimir el info)
    
    public void imprimirRuta() {
        System.out.println( "C. Salida: " + this.ciudadStart.nombre +
                "\nC. Llegada: " + this.ciudadEnd.nombre +
                "\nDistancia: " + this.distancia);
    }

    public void infoRuta() {
        System.out.println(this.toString());
    }
}
