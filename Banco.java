import java.util.ArrayList;

/**
 * Esta clase contiene las funcionalidades necesarias para añadir clientes a la lista de clientes
 * @author Mario Anguita Álvarez
 * @version 1.1
 * @see Cliente
 */

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Metodo para añadir un cliente al banco
     * @since 1.0
     * @param nombre (String): Nombre del Cliente
     * @param dni (String): Dni del Cliente
     * @param direccion (String): Dirección de residencia del cliente
     * @param cuenta (Cuenta): Cuenta de banco perteneciente al cliente
     */
    public void agregarCliente(String nombre, String dni, String direccion, Cuenta cuenta) {
        Cliente cliente = new Cliente(nombre, dni, direccion, cuenta);
        clientes.add(cliente);
        System.out.println("Cliente agregado con éxito");
    }

    /**
     * Metodo para comprobar la existencia del cliente
     * @since 1.0
     * @param dniOrigen (String): Dni del Cliente
     * @return (Cliente): Devuelve el cliente si existe
     */
    public Cliente comprobarCliente(String dniOrigen){
        Cliente origen = null;
        for (Cliente c : clientes) {
            if (c.getDni().equals(dniOrigen)) {
                origen = c;
            }
        }
        return origen;
    }

    /**
     * Metodo para traspasar dinero entre cuentas
     * @since 1.0
     * @param dniOrigen (String): Dni del Cliente que envía el dinero
     * @param dniDestino (String): Dni del Cliente que recibe el dinero
     * @param cantidad (double): Cantidad a traspasar
     * @return (Boolean): Estado de la transacción: True si se ha realizado correctamente, False si no se ha realizado correctamente
     */
    public boolean traspasarDinero(String dniOrigen, String dniDestino, double cantidad) {
        Cliente origen = comprobarCliente(dniOrigen);
        Cliente destino = comprobarCliente(dniDestino);

        if (origen != null && destino != null) {
            if (cantidad < 0) {
                System.out.println("El dinero a traspasar no puede ser negativo");
                return false;
            } else {
                if (cantidad <= origen.getCuenta().getSaldo()) {
                    origen.getCuenta().sacarDinero(cantidad);
                    destino.getCuenta().ingresarDinero(cantidad);
                    System.out.println("Traspaso exitoso");
                    return true;
                } else {
                    System.out.println("Fondos insuficientes en la cuenta de origen");
                }
            }
        } else {
            System.out.println("Uno o ambos clientes no encontrados");
        }
        return false;
    }

    /**
     * Metodo para saber qué cliente se quiere usar
     * @since 1.0
     * @param dni (String)
     * @return Se devuelve el cliente si existe
     */
    public Cliente getCliente(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Metodo para mostrar por pantalla una lista de los clientes del banco
     */
    public void listarClientes() {
        for (Cliente c : clientes) {
            c.mostrarInformacionCliente();
        }
    }
}
