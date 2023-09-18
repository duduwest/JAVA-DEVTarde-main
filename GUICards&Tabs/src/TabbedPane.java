import java.awt.*;
import javax.swing.*;

public class TabbedPane extends JFrame {
    public TabbedPane() {
        super("ExemploTabbedPane");
        JTabbedPane janelaAbas = new JTabbedPane();
        JPanel aba1 = new JPanel();
        JPanel aba2 = new JPanel();

        // aba 1 3 botoes
        aba1.add(new JButton("Botão 1"));
        aba1.add(new JButton("Botão 2"));
        aba1.add(new JButton("Botão 3"));

        aba2.add(new JTextField("", 20));
        // add abs ao JTABBED PANE
        janelaAbas.add("Aba JButtons", aba1);
        janelaAbas.add("Aba JTextField", aba2);

        this.add(janelaAbas);
        // confirgurar o frame
        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setVisible(true);

    }

}
