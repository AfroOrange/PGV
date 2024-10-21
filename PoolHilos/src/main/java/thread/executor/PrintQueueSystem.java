package thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintQueueSystem {
    public static void main(String[] args) {
        ExecutorService printer = Executors.newSingleThreadExecutor();

        printer.execute(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Documento 1 impreso");
        });

        printer.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Documento 2 impreso");
        });

        printer.shutdown();
    }
}
