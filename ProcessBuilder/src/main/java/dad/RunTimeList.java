package dad;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class RunTimeList {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Comando para ejecutar: ");
        String comando = scanner.next();

        System.out.print("Valores para agregar: ");
        String valorComando = scanner.next();

        System.out.print("Valores para agregar: ");
        String valorOpcional = scanner.next();


        Process process = new ProcessBuilder("CMD", "/C", comando, valorComando, valorOpcional).start();

        try {
            InputStream inputStream = process.getInputStream();

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        int exitValue;
        try {
            exitValue = process.waitFor();
            System.out.println("Valor de Salida: " + exitValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}