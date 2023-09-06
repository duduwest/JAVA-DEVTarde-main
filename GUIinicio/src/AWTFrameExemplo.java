import java.awt.Frame;

public class AWTFrameExemplo extends Frame { 
    //CONSTRUTOR
    public AWTFrameExemplo() {
        super("Minha primeira janela AWT"); 
        this.setSize(400, 400); 
        this.setVisible(true); 
        this.setResizable(false);
    }
    
}
