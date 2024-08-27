package h2708;

public class PermutacaoString {

    public static void permutar(String str, int inicio, int fim) {
        if (inicio == fim) {
            System.out.println(str); // Impressão de uma permutação
        } else {
            for (int i = inicio; i <= fim; i++) {
                str = trocar(str, inicio, i);
                permutar(str, inicio + 1, fim);
                str = trocar(str, inicio, i); // Backtrack para restaurar a string original
            }
        }
    }

    public static String trocar(String str, int i, int j) {
        char[] array = str.toCharArray();
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permutar(str, 0, n - 1);
    }
}
