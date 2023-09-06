package TryCatch0108;

import javax.swing.JOptionPane;

public class Trycatchfinally {
    public static void main(String[] args) {
        // teste try catch finnaly
        String fraseInicial = null;
        String fraseFinal = null;
        try {

            fraseInicial = JOptionPane.showInputDialog(null, "Digite uma frase: ");
            if (fraseInicial.equals(" ")) {
                fraseInicial = null;
            }

        } catch (Exception e) {
            fraseInicial = "Não foi digitado uma frase";

        } finally {
            fraseFinal = fraseInicial.toUpperCase();
            JOptionPane.showMessageDialog(null, fraseFinal);

        }
    }
}
