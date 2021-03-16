package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeesMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/person?useUnicode=true");
        dataSource.setUser("person");
        dataSource.setPassword("person");

        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from person")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            System.out.println(names);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }



/*
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into person (emp_name) values (?)");
        ) {
            ps.setString(1, "Lili");
            ps.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert");
        }
 */


    }
}
