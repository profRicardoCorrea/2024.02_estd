public class FilaVector<T> {
    private T[] fila;
    private int frente;
    private int traseira;
    private int tamanho;
    private int capacidade;

    // Construtor para inicializar a fila com capacidade especificada
    public FilaVector(int capacidade) {
        this.capacidade = capacidade;
        fila = (T[]) new Object[capacidade];
        frente = 0;
        traseira = -1;
        tamanho = 0;
    }

    // Insere um item no final da fila (enqueue)
    public void insert(T item) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia.");
        }
        traseira = (traseira + 1) % capacidade;
        fila[traseira] = item;
        tamanho++;
    }

    // Remove o primeiro item da fila (dequeue)
    public T remove() {
        if (empty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        T item = fila[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return item;
    }

    // Verifica se a fila está vazia
    public boolean empty() {
        return tamanho == 0;
    }

    // Retorna o tamanho da fila
    public int size() {
        return tamanho;
    }

    // Retorna o próximo item da fila sem remover
    public T front() {
        if (empty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila[frente];
    }

    public static void main(String[] args) {
        FilaVector<Integer> fila = new FilaVector<>(5);

        // Testando as operações
        fila.insert(10);
        fila.insert(20);
        fila.insert(30);

        System.out.println("Tamanho da fila: " + fila.size()); // Saída: 3
        System.out.println("Primeiro item da fila: " + fila.front()); // Saída: 10

        fila.remove();
        System.out.println("Primeiro item da fila após remover: " + fila.front()); // Saída: 20

        System.out.println("A fila está vazia? " + fila.empty()); // Saída: false

        fila.remove();
        fila.remove();

        System.out.println("A fila está vazia após remover todos os itens? " + fila.empty()); // Saída: true
    
        FilaVector<Pessoa> filaPessoas = new FilaVector<>(5);

        // Testando as operações
        filaPessoas.insert(new Pessoa("A","01"));
        filaPessoas.insert(new Pessoa("B","02"));
      

        System.out.println("Tamanho da  filaPessoas: " + filaPessoas.size()); // Saída: 3
        System.out.println("Primeiro item da filaPessoas: " + filaPessoas.front()); // Saída: 10

        System.out.println("NOme:***"+filaPessoas.remove().nome);
        System.out.println("Primeiro item da filaPessoas após remover: " + filaPessoas.front()); // Saída: 20

        System.out.println("A filaPessoas está vazia? " + filaPessoas.empty()); // Saída: false

        filaPessoas.remove();
        filaPessoas.remove();

        System.out.println("A filaPessoas está vazia após remover todos os itens? " + filaPessoas.empty()); // Saída: true
    }
}
