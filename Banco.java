import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void agregarCliente(String nombre, String dni, String direccion, String numeroCuenta) {
        Cliente cliente = new Cliente(nombre, dni, direccion, numeroCuenta);
        clientes.add(cliente);
        System.out.println("Cliente agregado con éxito");
    }

    public Cliente comprobarCliente(String dniOrigen){
        Cliente origen = null;
        for (Cliente c : clientes) {
            if (c.getDni().equals(dniOrigen)) {
                origen = c;
            }
        }
        return origen;
    }

    public boolean traspasarDinero(String dniOrigen, String dniDestino, double cantidad) {
        Cliente origen = comprobarCliente(dniOrigen);
        Cliente destino = comprobarCliente(dniDestino);

        if (origen != null && destino != null) {
            if (cantidad < 0) {
                System.out.println("El dinero a traspasar no puede ser negativo");
                return false;
            } else {
                if (cantidad <= origen.getSaldo()) {
                    origen.sacarDinero(cantidad);
                    destino.ingresarDinero(cantidad);
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

    public Cliente getCliente(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void listarClientes() {
        for (Cliente c : clientes) {
            c.mostrarInformacionCliente();
        }
    }
}
