package POOinterface;


public class App {  
     
    public static void main(String[] args) {  
        Quadrado fig1  = new Quadrado(7); 
        Retangulo fig2 = new Retangulo(7,2);  

        // como declarar array de objetos  
        Trapezio figTrapezio[] = new Trapezio[5]; 
        figTrapezio[0] = new Trapezio(10, 5, 6, 7, 8); 

        for (int i = 0; i < figTrapezio.length; i++) { 

            figTrapezio[i] = new Trapezio(i+5, i, i+1, i+2, i+3);
            
        }

        System.out.println("Nome Figura é " +fig1.getNomeFigura()+ "\n Area = "+fig1.getArea()+ 
        "\n Perimetro = "
        +fig1.getPerimetro()); 

        System.out.println("Nome Figura é " +fig2.getNomeFigura()+ "\n Area = "+fig2.getArea()+ 
        "\n Perimetro = "
        +fig2.getPerimetro());

 
    } 

}
