package EstruturaDecisãoifElse;

import java.util.Scanner;

/**
 * DecisãoifElse
 */
public class DecisãoifElse {

    Scanner sc = new Scanner(System.in);

    /**
     * 
     */
    // if desencadeado
    public void Decisãoif() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProduto>=100 então desconto é = 5
        if (precoProduto >= 100 && precoProduto < 100) {
            desconto = 5.0;
        }

        if (precoProduto >= 200 && precoProduto < 300) {
            desconto = 10;
        } // && precoProduto é uma forma de garantir que vai ler e ignorar o anterior
        if (precoProduto >= 300) {
            desconto = 15;
        }
        // chave é o bloco do comando diz que " se oque estiver dentro do parentes for
        // verdadeiro
        // executar oque se pede dentro da chaves "
        // realizar a conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é R$ " + precoFinal);

    }

    // if encadeado (if-Else)
    public void decisãoifElse() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto;
        // Estrutura de decisão encadeada if-else
        if (precoProduto >= 300) { // 1ª condição 
            desconto = 15; }
            else if (precoProduto >= 200) { // 1ª condição 
            desconto = 10;
        } else if (precoProduto > 100) { //2ª condição so vai ser executada se a rpiemira não for 
            desconto = 5;
        } else {
            desconto = 0;
        }
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é R$ " + precoFinal);

    }

}