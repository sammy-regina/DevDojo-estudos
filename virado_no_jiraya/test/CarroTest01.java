package test;

import src.br.com.sandra.maratonaJavaCore.AintroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "F40";
        carro1.ano = 1987;

        carro2.nome = "Lamborghini";
        carro2.modelo = "Diablo";
        carro2.ano = 1990;

        System.out.println("----- Carro 1 -----");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("----- Carro 2 -----");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}