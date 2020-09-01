package tan.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class demo03 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = (Connection) jdbcUtil.getCollection();
            String sql = "select * from emp";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            jdbcUtil.close(preparedStatement,connection,resultSet);
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
