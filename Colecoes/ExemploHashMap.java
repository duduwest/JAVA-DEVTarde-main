package Colecoes;

import java.util.HashMap;

public class ExemploHashMap {
    HashMap<String, String> capitalEstado = new HashMap<>();
    HashMap<String, Integer> NomeIdade = new HashMap<>();

    public void testeh() {
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("MG", "Minas Gerais");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("ES", "Vitória");
        // Buscando um valor pela chave
        System.out.println(capitalEstado.get("ES"));
        for (String i : capitalEstado.keySet()) {
            System.out.println(i + ": " + capitalEstado.get(i));

        }
    }

    public void exercicio1() {
        NomeIdade.put("Eduardo", 18);
        // Buscando um valor pela chave
        System.out.println(NomeIdade.get("Eduardo"));
        for (String i : NomeIdade.keySet()) {
            System.out.println(i + ": " + NomeIdade.get(i));

        }

    }
}
