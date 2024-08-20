package ord;
import java.util.ArrayList;
import java.util.Random;

public class BuscaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random random = new Random();

        // Adicionar 10 números aleatórios entre 1 e 100 à lista
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        // Valor a ser buscado
        int valorBuscado = 50; // Pode ser modificado para testar com diferentes valores

        // Buscar o valor na lista
        int indice = buscarValor(numeros, valorBuscado);
        if (indice != -1) {
            System.out.println("O valor " + valorBuscado + " foi encontrado no índice " + indice);
        } else {
            System.out.println("O valor " + valorBuscado + " não foi encontrado na lista.");
        }
    }

    // Método para buscar um valor na lista
    public static int buscarValor(ArrayList<Integer> lista, int valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == valor) {
                return i;
            }
        }
        return -1;
    }
}
