package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Jaula;
import model.Leao;

public class DeletaLeao {
    public static void deletaLeao(Leao leao, Jaula jaula){
        
        try{

            final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            
                PreparedStatement pLeao = con.prepareStatement("DELETE FROM leao WHERE id = ? ", PreparedStatement.RETURN_GENERATED_KEYS);
                pLeao.setInt(1, leao.getId() );

                    if(pLeao.executeUpdate()>0){
                        ResultSet resultado = pLeao.getGeneratedKeys();

                        if(resultado.next()){
                            resultado.getInt(1);
                        }
                    }
            con.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
