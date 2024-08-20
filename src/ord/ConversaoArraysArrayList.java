package ord;
import java.util.ArrayList;
import java.util.Arrays;

public class ConversaoArraysArrayList {

    public static void main(String[] args) {
        // Criar um array de inteiros com 5 elementos
        Integer[] array = {10, 20, 30, 40, 50};

        // Converter o array para uma ArrayList
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(array));

        // Adicionar dois novos elementos à ArrayList
        lista.add(60);
        lista.add(70);

        // Converter a ArrayList de volta para um array
        Integer[] novoArray = new Integer[lista.size()];
        lista.toArray(novoArray);

        // Imprimir o array final
        System.out.println("Array final:");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
