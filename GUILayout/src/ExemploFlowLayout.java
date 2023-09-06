import javax.swing.*; 
import java.awt.*;
public class ExemploFlowLayout {
public ExemploFlowLayout() { 
    // criei o frame, usa o GridLayout 
    JFrame janela1  = new JFrame("Janela 1"); 
    FlowLayout flow = new FlowLayout();  
    janela1.setLayout(flow);
    //Modificar o Layout do Frame  
    //JPanel texto1 = new JPanel("Informe o nº de Botões: "); 
    JTextField painel1 = new JTextField("Insira o Nº" , 25); 
    JButton botao1 = new JButton("Enviar"); 
    //adicionar os componentes 
  //  janela1.add(texto1); 
    janela1.add(painel1); 
    janela1.add(botao1);   
    //criando o botão  
    botao1.addActionListener(e ->{ 
        int quant = Integer.parseInt(painel1.getText()); 
        for (int i = 0; i < quant; i++) {
            janela1.add(new JButton(""+i)); 
            janela1.pack();
        }
    });
    //set frame  
    janela1.setDefaultCloseOperation(2);
    janela1.pack(); 
    janela1.setVisible(true); 

}

}