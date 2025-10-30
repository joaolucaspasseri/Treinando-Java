package Aula1;

import java.time.LocalDate;
import java.util.Scanner;

//Aula 1:
// Aprender como guardar e manipular informações no Java.
public class MainAula1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Informe sua altura:");
        double altura = entrada.nextDouble();

        System.out.println("Olá" + nome + ",você tem " + idade + " anos e mede " + altura + "m.");

        //calcular quantos anos que faltam pra chegar a 100 anos

        int anosfaltando = 100 - idade;

        int anoatual = LocalDate.now().getYear(); // ano atual do sistema

        if (anosfaltando>0){
            int anocem = anoatual + anosfaltando;

            System.out.println("Faltam "+anosfaltando+" anos para você completar 100!");
            System.out.println("Você completará 100 anos no ano de "+anocem+"!");
        } else if (anosfaltando==0) {
            System.out.println("Toma! Você completou 100 anos nesse ano de "+anoatual+"!");
        }else {
            int anocem = anoatual+anosfaltando;
            System.out.println("Você completou 100 anos no ano de "+anocem+". Que incrível");
        }

        entrada.close();

    }
}
