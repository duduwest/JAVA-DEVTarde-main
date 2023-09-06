import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameUtIlizando extends JFrame {
    public JFrameUtIlizando() {
        super("Minha Janela Principal "); //setando a janela  

        this.setBounds(500, 500, 400, 400); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //AJUSTANDO layout  
        FlowLayout flow = new FlowLayout(); 
        this.setLayout(flow);
        // adcionar componentes
        for (int i = 1; i < 6; i++) {
            this.add(new JButton("" + i));
        }  
        this.add(new JTextField("teste", 15));
        this.setVisible(true);
    }
}
