package aula1009;

public class ListaEncadeada {

    // Definição da classe Pessoa (nó da lista)
    private class Pessoa {
        String nome;
        Pessoa proximo;

        Pessoa(String nome) {
            this.nome = nome;
            this.proximo = null;
        }
    }

    // Cabeça da lista
    private Pessoa cabeca;

    // Construtor da lista encadeada
    public ListaEncadeada() {
        this.cabeca = null;
    }

    // Método para adicionar uma pessoa ao final da lista
    public void adicionar(String nome) {
        Pessoa novaPessoa = new Pessoa(nome);

        // Se a lista estiver vazia, a nova pessoa será a cabeça
        if (cabeca == null) {
            cabeca = novaPessoa;
        } else {
            Pessoa atual = cabeca;
            // Percorrer a lista até o último elemento
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            // Adicionar a nova pessoa no final
            atual.proximo = novaPessoa;
        }
    }

    // Método para consultar uma pessoa na lista
    public boolean consultar(String nome) {
        Pessoa atual = cabeca;
        // Percorrer a lista procurando o nome
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                return true;  // Pessoa encontrada
            }
            atual = atual.proximo;
        }
        return false;  // Pessoa não encontrada
    }

    public Pessoa consultar(String nome,int x) {
        Pessoa atual = cabeca;
        // Percorrer a lista procurando o nome
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                return atual;  // Pessoa encontrada
            }
            atual = atual.proximo;
        }
        return null;  // Pessoa não encontrada
    }
    // Método para remover uma pessoa da lista
    public boolean remover(String nome) {
        // Caso a lista esteja vazia
        if (cabeca == null) {
            return false;
        }

        // Caso a pessoa a ser removida seja a primeira da lista
        if (cabeca.nome.equals(nome)) {
            cabeca = cabeca.proximo;
            return true;
        }

        Pessoa atual = cabeca;
        Pessoa anterior = null;

        // Percorrer a lista procurando a pessoa a ser removida
        while (atual != null) {
            if (atual.nome.equals(nome)) {
            	
                // Remover a pessoa da lista
                anterior.proximo = atual.proximo;
                atual=null;
                return true;
            }
            anterior = atual;
            atual = atual.proximo;
        }

        return false;  // Pessoa não encontrada
    }

    // Método para exibir todas as pessoas da lista
    public void exibirLista() {
        Pessoa atual = cabeca;
        while (atual != null) {
            System.out.print(atual.nome + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    // Main para teste da lista encadeada
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Pedro");
        lista.adicionar("João 2");
        lista.adicionar("Maria 3");
        lista.adicionar("Pedro 4");

        System.out.println("Lista atual:");
        lista.exibirLista();

        System.out.println("\nConsulta de Maria: " + lista.consultar("Maria"));
        System.out.println("Remoção de Pedro: " + lista.remover("Pedro"));

        System.out.println("\nLista após remoção:");
        lista.exibirLista();
    }
}
