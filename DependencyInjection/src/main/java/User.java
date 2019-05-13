
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

public class User implements  Database{
    private String firstname;
    private String secondname;
    private int id;


    public String  getName(){
        return id + firstname + secondname;
    };

    public void setName(int id,String newName, String NewLastName){
        this.id = id;
        this.firstname = newName;
        this.secondname  = NewLastName;

    };

//    public  Connection connect()  {
//      Connection conn = null;
//        PreparedStatement pst = null;
//
//        try {
//            String url = "jdbc:postgresql://localhost/user_input";
//            String  user = "postgres";
//            String password = "TCGPC1";
//             conn = DriverManager.getConnection(url,user,password);
//            Statement stmt = conn.createStatement();
//            ResultSet rs;
//
//
//            rs = stmt.executeQuery("SELECT * FROM Users");
//            while ( rs.next() ) {
//                int id = rs.getInt("id");
//                String firstname = rs.getString("firstname");
//                String secondname = rs.getString("secondname");
//                System.out.println(id + " " + firstname + " " + secondname);
//            }
//            conn.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
//       return conn;
//    }

    public void retriveData() {
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

    public void save() {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
//            Class.forName("com.postgres.jdbc.Driver");
            String url = "jdbc:postgresql://localhost/user_input";
            String  user = "postgres";
            String password = "TCGPC1";

            conn = DriverManager.getConnection(url, user, password);

            String stm = "INSERT INTO Users(id,firstname,secondname) VALUES(?,?,?)";
            System.out.println(stm);
            pst = conn.prepareStatement(stm);
            pst.setInt(1,id);
            pst.setString(2, firstname);
            pst.setString(3, secondname);
            pst.executeUpdate();
            System.out.println(pst);
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
        };
    }
};

