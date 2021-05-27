package ejercicio1;

public class CuentaCorriente {

    private Double saldo;

    //Constructores
    public CuentaCorriente() {
        saldo = 0.0;
    }

    public CuentaCorriente(Double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.saldo = cuenta.saldo;
    }

    //Metodos
    public Double ingreso(Double ingreso) {
        return this.saldo += ingreso;
    }

    public Double egreso(Double egreso) {
        return this.saldo -= egreso;
    }

    public Double reintegro() {
        return 0.0;
    }

    public void transferencia(CuentaCorriente cuentaDestino, Double monto) {
        egreso(monto);
        cuentaDestino.ingreso(monto);
    }

    //Getter & Setters
    public Double getSaldo() {
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
