package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[] { 5, 7, 9, 10, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < 5) {
            vetorB[i] = vetorA[i];
            System.out.println("O vetor B [" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 };
        int vetorB[] = new int[8];
        int i = 0;
        while (i < 8) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("O vetor B [" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio3() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("O vetor B [" + i + "]=" + vetorB[i]);
            i++;

        }

    }

    public void exercicio4() {
        int vetorA[] = new int[] { 49, 16, 81, 25, 144, 36, 64, 9, 100, 1, 196, 225, 121, 169, 4 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("O vetor B [" + i + "]=" + vetorB[i]);
            i++;

        }

    }

/**
 * 
 */
public void exercicio5(){ 
    int  vetorA[] = new int []{49,16,81,25,144,36,64,9,100,1}; 
    double vetorB[] = new double[10]; 
    int  i=0; 
    while (i<10) {vetorB[i]=vetorA[i]*i; 
    System.out.println("O vetor B ["+i+"]="+vetorB[i]);
    i++; }  
} 

public void exercicio6(){ 
    int  vetorA[] = new int []{49,16,81,25,144,36,64,9,100,1}; 
    int  vetorB[] = new int []{49,16,81,25,144,36,64,9,100,1};
    int  vetorC[] = new int[10]; 
    int  i=0; 
    while (i<10)  { 
        vetorC[i]=vetorA[i]+vetorB[i]; 
        System.out.println("O vetor C["+i+"]="+vetorC[i]);
        i++; 

    }

}  } 
