package Day5;
import java.util.HashSet;

public class UniqeuEmail {
    public static void main(String[] args) {
        
        HashSet<String> emailSet = new HashSet<>();

        
        String[] emails = {
            "user1@example.com",
            "user2@example.com",
            "user1@example.com",  
            "user3@example.com"
        };

       
        for (String email : emails) {
            emailSet.add(email);
        }

        // Print unique email addresses
        System.out.println("Unique email addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}


