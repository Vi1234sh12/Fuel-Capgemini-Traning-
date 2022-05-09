/*
Assignment : Database Application 

Perfrom some Basic Operation 
1. insert value inside table 
2. create new table 
3. select table or values
4. update values inside of table
5. Delete values inside of table 
6. Exit Program 

*/

// @Developer VishalDhanure 

package demo;

import java.sql.*;
import java.util.*;
import java.time.*;

public class Exercise {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.print("\t Login to Database   ");
        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        System.out.print(date);
        System.out.println(" \n ---------------------------------------------------------------");
        System.out.print("\t Enter the UserName : Default (postgres) ");
        String user_name = sc.next();
        System.out.print("\t Enter the Password :  ");
        String pass_word = sc.next();
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", user_name, pass_word);

        System.out.println("Coonection done");

        do {
            System.out.println("------------------------------------------------------");
            System.out.println("\t\t Database Application Version 1.0   ");
            System.out.println("-------------------------------------------------------");
            System.out.println("\t\t  1.Insert Value  \n"
                    + "\t\t  2.Create Value  \n"
                    + "\t\t  3.Select Value \n"
                    + "\t\t  4.Update Value  \n"
                    + "\t\t  5.Delete Value \n"
                    + "\t\t  6.Exit \n");

            System.out.print("\t  Enter Choice : ");
            int choice = sc.nextInt();

            Statement stmt;
            stmt = conn.createStatement();

            if (choice == 1) {
                System.out.println("Enter the Id : ");
                int id = sc.nextInt();
                System.out.println("Enter the Name : ");
                String name = sc.next();
                String sql;
                sql = "insert into student values(" + id + ",'" + name + "')";
                stmt.executeUpdate(sql);
                System.out.println("\t\t Successfully Record Inserted ! ");

            } else if (choice == 2) {
                // System.out.println("Enter the table name :");
                // String table = sc.next();
                String sql;

                sql = "CREATE TABLE IF NOT EXISTS Product (id int primary key not null, name varchar(255))";

                stmt.executeUpdate(sql);
                System.out.println("\t\t Successfully Table Created! ");

            } else if (choice == 3) {
                String sql;
                sql = "SELECT * FROM student";
                ResultSet rs;
                rs = stmt.executeQuery(sql);
                // rs.next();
                // System.out.println(rs.getInt(1));
                // System.out.println(rs.getString(2));
                // System.out.println("Select sucessfully");
                int count = 1;
                while (rs.next()) {
                    System.out.print(count + "]" + " " + rs.getInt(1));
                    System.out.print(":  ");
                    System.out.println(rs.getString(2));
                    count++;
                }
                System.out.println("\t\t  Successfully Select Query Execuated !");

            } else if (choice == 4) {
                System.out.println("Enter the Id : ");
                int id = sc.nextInt();
                System.out.println("Enter the Name : ");
                String name = sc.next();
                String sql;
                sql = "update student set name = '" + name + "' where id = '" + id + "'";
                stmt.executeUpdate(sql);
                System.out.println("\t\t successfully record Updated ! ");

            } else if (choice == 5) {
                System.out.println("Enter the Id : ");
                int id = sc.nextInt();
                // System.out.println("Enter the Name : ");
                // String name = sc.next();
                String sql;
                sql = "delete from student where id = " + id + "";
                stmt.executeUpdate(sql);
                System.out.println("\t\t Successfully Record Deleted!");

            } else if (choice == 6) {
                conn.close();
                System.out.println("\t\t Successfully Exit ! ");
                System.exit(0); // close program
            } // End

        } while (true);

    } // End Main Methods

} // End Exercise class

/**
 * Output :
 * Driver loaded
 * ------------------------------------------------------------------
 * Login to Database Sat May 07 23:28:00 IST 2022
 * ---------------------------------------------------------------
 * Enter the User Name : postgres
 * Enter the Password : root
 * Coonection done
 * ------------------------------------------------------
 * Database Application Version 1.0
 * -------------------------------------------------------
 * 1.Insert Value
 * 2.Create Value
 * 3.Select Value
 * 4.Update Value
 * 5.Delete Value
 * 6.Exit
 * 
 * Enter Choice :
 */
