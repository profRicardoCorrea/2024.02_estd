import java.util.Random;

public class OrdenacaoArrays {

    public static void main(String[] args) {
        int[] arrayOriginal = new int[10];
        int[] arrayOrdenado = new int[10];

        // Inicializar arrayOriginal com valores aleatórios
        Random random = new Random();
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = random.nextInt(100) + 1;
        }

        // Transferir elementos para arrayOrdenado
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOrdenado[i] = arrayOriginal[i];
        }

        // Ordenar arrayOrdenado
        bubbleSort(arrayOrdenado);

        // Imprimir arrays
        System.out.println("Array Original:");
        imprimirArray(arrayOriginal);
        
        System.out.println("Array Ordenado:");
        imprimirArray(arrayOrdenado);
    }

    // Método para ordenar um array usando Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // Método para imprimir os elementos de um array
    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
