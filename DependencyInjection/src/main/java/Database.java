import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Database implements Db {
    private String firstname;
    private String secondname;
    private int id;

    User user;

    public Database (User user){
        this.user = user;
    };

    public void getAllData() {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            String url = "jdbc:postgresql://localhost/user_input";
            String  user = "postgres";
            String password = "TCGPC1";
            conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs;


            rs = stmt.executeQuery("SELECT * FROM Users");
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String secondname = rs.getString("secondname");
                System.out.println(id + " " + firstname + " " + secondname);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
//       return conn;

    };

    public void save(User user) {
        Connection conn = null;
        PreparedStatement pst = null;
        System.out.println("user" + user.getName());

        try {
            Class.forName("com.postgres.jdbc.Driver");
            String url = "jdbc:postgresql://localhost/user_input";
            String  myUser = "postgres";
            String password = "TCGPC1";

            conn = DriverManager.getConnection(url, myUser, password);

            String stm = "INSERT INTO Users(id,firstname,secondname) VALUES(?,?,?)";

            pst = conn.prepareStatement(stm);
            pst.setInt(1,id);
            pst.setString(2, user.getName());
            pst.setString(3, user.getName());
            pst.executeUpdate();
            System.out.println(pst);
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
        };
    }
}
