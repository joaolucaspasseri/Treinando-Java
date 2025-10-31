//Aula 5 - Arrays e Listas
//O que é uma Array? É a estrutura que guarda vários valores do mesmo tipo em uma única variável.
package Aula5;
import java.util.Scanner;

public class MainAula5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String [] alunos = new String [5];

        for (int i=0;i<5;i++){
            System.out.println("Inform o nome do aluno "+(i+1)+":");
            alunos[i] = entrada.nextLine();
        }

        System.out.println("\n Lista de alunos: ");
        for (String nome:alunos){
            System.out.println(nome);
        }
        entrada.close();
    }
}
