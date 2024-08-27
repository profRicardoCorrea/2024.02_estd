package lista_encadeada;
public class PessoaA {
    String nome;
    int idade;
    PessoaA filhoA;
    
    // Método recursivo para deletar um nó
    public PessoaA deletarNo(String nomeAlvo) {
        // Se o nó atual for o nó a ser deletado, retornamos o próximo nó
        if (this.nome.equals(nomeAlvo)) {
            return this.filhoA;
        } else if (this.filhoA != null) {
            // Se o próximo nó for o nó a ser deletado, fazemos o nó atual apontar para o nó seguinte ao próximo nó
            if (this.filhoA.nome.equals(nomeAlvo)) {
                this.filhoA = this.filhoA.filhoA;
            } else {
                // Caso contrário, chamamos o método recursivamente no próximo nó
                this.filhoA = this.filhoA.deletarNo(nomeAlvo);
            }
        }
        return this;
    }


    public void imprimirNomes() {
        // Imprime o nome do objeto atual
        System.out.println("Nome:"+nome);
        
        // Verifica se há um filho encadeado e chama o método recursivamente
        if (filhoA != null) {
            filhoA.imprimirNomes();
        }
    }

    public void adicionarNovoNo(PessoaA novoNo) {
        // Se o nó atual não tem um filho, adicionamos o novo nó aqui
        if (this.filhoA == null) {
            this.filhoA = novoNo;
        } else {
            // Caso contrário, chamamos o método recursivamente no filho atual
            this.filhoA.adicionarNovoNo(novoNo);
        }
    }
}
