package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import model.Golfinho;


public class DeletaGolfinho {

    public static void DeleteGolfinho(Golfinho golfinho){
        try {
            final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";
            Connection con = DriverManager.getConnection(url, user, password);

            Statement state = con.createStatement();
            state.executeUpdate(" DELETE FROM golfinho WHERE id = "+golfinho.getId()+" ");
            
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
