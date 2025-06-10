import java.io.Serializable;

/**
 * Este archivo contiene las funcionalidades para crear e interactuar con clientes
 * @author Mario Anguita Álvarez
 * @version 1.1
 * @see Cuenta
 */

public class Cliente implements Serializable {
    private String nombre;
    private String dni;
    private String direccion;
    private Cuenta cuenta;

    /**
     * Constructor para los clientes
     * @since 1.0
     * @param nombre (String) Nombre del cliente
     * @param dni (String) DNI del cliente
     * @param direccion (String) Direccion postal del cliente
     * @param cuenta (Cuenta perteneciente al cliente)
     */
    public Cliente(String nombre, String dni, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    /**
     * Metodo para mostrar la información del cliente
     * @since 1.0
     */
    public void mostrarInformacionCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
    }

    /**
     * Metodo para obtener el nombre del cliente
     * @since 1.1
     * @return Devuelve el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el DNI del cliente
     * @since 1.1
     * @return Devuelve el DNI del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Metodo para obtener la direccion del cliente
     * @since 1.1
     * @return Devuelve la direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para obtener la cuenta del cliente
     * @since 1.1
     * @return Devuelve la cuenta del cliente
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para cambiar el nombre del cliente
     * @since 1.1
     * @param nombre (String) Nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para cambiar el DNI del cliente
     * @since 1.1
     * @param dni (String) DNI del cliente
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Metodo para cambiar la direccion del cliente
     * @since 1.1
     * @param direccion (String) Direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
