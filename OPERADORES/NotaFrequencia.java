package OPERADORES;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in); // sc objeto de classe scanner "scanner" em amarelo contrutor da clase

    public void calcular() {
        System.out.println("informe a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        // Operação Aritmetica 
         double media = (nota1+nota2)/2;
        
        // OPERADORES DE ATRIBUIÇÃO 
       
         // media = nota1 
        // media += nota2 
        // media /=2  
        System.out.println("A media do Aluno é " + media );
        boolean mediaAprovada = media>=50; 
        System.out.println("O Aluno esta aprovado por nota ?" +mediaAprovada);
        System.out.println("informe a frequencia do aluno");
        int frequencia = sc.nextInt();
        boolean frequenciaAprovada =  frequencia>=75;
        System.out.println("O Aluno esta aprovado por Frequencia"+ frequenciaAprovada); 
        boolean resultadoFinal = (mediaAprovada==true)&&(frequenciaAprovada==true);
        System.out.println("O Aluno esta aprovado no curso?" + resultadoFinal); 


    }
}
