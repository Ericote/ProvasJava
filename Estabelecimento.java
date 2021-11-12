public class Estabelecimento {
   private int id;
   private String nome;
   private String dataDeAbertura;
   private Endereco endereco;


   public Estabelecimento(
    int id,
    String nome,
    String dataDeAbertura,
    int idEndereco,
    int cep,
    String rua, 
    int numero, 
    String bairro,  
    String cidade)

   {
       this.id = id;
       this.nome = nome;
       this.dataDeAbertura = dataDeAbertura;
       this.endereco = new Endereco(
            idEndereco,
            cep,
            rua,
            numero,
            bairro,
            cidade
        ); 
       
   }

   /*============== SETS ==================*/

   public void setid(int id){
       this.id = id;
   }

   public void setnome(String nome){
       this.nome = nome;
   }

   public void setdataDeAbertura(String dataDeAbertura){
       this.dataDeAbertura = dataDeAbertura;
   }

   public void setEndereco(Endereco endereco){
       this.endereco = endereco;
   }


   /*============== GETS ==================*/

   public int getid(){
       return id;
   }

   public String getNome(){
       return nome;
   }

   public String getdataDeAbertura(){
       return dataDeAbertura;
   }

   public Endereco getEndereco(){
       return endereco;
   }

   
}
