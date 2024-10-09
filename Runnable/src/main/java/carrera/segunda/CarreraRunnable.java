package carrera.segunda;

public class CarreraRunnable {

    public static void main(String[] args) {
        // Crear e iniciar la carrera con 5 corredores
        int numeroDeCorredores = 5;
        Carrera carrera = new Carrera(numeroDeCorredores);
        carrera.iniciarCarrera();
    }
}
