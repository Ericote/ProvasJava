package model;
import java.sql.Date;
import java.util.Objects;

public class Treinamento {
    private int idTreino;
    private Date dataTreino;
    private String detalhesTreino;
    Golfinho golfinho;

    public Treinamento(
        int idTreino,
        Date dataTreino,
        String detalhesTreino 
    )
    {
        this.idTreino = idTreino;
        this.dataTreino = dataTreino;
        this.detalhesTreino = detalhesTreino;
    }

    /*  SETS  */

    public void setIdTreino(int idTreino){
        this.idTreino = idTreino;
    }

    public void setDataTreino(Date dataTreino){
        this.dataTreino = dataTreino;
    }

    public void setDetalhesTreino(String detalhesTreino){
        this.detalhesTreino = detalhesTreino;
    }

    /*  GETS  */

    public int getIdTreino(){
        return idTreino;
    }

    public Date getDataTreino(){
        return dataTreino;
    }

    public String getDetalhesTreino(){
        return detalhesTreino;
    }

    /*========================= */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Treinamento)) {
            return false;
        }
        Treinamento treinamento = (Treinamento) o;
        return idTreino == treinamento.idTreino;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTreino, dataTreino, detalhesTreino, golfinho);
    }

    @Override
    public String toString() {
        return "{" +
            " idTreino='" + idTreino + "'" +
            ", Data do Treino='" + dataTreino + "'" +
            ", Detalhes do Treino='" + detalhesTreino + "'" +
            ", Golfinho='" + golfinho +
            "}";
    }


}
