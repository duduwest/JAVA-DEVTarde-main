package MatrizExemplo;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // exemplo de criação /preenchimento // e impressão de matriz
        // declarar matriz de duas dimensoes
        int tab[][] = new int[10][9]; // [10] [9] dimensoes do vetor
        // preencher a matriz
        for (int i = 0; i < 10; i++) {
            // laço que vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço que vai percorrer a 2ª dimensão da matriz
                System.out.print("tab[" + i + "][" + j + "]=");
                tab[i][j] = rd.nextInt(9); // preencher o valor na posição

            }
        }
        for (int i = 0; i < 10; i++) {
            // laço que vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço que vai percorrer a 2ª dimensão da matriz
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);

            }
        }
        // Imprimindo em Formato de Matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println(" |");
        }

    }

    /**
     * 
     */
    public void exemplo2() {
        int tab[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;

                }

            }

        }
        for (int i = 0; i < 5; i++) {
            // laço que vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 5; j++) {
                // laço que vai percorrer a 2ª dimensão da matriz
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);
            }
        }
        // Imprimindo em Formato de Matriz
        for (int i = 0; i < 5; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println(" |");
        }
    }

    /**
     * 
     */
    // criar uma matriz 4x4 imprimir ela e sua transposta

    public void exemplo3() {
        int matriz3[][] = new int[4][4];
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("matriz3[" + i + "][" + j + "]=");
                matriz3[i][j] = rd.nextInt(5);

            }

        }
        // Imprimir a minha matriz
        for (int i = 0; i < 4; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 4; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.println("matriz3[" + i + "][" + j + "]=" + matriz3[i][j]);
            }
        }
        System.out.println("---------------");
        // Imprimindo em Formato de Matriz
        System.out.println("MATRIZ NORMAL");
        for (int i = 0; i < 4; i++) {// linha
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { // coluna
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+matriz3[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------------");
        System.out.println("MATRIZ TRANSPOSTA");
        for (int i = 0; i < 4; i++) { // linha
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { // coluna
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+matriz3[j][i] + " ");
            }
            System.out.println("|");
        }
        // soma dos elementos da matriz DIAGONAL PRINCIPAL
        // soma dos elementos da diagonal principal
        int somaDig = 0;
        int somaDigInf = 0;
        int somaDigSup = 0;
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                // diagonal principal é i==j
                if (i == j) {// diagonal principal
                    somaDig += matriz3[i][j];
                } else if (i > j) {// nº da inferior diagonal
                    somaDigInf += matriz3[i][j];
                } else {// nº da superior diagonal
                    somaDigSup += matriz3[i][j];
                }
            }
        }
        System.out.println(" A soma da Diagonal é " + somaDig);
        System.out.println(" A soma dos nº Inferiores a diagonal é " + somaDigInf);
        System.out.println(" A soma dos nº Superiores a diagonal é " + somaDigSup);
    }
}