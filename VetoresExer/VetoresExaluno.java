package VetoresExer;

import java.util.Scanner;

public class VetoresExaluno {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar um vetor com 5 nº inteiros
        double valorDouble[] = new double[10]; // vetor vazio
        double vetorInt2[] = new double[] { 1, 2, 3, 4, 5 }; // vetor com valores preenchidos
        // preenchendo primeiro vetor nº 1
        System.out.println("Preencha o vetor de 10 posiçoes");
        valorDouble[10] = sc.nextInt(); // 1 ºposição indice 0
        valorDouble[9] = sc.nextInt(); // 10 ºposição indice 9
        valorDouble[8] = sc.nextInt(); // 9 ºposição indice 8
        valorDouble[7] = sc.nextInt(); // 8 ºposição indice 7
        valorDouble[6] = sc.nextInt(); // 7 ºposição indice 6
        valorDouble[5] = sc.nextInt(); // 6 ºposição indice 5
        valorDouble[4] = sc.nextInt(); // 5 ºposição indice 4
        valorDouble[3] = sc.nextInt(); // 4 ºposição indice 3
        valorDouble[2] = sc.nextInt(); // 3 ºposição indice 2
        valorDouble[1] = sc.nextInt(); // 2 ºposição indice 1
        System.out.println(" O valor da 10º posição indice 9 é " + valorDouble[9]);
        System.out.println(" O valor da 9º posição indice 8 é " + valorDouble[8]);
        System.out.println(" O valor da 8º posição indice 7 é " + valorDouble[7]);
        System.out.println(" O valor da 7º posição indice 6 é " + valorDouble[6]);
        System.out.println(" O valor da 6º posição indice 5 é " + valorDouble[5]);
        System.out.println(" O valor da 5º posição indice 4 é " + valorDouble[4]);
        System.out.println(" O valor da 4º posição indice 3 é " + valorDouble[3]);
        System.out.println(" O valor da 3º posição indice 2 é " + valorDouble[2]);
        System.out.println(" O valor da 2º posição indice 1 é " + valorDouble[1]);
        System.out.println(" O valor da 1º posição indice 0 é " + valorDouble[0]);

    }
}
