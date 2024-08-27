package lista_encadeada;
public class MainPessoaAStatic {
    
    
    public static PessoaAStatic deletarNo(PessoaAStatic listaPessoa,String nomeAlvo) {
        // Se o nó atual for o nó a ser deletado, retornamos o próximo nó
        if (listaPessoa.nome.equals(nomeAlvo)) {
            return listaPessoa.filhoA;
        } else if (listaPessoa.filhoA != null) {
            // Se o próximo nó for o nó a ser deletado, fazemos o nó atual apontar para o nó seguinte ao próximo nó
            if (listaPessoa.filhoA.nome.equals(nomeAlvo)) {
                listaPessoa.filhoA = listaPessoa.filhoA.filhoA;
            } else {
                // Caso contrário, chamamos o método recursivamente no próximo nó
                listaPessoa.filhoA = deletarNo(listaPessoa.filhoA,nomeAlvo);
            }
        }
        return listaPessoa;
    }

    
    public static void imprimirNomes(PessoaAStatic p) {
        // Imprime o nome do objeto atual
        if(p!=null)
            System.out.println("Nome:"+p.nome);
        
        // Verifica se há um filho encadeado e chama o método recursivamente
        if (p.filhoA != null) {
            imprimirNomes(p.filhoA);
        }
    }

    public static PessoaAStatic adicionarNovoNo(PessoaAStatic listaPessoa, PessoaAStatic novoNo) {
        // Se o nó atual não tem um filho, adicionamos o novo nó aqui
        if (listaPessoa== null) {
            listaPessoa =  novoNo;
        } else {
            // Caso contrário, chamamos o método recursivamente no filho atual
            listaPessoa.filhoA= adicionarNovoNo(listaPessoa.filhoA,novoNo);
        }
        return listaPessoa;

    }
    public static void main(String[] args) {
        
        // Criando instância lista encadeada de PessoaA
        PessoaAStatic listPessoaA =null;
        // Criando instâncias de PessoaA
        PessoaAStatic pessoa1 = new PessoaAStatic();
        pessoa1.nome = "Pessoa 1";

        PessoaAStatic pessoa2 = new PessoaAStatic();
        pessoa2.nome = "Pessoa 2";

        PessoaAStatic pessoa3 = new PessoaAStatic();
        pessoa3.nome = "Pessoa 3";

        PessoaAStatic pessoa4 = new PessoaAStatic();
        pessoa4.nome = "Pessoa 4";

        PessoaAStatic pessoa5 = new PessoaAStatic();
        pessoa5.nome = "Pessoa 5";


        listPessoaA=adicionarNovoNo(listPessoaA,pessoa5);
        listPessoaA=adicionarNovoNo(listPessoaA,pessoa2);
        listPessoaA=adicionarNovoNo(listPessoaA,pessoa3);
        listPessoaA=adicionarNovoNo(listPessoaA,pessoa1);
        listPessoaA=adicionarNovoNo(listPessoaA,pessoa4);
        // System.out.println(listPessoaA.filhoA.nome);
        // System.out.println(listPessoaA.filhoA.filhoA.nome);
        // System.out.println(listPessoaA.filhoA.filhoA.filhoA.nome);
        // System.out.println(listPessoaA.filhoA.filhoA.filhoA.filhoA.nome);
        // System.out.println(listPessoaA.filhoA.filhoA.filhoA.filhoA.filhoA.nome);

        imprimirNomes(listPessoaA);
        listPessoaA=deletarNo(listPessoaA, "Pessoa 3");
        System.out.println("=======================================");
        imprimirNomes(listPessoaA);
        
        
        

    }
    
}
