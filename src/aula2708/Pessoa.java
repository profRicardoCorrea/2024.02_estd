package aula2708;
public class Pessoa {
     String nome;
     String cpf;
     Pessoa Filho;
    public Pessoa(String nome, String cpf) {
        this.cpf=cpf;
        this.nome=nome;
    }
    public Pessoa(String nome) {
        
        this.nome=nome;
    }
}
