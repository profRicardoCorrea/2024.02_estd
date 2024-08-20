package ord;
import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota;
    }
}

public class GerenciamentoAlunos {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno pelo nome");
            System.out.println("3. Calcular média de notas");
            System.out.println("4. Encontrar aluno com a maior nota");
            System.out.println("5. Listar todos os alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a nota do aluno: ");
                    double nota = scanner.nextDouble();
                    alunos.add(new Aluno(nome, nota));
                    break;

                case 2:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    removerAluno(alunos, nomeRemover);
                    break;

                case 3:
                    double media = calcularMedia(alunos);
                    System.out.println("Média de notas: " + media);
                    break;

                case 4:
                    Aluno alunoMaiorNota = encontrarMaiorNota(alunos);
                    if (alunoMaiorNota != null) {
                        System.out.println("Aluno com a maior nota: " + alunoMaiorNota);
                    } else {
                        System.out.println("Não há alunos cadastrados.");
                    }
                    break;

                case 5:
                    listarAlunos(alunos);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void removerAluno(ArrayList<Aluno> alunos, String nome) {
        Aluno alunoRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.nome.equalsIgnoreCase(nome)) {
                alunoRemover = aluno;
                break;
            }
        }
        if (alunoRemover != null) {
            alunos.remove(alunoRemover);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static double calcularMedia(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.nota;
        }
        return soma / alunos.size();
    }

    public static Aluno encontrarMaiorNota(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) {
            return null;
        }
        Aluno alunoMaiorNota = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.nota > alunoMaiorNota.nota) {
                alunoMaiorNota = aluno;
            }
        }
        return alunoMaiorNota;
    }

    public static void listarAlunos(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}
