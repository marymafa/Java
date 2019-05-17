import java.util.Scanner;

public class ReturnUserOutput {

    Scanner userScanner = new Scanner(System.in);
    private String name;

    public  void  returnUserOutput(){

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        Database app = new Database( user);
        app.getAllData();

        System.out.println("Enter your FirstName");
        String newName = scanner.nextLine();

        System.out.println("Enter your seconName");
        String NewLastName = scanner.nextLine();

        System.out.println(" id");
        int  newId = scanner.nextInt();

        user.setName(newId,newName ,  NewLastName);
        System.out.println(user.getName());
        System.out.println();
        app.save(user);
    }

}
