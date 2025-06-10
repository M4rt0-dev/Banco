# Aplicación de un banco.

## Descripción de este proyecto.
<br>
Este es un proyecto para un trabajo final de la asignatura de entornos de desarrollo, en este proyecto te encontrarás una aplicación creada para la gestion de un banco.

`version 1.1`

Para la instalación de este proyecto primero descomprimir el archivo si esta comprimido, posteriormente necesitaras un IDE capaz de reproducir archivos `.java` posteriormente lo ejecutaras con la consola.

### Autores

1.- `Mario Anguita Álvarez`

2.- `Sergio Velasco`

### Instrucciones de uso

Iniciar el IDE y abrir la carpeta en la que se encuentran los archivos previamente descomprimidos, posteriormente deberas escribir en codigo de java como en los ejemplos que te dejaremos mas abajo las acciones necesarias que quieras llevar a cabo, posteriormente tendras que guardar los cambios en la base de datos, y, cada vez que quieras hacer cambios en la base de daros tendrás que primero cargar la base de datos y posteriormente hacer los cambios, tras esto volver a guardar la base de datos.

Ejemplos:

```java
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
```
