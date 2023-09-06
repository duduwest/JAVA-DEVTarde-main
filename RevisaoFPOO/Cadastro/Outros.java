package RevisaoFPOO.Cadastro;

public class Outros extends Animais {

    String racaOutros;

    // salva logo

    public Outros(String porte, double peso, String proprietario, String genero, int idAnimal, String racaOutros) {
        super(porte, peso, proprietario, genero, idAnimal);
        this.racaOutros = racaOutros;
    }

    public Outros(String racaOutros) {
        this.racaOutros = racaOutros;
    }

    // GETS AND SETTERS
    public String getRacaOutros() {
        return racaOutros;
    }

    public void setRacaOutros(String racaOutros) {
        this.racaOutros = racaOutros;
    }

}
