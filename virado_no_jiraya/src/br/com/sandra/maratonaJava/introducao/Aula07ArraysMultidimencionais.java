package src.br.com.sandra.maratonaJava.introducao;

public class Aula07ArraysMultidimencionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------array base-------------");
        for (int[] arrBase : dias) { //foreach na array base ele pega cada array interna
            for (int num : arrBase) { // foreach na array interna
                System.out.println(num);
            }
        }
    }
}
