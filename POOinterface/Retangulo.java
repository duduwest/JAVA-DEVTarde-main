package POOinterface;

public class Retangulo implements FigGeometricas {

    int base;
    int altura;
    // metodos 
    /////////////////////////// 

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        int area = base * altura;
        return area;
    }


    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }

    @Override
    public double getPerimetro() {
       
        return 2 * (base + altura);
    }

}
