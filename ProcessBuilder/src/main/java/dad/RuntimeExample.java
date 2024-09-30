package dad;

import java.io.IOException;

public class RuntimeExample {
    public static void main(String[] args) {
        try {
            // Ejecutar un comando simple
            Runtime.getRuntime().exec("notepad.exe");  // Abrir el bloc de notas en Windows
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}