package carrera.segunda;

class SecondRunners implements Runnable {

    private static final int META = 100; // Metros totales de la carrera
    private String nombre;
    private int posicionActual = 0;
    private static String ganador = null;

    public SecondRunners(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (posicionActual < META && ganador == null) {
            // El corredor avanza una distancia aleatoria en cada paso
            int distancia = (int) (Math.random() * 10) + 1;
            posicionActual += distancia;

            // Imprimir el avance del corredor
            System.out.println(nombre + " ha avanzado a la posición " + posicionActual + " metros.");

            // Simular tiempo de descanso entre pasos
            try {
                Thread.sleep((int) (Math.random() * 500) + 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Si el corredor alcanza o supera la meta y no hay ganador aún, se declara como ganador
            if (posicionActual >= META && ganador == null) {
                ganador = nombre;
                System.out.println("¡" + nombre + " ha ganado la carrera!");
            }
        }
    }
}