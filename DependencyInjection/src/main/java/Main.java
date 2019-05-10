
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {


    public static void main(String[] args) {


        // write your code here
        Scanner scanner = new Scanner(System.in);

        User users = new User();
        User app = new User();
        app.connect();

        System.out.println(" id");
        int  newId = scanner.nextInt();


        System.out.println("Enter your FirstName");
        String newName = scanner.nextLine();

        System.out.println("Enter your seconName");
        String NewLastName = scanner.nextLine();


        users.setName(newId,newName ,  NewLastName);
        System.out.println(users.getName());
        users.save();

    }
}
