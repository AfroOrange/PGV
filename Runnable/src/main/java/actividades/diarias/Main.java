package actividades.diarias;

public class Main {
    public static void main(String[] args) {

        TareaDiaria primeraTarea = new TareaDiaria("Preparar el desayuno");
        TareaDiaria segundaTarea = new TareaDiaria("Hacer ejercicio");
        TareaDiaria terceraTarea = new TareaDiaria("Leer un libro");

        // Crear hilos para cada tarea
        Thread hilo1 = new Thread(primeraTarea);
        Thread hilo2 = new Thread(segundaTarea);
        Thread hilo3 = new Thread(terceraTarea);

        // Iniciar las tareas
        System.out.println("Se inician las tareas");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
