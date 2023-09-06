package POObanco.Conta;

public class ContaPJ extends Conta {
    //atributos 
    String nCNPJ;

    
    //métodos 
    //construtor   

    public ContaPJ(String nome, double saldo, int numeroConta, String nCNPJ) {
        super(nome, saldo, numeroConta);
        this.nCNPJ = nCNPJ;
    }

    public ContaPJ(String nCNPJ) {
        this.nCNPJ = nCNPJ;
    }

    public ContaPJ() {
    }


    //gets and sets  
    public String getnCNPJ() {
        return nCNPJ;
    }

    public void setnCNPJ(String nCNPJ) {
        this.nCNPJ = nCNPJ;
    } 
}
