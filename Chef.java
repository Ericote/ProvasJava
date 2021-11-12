import java.util.ArrayList;

public class Chef extends Pessoas {

    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef( int idPessoa, String nome, int cpf, String dataNasc) {
        super(idPessoa, nome, cpf, dataNasc);
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    }
    
}
    
    

