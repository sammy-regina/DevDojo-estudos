package src.br.com.sandra.maratonaJava.introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
            // Exemplo com while
        System.out.println("\n--------------whaile--------------\n");
        int count = 0;
        while (count < 11) { // enquanto a condição < 10 for verdadeira, executa o bloco
            System.out.println("Count = " + count);
            count++; // incrementa o valor de count em 1
        }

        // Exemplo com do while
        System.out.println("\n--------------do while--------------\n");
        count = 0;
        do {
            System.out.println("Count do while = " + count);
            count++;
        } while (count < 13); // executa o bloco pelo menos uma vez, depois verifica a condição

        // Exemplo com for
        System.out.println("\n-------------for---------------\n");
        for (int i = 0; i < 16; i++) { // emquanto i for menor que 16 incrementa 1
            
            System.out.println("Count for = " + i);
        }

        // Exemplo com continue
        System.out.println("\n--------------continue--------------\n");
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            if (valorTotal / parcela < 1000) {
                continue; // pula para a próxima iteração se a condição for verdadeira
            }
            System.out.println("Parcela " + parcela + " R$ " + (valorTotal / parcela));
        }

    }
}
