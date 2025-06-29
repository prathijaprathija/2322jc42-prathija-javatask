package Post_ClassDay1;

public class Bank  {
    private int balance = 1000;

    // Synchronized method to prevent race condition
    public synchronized void withdraw(int amount) {
        String user = Thread.currentThread().getName();
        System.out.println(user + " is trying to withdraw ₹" + amount);

        // Simulate processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(user + " was interrupted.");
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.println(user + " withdrawal successful. Remaining balance: ₹" + balance + "\n");
        } else {
            System.out.println(user + " withdrawal failed. Not enough balance. Current balance: ₹" + balance + "\n");
        }
    }
}

class User extends Thread {
    Bank account;
    int amount;

    User(Bank account, String name, int amount) {
        super(name); // Set thread name
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        Bank account = new Bank();

        // Create multiple user threads
        User user1 = new User(account, "User-1", 500);
        User user2 = new User(account, "User-2", 700);
        User user3 = new User(account, "User-3", 300);

        user1.start();
        user2.start();
        user3.start();
    }
}

 



