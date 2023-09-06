import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ContainersComponents extends JFrame {
    //atributos 
    int cont = 0; 
    public ContainersComponents() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow); 

        // criar outro container
        JPanel painel1 = new JPanel();
        this.add(painel1);
        // adicionar um Jbutton -> painel1
        // criar o botão
        // this.add(new JButton("Clique aqui"));
        JButton botao1 = new JButton("Clique Aqui");
        JLabel texto1 = new JLabel("Nº de Cliques");
        painel1.add(texto1);
        painel1.add(botao1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // fecha o programa ao apertar "x"

        // criar função (addActionListener) 
        //adiconar ação ao botão 
        botao1.addActionListener(e -> {  
            cont ++;
            texto1.setText("Nº de cliques é "+cont); 
            add(botao1);

        } );
        this.setVisible(true); // Transforma a janela em Visivel
    }

}
