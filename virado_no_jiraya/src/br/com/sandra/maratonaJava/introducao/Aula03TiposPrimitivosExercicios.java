package src.br.com.sandra.maratonaJava.introducao;

/*
Pratica
Crie variáveis para os campos descritos abaixoentre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.
 */

import java.util.logging.Logger;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Sandra";
        String endereco = "Rua das Flores, 123";
        double salario = 2500.50;
        String dataRecebimentoSalario = "10/10/2025";

        // usando concatenação
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",");
        System.out.println("confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario + ".");

        // usando printf
        String relatorio = String.format("Eu %s, morando no endereço %s,%nconfirmo que recebi o salário de R$%.2f, na data %s.",
                nome, endereco, salario, dataRecebimentoSalario);
        System.out.println(relatorio);
    }
    // alternativa usando logger usado em projetos maiores
  /*private static final Logger logger = Logger.getLogger(Aula03TiposPrimitivosExercicios.class.getName());

    public static void main(String[] args) {
        String nome = "Sandra";
        String endereco = "Rua das Flores, 123";
        double salario = 2500.50;
        String dataRecebimentoSalario = "10/10/2025";

        // usando concatenação
        logger.info("Eu " + nome + ", morando no endereço " + endereco + ",");
        logger.info("confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario + ".");

        // usando printf
        String relatorio = String.format("Eu %s, morando no endereço %s,%nconfirmo que recebi o salário de R$%.2f, na data %s.",
                nome, endereco, salario, dataRecebimentoSalario);
        logger.info(relatorio);
    }*/
}
