package h2708;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizacao {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n); // Retorna o valor memoizado
        }

        int resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, resultado); // Armazena o valor calculado

        return resultado;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n)); // 55
    }
}
