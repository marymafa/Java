
//package com.company;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    private String firstname;
    private String secondname;

//    private final String url = "jdbc:postgresql://localhost/user_input";
//    private final String user = "postgres";
//    private final String password = "TCGPC1";

    public String  getName(){
        return firstname + secondname;
    };

    public void setName(String newName, String NewLastName){

        this.firstname = newName;
        this.secondname  = NewLastName;

    };
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public  Connection connect() {
      Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost/user_input";
            String  user = "postgres";
            String password = "TCGPC1";
             conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM Users");
            while ( rs.next() ) {
                String firstname = rs.getString("firstname");
                String secondname = rs.getString("secondname");
                System.out.println(firstname + secondname);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
       return conn;
    }

     };

