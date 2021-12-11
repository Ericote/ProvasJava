package model;
import java.sql.Date;
import java.util.Objects;
import java.util.ArrayList;

public class Golfinho extends Animal {
     private int treinamento;
     ArrayList<Treinamento> treinamentos = new ArrayList<>();
     Jaula jaula2;

    public Golfinho(
        int id, 
        String nome, 
        int treinamento,
        int idJaula,
        String descricao
        )
    
    {
        super(id, nome);
        this.treinamento = treinamento;
        this.jaula2 = new  Jaula(
            idJaula, 
            descricao 
            );
    }

    public void adicionarTreino(Treinamento treinamento) {
        this.treinamentos.add(treinamento);
    }
    
    public void adicionarTreino(
        int idTreino,
        Date dataTreino,
        String detalhesTreino 
    ) {
        this.adicionarTreino(new Treinamento(idTreino, dataTreino, detalhesTreino));
    }

    /*  SET  */ 

    public void setTreinamento(int treinamento){
        this.treinamento = treinamento;
    }


    /*  GET  */

    public int getTreinamento(){
        return treinamento;
    }


    /* ======================================================================== */



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Golfinho)) {
            return false;
        }
        Golfinho golfinho = (Golfinho) o;
        return this.getId() == golfinho.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getNome(), treinamento,jaula2.getIdJaula(), jaula2.getDescricao());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", treinamento='" + getTreinamento() + "'" +
            ", idJaula='" + jaula2.getIdJaula() + "'" +
            ", Descrição'" + jaula2.getDescricao() +
            "}";
    }

}

