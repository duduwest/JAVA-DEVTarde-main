package RevisaoFPOO.Cadastro;

public class Gato extends Animais {

    String racaCat;

    // construtor

    public String getRacaCat() {
        return racaCat;
    }

    public Gato(String porte, double peso, String proprietario, String genero, int idAnimal, String racaCat) {
        super(porte, peso, proprietario, genero, idAnimal);
        this.racaCat = racaCat;
    }

    // GETS AND SETTERS

    public Gato(String racaCat) {
        this.racaCat = racaCat;
    }

    public void setRacaCat(String racaCat) {
        this.racaCat = racaCat;
    }

}
