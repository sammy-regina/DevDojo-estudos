package src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.test;

import src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 5); // (10, 5) argumentos que são oa valores recebidos pelos parâmetros
        System.out.println("Fim do Teste 02A");

        System.out.println("-------------------");

        calculadora.multiplicaDoisNumeros(2, 3.5F); // usando float
        System.out.println("Fim do Teste 02B");
    }
}
