	package lista_encadeada;
public class MainPessoaB {
    
    
    
    public static void main(String[] args) {
        
        // Criando instância lista encadeada de PessoaA
        PessoaA listPessoaA =new PessoaA();
        // Criando instâncias de PessoaA
        PessoaA pessoa1 = new PessoaA();
        pessoa1.nome = "Pessoa 1";

        PessoaA pessoa2 = new PessoaA();
        pessoa2.nome = "Pessoa 2";

        PessoaA pessoa3 = new PessoaA();
        pessoa3.nome = "Pessoa 3";

        PessoaA pessoa4 = new PessoaA();
        pessoa4.nome = "Pessoa 4";

        PessoaA pessoa5 = new PessoaA();
        pessoa5.nome = "Pessoa 5";


        listPessoaA.adicionarNovoNo(pessoa5);
        listPessoaA.adicionarNovoNo(pessoa2);
        listPessoaA.adicionarNovoNo(pessoa3);
        listPessoaA.adicionarNovoNo(pessoa1);
        listPessoaA.adicionarNovoNo(pessoa4);
        // System.out.println(pessoa5.nome);
        // System.out.println(pessoa5.filhoA.nome);
        // System.out.println(pessoa5.filhoA.filhoA.nome);
        // System.out.println(pessoa5.filhoA.filhoA.filhoA.nome);
        // System.out.println(pessoa5.filhoA.filhoA.filhoA.filhoA.nome);
        //System.out.println(listPessoaA.filhoA.filhoA.filhoA.filhoA.filhoA.nome);
        
        
      //  listPessoaA.imprimirNomes();
      pessoa5.deletarNo("Pessoa 1");
        pessoa5.imprimirNomes();
        

    }
    
}
