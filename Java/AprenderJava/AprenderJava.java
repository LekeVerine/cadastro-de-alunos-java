package AprenderJava;

import java.util.Scanner;


public class AprenderJava {
    public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    int i;
    double somaNotas, media;
    somaNotas = 0;
    
    String [] nome = new String[3];
    int [] idade = new int[3];
    double [] nota = new double[3];

    for ( i = 0; i < 3; i++) {
        
        System.out.println("\n\t*** Cadastro do aluno " + (i + 1) + " ****");
        
         System.out.print("Digite o seu nome:  ");
         nome[i] = obj.nextLine();

         System.out.print("Qual a sua idade?  ");
         idade[i] = obj.nextInt();

         System.out.print("Qual foi a sua nota?  ");
         nota[i] = obj.nextDouble();

         somaNotas += nota[i];

         obj.nextLine();
    
    }
    
        System.out.println("\n\t*** Lista de alunos  ****");
        for ( i = 0; i < 3; i++) {
            System.out.println("Nome: " + nome[i] + " | Idade: " + idade[i] + " | Nota: " + nota[i]);
        }

        media = somaNotas/3;
        System.out.println("\nMedia geral da turma: "+media);
        if (media<6){
            System.out.print("**media bem abaixo do esperado...**");
        }else if (media >= 6 && media < 8){
            System.out.println("Boa, estao em uma media otima!");
        }else{
            System.out.println("Me surpreenderam, parebens!!!!");
        }
  }
}   
