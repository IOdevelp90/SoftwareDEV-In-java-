import java.sql.*;
import java.util.Arraylist;
import java.util.Collections;
import java.util.List

public class AmigoSecreto{
    public static void main (String[] args){
        Connection conn = null;

        try{
            conn = DriverManager.getConnection ("jbdc.sqlite:amigo_secreto.db");
            Statement.statement = conn.createStatement();


            statement.executeUpdate("CREATE TABLE IF NOT EXISTS participantes (Id INTEGER PRIMARY KEY, Nome TEXT NOT NULL)");
        
        List<String> participantes = new Arraylist <>();

        participantes.add ("Joao");
        participantes.add ("Maria");
        participantes.add ("Pedro");
        participantes.add ("Ana");
        participantes.add ("Luiza");
        

        for (String nome: participantes){
            PreparedStatement insertStatement = conn.PreparedStatement (INSERT )
        }



        }

        
    }
}
...