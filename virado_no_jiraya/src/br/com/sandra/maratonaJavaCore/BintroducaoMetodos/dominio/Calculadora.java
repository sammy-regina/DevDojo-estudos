package src.br.com.sandra.maratonaJavaCore.BintroducaoMetodos.dominio;

public class Calculadora {
    // Métodos são ações que um objeto pode executar

    // Void método que não retorna valor
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }
    // Método com parâmetros
    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    // Método com retorno
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) { // checagem para evitar divisão por zero
            System.out.println("Não é possível realizar uma divisão por zero");
            return 0;
        }
        return num1 / num2;
    }
}
