package aed;

public class Horario {
    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        _hora= hora;
        _minutos= minutos;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public int hora() {
        return _hora;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public int minutos() {
        return _minutos;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    @Override
    public String toString() {
        return( String.valueOf(_hora) + ":" + String.valueOf(_minutos+100).substring(1,3) );
        //throw new UnsupportedOperationException("No implementada aun");
    }

    @Override
    public boolean equals(Object otro) {
        return( this.toString().equals(otro.toString()) && this.getClass()==otro.getClass());
    }

}