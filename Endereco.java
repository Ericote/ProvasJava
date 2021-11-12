public class Endereco {
    private int idEndereco;
    private int cep;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    

    public Endereco(int idEndereco, int cep, String rua, int numero, String bairro, String cidade) {
        
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;        
    }
    public void setId(int idEndereco){
        this.idEndereco = idEndereco;
    }
 
    public void setCep(int cep){
     this.cep = cep;
    }
 
    public void setRua(String rua){
     this.rua = rua;
    }
 
    public void setNumero(int numero){
     this.numero = numero;
    }
 
    public void setBairro(String bairro){
     this.bairro = bairro;
    }
 
    public void setCidade(String cidade){
     this.cidade = cidade;
    }

    /*======================== GETS ======================= */

    public int getIdEndereco(){
        return this.idEndereco;  
    }
 
    public int getCep(){
        return this.cep;
    }
 
    public String getRua(){
        return rua;
    }
 
    public int getNumero(){
        return numero;
    }
 
    public String getBairro(){
        return bairro;
    }
 
  public String getCidade(){
       return cidade;
    }
}
