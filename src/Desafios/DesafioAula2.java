package Desafios;

import java.util.Scanner;

public class DesafioAula2 {
    public static void main (String[]args ){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu peso(Kg): ");
            double peso = entrada.nextDouble();

        System.out.println("Informe sua altura(m): ");
            double altura = entrada.nextDouble();

            double imc = peso/(altura*altura);

        System.out.printf("\nSeu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (grave)");
        }

        entrada.close();
    }
}
