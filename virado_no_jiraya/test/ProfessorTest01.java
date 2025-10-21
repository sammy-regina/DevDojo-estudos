package test;

import src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fabio";
        professor.idade = 40;
        professor.sexo = 'M';
        professor.especialidade = "Java";

        System.out.println("--- Dados do Professor ---");
        System.out.println("Nome: " + professor.nome +
                           "\nIdade: " + professor.idade +
                           "\nSexo: " + professor.sexo +
                           "\nEspecialidade: " + professor.especialidade);
    }
}
