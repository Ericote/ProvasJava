package model;
import java.util.Objects;
import java.sql.Date;
import java.util.Scanner;

import view.AlterarLeao;
import view.CadastrarLeao;
import view.DeletaLeao;
import view.SelectLeao;




public class Pesquisa extends Animal {
    private String porId;
    Golfinho golfinho;
    Jaula jaula;

    public Pesquisa(
        String porId,
        int id,
        String nome
    )
    {
        super(id, nome);
        this.porId = porId;
    }


    public static void main(String[] args){


        try {
            Scanner scan1 = new Scanner(System.in);
            int porId = 0;
            int id = 0;
            String nome = "";
            int treinamento = 0;
            int idJaula = 0;
            String descricao = "";
            int escolha;
            int alimentacao = 0;
            int visitantes = 0;
            Golfinho golfinho = new Golfinho(id, nome, treinamento,idJaula, descricao);

           
    

            do{
            System.out.println("+--------------------------------+");
            System.out.println("|        CENTRO DE COMANDO       |");
            System.out.println("+--------------------------------+");
            System.out.println("| [1] ->     INSERT Leão         |");
            System.out.println("| [2] ->     UPDATE Leão         |");
            System.out.println("| [3] ->     DELETE Leão         |");
            System.out.println("| [4] ->     SELECT Leão         |");
            System.out.println("| [5] ->   INSERT Golfinho       |");
            System.out.println("| [6] ->   UPDATE Golfinho       |");
            System.out.println("| [7] ->   DELETE Golfinho       |");
            System.out.println("| [8] ->   SELECT Golfinho       |");
            System.out.println("| [9] ->        SAIR             |");
            System.out.println("+--------------------------------+");
            System.out.println(" Escolha uma opção: ");
            escolha = scan1.nextInt();
            
            switch(escolha){

                case 1:
                System.out.println("+---------------------+");
                System.out.println("|  CADASTRAR DE LEÃO  |");
                System.out.println("+---------------------+");
                System.out.println("--------------------");
                System.out.println("       NOME:       ");
                try {
                    nome = scan1.next();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println("   ALIMENTAÇÃO:     ");
                try {
                    alimentacao = scan1.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println("    VISITANTES :    ");
                try {
                    visitantes = scan1.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println(" DESCRIÇÃO DA JAULA: ");
                try {
                    descricao = scan1.next();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try{
                Jaula jaula = new Jaula(idJaula, descricao);
                Leao leao = new Leao(id, nome, alimentacao, visitantes, idJaula, descricao);
                CadastrarLeao.InsertLeao(leao, jaula);

                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 2:
                System.out.println("+---------------------+");
                System.out.println("|  UPDATE DE LEÃO     |");
                System.out.println("+---------------------+");
                System.out.println("ID: ");
                try {
                    id = scan1.nextInt();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println("       NOME:       ");
                try {
                    nome = scan1.next();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println("   ALIMENTAÇÃO:     ");
                try {
                    alimentacao = scan1.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("--------------------");
                System.out.println("    VISITANTES :    ");
                try {
                    visitantes = scan1.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    Jaula jaula = new Jaula(idJaula, descricao);
                    Leao leao = new Leao(id, nome, alimentacao, visitantes, idJaula, descricao);
                    AlterarLeao.UpdateLeao(leao, jaula);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 3:
                System.out.println("+----------------+");
                System.out.println("|  DELETE LEÃO   |");
                System.out.println("+----------------+");
                System.out.println("ID: ");
                try {
                    id = scan1.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    Jaula jaula = new Jaula(idJaula, descricao);
                    Leao leao = new Leao(id, nome, alimentacao, visitantes, idJaula, descricao);
                    DeletaLeao.deletaLeao(leao, jaula);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
                System.out.println("+-------------------+");
                System.out.println("|    SELECT LEÃO    |");
                System.out.println("+-------------------+");
                try {
                    Jaula jaula = new Jaula(idJaula, descricao);
                    Leao leao = new Leao(id, nome, alimentacao, visitantes, idJaula, descricao);
                    SelectLeao.selectLeao(leao, jaula);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }

        }while(escolha !=9);
        scan1.close(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }
            

        }

    /*  SETS  */

    public void setPorId(String porId){
        this.porId = porId;
    }

    /*  GETS  */

    public String getPorId(){
        return porId;
    }
    
/* ========================================================== */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pesquisa)) {
            return false;
        }
        Pesquisa pesquisa = (Pesquisa) o;
        return this.getId() == pesquisa.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getNome(), porId);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", Por Id='" + getPorId() +
            "}";
    }
    

}
