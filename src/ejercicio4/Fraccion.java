package ejercicio4;

public class Fraccion {

    private int numerador;
    private int denominador;

    //Constructor
    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Metodos
    public Fraccion sumar(Fraccion fraccion) {
        numerador = numerador * fraccion.denominador + denominador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;
        return this;
    }

    public Fraccion sumar(int entero) {
        numerador = numerador + denominador * entero;
        denominador = denominador;
        return this;
    }

    public Fraccion restar(Fraccion fraccion) {
        numerador = numerador * fraccion.denominador - denominador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;
        return this;
    }

    public Fraccion restar(int entero) {
        numerador = numerador - denominador * entero;
        denominador = denominador;
        return this;
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        numerador = numerador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;
        return this;
    }

    public Fraccion multiplicar(int entero) {
        numerador = numerador * entero;
        denominador = denominador;
        return this;
    }

    public Fraccion dividir(Fraccion fraccion) {
        numerador = numerador * fraccion.denominador;
        denominador = fraccion.numerador * denominador;
        return this;
    }

    public Fraccion dividir(int entero) {
        numerador = numerador;
        denominador = entero * denominador;
        return this;
    }

    //Getter and Setter
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
