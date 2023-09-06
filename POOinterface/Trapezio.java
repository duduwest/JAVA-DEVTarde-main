package POOinterface;

public class Trapezio implements FigGeometricas {
    // Atributos
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    // construtor (com todos parametros)
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // métodos da interface
    @Override
    public double getArea() {
        return (baseMaior+baseMenor)*altura/2;
    }

    @Override
    public String getNomeFigura() {
        return "Trapezio";
    }

    @Override
    public double getPerimetro() {
        return baseMaior+baseMenor+lado1+lado2;
    }

}
