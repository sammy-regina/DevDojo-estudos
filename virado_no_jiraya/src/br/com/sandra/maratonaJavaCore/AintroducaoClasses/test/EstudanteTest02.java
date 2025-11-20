package src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.test;

import src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println("--- Dados padrão do Estudante ---");
        // Se nãoa tribuir o valor das variáveis, os valores padrões serão atribuídos(0, null, false)
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

    }
}
