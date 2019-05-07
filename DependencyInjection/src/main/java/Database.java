//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.*;
//
//public class Database {
//    private final String url = "jdbc:postgresql://localhost/user_input";
//    private final String user = "postgres";
//    private final String password = "TCGPC1";
//
//
//
//    public Connection connect() {
//
//        Connection conn = null;
//        PreparedStatement myStmt = null;
//        ResultSet myRs = null;
//        try {
//
//
//            Class.forName("org.postgresql.Driver");
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully.");
//
//// create statement
//            String sql = "insert into users "
//                    + " (firstName, secondName)" + " values (?, ?, ?)";
//
//            myStmt = conn.prepareStatement(sql);
//
//
//            // set param values
//            myStmt.setString(1, firstName);
//            myStmt.setString(2, secondName);
//
//            // 3. Execute SQL query
//            myStmt.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return conn;
//    }
//
//
//
//}
