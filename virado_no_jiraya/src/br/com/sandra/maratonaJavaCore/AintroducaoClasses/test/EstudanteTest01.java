package src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.test;

import src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Sandra";
        estudante.idade = 35;
        estudante.sexo = 'F';

        System.out.println("--- Dados do Estudante ---");
        System.out.println("Nome: " + estudante.nome + "\nIdade: " + estudante.idade + "\nSexo: " + estudante.sexo);
    }
}
