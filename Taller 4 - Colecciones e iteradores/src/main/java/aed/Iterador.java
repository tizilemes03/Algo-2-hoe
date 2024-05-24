package aed;

interface Iterador<T> {
    
    /**
     * Devuelve true si hay un elemento siguiente en la colección.
     * 
     */
    public boolean haySiguiente();
    
    /**
     * Devuelve true si hay un elemento anterior en la colección.
     * 
     */
    public boolean hayAnterior();

    /**
     * Devuelve el elemento siguiente en la colección y avanza el iterador.
     * 
     */
    public T siguiente();

    /**
     * Devuelve el elemento anterior en la colección y retrocede el iterador.
     * 
     */
    public T anterior();

}



public ListaEnlazada<T> copiar() {
    ListaEnlazada<T> Copita = new ListaEnlazada<>();
    
    Nodo actual = first;
    
    for(int j= 0; j< contador; j++){
    
    
        Copita.agregarAtras(actual.valor);
    
    
        actual = actual.sig;
    
    
    }


    return Copita;
}

public ListaEnlazada(ListaEnlazada<T> lista) {
    
    first = null;
    last = null;

    for( int i = 0 ; i< lista.longitud(); i++){

        this.agregarAtras(lista.obtener(i));
    }


}

@Override
public String toString() {
    
    String res = "[";

    Nodo actual = first;

    int i = 0;

    while (i < contador){

        if( i == contador -1 ){
            res = res + String.valueOf(actual.valor);
        }
        
        else{
            res = res + String.valueOf(actual.valor)+", ";
        }


        actual = actual.sig;
        i += 1;

    }

    res = res.concat("]");

    return res;
}