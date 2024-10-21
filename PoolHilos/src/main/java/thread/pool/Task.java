package thread.pool;

class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing task: " + taskName + " by thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simular alguna tarea costosa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed task: " + taskName + " by thread: " + Thread.currentThread().getName());
    }
}