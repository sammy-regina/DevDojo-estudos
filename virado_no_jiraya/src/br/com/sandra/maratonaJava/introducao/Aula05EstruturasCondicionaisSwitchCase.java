package src.br.com.sandra.maratonaJava.introducao;

public class Aula05EstruturasCondicionaisSwitchCase {
    // Imprime o dia da semana baseado no numero
    public static void main(String[] args) {
        int dia = 4;
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Segunda-feira";
                break;
            case 2:
                diaSemana = "Terça-feira";
                break;
            case 3:
                diaSemana = "Quarta-feira";
                break;
            case 4:
                diaSemana = "Quinta-feira";
                break;
            case 5:
                diaSemana = "Sexta-feira";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Dia inválido";
                break;
        }
        System.out.println("Hoje é " + diaSemana);

        // Imprima se a pessoa é homem ou mulher baseado no charactere  'F' ou 'M'
        char sexo = 'F';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }

        // switch com String
        String linguagem = "Java";
        switch (linguagem) {
            case "Java":
                System.out.println("Linguagem Java");
                break;
            case "Python":
                System.out.println("Linguagem Python");
                break;
            case "JavaScript":
                System.out.println("Linguagem JavaScript");
                break;
            default:
                System.out.println("Linguagem inválida");
                break;
        }
    }
}
