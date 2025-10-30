//Operadores Matemáticos e Lógicos
package Aula2;
import java.util.Scanner;

public class MainAula2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o segundo número");
        double num2 = entrada.nextDouble();

        System.out.println("\nResultados: ");
        System.out.println("Soma: "+(num1+num2));
        System.out.println("Subtração: "+ (num1-num2));
        System.out.println("Multiplicação: "+ (num1*num2));
        System.out.println("Divisão: "+ (num1/num2));
        System.out.println("Resto da divisão: "+ (num1%num2));

        entrada.close();
    }
}

//Operadores Relacionais e Lógicos