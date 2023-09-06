package TryCatch0108;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    /**
     * Classe que demonstra o uso do try / catch.
     */
    public static void main(String[] args) {
        boolean corrija = true;
        int n1, n2;

        while (corrija) {

            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                    + "\n 1 - Adição"
                    + "\n 2 - Subtração"
                    + "\n 3 - Divisão"
                    + "\n 4 - Multiplicação"));

            switch (acao1) {
                case 1: {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (1)"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (2)"));
                        // JOptionPane.CANCEL_OPTION,icon:null, operacoes, operacoe[0];
                        JOptionPane.showMessageDialog(null, "O resultado é Adição: " + (n1 + n2));
                        corrija = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao é um numero inteiro!");
                        /** TODO: handle exception */

                    }
                    corrija = true;

                }
                    break;
                case 2: {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (1)"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (2)"));
                        JOptionPane.showMessageDialog(null, "O resultado é Subtração: " + (n1 - n2));
                        corrija = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao é um numero inteiro!");
                        /** TODO: handle exception */

                    }
                    corrija = true;
                }
                    break;
                case 3: {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (1)"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (2)"));
                        JOptionPane.showMessageDialog(null, "O resultado é Divisão: " + (n1 / n2));
                        corrija = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao é um numero inteiro!");
                        /** TODO: handle exception */

                    }
                    corrija = true;
                }
                    break;
                case 4: {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (1)"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (2)"));
                        JOptionPane.showMessageDialog(null, "O resultado é Multiplicação: " + (n1 * n2));
                        corrija = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao é um numero inteiro!");
                        /** TODO: handle exception */

                    }
                    corrija = true;
                }
                    break;

                default:

                    break;
            }

        }
    }
}