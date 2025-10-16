package src.br.com.sandra.maratonaJava.introducao;

import java.util.Scanner;

public class Aula06EstruturaDeRepeticaoExercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o exercício:");
        System.out.println("1 - Tabuada");
        System.out.println("2 - Números pares de 1 a 100");
        System.out.println("3 - Triângulo de asteriscos");
        System.out.println("4 - Soma dos múltiplos de 3");
        System.out.println("5 - Quantidade de parcelas do carro");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                tabuada(sc);
                break;
            case 2:
                numerosPares();
                break;
            case 3:
                trianguloAsteriscos(sc);
                break;
            case 4:
                multiplosDeTres(sc);
                break;
            case 5:
                parcelas();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }

    public static void tabuada(Scanner sc) {
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void numerosPares() {
        System.out.println("Números pares de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // se o resto da divisão por 2 for 0, é par
                System.out.println(i);
            }
        }
    }

    public static void trianguloAsteriscos(Scanner sc) {
        System.out.print("Digite o número de linhas do triângulo: ");
        int linhas = sc.nextInt(); // número de linhas do triângulo

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // imprime asteriscos
            }
            System.out.println();
        }
    }

    public static void multiplosDeTres(Scanner sc){
        System.out.println("Digite um número para somar os múltiplos de 3 até ele:");
        int numero = sc.nextInt();
        int soma = 0;
        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0){ // se o resto da divisão por 3 for 0, é múltiplo de 3
                soma += i;
                System.out.println("Somando: " + i);
            }
        }
        System.out.println("A soma dos múltiplos de 3 até " + numero + " é: " + soma);
    }

    // Dado o valor do carro, descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void parcelas(){
        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){ // enquanto a parcela for menor ou igual ao valor total
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break; // sai do loop quando a parcela for menor que 1000
            }
        }
    }

}
