//Desafio Aula 4 - Tabuada Inteligente
package Desafios;
import java.util.Scanner;

public class DesafioAul4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número para ver a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println("\n--- Tabuada de "+numero+" (utilizando For) ---");
        for (int i=1;i<=10;i++){
            System.out.println(numero+" X "+i+" = "+(numero * i));
        }

        int n = 1;
        System.out.println("\n--- Tabuada de " + numero + " (usando while) ---");
        while (n<=10){
            System.out.println(numero+" X "+n+" = "+(numero*n));
            n++;
        }
        int j = 1;
        System.out.println("\n--- Tabuada de " + numero + " (usando do-while) ---");
        do {
            System.out.println(numero+ " X "+j+" = "+(numero*j));
            j++;
        }while (j<=10);

    }
}
