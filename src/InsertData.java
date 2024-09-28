import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
        String query="INSERT INTO EMPLOYEES(EMPLOYEFIRSTNAME,EMPLOYELASTNAME,salary) VALUES(?,?,?)";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1,"Amjad");
        statement.setString(2,"Ansari");
        statement.setInt(3,8000);
        int i = statement.executeUpdate();
        System.out.println(i);


    }
}
