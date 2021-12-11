package model;
import java.sql.Date;
import java.util.Objects;
import java.util.ArrayList;

public class Leao extends Animal {
   private int alimentacao = 6;
   private int visitantes;
   ArrayList<Alimentacao> alimentacoes = new ArrayList<>();
   Jaula jaula;

public Leao(
    int id, 
    String nome,
    int alimentacao, 
    int visitantes, 
    int idJaula,
    String descricao)
{
    super(id, nome);
    this.alimentacao = alimentacao;
    this.visitantes = visitantes;
    this.jaula = new Jaula(
        idJaula,
        descricao
    );
}

public void adicionarAlimento(Alimentacao alimentacao) {
    this.alimentacoes.add(alimentacao);
}

public void adicionarAlimento(
     int idAlimento,
     Date data,
     String detalhes
) {
    this.adicionarAlimento(new Alimentacao(idAlimento, data, detalhes));
}



    /*  SETS  */

    public void setAlimentacao(int alimentacao){
        this.alimentacao = alimentacao;
    }

    public void setVisitantes(int visitantes){
        this.visitantes = visitantes;
    }


    /*  GETS  */

    public int getAlimentacao(){
        return alimentacao;
    }

    public int getVisitantes(){
        return visitantes;
    }


    /*=========================================================== */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Leao)) {
            return false;
        }
        Leao leao = (Leao) o;
        return this.getId() == leao.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getNome(), alimentacao, visitantes, jaula.getIdJaula(), jaula.getDescricao());
    }

    @Override
    public String toString() {
        return "" +
            "\n id=" + super.getId()  +
            "\n nome=" + super.getNome()  +
            "\n Alimentação=" + getAlimentacao() +
            "\n Visitantes=" + getVisitantes()  +
            "\n IdJaula=" + jaula.getIdJaula() +
            "\n Descrição=" + jaula.getDescricao() +
            "";
    }
}