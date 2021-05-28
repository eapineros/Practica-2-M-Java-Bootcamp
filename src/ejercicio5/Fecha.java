package ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar fecha;

    //Constructores
    public Fecha() {
        this.fecha = new GregorianCalendar();
    }

    public Fecha(int año, int mes, int dia) {
        this.fecha = new GregorianCalendar(año, mes, dia);
    }

    @Override
    public String toString() {
        return this.fecha.get(Calendar.DATE) + "/" +
                this.fecha.get(Calendar.MONTH) + "/" +
                this.fecha.get(Calendar.YEAR);
    }


    public void agregarUnDia() {
        this.fecha.add(Calendar.DATE, 1);
    }

    //Getters and Setters

    public int getDia() {
        return this.fecha.get(Calendar.DATE);
    }

    public void setDia(int dia) {
        this.fecha.set(Calendar.DATE, dia);
    }

    public int getMes() {
        return this.fecha.get(Calendar.MONTH);
    }

    public void setMes(int mes) {
        this.fecha.set(Calendar.MONTH, mes);
    }

    public int getAño() {
        return this.fecha.get(Calendar.YEAR);
    }

    public void setAño(int año) {
        this.fecha.set(Calendar.YEAR, año);
    }
}
