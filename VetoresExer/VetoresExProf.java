package VetoresExer;

import java.util.Scanner;

public class VetoresExProf {
    Scanner sc = new Scanner(System.in); 
    public void exemplo1() {
        //criar um vetor com 5 nº inteiros 
        int vetorInt[]= new int [5]; // vetor vazio 
        int vetorInt2[]= new int []{ 1,2,3,4,5}; // vetor com valores preenchidos 
        // preenchendo primeiro vetor  nº 1  
        System.out.println("Preencha o vetor de 5 posiçoes");
        vetorInt[0] = sc.nextInt(); //1 ºposição indice 0
        vetorInt[1] = sc.nextInt(); //2 ºposição indice 1
        vetorInt[2] = sc.nextInt(); //3 ºposição indice 2
        vetorInt[3] = sc.nextInt(); //4 ºposição indice 3 
        vetorInt[4] = sc.nextInt(); //5 ºposição indice 4
        System.out.println(" O valor da 1º posição indice 0 é "+vetorInt[0]);
        System.out.println(" O valor da 2º posição indice 1 é "+vetorInt[1]);
        System.out.println(" O valor da 3º posição indice 2 é "+vetorInt[2]);
        System.out.println(" O valor da 4º posição indice 3 é "+vetorInt[3]);
        System.out.println(" O valor da 5º posição indice 4 é "+vetorInt[4]);
      
        
        
        
        
        


        


    }
}
