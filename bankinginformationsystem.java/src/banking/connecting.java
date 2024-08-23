package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connecting {
    Connection connection;
    Statement statement;
    public connecting(){
        try {
connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system","root","Mrgrey7171");
      statement =connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
