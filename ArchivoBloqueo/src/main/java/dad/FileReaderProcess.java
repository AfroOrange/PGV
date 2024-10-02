package dad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderProcess {

    private static final String LOCK_FILE = "lockfile.lock";
    private static final String DATA_FILE = "data.txt";

    public static void main(String[] args) {

        File lockFile = new File(LOCK_FILE);

        // Esperar a que el archivo de bloqueo desaparezca
        System.out.println("Esperando a que se libere el archivo de bloqueo...");

        while (lockFile.exists()) {
            try {
                Thread.sleep(1000); // Pausa por 1 segundo antes de verificar de nuevo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Leer el archivo de datos
        System.out.println("Archivo de bloqueo liberado. Leyendo el archivo de datos...");

        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Leído: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Proceso de lectura completado.");
    }
}
