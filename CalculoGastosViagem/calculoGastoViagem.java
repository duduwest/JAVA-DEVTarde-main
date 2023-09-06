package CalculoGastosViagem;

public class calculoGastoViagem {
    public static void main(String[] args) {
        System.out.println("===Calculadora custo de viagem===");
        double distanciaPercorrida = 431;
        double combustivelGastoPorKm = 15;
        double preçoCombustivel = 5;
        double CombustivelGastoTotalViagem = distanciaPercorrida / combustivelGastoPorKm;
        CombustivelGastoTotalViagem = CombustivelGastoTotalViagem * preçoCombustivel;
        System.out.println("O gasto total de combustivel foi de: ");
        System.out.println(CombustivelGastoTotalViagem);

    }

}
