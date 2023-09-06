package Exercicioifelse;

import java.util.Scanner;

public class Exercicio {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Informe o 1º (Primeiro Valor)");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º (segundo Valor)");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1º Valor é maior " + valor1);
        } else {
            System.out.println("O 2º Valor é maior" + valor2);
        }

    }

    public void exercicio2() {
        System.out.println("Informe seu ano de nascimento");
        int AnoDeNascimento = sc.nextInt();
        if (AnoDeNascimento <= 2007) {
            System.out.println("pode votar");
        } else if (AnoDeNascimento >= 2006) {
            System.out.println("Não pode votar");
        }

    }

    public void exercicio3() {
        System.out.println("Informe sua senha");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        System.out.println("informe quantas maças voce comprou");
        double numeroMaca = sc.nextDouble();
        double precoMaca;
        if (numeroMaca >= 12) {
            precoMaca = 0.25;
        } else {
            precoMaca = 0.30;
        }
        double precoTotal = precoMaca * numeroMaca;
        System.out.println("O valor total foi de R$" + precoTotal);
    }

    public void exercicio5() {
        System.out.println("Digite os valores!");
        System.out.println("Informe o 1º (Primeiro Valor)");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º (segundo Valor)");
        int valor2 = sc.nextInt();
        System.out.println("Informe o 3º (segundo Valor)");
        int valor3 = sc.nextInt();
        if (valor1 > valor2 && valor2 > valor3) {
            System.out.println(valor3 + " é menor que " + valor2 + " e menor que " + valor1);
        } else if (valor1 > valor3 && valor3 > valor2) {
            System.out.println(valor2 + " é menor que " + valor3 + " e menor que " + valor1);
        } else if (valor2 > valor3 && valor3 > valor1) {
            System.out.println(valor1 + " é menor que " + valor3 + " e menor que " + valor2);
        } else if (valor2 > valor1 && valor1 > valor3) {
            System.out.println(valor1 + " é menor que " + valor2 + " e menor que " + valor2);
        } else if (valor3 > valor2 && valor2 > valor1) {
            System.out.println(valor3 + " é menor que " + valor2 + " e menor que " + valor3);
        } else if (valor3 > valor1 && valor1 > valor2) {
            System.out.println(valor2 + " é menor que " + valor2 + " e menor que " + valor3);
        }
    }

    public void exercicio6() { 
        System.out.println(" Informe sua altura (ex 1.80)");
        double altura = sc.nextDouble(); 
        System.out.println("informe seu sexo (feminino-1 e masculino-2)");
        int sexo = sc.nextInt(); 
        double calcularpeso; 
        if (sexo == 1 ) {calcularpeso=72.1;} else if (sexo == 2){ calcularpeso=62.1;}
        else { calcularpeso=0;}
        double pesoIdeal = (altura*calcularpeso)-58; 
        System.out.println("Seu peso ideal é "+ pesoIdeal);


       

       
        
        
   
    }

}