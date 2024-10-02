package dad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterProcess {

    private static final String LOCK_FILE = "lockfile.lock";
    private static final String DATA_FILE = "data.txt";

    public static void main(String[] args) {

        File lockFile = new File(LOCK_FILE);

        try {
            // Crear el archivo de bloqueo
            if (lockFile.createNewFile()) {
                System.out.println("Archivo de bloqueo creado. Comenzando la escritura de datos...");

                // Crear el archivo de datos y escribir información en él
                FileWriter writer = new FileWriter(DATA_FILE);
                writer.write("Datos importantes generados por el proceso de escritura.\n");
                writer.write("Línea 1: Información relevante.\n");
                writer.write("Línea 2: Más datos interesantes.\n");

                writer.close();
                System.out.println("Escritura completada. Eliminando el archivo de bloqueo...");

                lockFile.delete(); // Eliminar el archivo de bloqueo al finalizar la escritura
                System.out.println("Archivo de bloqueo eliminado. Proceso de escritura finalizado.");
            } else {
                System.out.println("El proceso de escritura ya está en ejecución o el archivo de bloqueo no pudo ser creado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}