import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ativ04
 */
public class Ativ04 extends JFrame {
    public Ativ04() {
        super("Nome e Sobrenome");
        JPanel panelPrin = new JPanel();
        CardLayout cl = new CardLayout();
        panelPrin.setLayout(cl);
        this.add(panelPrin);
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        card1.add(new JLabel("Nome: "));
        card1.add(new JTextField(20));
        card2.add(new JLabel("Sobrenome: "));
        card2.add(new JTextField(20));
        panelPrin.add(card1);
        panelPrin.add(card2);

        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setBounds(100, 100, 220, 220);
        this.setVisible(true);

    }

}