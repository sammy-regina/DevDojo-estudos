package src.br.com.sandra.maratonaJava.introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        // whaile, do while, for
        int count = 0;
        while (count < 11) { // enquanto a condição < 10 for verdadeira, executa o bloco
            System.out.println("Count = " + count);
            count++; // incrementa o valor de count em 1
        }

        // Exemplo com do while
        count = 0;
        do {
            System.out.println("Count do while = " + count);
            count++;
        } while (count < 13); // executa o bloco pelo menos uma vez, depois verifica a condição

        // Exemplo com for
        for (int i = 0; i < 16; i++) { // emquanto i for menor que 16 incrementa 1
            
            System.out.println("Count for = " + i);
        }

    }
}
