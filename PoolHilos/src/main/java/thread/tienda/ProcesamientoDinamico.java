package thread.tienda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcesamientoDinamico {
    public static void main(String[] args) {
        // Crear un pool de hilos dinámico utilizando newCachedThreadPool()
        ExecutorService poolDeHilos = Executors.newCachedThreadPool();

        // Enviar 10 pedidos al pool de hilos para ser procesados
        for (int i = 1; i <= 10; i++) {
            Pedido pedido = new Pedido(i);
            poolDeHilos.execute(pedido);
        }

        // Cerrar el pool de hilos después de enviar todas las tareas
        poolDeHilos.shutdown();
    }
}