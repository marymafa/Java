import java.util.Scanner;

public class ReturnUserOutput {

    Scanner userScanner = new Scanner(System.in);

    public  void  returnUserOutput(){

        Scanner scanner = new Scanner(System.in);

        User users = new User();
        User app = new User();
        app.retriveData();


        System.out.println("Enter your FirstName");
        String newName = scanner.nextLine();

        System.out.println("Enter your seconName");
        String NewLastName = scanner.nextLine();

        System.out.println(" id");
        int  newId = scanner.nextInt();


        users.setName(newId,newName ,  NewLastName);
        System.out.println(users.getName());
        users.save();
    };

}
