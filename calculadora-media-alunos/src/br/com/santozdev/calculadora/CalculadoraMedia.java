package br.com.santozdev.calculadora;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu
        int opcao;
        do {
            System.out.println("==========================");
            System.out.println("MENU: ");
            System.out.println("1- Calcular a Média do(a) aluno(a):  ");
            System.out.println("2- Para Sair  ");
            System.out.println("Escolha uma opção: ");
            System.out.println("==========================");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("\nEXECUTANDO..\n");

                    //Entrada
                    System.out.println("==========================");
                    System.out.println("Digite o nome do aluno(a):");
                    String nomeAluno = scanner.nextLine();
                    nomeAluno = nomeAluno.toUpperCase();

                    System.out.println("Digite a matrícula: ");
                    int matricula = scanner.nextInt();
                    System.out.println("==========================\n");
                    scanner.nextLine();

                    System.out.println("==========================");
                    System.out.println("Digite a primeira nota do aluno: ");
                    float primeiraNota = scanner.nextFloat();

                    System.out.println("Digite a segunda nota do aluno");
                    float segundaNota = scanner.nextFloat();
                    System.out.println("==========================\n");

                    // Processamento
                    while (primeiraNota < 0 || segundaNota < 0 || primeiraNota > 10 || segundaNota > 10) {

                        System.out.println("NOTA INVÁLIDA INSIRA NOVAMENTE: \n");
                        System.out.println("Digite a primeira nota do aluno: ");
                        primeiraNota = scanner.nextFloat();
                        System.out.println("Digite a segunda nota do aluno: ");
                        segundaNota = scanner.nextFloat();
                        System.out.println("==========================");
                    }
                    // saida
                    float media = (primeiraNota + segundaNota)/2;

                    if (media >= 7){
                        System.out.println("\nALUNO(A): " + nomeAluno + " APROVADO(A)!! | MÉDIA: " + media);
                        System.out.println("\n");

                    }else if (media >= 5){
                        System.out.println("\nALUNO(A): " + nomeAluno + " ESTÁ EM RECUPERAÇÃO! | MÉDIA " + media);
                        System.out.println("\n");
                    }else{
                        System.out.println("\nALUNO(A): " + nomeAluno + " REPROVADO(A)! | MÉDIA " + media);
                        System.out.println("\n");
                    }

                    break; //termina case 1

                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } while (opcao != 2);
    }
}
