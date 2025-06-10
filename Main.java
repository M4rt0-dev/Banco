
/**
 * Clase Main donde se ejecutan los comandos
 * @author Mario Anguita Álvarez
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cuenta cuenta1 = new Cuenta(500,"CUENTA1");
        Cuenta cuenta2 = new Cuenta(500,"CUENTA2");
        Cuenta cuenta3 = new Cuenta(500,"CUENTA3");
        Cuenta cuenta4 = new Cuenta(500,"CUENTA4");

        banco.agregarCliente("Alice", "111A", "Calle A", cuenta1);
        banco.agregarCliente("Bob", "222B", "Calle B", cuenta2);
        banco.agregarCliente("Ron", "222C", "Calle C", cuenta3);
        banco.agregarCliente("Ren", "222D", "Calle D", cuenta4);

        banco.getCliente("111A").getCuenta().ingresarDinero(1000);
        banco.getCliente("111A").getCuenta().sacarDinero(200);
        banco.traspasarDinero("111A", "222B", 300);
        banco.traspasarDinero("111A", "222B", -45);

        banco.listarClientes();
        banco.getCliente("111A").getCuenta().ingresarDinero(1000);

    }
}
