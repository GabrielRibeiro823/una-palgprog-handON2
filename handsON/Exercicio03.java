package handsON;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite uma bela frase por favor: ");
        String frase = leitor.nextLine();

        int letra = 0;
        int espacos = 0;
        int numeros = 0;
        int outros = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Verifica se é uma letra (a-z, A-Z)
            if (Character.isLetter(c)) {
                letra++;
                // Verifica se é um número (0-9)
            } else if (Character.isDigit(c)) {
                espacos++;
                // Verifica se é espaço (ou tab, quebra de linha)
            } else if (Character.isWhitespace(c)) {
                numeros++;
                // Qualquer outro caractere (!, @, #, etc)
            } else {
                outros++;
            }
        }
        System.out.println("quantidades de letras "+letra);
        System.out.println("quantidades de numeros "+numeros);
        System.out.println("quantidades de espaços "+espacos);
        System.out.println("espaços de outros caracteres "+outros);

        leitor.close();
    }
}
