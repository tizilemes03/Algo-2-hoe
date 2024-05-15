package aed;

public class Fecha {
    private int _day;
    private int _month;


    public Fecha(int dia, int mes) {
        _day=dia;
        _month=mes;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Fecha(Fecha fecha) {
        _day= fecha.dia();
        _month= fecha.mes();
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return _day;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer mes() {
        return _month;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public String toString() {
        return (String.valueOf(_day) +"/"+ String.valueOf(_month));
        //throw new UnsupportedOperationException("No implementada aun");
    }

    @Override
    public boolean equals(Object otra) {
        
        return (this.toString().equals( otra.toString() ) && (otra.getClass() == this.getClass()));
        //return (_day==( otra ) && (_month== otra ) );
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public void incrementarDia() {
        if( (_day+1)> diasEnMes(_month)){
            _day= 1;
            if(_month==12){
                _month=1;
            }
            else{
                _month++;
            }
        }

        else {
            _day++;
        }
        
        //throw new UnsupportedOperationException("No implementada aun");
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}