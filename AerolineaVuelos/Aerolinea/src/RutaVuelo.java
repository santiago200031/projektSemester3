

class RutaVuelo {
    ListaSEC rutas;

    RutaVuelo() {
        this.rutas = new ListaSEC();
    }

    boolean insertarRutaVuelo(Ruta ruta) {
        return this.rutas.insertar(ruta);
    }

    //Hacer Metodo
    public void imprimirRutaVuelo() {
        if(this.rutas.primero == null){
            return;
        }else{
            int pos =1;
            Nodo aux = this.rutas.primero;
            while(aux != null){
                Ruta ruta =(Ruta) aux.inf;
                System.out.println("Ruta "+pos);
                ruta.imprimirRuta();
                aux=aux.siguiente;
                pos++;
            }
        }
    }
}
