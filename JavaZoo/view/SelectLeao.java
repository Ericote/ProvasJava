package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Jaula;
import model.Leao;


public class SelectLeao {
    public static void selectLeao(Leao leao, Jaula jaula){
        try {
        final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        Connection con = DriverManager.getConnection(url, user, password);
          
        PreparedStatement state4 = con.prepareStatement("SELECT * FROM leao l INNER JOIN jaula j ON l.jaula_id = j.id  ",
        PreparedStatement.RETURN_GENERATED_KEYS);
        //state4.setInt(1,leao.getId());
        ResultSet result = state4.executeQuery();
        while(result.next()){
            Leao leao2 = new Leao(
                result.getInt("id"), 
                result.getString("nome"), 
                result.getInt("alimentacao"), 
                result.getInt("visitantes"), 
                result.getInt("jaula_id"), 
                result.getString("descricao")
                );
         System.out.println(leao2);
        }
        con.close();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}
