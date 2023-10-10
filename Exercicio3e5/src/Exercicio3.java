import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        super("Exercicio 3 CARD LAYOUT");
        // adicoinar um painel (main panel)
        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);
        this.add(mainPanel);
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem vindo"));
        JButton but1 = new JButton("Login");
        JButton but2 = new JButton("Cadastro");
        card1.add(but1);
        card1.add(but2);
        mainPanel.add(card1, "HOME");        // card 2
        // ----------------------------------------------------------------------------------------------
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Pag de login "));
        JButton but3 = new JButton("HOME");
        JButton but4 = new JButton("Cadastro");
        card2.add(but3);
        card2.add(but4);
        mainPanel.add(card2, "Login");
        // card 3
        // ------------------------------------------------------------------------------------------------
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Pag de Cadastro "));
        JButton but5 = new JButton("Home ");
        JButton but6 = new JButton("Login");
        card3.add(but5);
        card3.add(but6);
        mainPanel.add(card3, "Cadastro");

        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setBounds(100, 100, 220, 220);
        this.setVisible(true);

        // ===================================================================================================================

        // funcionalidade dos botões
        but1.addActionListener(e -> {
            // troca do card
            cl.show(mainPanel, but1.getText()); // vai navegar para o card "Login"
        });
        but2.addActionListener(e -> {
            // troca do card
            cl.show(mainPanel, but2.getText());
        });
        but3.addActionListener(e -> {
            // troca do card
            cl.show(mainPanel, but3.getText());
        });
        but4.addActionListener(e -> {
            // troca do card
            cl.show(mainPanel, but4.getText());
        });
        but5.addActionListener(e -> {
            // troca do card
            cl.show(mainPanel, but5.getText());
        }); 
        but6.addActionListener(e ->{ 
            //troca do card 
            cl.show(mainPanel,but6.getText());
         });


    }
}
