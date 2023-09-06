package IteracaoFor;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        for (int i = 0; i < 10; i++) {

            System.out.println("O numero de iteracçao é " + i);
        }

    }

    public void exercicio2() {

        int vetorA[] = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 5; i++) {
            System.out.println("O vetor A [" + i + "]=" + vetorA[i]);

        }
    }

    public void exercicio3() {
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do Aluno");
            notas[i] = sc.nextDouble();
        } // criei um vetor para as notas e preencer as notas (usuario)
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i + 1) + "= " + notas[i]);
            media += notas[i]; // acumular valor da medias
        } // criei variavel para calcular a media e o vetor de baixo para calcular media e
          // imprimir as notas

        media /= notas.length; // dividir media pelo nº de notas do vetor
        System.out.println("A media do aluno é " + media);

    }

    public void exercicio4e() {
        System.out.println("Digite uma Palavra ");
        String palavra = sc.next();
        palavra.toLowerCase(); // toLowerCase transforma tudo que digitar em minusculo
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            } else {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                } else {
                    cont++;
                    System.out.println(c + " é consoante");
                }
            }

        }

        System.out.println(" o nº da consoante é " + cont);
    }

    // Exercicio 5 com contador
    public void exercicio5e() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contImpar = 0; // contador de nmr impares
        int contPar = 0; // contador de pares
        // contando quanto nº para e quantos nº impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        // criando os vetores com o tamanho correto
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        // distribuindo os valores nos vetores
        contImpar = 0;// zerar o contador
        contPar = 0;// zerar o contador
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                vetorPar[contPar] = vetorNumeros[i];
                contPar++; // conta o nº de itens par
            } else {
                vetorImpar[contImpar] = vetorNumeros[i];
                contImpar++;// conta o nº de itens impar
            }
        }
        // imprimir os vetores
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor [" + i + "] =" + vetorNumeros[i]);

        }
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.println("vetor [" + i + "] =" + vetorPar[i]);

        }
        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.println("vetor [" + i + "] =" + vetorImpar[i]);

        }
    }

    // exercicio 6
    public void exercicio6() {
        // laço dentro de laço
        double alunos[] = new double[10]; // vetor media dos alunos
        double notas[] = new double[4]; // vetor notas
        int cont = 0;
        for (int i = 0; i < alunos.length; i++) // laço para receber a media
        // não pode usar a variavel i pois ja ta sendo usada entao usamos j
        {
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ".");
                notas[j] = sc.nextDouble();
                alunos[i] += notas[j]; // acumular as notas do aluno i

            }
            alunos[i] /= notas.length; // calcula a media dividindo pelo nmr de notas
            if (alunos[i] >= 7) {
                cont++; // conta o nmr de alunos com nota >7

            }

        }  
      
            
            
        
        // imprimir medias 
        for (int i = 0; i < alunos.length; i++)
         { System.out.println(" A media do aluno "+(i+1)+" é" +alunos[i]);

        } 

        // imprimir contador 
        System.out.println("O Nº de alunos com nota > (maior) ou =(igual) a 7 é "+cont);
    }
} 
