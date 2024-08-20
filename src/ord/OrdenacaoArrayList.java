package ord;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoArrayList {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();

        // Adicionar nomes de cidades à lista
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");
        cidades.add("Curitiba");

        // Imprimir lista antes da ordenação
        System.out.println("Lista antes da ordenação:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Ordenar a lista em ordem alfabética
        Collections.sort(cidades);

        // Imprimir lista após a ordenação
        System.out.println("Lista após a ordenação:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
