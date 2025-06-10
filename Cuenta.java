
/**
 * Esta clase tiene las funcionalidades para crear e interactuar con cuentas
 * @author Mario Anguita Álvarez
 * @version 1.1
 */

public class Cuenta {

    private double saldo;
    private String numeroCuenta;

    /**
     * Constructor para las cuentas
     * @since 1.1
     * @param saldo (Double) Saldo que tiene la cuenta
     * @param numeroCuenta (String) identificador de la cuenta
     */
    public Cuenta(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Metodo para ingresar dinero
     * @since 1.1
     * @param cantidad (Double) Cantidad a ingresar
     * @return (Boolean) Devuelve true si se ha efectuado correctamente, devuelve false si no se ejecuta correctamente
     */
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

    /**
     * Metodo para retirar dinero
     * @since 1.1
     * @param cantidad (Double) Cantidad a retirar
     * @return (Boolean) Devuelve true si se ha efectuado correctamente, devuelve false si no se ejecuta correctamente
     */
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

    /**
     * Metodo para consultar el saldo actual de tu cuenta
     * @since 1.1
     */
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    /**
     * Metodo para cambiar el identificador de la cuenta
     * @since 1.1
     * @param numeroCuenta (String) identificador de la cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Metodo para obtener el saldo
     * @since 1.1
     * @return Devuelve el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para obtener el identificador de la cuenta
     * @since 1.1
     * @return Identificador de la cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

}
