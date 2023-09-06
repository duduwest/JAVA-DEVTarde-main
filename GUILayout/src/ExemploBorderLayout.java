import java.awt.*;
import javax.swing.*;

/**
 * ExemploBorder
 */
public class ExemploBorderLayout extends JFrame {
public ExemploBorderLayout() {
    super("Janela"); 
//add Painel  
JPanel painel = new JPanel(new BorderLayout()); // define o layout ja na criação do painel 
this.setBounds(300, 300, 300, 300);
this.add(painel);   

// add componentes 
painel.add(new JButton("South"),BorderLayout.SOUTH);  
painel.add(new JButton("North"),BorderLayout.NORTH);
painel.add(new JButton("West"),BorderLayout.WEST);
painel.add(new JButton("East"),BorderLayout.EAST); 



    this.setDefaultCloseOperation(2);
    // this.pack(); // rouba o tamanho da janela
    this.setVisible(true);

} } 