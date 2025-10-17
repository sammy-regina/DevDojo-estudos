package src.br.com.sandra.maratonaJava.introducao;

public class Aula07ArrayInicializacao {
    public static void main(String[] args) {
        // outra forma de inicializar um array
        int[] idades = {25, 10, 49}; // declarando e inicializando um array de inteiros
        for (int i = 0; i < idades.length; i++) { // percorrendo o array com um loop for
            System.out.println(idades[i]); // imprimindo os valores do array
        }

        System.out.println("--------for each------------");
        // outra forma de percorrer o array, usando o for each
        for (int idade : idades) { // para cada idade dentro do array idades faça isso
            System.out.println(idade); // imprimindo os valores do array
        }
    }
}
