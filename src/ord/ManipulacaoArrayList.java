package ord;
import java.util.ArrayList;

public class ManipulacaoArrayList {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        // Adicionar 5 nomes à lista
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniela");
        nomes.add("Eduardo");

        // Remover o segundo nome
        nomes.remove(1); // Remove "Bruno"

        // Adicionar um novo nome no final
        nomes.add("Fernanda");

        // Imprimir todos os nomes da lista
        System.out.println("Nomes na lista:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
