import java.sql.*;

public class sqlite {
  public static void main(String[] args){
    String jdbcURL = "jdbc:sqlite:simplefolks.sqlite";
    try {
      Connection connection = DriverManager.getConnection(jdbcURL);
      String sql = "SELECT * FROM people";

      Statement statement = connection.createStatement();

      ResultSet result = statement.executeQuery(sql);

      while (result.next()) {
        String name = result.getString("name");
        String sex = result.getString("sex");

        System.out.println(name + " | " + sex);
      }
    } catch (SQLException e) {
      System.out.println("Error connecting");
      e.printStackTrace();
    }
  }
}
