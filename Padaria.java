import java.util.ArrayList;
public class Padaria extends Estabelecimento{
    
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id,
        String nome,
        String dataDeAbertura,
        int idEndereco,
        int cep,
        String rua, 
        int numero, 
        String bairro,  
        String cidade
    )  
    
    {
        super(id, nome, dataDeAbertura, idEndereco,
        cep,
        rua, 
        numero, 
        bairro,  
        cidade);
          
    }

    public static void main(String[] args) {
        Padaria padaria01 = new Padaria(1,"Pão do Jão", "12/08/2006", 1, 17350875,"Rua São vidente, 625", 890, "Floresta", "Joinville");
        Padaria padaria02 = new Padaria(2, "Alfa Pães", "24/05/1990", 2, 69264014, "Rua dos bois, 433", 1920, "Itaum", "Joinville");
        Padaria padaria03 = new Padaria(3, "Pão que o Diabo Amassou", "15/03/2010", 3, 59023645, "Rua dos cães, 666", 566, "Aventureiro", "Joinville");
        
/* ============================ CRIAÇÃO DAS PADARIAS ================================= */

        System.out.println("\n =========== PADARIAS =========");
        System.out.println(" Padaria 1 - " + padaria01.getNome());
        System.out.println("  Rua: " + padaria01.getEndereco().getRua()
                         + ", Número: "+ padaria01.getEndereco().getNumero()
                         + ", Bairro: "+ padaria01.getEndereco().getBairro()
                         + ", Cidade: "+ padaria01.getEndereco().getCidade()
                         + ", CEP: "+padaria01.getEndereco().getCep() + "\n");
        System.out.println("=====================================");
        System.out.println(" Padaria 2 - " + padaria02.getNome());
        System.out.println("  Rua: " + padaria02.getEndereco().getRua()
                         + ", Número: "+ padaria02.getEndereco().getNumero()
                         + ", Bairro: "+ padaria02.getEndereco().getBairro()
                         + ", Cidade: "+ padaria02.getEndereco().getCidade()
                         + ", CEP: "+padaria02.getEndereco().getCep() + "\n");
        System.out.println("=====================================");
        System.out.println(" Padaria 3 - " + padaria03.getNome());
        System.out.println("  Rua: " + padaria03.getEndereco().getRua()
                         + ", Número: "+ padaria03.getEndereco().getNumero()
                         + ", Bairro: "+ padaria03.getEndereco().getBairro()
                         + ", Cidade: "+ padaria03.getEndereco().getCidade()
                         + ", CEP: "+padaria03.getEndereco().getCep() + "\n");

      /* ============================ CRIAÇÃO DOS CHEFS ================================= */

        System.out.println("\n ========= OS PODEROSOS CHEFS =========");
        Chef chef01 = new Chef(2, "Jaqueline", 221450, "10/3/1990");
        System.out.println(chef01.getIdPessoa());
        System.out.println(chef01.getNome());
        System.out.println(chef01.getCpf());
        System.out.println(chef01.getDataNasc());
        Chef chef02 = new Chef(5, "Sebastian", 734200, "24/6/1980");
        System.out.println(chef02.getIdPessoa());
        System.out.println(chef02.getNome());
        System.out.println(chef02.getCpf());
        System.out.println(chef02.getDataNasc());
        Chef chef03 = new Chef(7, "Douglas", 155352, "5/4/2006");
        System.out.println(chef03.getIdPessoa());
        System.out.println(chef03.getNome());
        System.out.println(chef03.getCpf());
        System.out.println(chef03.getDataNasc());
        System.out.println(" Nome: " +chef01.getNome()
                         +", CPF: " +chef01.getCpf()
                         +", Data de Nascimento: "+chef01.getDataNasc() + "\n");
        System.out.println("============================================");
        System.out.println(" Nome: " +chef02.getNome()
                         +", CPF: " +chef02.getCpf()
                         +", Data de Nascimento: "+chef02.getDataNasc() + "\n");
        System.out.println("============================================");      
        System.out.println(" Nome: " +chef03.getNome()
                         +", CPF: " +chef03.getCpf()
                         +", Data de Nascimento: "+chef03.getDataNasc() + "\n");

       /* ============================ CRIAÇÃO DAS RECEITAS ================================= */

        /* RECEITAS DO CHEF 1 */
        Receita receita01 = new Receita(1, "Bolo de Cenoura", "assar", 4, chef01);
        Receita receita02 = new Receita(2, "Pastel", "Fazer massa", 2, chef01);
        Receita receita03 = new Receita(3, "Brigadeiro", "colocar granulado", 6, chef01);
        Receita receita04 = new Receita(4, "Coxinha", "rechear", 3, chef01);
        Receita receita05 = new Receita(5, "Pão", "preparar Massa", 5, chef01);
        padaria01.adicionarReceita(receita01);
        padaria01.adicionarReceita(receita02);
        padaria01.adicionarReceita(receita03);
        padaria01.adicionarReceita(receita04);
        padaria01.adicionarReceita(receita05);
        /* RECEITAS DO CHEF 2 */
        Receita receita06 = new Receita(6, "Pão de Queijo", "assar", 6, chef02);
        Receita receita07 = new Receita(7, "Rocambole", "enrolar", 5, chef02);
        Receita receita08 = new Receita(8, "Kibe", "fritar", 7, chef02);
        Receita receita09 = new Receita(9, "Mini Pizza", "colocar ingredientes", 1, chef02);
        Receita receita10 = new Receita(10, "Pão Doce", "rechear", 3, chef02);
        padaria02.adicionarReceita(receita06);
        padaria02.adicionarReceita(receita07);
        padaria02.adicionarReceita(receita08);
        padaria02.adicionarReceita(receita09);
        padaria02.adicionarReceita(receita10);
        /* RECEOTAS DO CHEF 3 */
        Receita receita11 = new Receita(11, "Donuts", "fritar", 7, chef03);
        Receita receita12 = new Receita(12, "Pastel Assado", "rechear", 3, chef03);
        Receita receita13 = new Receita(13, "Empada", "assar", 4, chef03);
        Receita receita14 = new Receita(14, "Brownie", "colocar ingredientes", 1, chef03);
        Receita receita15 = new Receita(15, "Bolinha de Queijo", "fritar", 7, chef03);
        padaria03.adicionarReceita(receita11);
        padaria03.adicionarReceita(receita12);
        padaria03.adicionarReceita(receita13);
        padaria03.adicionarReceita(receita14);
        padaria03.adicionarReceita(receita15);

        System.out.println("============ RECEITA DO CHEF 1 ============");
        for (Receita receitas : chef01.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }

        System.out.println("============ RECEITA DO CHEF 2 ============");
        for (Receita receitas : chef02.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }

        System.out.println("============ RECEITA DO CHEF 3 ============");
        for (Receita receitas : chef03.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }
        System.out.println("\n\n");
        System.out.println("\n =========== RECEITAS DA PADARIA 1 ===========");
        for (Receita receita : padaria01.receitas) {
            System.out.println("Nome da receita: " + receita.nome);
        }
        System.out.println("\n =========== RECEITAS DA PADARIA 2 ===========");
        for (Receita receita : padaria02.receitas) {
            System.out.println("Nome da receita: " + receita.nome);
        }
        System.out.println("\n =========== RECEITAS DA PADARIA 3 ===========");
        for (Receita receita : padaria03.receitas) {
            System.out.println("Nome da receita: " + receita.nome);
        }
        System.out.println("\n\n");

        /*=================== CRIAÇÃO DE CLIENTES ==================*/

        
        Cliente cliente01 = new Cliente(1, "Cleber", 304546761, "01/10/1990", 253820947);
        cliente01.adicionarReceita(receita01);
        cliente01.adicionarReceita(receita02);
        cliente01.adicionarReceita(receita03);
        cliente01.adicionarReceita(receita04);
        cliente01.adicionarReceita(receita05);
        Cliente cliente02 = new Cliente(2, "Lukchas", 904734356, "15/5/1980", 279147818);
        cliente02.adicionarReceita(receita06);
        cliente02.adicionarReceita(receita07);
        cliente02.adicionarReceita(receita08);
        cliente02.adicionarReceita(receita09);
        cliente02.adicionarReceita(receita10);
        Cliente cliente03 = new Cliente(3, "Gizely",78716600, "20/03/2000", 354910395);
        cliente03.adicionarReceita(receita11);
        cliente03.adicionarReceita(receita12);
        cliente03.adicionarReceita(receita13);
        cliente03.adicionarReceita(receita14);
        cliente03.adicionarReceita(receita15);

        /* AQUI AS INFORMAÇÕES DOS CLIENTES SÃO IMPRIMIDAS */

       System.out.println("========= CLIENTES===========");
       System.out.println("CLIENTE 1 \n");
       System.out.println("ID DO CLIENTE: ");
       System.out.println(cliente01.getIdPessoa());
       System.out.println("NOME: ");
       System.out.println(cliente01.getNome());
       System.out.println("CPF: "); 
       System.out.println(cliente01.getCpf());
       System.out.println("DATA DE NASCIMENTO: ");
       System.out.println(cliente01.getDataNasc());
       System.out.println("TELEFONE: ");
       System.out.println(cliente01.telefone);
       System.out.println("=============================================");
       System.out.println("CLIENTE 2 \n");
       System.out.println("ID DO CLIENTE: ");
       System.out.println(cliente02.getIdPessoa());
       System.out.println("NOME: ");
       System.out.println(cliente02.getNome());
       System.out.println("CPF: "); 
       System.out.println(cliente02.getCpf());
       System.out.println("DATA DE NASCIMENTO: ");
       System.out.println(cliente02.getDataNasc());
       System.out.println("TELEFONE: ");
       System.out.println(cliente02.telefone);
       System.out.println("=============================================");
       System.out.println("CLIENTE 3 \n");
       System.out.println("ID DO CLIENTE: ");
       System.out.println(cliente03.getIdPessoa());
       System.out.println("NOME: ");
       System.out.println(cliente03.getNome()); 
       System.out.println("CPF: ");
       System.out.println(cliente03.getCpf());
       System.out.println("DATA DE NASCIMENTO: ");
       System.out.println(cliente03.getDataNasc());
       System.out.println("TELEFONE: ");
       System.out.println(cliente03.telefone);

       System.out.println("\n\n");
       System.out.println("\n =========== RECEITAS DO CLIENTE 1 ===========");
       for (Receita receita : cliente01.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }
       System.out.println("\n =========== RECEITAS DO CLIENTE 2 ===========");
       for (Receita receita : cliente02.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }
       System.out.println("\n =========== RECEITAS DO CLIENTE 3 ===========");
       for (Receita receita : cliente03.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }

       Mercados mercado01 = new Mercados(" 2 por 10", 1, "Mercadão do Jão", "04/07/1974", 1, 64005-810, "Rua Henri Koster", 455, "Itinga", "Joinville");
        mercado01.adicionarReceita(receita01);
        mercado01.adicionarReceita(receita02);
        mercado01.adicionarReceita(receita03);
        mercado01.adicionarReceita(receita04);
        mercado01.adicionarReceita(receita05);
       Mercados mercado02 = new Mercados(" 5 por 20 ", 2, "Pãonificadora", "19/03/1993", 2, 39400-748, "Acesso Oito", 899, "Ibirapuera", "São Paulo");
        mercado02.adicionarReceita(receita06);
        mercado02.adicionarReceita(receita07);
        mercado02.adicionarReceita(receita08);
        mercado02.adicionarReceita(receita09);
        mercado02.adicionarReceita(receita10);
       Mercados mercado03 = new Mercados(" 3 por 7 ", 3, "Mercado do Jário", "09/02/2008", 3, 40353-210, "Rua L-004", 903, "Guanamirim", "Joinville");
        mercado03.adicionarReceita(receita11);
        mercado03.adicionarReceita(receita12);
        mercado03.adicionarReceita(receita13);
        mercado03.adicionarReceita(receita14);
        mercado03.adicionarReceita(receita15);

        System.out.println("\n =========== RECEITAS DO MERCADO 1 ===========");
       for (Receita receita : mercado01.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }
       System.out.println("\n =========== RECEITAS DO MERCADO 2 ===========");
       for (Receita receita : mercado02.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }
       System.out.println("\n =========== RECEITAS DO MERCADO 3 ===========");
       for (Receita receita : mercado03.receitas) {
           System.out.println("Nome da receita: " + receita.nome);
       }
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    } 
    
}
