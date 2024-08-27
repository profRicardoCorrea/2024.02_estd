public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa("maria");
        Pessoa p2=new Pessoa("eliza");
        Pessoa p3=new Pessoa("pedro");
        Pessoa p4=new Pessoa("joao");

        p4.Filho=p1;
        p1.Filho=p2;
        p2.Filho=p3;

        p4.Filho=p1;
        p4.Filho.Filho=p2;
        p4.Filho.Filho.Filho=p3;
        p4.Filho.Filho.Filho.Filho=new Pessoa("Luiz");

    }
    
}
