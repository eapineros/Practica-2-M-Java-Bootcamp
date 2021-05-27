package ejercicio5;

import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar fecha;

    //Constructores
    public Fecha() {
        this.fecha = new GregorianCalendar();
    }

    public Fecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "fecha=" + fecha +
                '}';
    }

    public boolean esCorrectaFecha() {
        return true;
    }

    public void agregarUnDia() {

    }

    //Getters and Setters

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
}
