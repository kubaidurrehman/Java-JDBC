import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Load Driver Manager Class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
        PreparedStatement statement = con.prepareStatement("Select * from employees");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String FName = resultSet.getString(2);
            String LName = resultSet.getString(3);
            int salary = resultSet.getInt(4);
            System.out.println("id : " + id + " First name : " + FName + " Last Name : " + LName + " Salary : " + salary);

        }
        // close connection
        resultSet.close();
        statement.close();
        con.close();

    }
}