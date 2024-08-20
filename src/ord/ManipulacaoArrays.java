package ord;
import java.util.Random;

public class ManipulacaoArrays {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        
        // Inicializar array com valores aleatórios
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Imprimir elementos do array
        System.out.println("Elementos do array:");
        imprimirArray(array);

        // Calcular e imprimir soma, máximo e mínimo
        int soma = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

    // Método para imprimir os elementos de um array
    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
