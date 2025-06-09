import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String dni;
    private String direccion;
    private double saldo;
    private String numeroCuenta;

    public Cliente(String nombre, String dni, String direccion, String numeroCuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public boolean ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso exitoso");
            return true;
        } else {
            System.out.println("La cantidad a ingresar no puede ser negativa");
        }
        return false;
    }

    public boolean sacar(double cantidad) {
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


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
