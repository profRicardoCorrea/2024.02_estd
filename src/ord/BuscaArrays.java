package ord;
public class BuscaArrays {

    public static void main(String[] args) {
        int[] array = {10, 25, 33, 47, 56, 33, 78, 90, 100, 33};
        int valorBuscado = 33;

        int indice = buscarValor(array, valorBuscado);
        if (indice != -1) {
            System.out.println("O valor " + valorBuscado + " foi encontrado no índice " + indice);
        } else {
            System.out.println("O valor " + valorBuscado + " não foi encontrado no array.");
        }
    }

    // Método para buscar um valor no array
    public static int buscarValor(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
