import java.io.Serializable;

/**
 * @author Mario Anguita Álvarez
 * @version 1.1
 * @see Cuenta
 */

public class Cliente implements Serializable {
    private String nombre;
    private String dni;
    private String direccion;
    private Cuenta cuenta;

    public Cliente(String nombre, String dni, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public void mostrarInformacionCliente() {
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

    public Cuenta getCuenta() {
        return cuenta;
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

}
