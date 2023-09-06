import javax.swing.JFrame;

/**
 * GUISwingJFrameExemplo
 */
public class GUISwingJFrameExemplo extends JFrame {
    public GUISwingJFrameExemplo() {
        super("Minha primeira Janela GUI Swing");
        this.setSize(400, 400); // tamanho 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  //fecha o programa ao apertar "x"
        this.setVisible(true); // Transforma a janela em Visivel 
    }

}