package src.br.com.sandra.maratonaJava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // toda variavel local deve ser inicializada antes de ser usada

        // Estrutura condicional = if, else
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int idade2 = 16;
        boolean isAutorizadoComprarBebida = idade2 >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }

        // Exemplo de else if
        int idade3 = 68;
        boolean isIdoso = idade3 >= 65;
        if (isIdoso) {
            System.out.println("Idoso");
        } else if (idade3 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Operador Ternario
        // Doar se salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições de doar";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; // operador ternario

        System.out.println(resultado);
    }
    // Tabela verdade AND (&&) todas as condições precisam ser verdadeiras para resultar em true
    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = false

    // Tabela verdade OR (||) pelo menos uma condição precisa ser verdadeira para resultar em true
    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false

}
