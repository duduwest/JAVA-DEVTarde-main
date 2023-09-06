package POObanco.Conta;

/**
 * ContaPF
 */
public class ContaPF extends Conta { 
// atributos 
String nCPF;  
//Métodos  

// construtor 

public ContaPF(String nome, double saldo, int numeroConta, String nCPF) {
    super(nome, saldo, numeroConta);
    this.nCPF = nCPF;
}


public ContaPF(String nCPF) {
    this.nCPF = nCPF;
}

 
//GET AND SETS  

public ContaPF() {
}


public String getnCPF() {
    return nCPF;
}


public void setnCPF(String nCPF) {
    this.nCPF = nCPF;
} 




}