import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BDemJava {
    public static void main(String [] args ){
        Connection connection = null;

        try{

            class.forName("org.sqlite.JDBC");
            
            connection = DriverManager.getConnection("jbbc:sqlite:test.db");


            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Pessoas(" +
                                    "id INTEGER PRIMARY KEY AUTOINCRIMENT," +
                                    "nome TEXT NOT NULL," +
                                    "idade INTEGER)" ;
                                    
                    statement.executeUpdate(createTableSQL);
                    statement.close();                  
                
            
              String insertSQL = : "INSERT INTO Pessoa (nome, idade)"
              PreparedStatement preparedStatement = connection.prepareStatement()
        }     updateStatement
    }
    
}
