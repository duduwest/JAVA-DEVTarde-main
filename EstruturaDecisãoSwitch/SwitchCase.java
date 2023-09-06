package EstruturaDecisãoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void Letra() {
        System.out.println("Digite uma letra"); 
        String letra = sc.nextLine();
        switch(letra) { 
            case "a": System.out.println(letra + "é uma vogal");
            break; 
            case "e": System.out.println(letra + "é uma vogal");
            break; 
            case "i": System.out.println(letra + "é uma vogal");
            break; 
            case "o": System.out.println(letra + "é uma vogal");
            break; 
            case "u": System.out.println(letra + "é uma vogal");
            break;  
            default: System.out.println(letra + " É consoante ");
            break; 

        }
    } 


  
       
    
        public void Mes() {
            System.out.println("Digite um mes (ex: 1 = janeiro)"); 
            String Mes = sc.nextLine();
            switch (Mes) { 
                case "1": System.out.println(Mes + "janeiro");
                break; 
                case "2": System.out.println(Mes + "fevereiro");
                break; 
                case "3": System.out.println(Mes + "março");
                break; 
                case "4": System.out.println(Mes + "abril");
                break; 
                case "5": System.out.println(Mes + "maio");
                break;  
                case "6": System.out.println(Mes + "junho");
                break; 
                case "7": System.out.println(Mes + "julho");
                break; 
                case "8": System.out.println(Mes + "agosto");
                break; 
                case "9": System.out.println(Mes + "setembro");
                break; 
                case "10": System.out.println(Mes + "outubro");
                break; 
                case "11": System.out.println(Mes + "novembro");
                break; 
                case "12": System.out.println(Mes + "dezembro");
                break; 
                default: System.out.println(Mes + "Não é mes");
                break; 
    
            }
        } 


} 


