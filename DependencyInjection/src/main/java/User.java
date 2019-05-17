
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
    private int id;


    public String  getName(){
        return id + firstname + secondname;
    };

    public void setName(int id,String newName, String NewLastName){
        this.id = id;
        this.firstname = newName;
        this.secondname  = NewLastName;

    };

};

