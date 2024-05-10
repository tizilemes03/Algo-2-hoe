package aed;

public class Fecha {
    private int _dia;
    private int _mes;
    public Fecha(int dia, int mes) {
        
        _dia= dia;
        _mes= mes;    
        //los constructores son utilizados para construir clases, esta clase inicializa la 
        //primer instancia de la clase
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Fecha(Fecha fecha) {
        //tratar de entender que es esto_dia= fecha._dia;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return _dia;
        //throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer mes() {
        //throw new UnsupportedOperationException("No implementada aun");
        return _mes;
    }

    public String toString() {
        //throw new UnsupportedOperationException("No implementada aun");
        return  String.valueOf(_dia) + "/" + String.valueOf(_mes);
    }

    @Override
    public boolean equals(Object otra) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void incrementarDia() {
        //throw new UnsupportedOperationException("No implementada aun");
        _dia+=1;
        if (_dia > diasEnMes(_mes) ){
            _dia = _dia - diasEnMes(_mes);
            _mes = (_mes + 1)%12; // me sirve para el caso 1/13
        }
        
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
