import java.util.ArrayList;

public class Mercados extends Estabelecimento {
    String promocao;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Mercados(String promocao, int id, String nome, String dataDeAbertura,int Id,
    int cep,
    String rua, 
    int numero, 
    String bairro,  
    String cidade){
        
        super(id, nome, dataDeAbertura,Id,
        cep,
        rua, 
        numero, 
        bairro,  
        cidade);
        this.promocao = promocao;
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    } 
}
