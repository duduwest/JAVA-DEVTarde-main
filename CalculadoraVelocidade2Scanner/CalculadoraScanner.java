package CalculadoraVelocidade2Scanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe a Distancia Percorrida");
       double distanciaPercorrida = sc.nextDouble();
       System.out.println("A distancia percorrida foi de " +distanciaPercorrida+ "km"); 
       System.out.println("Informe o tempo gasto na viagem");
       double tempoGasto = sc.nextDouble();
       System.out.println("O tempo Gasto na Viagem foi de " + tempoGasto + "horas");
       sc.close();
       double velocidadeMedia = distanciaPercorrida/tempoGasto;
       System.out.println("A velocidade Média foi de " +velocidadeMedia+ "km/h");

    }
}
