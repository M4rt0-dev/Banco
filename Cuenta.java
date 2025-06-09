
/**
 * @author Mario Anguita Álvarez
 * @version 1.1
 * @see Cliente
 */

public class Cuenta {

    private double saldo;
    private String numeroCuenta;

    public Cuenta(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public boolean ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso exitoso");
            return true;
        } else {
            System.out.println("La cantidad a ingresarDinero no puede ser negativa");
        }
        return false;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retirada exitosa");
            return true;
        } else if (cantidad < 0) {
            System.out.println("La cantidad a retirar no puede ser negativa");
            return false;
        } else {
            System.out.println("La cantidad a retirar no puede ser mayor al limite de la cuenta");
        }
        return false;
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

}
