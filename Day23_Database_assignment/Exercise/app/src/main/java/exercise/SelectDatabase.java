package exercise;

import java.util.*;
import java.sql.*;

public class SelectDatabase {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");

        System.out.println("Connection Done");

        Statement stmt = conn.createStatement();
        String sql;

        sql = "select * from student where id = 48955522";

        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            System.out.println("Record Found");
        } else {
            System.out.println("Record Not Found");
        }

        conn.close();

    }

}
