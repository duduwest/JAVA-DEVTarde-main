package AtivFormativa2205;

import java.util.Random;
import java.util.Scanner;

public class Formativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Exercicio1() {
        System.out.print("Determine o Nº de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Determine o Nº de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }

        System.out.println("Matriz Preenchida:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz com substituição dos valores:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Exercicio2() {
        int nSorteado = (int) (Math.random() * 1001);
        int seuPalpite;
        int tentativas = 0;
        boolean tentarNovamente = true;

        System.out.println("============================");
        System.out.println("Tente adivinhar um número de 0 a 1000:");


        while (tentarNovamente) {
            System.out.print("Digite o seu seuPalpite: ");
            seuPalpite = sc.nextInt();
            tentativas++;

            if (seuPalpite == nSorteado) {

                System.out.println("Parabéns! Você acertou o número " + nSorteado
                        + ".");
                System.out.println("Você acertou em " + tentativas
                        + " tentativas.");
                System.out.println("Fim!");
                System.out.println("============================");
            } else if (seuPalpite < nSorteado) {
                System.out.println("O número sorteado é maior do que o seu palpite.");
            } else {
                System.out.println("O número sorteado é menor do que o seu palpite.");
            }
        }
    }

    public void Exercicio3() {
        int tVetor = rd.nextInt(901) + 100; // t vetor = tamanho do vetor 
        int[] vetor = new int[tVetor];
        int quantidadeParPosicaoImpar = 0;
        int quantidadeImparPosicaoPar = 0;

        System.out.println("Tamanho do vetor: " + tVetor);

        System.out.println("Vetor gerado:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(900) + 100;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Números pares do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Números ímpares do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                quantidadeParPosicaoImpar++;
            }
        }

        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                quantidadeImparPosicaoPar++;
            }
        }
        System.out.println( );
        System.out.println("Quantidade de números pares nas posições ímpares: " + quantidadeParPosicaoImpar);
        System.out.println("Quantidade de números ímpares nas posições pares: " + quantidadeImparPosicaoPar);
    }
}