package DBGUI;
import java.sql.*;

 
public class OracleTest {
 
public Connection connectdb() {
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 
	} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
 
		}
 Connection connection = null;
 
        try {
                  connection = DriverManager.getConnection(
                              "jdbc:oracle:thin:@localhost:1533/cse1.omega.uta.edu", "cxv6250", "xxxxxx");

           } catch (SQLException e) {
                  return connection;
                  }
                  
		if (connection != null) {
				return connection;
		} else {
			return connection;
		}
}
}

