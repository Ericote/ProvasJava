package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Jaula;
import model.Leao;


public class CadastrarLeao {
    public static void InsertLeao(Leao leao, Jaula jaula){
        
        try{

            final String url = "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            

            PreparedStatement pState = con.prepareStatement("INSERT INTO jaula ( descricao ) VALUES (?)", PreparedStatement.RETURN_GENERATED_KEYS);
            pState.setString(1, jaula.getDescricao());

            if (pState.executeUpdate() > 0) {
                ResultSet rs = pState.getGeneratedKeys();
                rs.next();
                int idJaula = rs.getInt(1);
                
                PreparedStatement pLeao = con.prepareStatement("INSERT INTO leao (nome,alimentacao,visitantes,jaula_id) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
                pLeao.setString(1, leao.getNome());
                pLeao.setInt(2, leao.getAlimentacao());
                pLeao.setInt(3, leao.getVisitantes());
                pLeao.setInt(4, idJaula);
                if (pLeao.executeUpdate() > 0) {
                    ResultSet rsLeao = pLeao.getGeneratedKeys();
                    rsLeao.next();
                    int idLeao = rsLeao.getInt(1);
                }
            }
            con.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
