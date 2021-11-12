import java.util.ArrayList;
public class Receita {
    int id;
    String nome;
    String etapa;
    int numEtapa;
    Chef chef;
    Cliente cliente;
    ArrayList<Padaria> padarias = new ArrayList<>();

    public Receita( 
    int id,  
    String nome,    
    String etapa,   
    int numEtapa,
    Chef chef
    ) {
        this.id = id;
        this.nome = nome;
        this.etapa = etapa;
        this.numEtapa = numEtapa;
        this.chef = chef;
        chef.adicionarReceita(this);

    }


    public void adicionarPadaria(Padaria padaria) {
        this.padarias.add(padaria);
        padaria.adicionarReceita(this);
    }
        
}
