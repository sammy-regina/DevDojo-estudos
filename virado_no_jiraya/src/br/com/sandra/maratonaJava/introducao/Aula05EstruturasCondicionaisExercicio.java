package src.br.com.sandra.maratonaJava.introducao;

// Quanto tenho que pagar de imposto na holanda em 2020 baseado no meu salario atual

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 7000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double imposto;

        if (salario <= 34712) {
            imposto = salario * primeiraFaixa;
        } else if (salario > 34712 && salario <= 68507) {
            imposto = salario * segundaFaixa;
        } else {
            imposto = salario * terceiraFaixa;
        }
        System.out.println("Quem recebe " + String.format("%.2f", salario) + " paga " + String.format("%.2f", imposto) + " de imposto na Holanda");
    }
}
