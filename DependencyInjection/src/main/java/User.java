
//package com.company;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class User {
    private String firstname;
    private String secondname;


    private final String url = "jdbc:postgresql://localhost/user_input";
    private final String user = "postgres";
    private final String password = "TCGPC1";


    public String  getName(){
        return firstname + secondname;
    };

    public void setName(String newName, String NewLastName){

        this.firstname = newName;
        this.secondname  = NewLastName;

    };


    public Connection connect() {

        Connection conn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        try {


            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

// create statement
            String sql = "insert into Users "
                    + " (firstname, secondname)" + " values (?,?, ?)";

          myStmt = conn.prepareStatement("select * from Users");

            myStmt = conn.prepareStatement(sql);


            // set param values
            myStmt.setString(1, firstname);
            myStmt.setString(2, secondname);

            // 3. Execute SQL query
            myStmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
