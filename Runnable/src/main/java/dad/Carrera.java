package dad;

// Clase principal para ejecutar la simulación de la carrera
public class Carrera {
    public static void main(String[] args) {
        // Crear instancias de corredores con diferentes velocidades
        Corredor corredor1 = new Corredor("Usain Bolt", 50); // Velocidad rápida
        Corredor corredor2 = new Corredor("Carl Lewis", 70); // Velocidad media
        Corredor corredor3 = new Corredor("Jesse Owens", 100); // Velocidad lenta

        // Crear hilos para cada corredor
        Thread hilo1 = new Thread(corredor1);
        Thread hilo2 = new Thread(corredor2);
        Thread hilo3 = new Thread(corredor3);

        // Iniciar la carrera
        System.out.println("¡La carrera comienza!");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}