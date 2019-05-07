
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        User app = new User();
        app.connect();

        System.out.println("Enter your FirstName");
        String newName = scanner.nextLine();

        System.out.println("Enter your seconName");
        String NewLastName = scanner.nextLine();


        user.setName(newName ,  NewLastName);
        System.out.println(user.getName());


    }
}
