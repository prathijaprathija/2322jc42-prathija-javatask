package Day6;


	class TicketBooking{
	    int availableSeats = 5;

	    // Synchronized method to book tickets
	    synchronized void bookTicket(String user, int seats) {
	        System.out.println(user + " is trying to book " + seats + " seat(s).");

	        // Simulate delay
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            System.out.println("Interrupted");
	        }

	        if (seats <= availableSeats) {
	            availableSeats -= seats;
	            System.out.println("Booking successful for " + user);
	        } else {
	            System.out.println("Booking failed for " + user + " (Not enough seats)");
	        }

	        System.out.println("Remaining seats: " + availableSeats + "\n");
	    }
	}

	class User extends Thread {
	    TicketBooking booking;
	    String userName;
	    int seatsToBook;

	    User(TicketBooking booking, String name, int seats) {
	        this.booking = booking;
	        this.userName = name;
	        this.seatsToBook = seats;
	    }

	    public void run() {
	        booking.bookTicket(userName, seatsToBook);
	    }


	
	    public static void main(String[] args) {
	        TicketBooking bookingSystem = new TicketBooking();

	        // Create multiple user threads
	        User user1 = new User(bookingSystem, "Alice", 2);
	        User user2 = new User(bookingSystem, "Bob", 1);
	        User user3 = new User(bookingSystem, "Charlie", 3);

	        user1.start();
	        user2.start();
	        user3.start();
	    }

		public void bookTicket(String userName, int seatsToBook) {
			// TODO Auto-generated method stub
			
		}
	}


