
//Simple way of retrieving information from a sqlite dataset with JDBC driver:
//import java.sql.*;
//
//public class sqlite {
//  public static void main(String[] args){
//    String jdbcURL = "jdbc:sqlite:simplefolks.sqlite";
//    try {
//      Connection connection = DriverManager.getConnection(jdbcURL);
//      String sql = "SELECT * FROM people";
//
//      Statement statement = connection.createStatement();
//
//      ResultSet result = statement.executeQuery(sql);
//
//      while (result.next()) {
//        String name = result.getString("name");
//        String sex = result.getString("sex");
//
//        System.out.println(name + " | " + sex);
//      }
//    } catch (SQLException e) {
//      System.out.println("Error connecting");
//      e.printStackTrace();
//    }
//  }
//}

//Iterate through each entry in the result set, and save it to an individual JSON file named after the person's name. Each JSON file will contain the "name" and "sex" fields specific to that person:
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import org.json.JSONException;
import org.json.JSONObject;

public class sqlite {
  public static void main(String[] args) {
    String jdbcURL = "jdbc:sqlite:simplefolks.sqlite";

    try {
      Connection connection = DriverManager.getConnection(jdbcURL);
      String sql = "SELECT * FROM people";

      Statement statement = connection.createStatement();

      ResultSet result = statement.executeQuery(sql);

      while (result.next()) {
        String name = result.getString("name");
        String sex = result.getString("sex");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("sex", sex);

        // Write the JSON object to a file
        FileWriter fileWriter = new FileWriter(name + ".json");
        fileWriter.write(jsonObject.toString(2)); // Use indentation of 2 spaces
        fileWriter.close();

        System.out.println("JSON file generated for " + name + ".");
      }

    } catch (SQLException | JSONException | IOException e) {
      System.out.println("Error occurred.");
      e.printStackTrace();
    }
  }
}
