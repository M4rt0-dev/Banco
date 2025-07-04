import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene las funcionalidades para interactuar con el archivo de la base de datos
 * @author Mario Anguita Álvarez
 * @version 1.1
 */

public class BaseDatos {
    private static final String ARCHIVO = "datos_bancarios.txt";
    private static final String RUTA = System.getProperty("user.dir");
    private static final String SEPARATOR = System.lineSeparator();
    private static final String FOLDER = "resources";
    private static final String RUTA_FINAL = RUTA + SEPARATOR + FOLDER + SEPARATOR + ARCHIVO;

    /**
     * Metodo para guardar los clientes en un archivo para la base de datos
     * @since 1.0
     * @param lista (ArrayList) lista de datos que se guarda
     */
    public void guardar(ArrayList<Cliente> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_FINAL))) {
            oos.writeObject(lista);
        } catch (FileNotFoundException exception) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura");
        }
    }

    /**
     * Metodo para cargar el archivo de la base de datos previamente guardado
     * @since 1.0
     * @return devuelve el archivo de clientes si existe, si no existe o no ha sido creado todavía devuelve null
     */
    public ArrayList<Cliente> cargarTodos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(RUTA_FINAL)))){
            return (ArrayList<Cliente>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } catch (ClassNotFoundException e) {
            System.out.println("La clase libro no existe");
        }
        return null;
    }
}
