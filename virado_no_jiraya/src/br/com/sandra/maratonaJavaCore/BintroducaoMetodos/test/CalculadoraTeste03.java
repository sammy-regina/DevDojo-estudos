package src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.test;

import src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2); // resultado recebe o valor retornado pelo método
        System.out.println(resultado);
        System.out.println("Fim do Teste 03A");

        System.out.println("-------------------");
    }
}
