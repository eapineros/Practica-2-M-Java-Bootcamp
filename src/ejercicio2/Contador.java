package ejercicio2;

public class Contador {

    private int valor;

    //Constructores
    public Contador() {

    }

    public Contador(int val) {
        this.valor = val;
    }

    public Contador(Contador newContador) {
        this.valor = newContador.valor;
    }

    //Metodos
    public int incrementar() {
        return valor++;
    }

    public int incrementar(int incremento) {
        return valor += incremento;
    }

    public int decrementar() {
        return valor--;
    }

    public int decremenatr(int decremento) {
        return valor -= decremento;
    }


    //Getter and Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
