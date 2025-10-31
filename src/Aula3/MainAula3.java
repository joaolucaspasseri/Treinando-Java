//Aula 3 - Estruturas Condicionais em Java (if, else if, else)
package Aula3;
import java.util.Scanner;

public class MainAula3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        double nota = entrada.nextDouble();

        if (nota>=7){
            System.out.println("Aprovado!");
        } else if (nota>=5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}
