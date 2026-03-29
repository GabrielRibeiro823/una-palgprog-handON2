package handsON;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char opcao;
        int contTentativas = 0;
        int tentMaximas = 3;


        do {
            System.out.println("Em Java, qual estrutura é mais adequada para executar um bloco" +
                    "de código repetidamente enquanto uma condição for verdadeira, sendo que essa condição é verificada antes da execução?");
            System.out.println("A) switch");
            System.out.println("B) for");
            System.out.println("C) while");
            System.out.println("D) do-while");
            System.out.println("E) if");


            System.out.println("digite a opçao correta para encerra o programa: ");
            opcao = Character.toLowerCase(leitor.next().charAt(0));
            contTentativas++;

            switch (opcao) {
                case 'a', 'b', 'd', 'e':
                    System.out.println("Resposta incorreta");
                    break;
                case 'c':
                    System.out.println("Resposta correta");
                    System.out.println("Voce acertou na tentativa " + contTentativas);
                    break;
                default:
                    System.out.println("Opçao invalida!");
                    contTentativas--;
            }


        } while (opcao != 'c' && contTentativas < tentMaximas);

        if (opcao != 'c') {
            System.out.println("Você atingiu o limite de tentativas!");
        }
        leitor.close();


    }
}
