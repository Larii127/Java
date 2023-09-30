import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner aluno = new Scanner(System.in);
        Scanner professor = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema Acadêmico");
            System.out.println("1. Cadastrar Aluno");


            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.println("Iforme o nome do aluno:");
                    aluno.setNome(scanner.next());
                    System.out.println("Informe a idade:");
                    aluno.setIdade(input.nextInt());
                    System.out.println("Informe a primeira nota:");
                    aluno.setNota1(input.nextInt());
                    System.out.println("Informe a segunda nota:");
                    aluno.setNota1(input.nextInt());
                    break;
                case 2:
                    System.out.println("Iforme o nome do professor:");
                    professor.setNome(scanner.nextLine());
                    System.out.println("Informe a idade:");
                    professor.setIdade(input.nextInt());
                    System.out.println("Informe a especializaçaõ:");
                    professor.setEspecializacao(input.nextInt());
                    System.out.println("Informe o salario:");
                    professor.setSalario(input.nextInt());

                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }


