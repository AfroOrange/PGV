package dad;

public class TareaDiaria implements Runnable {

    private String nombre;
    public static final int PROGRESO = 5;

    @Override
    public void run() {

        System.out.println(nombre + " ha comenzado");

        int progresoActual = 0;

        while (progresoActual < PROGRESO) {
            try {
                Thread.sleep(1000);
                progresoActual++;
                System.out.println(nombre + " - Progreso " + progresoActual + "/" + PROGRESO);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(nombre + " ha finalizado");

    }

    public TareaDiaria(String nombre) {
        this.nombre = nombre;

    }
    public String getName() {
        return nombre;
    }
}
