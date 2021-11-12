public class Pessoas {
    private int idPessoa;
    private String nome;
    private int cpf;
    private String dataNasc;

    public Pessoas(
        int idPessoa,
        String nome,
        int cpf,
        String dataNasc
    )

    {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    /*================= SETS ====================*/

    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    /*================= GETS ====================*/

    public int getIdPessoa(){
        return idPessoa;
    }

    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }

    public String getDataNasc(){
        return dataNasc;
    }


}
