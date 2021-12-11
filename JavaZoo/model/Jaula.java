package model;
import java.util.Objects;

public class Jaula {
    private int idJaula;
    private String descricao;

    public Jaula(
        int idJaula,
        String descricao
    )
    {
        this.idJaula = idJaula;
        this.descricao = descricao;
    }

    /*  SETS  */

    public void setIdJaula(int idJaula){
        this.idJaula = idJaula;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    /*  GETS  */

    public int getIdJaula(){
        return idJaula;
    }

    public String getDescricao(){
        return descricao;
    }

    /* ================== */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Jaula)) {
            return false;
        }
        Jaula jaula = (Jaula) o;
        return idJaula == jaula.idJaula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJaula, descricao);
    }

    @Override
    public String toString() {
        return "{" +
            ", IdJaula='" + idJaula + "'" +
            ", Descrição='" + descricao +
            "}";
    }

}
