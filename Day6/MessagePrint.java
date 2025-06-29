package Day6;


	class MessagePrint implements Runnable {
	    String message;

	    // Constructor to set message
	    MessagePrint(String msg) {
	        this.message = msg;
	    }

	    // This code runs in the thread
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(message + " - " + i);
	            try {
	                Thread.sleep(500); // wait 0.5 seconds
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Create Runnable objects with messages
	        Runnable task1 = new MessagePrint("Hello from Thread 1");
	        Runnable task2 = new MessagePrint("Hello from Thread 2");

	        // Create Thread objects
	        Thread thread1 = new Thread(task1);
	        Thread thread2 = new Thread(task2);

	        // Start threads
	        thread1.start();
	        thread2.start();
	    }
	}



