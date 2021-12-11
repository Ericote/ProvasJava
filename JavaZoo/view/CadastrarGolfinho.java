package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Golfinho;
import model.Jaula;

public class CadastrarGolfinho {
    public static void InsertGolfinho(Golfinho golfinho, Jaula jaula){

        try {

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

                PreparedStatement gstate = con.prepareStatement(" INSERT INTO golfinho (nome, treinamento, jaula_id) VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
                gstate.setString(1, golfinho.getNome());
                gstate.setInt(2,golfinho.getTreinamento());
                gstate.setInt(3, idJaula);

                if (gstate.executeUpdate() > 0){
                    ResultSet result = gstate.getGeneratedKeys();
                    result.next();
                    int IdGolfinho = result.getInt(1);

                }

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

    
    

