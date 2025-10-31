//Desafio - Calculadora de Faixa Etária
package Desafios;

import java.util.Scanner;

public class DesafioAula3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        double idade = entrada.nextDouble();
        
        if (idade<12){
            System.out.println("Que bacana! Você ainda é uma criança!");
        } else if (idade<18) {
            System.out.println("Você é adolescente!");
        } else if (idade<60) {
            System.out.println("Você é adulto");
        } else{
            System.out.println("Você é idoso");
        }

        entrada.close();
    }

}
