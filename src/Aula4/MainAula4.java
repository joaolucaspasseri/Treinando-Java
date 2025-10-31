// Aula 4 - Estruturas de Repetição (Loops - for,while,do-while)
package Aula4;

import java.util.Scanner;

//for - quantas vezes que você sabe que vai repetir
// while - você não sabe quantas vezes vai repetir
public class MainAula4 {
    public static void main(String[]args){
        for (int i = 1; i <= 5;i++ ){
            System.out.println("Contagem: "+ i);
        }
            System.out.println("Fim do Loop!");

// while - você não sabe quantas vezes vai repetir
        int contador = 1;
        while (contador <= 5){
            System.out.println("Contagem: "+ contador);
            contador++;
        }
        System.out.println("Fim do Loop!(While)");

// do-while execut pelo menos uma vez
        int contagem = 6;
        do {
            System.out.println("Contagem: "+ contagem);
            contagem++;
        }while (contagem <= 5);

        System.out.println("Fim do Loop!(do-while)");
    }
}
