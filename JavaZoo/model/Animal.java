package model;
import java.util.Objects;

public abstract class Animal {
    private int id;
    private String nome;

    public Animal(
        int id,
        String nome
    )
    {
        this.id = id;
        this.nome = nome;
    }

    /*  SETS  */
    
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /*  GETS  */

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    /*=============================*/

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, nome);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", nome='" + nome + 
            "}";
    }

}
