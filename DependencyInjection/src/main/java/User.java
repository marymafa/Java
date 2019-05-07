
//package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class User {
    private String firstName;
    private String secondName;

    private final String url = "jdbc:postgresql://localhost/user_input";
    private final String user = "postgres";
    private final String password = "TCGPC1";


    public String  getName(){
        return firstName + secondName;
    };

    public void setName(String newName, String NewLastName){

        this.firstName = newName;
        this.secondName  = NewLastName;

    };

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
