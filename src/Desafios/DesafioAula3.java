package Desafios;
import java.util.Scanner;
public class DesafioAula3 {
    public static void main (String[]args ){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu peso(Kg): ");
            double peso = entrada.nextDouble();

        System.out.println("Informe sua altura(m): ");
            double altura = entrada.nextDouble();

            double imc = peso/(altura*altura);

        System.out.printf("\nSeu IMC é: %.2f%n", imc);

        if (imc<18.5){
            System.out.println("Você está abaixo do peso.");
        } else if (imc<25) {
            System.out.println("Você está com peso ideal");
        } else if (imc<30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade");
        }
        entrada.close();
    }
}
