package Jdbc;

import java.sql.*;

public class DBConnect {

    public static final String DBURL="jdbc:mysql://localhost:3306/world";
    public static final String USER="root";
    public static final String PASSWORD="NAHAnut741123";

    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        PreparedStatement pr=null;
        String sql="SELECT * FROM student";
        String sql1="INSERT INTO university.student (student_name,student_class) VALUES (?,?)";
        String sql2="UPDATE university.student SET student_name= ? WHERE student_id=?";
        String sql3="DELETE FROM university.student WHERE student_id=?";
        try {
            connection= DriverManager.getConnection(DBURL,USER,PASSWORD);

            /*statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("Şehrin ismi : " + resultSet.getString("name"));
            }*/

            /*pr=connection.prepareStatement(sql1);
            pr.setString(1,"şevket");
            pr.setInt(2,10);*/

            /*pr=connection.prepareStatement(sql2);
            pr.setString(1,"şeyma");
            pr.setInt(2,2);*/

            pr=connection.prepareStatement(sql3);
            pr.setInt(1,2);
            pr.executeUpdate();
            connection.close();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
