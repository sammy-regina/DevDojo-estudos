package src.br.com.sandra.maratonaJava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // eplicando arrays, que são estruturas de dados que armazenam múltiplos valores do mesmo tipo
        // primeiro declaramos o tipo, depois abre e fecha colchetes e depois o nome da variável+
        // o indice sempre começa em 0

        int[] idades = new int[3]; // declarando um array de inteiros com 3 posições

        idades[0] = 21; // atribuindo valores às posições do array
        idades[1] = 12;
        idades[2] = 68;

        System.out.println(idades[0]); // imprimindo o array, que está nulo

    }
}
