package src.br.com.sandra.maratonaJava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // eplicando arrays, que são estruturas de dados que armazenam múltiplos valores do mesmo tipo
        // primeiro declaramos o tipo, depois abre e fecha colchetes e depois o nome da variável+
        // o indice sempre começa em 0 para byte, int, long, float, double,
        // para char começa com o espaço em branco
        // para boolean começa com false
        // para String começa com null

        int[] idades = new int[3]; // declarando um array de inteiros com 3 posições
        idades[0] = 21; // atribuindo valores às posições do array
        idades[1] = 12;
        idades[2] = 68;

        System.out.println(idades[0]); // imprimindo o array, que está nulo

        System.out.println("----------array string com for----------");
        String[] nomes = new String[4]; // declarando um array de Strings com 4 posições
        nomes[0] = "Sandra"; // atribuindo valores às posições do array
        nomes[1] = "Jiraya";
        nomes[2] = "Naruto";
        nomes[3] = "Sasuke";

        for (int i = 0; i < 4; i++) { // percorrendo o array com um loop for
            System.out.println(nomes[i]); // imprimindo os valores do array
        }

        // como deixar o código mais dinâmico, sem precisar ficar alterando o 4 do for
        System.out.println("---------lenght (mais dinámico)-----------");
        for (int i = 0; i < nomes.length; i++) { // usando o .length para pegar o tamanho do array
            System.out.println(nomes[i]); // imprimindo os valores do array
        }

        System.out.println("--------for each------------");
        // outra forma de percorrer o array, usando o for each
        for (String nome : nomes) { // para cada nome dentro do array nomes faça isso
            System.out.println(nome); // imprimindo os valores do array
        }
    }
}
