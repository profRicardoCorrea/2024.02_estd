package h2708;

public class PotenciaRecursiva {

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1; // Qualquer número elevado a 0 é 1
        }

        if (expoente < 0) {
            return 1 / potencia(base, -expoente); // Lida com expoentes negativos
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int expoente = 3;
        System.out.println("Resultado: " + potencia(base, expoente)); // 8
    }
}
