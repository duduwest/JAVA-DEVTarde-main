package POOexercercios1;

import javax.swing.JOptionPane;

public abstract class Pessoas {
    // atributos
    private String nome;
    private double altura;
    private int mesNascimento;
    private int diaNascimento;
    private int AnoNascimento;

    public Pessoas(String nome, double altura, int mesNascimento, int diaNascimento, int AnoNascimento) { // construtores
        this.nome = nome;
        this.altura = altura;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento; 
        this.AnoNascimento = AnoNascimento;
    }

    // contrsutor vazio
    public Pessoas() {
        super();
    }
 
    // metodos gets and sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    } 
    public int getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }
 

// Metodos para imprimir 
public void imprimir() { 
    System.out.println("Nome:"+nome); 
    System.out.println("Altura:"+altura); 
    System.out.println("Nascimento:"+diaNascimento+"/"+mesNascimento+"/"+AnoNascimento); 
    
} 
// metodo para calcular a idade  
public int idade() {  
    int calculo; 
    if (diaNascimento<=5 && mesNascimento<=6) {
        calculo = 2023-AnoNascimento;
    } else {
        calculo = 2023-AnoNascimento - 1;
    } 

    return calculo; 
    
}
}
