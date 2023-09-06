import javax.swing.JOptionPane;

public class Carros {
    // Atributós
    String marca;
    String modelo;
    String ano;
    String cor; 
    String placa;
    
    
    //contrutores 
   
    public Carros(String marca, String modelo, String ano, String cor ,String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor; 
        this.placa = placa; 
    }

    public Carros() {
    }

    
    
    //gets and sets  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }   

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    } 
    
}


