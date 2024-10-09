package dad;
class Corredor implements Runnable {

    private final String nombre;
    private final int velocidad; // Tiempo en milisegundos para avanzar un "metro"
    private static final int DISTANCIA_TOTAL = 100; // Distancia total de la carrera en metros
    private static int posicion = 1; // Posición compartida para mostrar el orden de llegada

    public Corredor(String nombre, int velocidad) {

        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    @Override
    public void run() {
        int distanciaRecorrida = 0;

        while (distanciaRecorrida < DISTANCIA_TOTAL) {
            try {
                // El corredor avanza un metro y duerme según su velocidad
                Thread.sleep(velocidad);
                distanciaRecorrida++;
                System.out.println(nombre + " ha avanzado " + distanciaRecorrida + " metros.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Cuando termina la carrera, muestra la posición de llegada
        System.out.println(nombre + " ha terminado la carrera en la posición " + obtenerPosicion() + "!");
    }

    // Método sincronizado para asegurar que la posición se actualice correctamente
    private synchronized int obtenerPosicion() {
        return posicion++;
    }
}