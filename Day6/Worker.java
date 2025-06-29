package Day6;

public class Worker  extends Thread {
    String taskName;

    Worker(String name) {
        this.taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Step " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " finished.\n");
    }



    public static void main(String[] args) {
        Worker t1 = new Worker("Thread A");
        Worker t2 = new Worker("Thread B");

        System.out.println("Starting Thread A...");
        t1.start();

        try {
            t1.join(); // Wait until Thread A finishes
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }

        System.out.println("Starting Thread B after Thread A finishes...");
        t2.start();
    }
}



