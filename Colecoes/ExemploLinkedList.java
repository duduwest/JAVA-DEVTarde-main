package Colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList<String> pessoas = new LinkedList<>();

    public void teste() {
        // adicionei normalmente
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");
        // adiciona na primeira posição
        pessoas.addFirst("Cecilia");
        // remove o ultimo nome
        pessoas.removeLast();
        // Imprime a lista
        System.out.println(pessoas);

    }
}
