package src.br.com.sandra.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos
        // int, double, float, char, byte, short, long, boolean
        int idade = 10; //quando for usar int? numeros inteiros
        double salarioDouble = 2000.0; // quando for usar double? mais preciso com numeros reais e ocupa mais memoria
        float salarioFloat = 2500.0F; // quando for usar float? menos preciso com numeros reais e ocupa menos memoria
        byte idadeByte = 10; // quando for usar byte? -128 a 127
        short idadeShort = 20; // quando for usar short? -32.768 a 32.767
        long numeroGrandeLong = 1000000000000000000L; // quando for usar long? numeros grandes
        char caractere = 'A'; // quando for usar char? apenas um caractere da tabela ASCII
        boolean verdadeiro = true; // quando for usar boolean? true ou false

        System.out.println("Idade: " + idade);
        System.out.println("Salario Double: " + salarioDouble);
        System.out.println("Salario Float: " + salarioFloat);
        System.out.println("Idade Byte: " + idadeByte);
        System.out.println("Idade Short: " + idadeShort);
        System.out.println("Numero Grande Long: " + numeroGrandeLong);
        System.out.println("Caractere: " + caractere);
        System.out.println("Verdadeiro: " + verdadeiro);

        // casting (conversão de tipos) força a conversão
        double salarioDouble2 = 2500.0;
        float salarioFloat2 = (float) salarioDouble2; // casting de double para float
        System.out.println("Salario Float2: " + salarioFloat2);

        // tipos primitivos x tipos referencia
        int idade2 = 20; // tipo primitivo
        Integer idadeRef = Integer.valueOf(20); // tipo referencia (objeto) usado quando precisa de mais funcionalidades

        // wrapper classes (classes que envolvem os tipos primitivos)
        Integer idadeRef2 = 30; // autoboxing (conversão automática de primitivo para objeto)
        int idade3 = idadeRef2; // unboxing (conversão automática de objeto para primitivo)

        System.out.println("Idade2: " + idade2);
        System.out.println("IdadeRef: " + idadeRef);
        System.out.println("IdadeRef2: " + idadeRef2);
        System.out.println("Idade3: " + idade3);

        // valor default dos tipos primitivos
        int valorDefaultInt = 0;
        double valorDefaultDouble = 0.0;
        float valorDefaultFloat = 0.0F;
        byte valorDefaultByte = 0;
        short valorDefaultShort = 0;
        long valorDefaultLong = 0L;
        char valorDefaultChar = '\u0000'; // caractere vazio
        boolean valorDefaultBoolean = false;

        System.out.println("Valor Default Int: " + valorDefaultInt);
        System.out.println("Valor Default Double: " + valorDefaultDouble);
        System.out.println("Valor Default Float: " + valorDefaultFloat);
        System.out.println("Valor Default Byte: " + valorDefaultByte);
        System.out.println("Valor Default Short: " + valorDefaultShort);
        System.out.println("Valor Default Long: " + valorDefaultLong);
        System.out.println("Valor Default Char: '" + valorDefaultChar + "'");
        System.out.println("Valor Default Boolean: " + valorDefaultBoolean);
    }
}
