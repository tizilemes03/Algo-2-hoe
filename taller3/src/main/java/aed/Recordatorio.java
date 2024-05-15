package aed;

public class Recordatorio {
    private Fecha fecha;
    private String mensaje;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.fecha= new Fecha( fecha );
        this.horario= horario;
        this.mensaje= mensaje;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        
        return (new Fecha(this.fecha) );
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje + " @ " + this.fecha.toString() + " " + this.horario.toString();
    }

    @Override
    public boolean equals(Object otro) {
        Recordatorio other = (Recordatorio)otro;
        return ( ( this.fecha.equals(other.fecha) ) && ( this.horario.equals(other.horario) ) && ( this.mensaje.equals(other.mensaje) ));
        // return (this.getClass() == otro.getClass());
    }

}
