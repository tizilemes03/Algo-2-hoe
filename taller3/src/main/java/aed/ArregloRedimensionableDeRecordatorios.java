package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private Recordatorio[] _pusi; 
    private int _contador; 

    public ArregloRedimensionableDeRecordatorios() {
        //throw new UnsupportedOperationException("No implementada aun");
        _pusi = new Recordatorio[10];
        _contador = 0; 
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        ArregloRedimensionableDeRecordatorios newVag = vector.copiar();
        
        this._pusi = newVag._pusi;
        this._pusi = newVag._pusi;
    }

    public int longitud(){
        //throw new UnsupportedOperationException("No implementada aun");
        return _contador;
    }

    public void agregarAtras(Recordatorio i) {
        //throw new UnsupportedOperationException("No implementada aun");
        if (_contador < _pusi.length){
            _pusi[_contador] = i;
            _contador+=1;
        }
        else{
            Recordatorio[] _newPusi = new Recordatorio[_contador*2];
            for(int j= 0; j<_contador; j++){
                _newPusi[j] = _pusi[j];
            }

            _pusi= _newPusi;

            agregarAtras(i);
        }
         
    }

    public Recordatorio obtener(int i) {
        //throw new UnsupportedOperationException("No implementada aun");
        return _pusi[i];

    }
    public void quitarAtras() {
        //throw new UnsupportedOperationException("No implementada aun");
        if (_contador != 0){
            _contador = _contador - 1;
        }
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        //throw new UnsupportedOperationException("No implementada aun");
        _pusi[indice] = valor; 
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        //throw new UnsupportedOperationException("No implementada aun");
        ArregloRedimensionableDeRecordatorios NuevaPuchi = new ArregloRedimensionableDeRecordatorios();

        for(int j= 0; j<_contador; j++){
                NuevaPuchi.agregarAtras( _pusi[j] );
        }

        return NuevaPuchi;
    }

}
