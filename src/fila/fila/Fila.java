public class Fila {
    private int[] fila;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    // Construtor da fila
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new int[this.capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    // Método para enfileirar um elemento na fila
    public void enfileirar(int elemento) {
        // Verifica se a fila está cheia
        if (tamanho == capacidade) {
            System.out.println("Fila cheia! Não é possível adicionar elementos.");
            return;
        }

        // Avança o ponteiro fim e, se necessário, volta ao início do vetor (comportamento circular)
        fim = (fim + 1) % capacidade;
        fila[fim] = elemento;
        tamanho++;
        System.out.println(elemento + " enfileirado.");
    }

    // Método para desenfileirar um elemento da fila
    public int desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia! Não há elementos para desenfileirar.");
            return Integer.MIN_VALUE; // Valor indicativo de fila vazia
        }

        int elemento = fila[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    // Método para verificar o elemento no início da fila sem removê-lo
    public int frente() {
        if (tamanho == 0) {
            System.out.println("Fila vazia! Não há elementos.");
            return Integer.MIN_VALUE; // Valor indicativo de fila vazia
        }

        return fila[inicio];
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para verificar se a fila está cheia
    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    // Método para obter o tamanho da fila
    public int tamanho() {
        return tamanho;
    }
}
