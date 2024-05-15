package aed;

public class Agenda {
    
    private Fecha _fechaXD;
    private ArregloRedimensionableDeRecordatorios _recordatorioXD;

    public Agenda(Fecha fechaActual) {
        //throw new UnsupportedOperationException("No implementada aun");
        this._fechaXD = new Fecha(fechaActual);
        this._recordatorioXD = new ArregloRedimensionableDeRecordatorios();

    }


    public void agregarRecordatorio(Recordatorio recordatorio) {
        //throw new UnsupportedOperationException("No implementada aun");
        this._recordatorioXD.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String res = "";
        
        res = res + _fechaXD.toString() + "\n" + "====="+"\n";

        int i=0; 
        while ( i < _recordatorioXD.longitud()) {
            
            Recordatorio elem=_recordatorioXD.obtener(i);
            
            if (_fechaXD.equals(elem.fecha())){

                String hs = String.valueOf(elem.horario().hora()) +":"+ String.valueOf(elem.horario().minutos());

                String Subres= elem.mensaje() + " @ " + elem.fecha().toString() + " " + hs;
            
                res = res + Subres + "\n";
            
            }
            i+=1;
        }

        return res;
        //throw new UnsupportedOperationException("No implementada aun");

    }

    public void incrementarDia() {
        //throw new UnsupportedOperationException("No implementada aun");
        _fechaXD.incrementarDia();
    }

    public Fecha fechaActual() {
        //throw new UnsupportedOperationException("No implementada aun");
        return new Fecha(_fechaXD);
        // yo uso el constructor anti aliasing para crear una copia de mi fecha, no es la misma instancia pero son iguales, pues una es la copia de la otra.
    }


}

