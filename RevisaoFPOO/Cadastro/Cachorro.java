package RevisaoFPOO.Cadastro;

import javax.print.DocFlavor.STRING;

public class Cachorro extends Animais {

    String racaDog;

    // construtor
    public String getRacaDog() {
        return racaDog;
    }

    public Cachorro(String porte, double peso, String proprietario, String genero, int idAnimal, String racaDog) {
        super(porte, peso, proprietario, genero, idAnimal);
        this.racaDog = racaDog;
    }

    // GETS AND SETTERS

    public Cachorro(String racaDog) {
        this.racaDog = racaDog;
    }

    public Cachorro() {
    }

    public void setRacaDog(String racaDog) {
        this.racaDog = racaDog;
    }

}
