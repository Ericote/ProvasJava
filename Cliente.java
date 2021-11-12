import java.util.ArrayList;

public class Cliente extends Pessoas {
    int telefone;
    ArrayList<Receita> receitas = new ArrayList<>();
/* CONSTRUTOR DA CLASSE COM INFORMAÇÕES DA SUPER E O COMANDO SUPER SENDO USADO PARA A CONEXÃO  DE HERANÇA ENTRE ELAS */
    public Cliente(int idPessoa, String nome, int cpf, String dataNasc, int telefone) {
        super(idPessoa, nome, cpf, dataNasc);
        this.telefone = telefone;
    }

/* CRIAÇÃO DOS CLIENTES, BASICÃO */
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(1, "Cleber", 304546761, "01/10/1990", 253820947);
        Cliente cliente02 = new Cliente(2, "Lukchas", 904734356, "15/5/1980", 279147818);
        Cliente cliente03 = new Cliente(3, "Gizely",78716600, "20/03/2000", 354910395);

    /* AQUI AS INFORMAÇÕES DOS CLIENTES SÃO IMPRIMIDAS */
       System.out.println("========= CLIENTES===========");
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
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    }
}
