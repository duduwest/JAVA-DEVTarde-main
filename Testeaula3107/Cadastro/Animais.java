package Testeaula3107.Cadastro;

public abstract class Animais {
    // Atributos
    String porte;
    double peso;
    String proprietario;
    String genero;
    int idAnimal;

    // contrutores cheio
    public Animais(String porte, double peso, String proprietario, String genero, int idAnimal) {
        this.porte = porte;
        this.peso = peso;
        this.proprietario = proprietario;
        this.genero = genero;
        this.idAnimal = idAnimal;
    }

    // construtor vazio
    public Animais() {

    }

    // métodos
    // gets and sets

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

}
