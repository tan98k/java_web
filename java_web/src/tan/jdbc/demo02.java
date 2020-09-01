package tan.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class demo02 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            String sql = "select * from emp where salary > ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,5000);
            resultSet = preparedStatement.executeQuery();
            Person person = null;
            ArrayList<Person> arrayList = new ArrayList<>();
            while (resultSet.next()){
                System.out.print(resultSet.getInt(1)+" ");
                System.out.print(resultSet.getString(2)+" ");
                System.out.print(resultSet.getInt(3)+" ");
                System.out.print(resultSet.getInt(4)+" ");
                System.out.print(resultSet.getDate(5)+" ");
                System.out.print(resultSet.getFloat(6)+" ");
                System.out.println();
                person = new Person(resultSet.getInt(1),resultSet.getString(2));
                arrayList.add(person);
            }
            System.out.println(arrayList);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                connection.close();
            }

            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (resultSet != null){
                resultSet.close();
            }
        }

    }

    static class Person{
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
