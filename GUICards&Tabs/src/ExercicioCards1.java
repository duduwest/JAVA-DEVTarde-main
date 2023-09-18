import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;


public class ExercicioCards1 extends JFrame {

    JPanel cards;
    private String pagina01 = "Pagina 01";
    private String pagina02 = "Pagina 02";
    private String pagina03 = "Pagina 03";

    public ExercicioCards1() {
        super("Exercicio 1");
        JPanel aba1 = new JPanel();
        JPanel aba2 = new JPanel();

        String comboBoxItems[] = { pagina01, pagina02, pagina03 };
        JComboBox cb = new JComboBox(comboBoxItems);
        aba1.add(cb);
        aba1.add(new JButton("PROXIMO"));
        aba1.add(new JButton("ANTERIOR"));

        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setVisible(true);
    }
}
