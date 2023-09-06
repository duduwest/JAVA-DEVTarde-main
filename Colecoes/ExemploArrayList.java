package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    // criando um array list
    ArrayList<String> carros = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();

    // oq estiver entre <> não pode ser primitivo tem q ser
    // interger, string ou Double

    public void teste(Object title) {
        // adicionando elementos com o metodo add
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");

        // imprimindo os elementos
        JOptionPane.showMessageDialog(null, carros);

        // percorrer a lista com forI | possui contador e aloca posiçoes e elementos
        for (int i = 0; i < carros.size(); i++) {
            JOptionPane.showMessageDialog(null, carros.get(i));
        }

        // for each
        for (String i : carros) // Aqui nao possuimos contador e basicamente le sem pré definição esteblecida
                                // enquanto no
        // for i precisamos estabelecer um size
        {
            JOptionPane.showMessageDialog(null, title, i, 0);
        }

        // limpando o vetor com método clear
        carros.clear();
        JOptionPane.showMessageDialog(null, carros);
    }

    public void exercicio1() {
        // criando um Array List de numeros inteiros
        // preencher com 5 num - dps ordenar e imprimir
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Numero:")));
        }
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

    }
}
