package ord;
public class ManipulacaoMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("Soma das linhas:");
        imprimirArray(somaLinhas);

        System.out.println("Soma das colunas:");
        imprimirArray(somaColunas);
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Método para imprimir os elementos de um array
    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
