import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio5 extends JFrame {
    public Exercicio5() {
        super("Jogo simples");
        JPanel panelPrin = new JPanel();
        // fazer card com 4 botoes de escolha 1 certo so passa pra prox se acertar
        CardLayout cl = new CardLayout();
        panelPrin.setLayout(cl);
        this.add(panelPrin);
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem vindo ao QUIZZ"));
        JButton but1 = new JButton("INICIAR O QUIZZ");
        card1.add(but1);
        panelPrin.add(card1, "PagVolta");
        // ====================================================================================
        // fazer painel de perda

        // =========================================================================
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Desafio 01"));
        card2.add(new JLabel("Quando foi fundado a S.E.P?"));
        JButton but2 = new JButton("1994");
        JButton but3 = new JButton("1787");
        JButton but4 = new JButton("1897");
        JButton but5 = new JButton("1914");
        card2.add(but2);
        card2.add(but3);
        card2.add(but4);
        card2.add(but5);
        panelPrin.add(card2, "INICIAR O QUIZZ");
        // =====================================================================================
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Desafio 02"));
        card3.add(new JLabel("Qual o mascote do time?"));
        JButton but6 = new JButton("Porco");
        JButton but7 = new JButton("Gambá");
        JButton but8 = new JButton("Viado");
        JButton but9 = new JButton("Baleia");
        card3.add(but6);
        card3.add(but7);
        card3.add(but8);
        card3.add(but9);
        panelPrin.add(card3, "1914");
        // =========================================================================================
        JPanel card5 = new JPanel();
        card5.add(new JLabel("Desafio 03"));
        card5.add(new JLabel("Quantas vezes foi campeão da libertadores?"));
        JButton but10 = new JButton("1");
        JButton but11 = new JButton("5");
        JButton but12 = new JButton("3");
        JButton but13 = new JButton("Nenhuma");
        card5.add(but10);
        card5.add(but11);
        card5.add(but12);
        card5.add(but13);
        panelPrin.add(card5, "Porco");

        // =========================================================================================

        JPanel card6 = new JPanel();
        card6.add(new JLabel("Desafio 04"));
        card6.add(new JLabel("Quantas vezes o Palmeiras foi campeão do Brasileirão?"));
        JButton but14 = new JButton("11 vezes");
        JButton but15 = new JButton("8 vezes");
        JButton but16 = new JButton("6 vezes");
        JButton but17 = new JButton("12 vezes");
        card6.add(but14);
        card6.add(but15);
        card6.add(but16);
        card6.add(but17);
        panelPrin.add(card6, "3");
        // =========================================================================================

        JPanel card7 = new JPanel();
        card7.add(new JLabel("Desafio 05"));
        card7.add(new JLabel("Qual foi o primeiro nome do Palmeiras quando foi fundado?"));
        JButton but19 = new JButton("Palmeiras Futebol Clube");
        JButton but20 = new JButton("Associação Esportiva Palmeiras");
        JButton but18 = new JButton("Sociedade Esportiva Palestra Itália");
        JButton but21 = new JButton("Clube Atlético Palmeiras");
        card7.add(but18);
        card7.add(but19);
        card7.add(but20);
        card7.add(but21);
        panelPrin.add(card7, "11 vezes");
        // =========================================================================================
        JPanel vitoriaCard = new JPanel();
        vitoriaCard.add(new JLabel("Parabéns, você venceu!"));
        panelPrin.add(vitoriaCard, "Sociedade Esportiva Palestra Itália"); 
        // =========================================================================================


        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setBounds(100, 100, 220, 220);
        this.setVisible(true);

        // funcionalidade dos botões
        but1.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });

        but5.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });
        but6.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });
        but12.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });
        but14.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });
        but18.addActionListener(e -> {
            // troca do card
            cl.next(panelPrin);
        });
    }

}
