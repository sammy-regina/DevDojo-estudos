package src.br.com.sandra.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * %
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println("Resultado da soma: " + resultado);

        resultado = numero2 - numero1;
        System.out.println("Resultado da subtração: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("Resultado da multiplicação: " + resultado);

        resultado = numero2 / numero1;
        System.out.println("Resultado da divisão: " + resultado);

        resultado = numero2 % numero1;
        System.out.println("Resultado do módulo: " + resultado);

        // operadores de atribuição
        int i = 0;
        i += 5; // i = i + 5
        System.out.println("i após += 5: " + i);
        i -= 3; // i = i - 3
        System.out.println("i após -= 3: " + i);
        i *= 2; // i = i * 2
        System.out.println("i após *= 2: " + i);
        i /= 4; // i = i / 4
        System.out.println("i após /= 4: " + i);
        i %= 3; // i = i % 3
        System.out.println("i após %= 3: " + i);

        // contador
        int contador =0;
        contador +=1; // contador = contador + 1
        contador++; // contador = contador + 1
        contador--; // contador = contador - 1
        System.out.println("Valor do contador: " + contador);

        // operadores de incremento e decremento
        int j = 0;
        j++; // j = j + 1
        System.out.println("j após j++: " + j);
        j--; // j = j - 1
        System.out.println("j após j--: " + j);
        ++j; // j = j + 1
        System.out.println("j após ++j: " + j);
        --j; // j = j - 1
        System.out.println("j após --j: " + j);

        // operadores relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezMaiorOuIgualADez = 10 >= 10;
        boolean isDezMenorOuIgualADez = 10 <= 10;
        System.out.println("10 > 20: " + isDezMaiorQueVinte);
        System.out.println("10 < 20: " + isDezMenorQueVinte);
        System.out.println("10 == 20: " + isDezIgualAVinte);
        System.out.println("10 != 20: " + isDezDiferenteDeVinte);
        System.out.println("10 >= 10: " + isDezMaiorOuIgualADez);
        System.out.println("10 <= 10: " + isDezMenorOuIgualADez);

        // operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        // && (AND) - todas as condições precisam ser verdadeiras
        boolean and = condicao1 && condicao2;
        System.out.println("condicao1 && condicao2: " + and);
        // || (OR) - uma das condições precisa ser verdadeira
        boolean or = condicao1 || condicao2;
        System.out.println("condicao1 || condicao2: " + or);
        // ! (NOT) - inverte o valor da condição
        boolean not = !condicao1;
        System.out.println("!condicao1: " + not);

        // operador ternário
        int a, b;
        a = 5;
        b = 6;
        String resultadoTernario = a == b ? "verdadeiro" : "falso";
        System.out.println("Resultado do operador ternário: " + resultadoTernario);

    }
}
