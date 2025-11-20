package src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.test;

import src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Fim do Teste 01");

        System.out.println("-------------------");

        calculadora.subtraiDoisNumeros();
        System.out.println("Fim do Teste 02");
    }
}
