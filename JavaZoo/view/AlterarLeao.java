package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Jaula;
import model.Leao;

public class AlterarLeao {
    public static void UpdateLeao(Leao leao, Jaula jaula){
        
        try{

            final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
                
                PreparedStatement pLeao = con.prepareStatement("UPDATE leao SET nome = ?, alimentacao = ?, visitantes = ?  WHERE id = ?", PreparedStatement.RETURN_GENERATED_KEYS);
                pLeao.setString(1, leao.getNome());
                pLeao.setInt(2, leao.getAlimentacao());
                pLeao.setInt(3, leao.getVisitantes());
                pLeao.setInt(4, leao.getId());
                if(pLeao.executeUpdate()>0){
                    ResultSet resultado = pLeao.getGeneratedKeys();

                    if(resultado.next()){
                        resultado.getString(1);
                        resultado.getInt(2);
                        resultado.getInt(3);
                        resultado.getInt(4);
                    }
                
            }
            con.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
