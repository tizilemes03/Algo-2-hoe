package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados
    private Nodo first;
    private Nodo last;
    private int contador;
    private class Nodo {
        // Completar
        T valor;
        Nodo sig;
        Nodo ant;

    }

    public ListaEnlazada() {
        
        first = null;
        last = null;
        contador = 0;
    }

    public int longitud() {
        
        return contador;

    
    }

    public void agregarAdelante(T elem) {
        
        Nodo nuevito = new Nodo();
        if (contador == 0){
            nuevito.valor= elem;
            first = nuevito;
            last = nuevito;
        }

        else{

            nuevito.valor= elem;
            nuevito.ant= null;
            nuevito.sig= first;

            first = nuevito;
        }

        contador +=1;
    }

    public void agregarAtras(T elem) {
        
        Nodo newito = new Nodo();
        if (contador == 0){
            newito.valor= elem;
            first = newito;
            last = newito;
        }

        else{
            newito.valor= elem;
            this.last.sig = newito;
            newito.sig= null;
            newito.ant= last;

            last = newito;
        }

        contador +=1;

    }

    public T obtener(int i) {
        Nodo este = this.first;
        int j = 0;
        while (j != i){
            este = este.sig;
            j++;
        }  
        return este.valor;
    }

    public void eliminar(int i) {
        Nodo este = this.first;
        int j = 0;
        while (j != i){
            este = este.sig;
            j++;
        }
        
        if (contador == 1){
            last= null;
            first= null;
        }    
        
        else{
            
            if( (este != this.last) && (este != this.first)){
                (este.sig).ant = este.ant;
                (este.ant).sig = este.sig; 
                este.sig= null;
                este.ant= null;
            }
            if (este == last){
                last = este.ant;

                este.ant.sig=null;
                este.ant=null;
            }    
            if (este == first){
                first= este.sig;

                este.sig.ant = null;
                este.sig = null;
            }
    

        }

        contador = contador - 1;
    
    }


    public void modificarPosicion(int indice, T elem) {
       
        Nodo este = this.first;
        int j = 0;
        while (j != indice){
            este = este.sig;
            j++;
        }
        este.valor = elem;

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

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }


        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}

