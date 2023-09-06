import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

/**
 * ExemploGridLayout
 */
public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout() {
        super("janela Pirncipal");
        // Adiciona uma janela com JPanel
        JPanel painel = new JPanel();
        this.setBounds(300, 300, 300, 300);
        this.add(painel); // adicionando painel ao frame Jpanel ao Jframe
        // modificr o layout do Painel (Jpanel) DE FLOW PARA GRID
        GridLayout grid = new GridLayout(5, 5); // cria a classe GRID
        painel.setLayout(grid); // modifica o painel para grid
        // adiconando componentes ao Jpanel
        // criando botões separadamente para dar valor

        this.setTitle("Exemplo Botão Somar");

        JTextField teste = new JTextField("Insira o calculo", 25); 
        this.setSize(20, 20);
        painel.add(teste);
        String valores[] = { "7", "8", "9", "x", "4", "5", "6", "-", "3", "2", "1", "+", "/", "0", ".",  };
        for (int i = 0; i < valores.length; i++) {
            painel.add(new JButton(valores[i])); 
           
            
        }
        // set do frame
        this.setDefaultCloseOperation(2);
        // this.pack(); // rouba o tamanho da janela
        this.setVisible(true);

    }
}