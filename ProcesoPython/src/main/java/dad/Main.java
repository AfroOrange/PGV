package dad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {

        try {
            Process process = new ProcessBuilder("Python",
                    "C:\\Users\\elwiw\\Documents\\Python\\Python PGV\\proceso_python.py").start();

            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            process.waitFor();

            int exitStatus = process.exitValue();
            System.out.println("Retorno " + br.readLine());
            System.out.println("Valor de salida " + exitStatus);

        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}