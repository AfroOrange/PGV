package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Crear un pool de hilos con un número fijo de hilos
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Crear tareas para ejecutar
        for (int i = 0; i < 10; i++) {
            Runnable task = new Task("" + i);
            // Enviar la tarea al pool de hilos
            executor.execute(task);
        }

        // Indicar que no se enviarán más tareas, pero las tareas actuales deben completarse
        executor.shutdown();
    }
}

