package model;
import java.sql.Date;
import java.util.Objects;


public class Alimentacao{
    private int idAlimento;
    private Date data;
    private String detalhes;
    Leao leao;

    public Alimentacao(
        int idAlimento,
        Date data,
        String detalhes
    )
    {
        this.idAlimento = idAlimento;
        this.data = data;
        this.detalhes = detalhes;
    }

    
    /*  SETS  */

    public void setIdAlimento(int idAlimento){
        this.idAlimento = idAlimento;
    }

    public void setData(Date data){
        this.data = data;
    }

    public void setDetalhes(String detalhes){
        this.detalhes = detalhes;
    }

    /*  GETS  */

    public int getIdAlimento(){
        return idAlimento;
    }

    public Date getData(){
        return data;
    }

    public String getDetalhes(){
        return detalhes;
    }

    /* ============================================== */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alimentacao)) {
            return false;
        }
        Alimentacao alimentacao = (Alimentacao) o;
        return idAlimento == alimentacao.idAlimento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlimento, data, detalhes, leao);
    }

    @Override
    public String toString() {
        return "{" +
            " idAlimento='" + idAlimento + "'" +
            ", data='" + data + "'" +
            ", detalhes='" + detalhes + "'" +
            ", Leão='" + leao +
            "}";
    }

    
}