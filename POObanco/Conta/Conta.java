package POObanco.Conta;

import javax.swing.JOptionPane;

//superclasse 
public abstract class Conta { // classe abstrata vulgo super classe não posso isntanciar um obj nela

    // atributos
    String nome;
    double saldo;
    int numeroConta;

    // MÉTODOS

    // contrutor completo  
    public Conta(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta; 
  
    }

    // construtor vazio
    public Conta() {
    }
 

    //gets and sets 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    } 
    public void deposito(double value){ //criamos um metodo deposito  e uma double value com op logica  
        saldo+=value;
    } 
    public void saque(double value) {
        if (value > saldo) { 
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
            
        } else {
            saldo -= value;
          JOptionPane.showMessageDialog(null, "Saque de " + value + " realizado com sucesso.");
        }
    } 
    public void emprestimo(double value) {
       JOptionPane.showMessageDialog(null,"Empréstimo de " + value + " realizado com sucesso.");
    }

    public void transferencia(double value, Conta destino) {
        if (value > saldo) {
           JOptionPane.showMessageDialog(null,"Saldo insuficiente para realizar a transferência.");
        } else {
            saldo -= value;
            destino.deposito(value);
           JOptionPane.showMessageDialog(null,"Transferência de " + value + " realizada com sucesso para a conta " + destino.getNumeroConta() + ".");
        }
    } 
    
}



    

