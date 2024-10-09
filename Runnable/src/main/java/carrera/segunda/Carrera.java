package carrera.segunda;

class Carrera {
    private int numeroDeCorredores;
    private Thread[] corredoresThreads;

    public Carrera(int numeroDeCorredores) {
        this.numeroDeCorredores = numeroDeCorredores;
        corredoresThreads = new Thread[numeroDeCorredores];
    }

    // Método para iniciar la carrera
    public void iniciarCarrera() {
        System.out.println("¡La carrera ha comenzado!");
        for (int i = 0; i < numeroDeCorredores; i++) {
            SecondRunners corredor = new SecondRunners("Corredor " + (i + 1));
            corredoresThreads[i] = new Thread(corredor);
            corredoresThreads[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread t : corredoresThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("¡La carrera ha terminado!");
    }
}