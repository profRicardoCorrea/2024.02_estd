package h2708;

public class PalindromoRecursivo {

    public static boolean isPalindromo(String str, int inicio, int fim) {
        if (inicio >= fim) {
            return true; // Condição de parada
        }

        if (str.charAt(inicio) != str.charAt(fim)) {
            return false; // Não é palíndromo
        }

        return isPalindromo(str, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String palavra = "radar";
        boolean resultado = isPalindromo(palavra, 0, palavra.length() - 1);
        System.out.println("É palíndromo? " + resultado);
    }
}
