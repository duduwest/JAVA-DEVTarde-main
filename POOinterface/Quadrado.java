package POOinterface;

public class Quadrado implements FigGeometricas {
    int lado;

    public Quadrado(int lado) { // construtor com 1 paraemtro
        this.lado = lado;
    }

    public int getLado() { // getters
        return lado;
    }

    public void setLado(int lado) { // seterss
        this.lado = lado;
    }

    @Override
    public double getArea() { // calcula area do quadrado
        int area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado * 4;
        return perimetro;
    }

}
