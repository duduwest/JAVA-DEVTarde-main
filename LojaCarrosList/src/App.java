import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // criar uma classe chamado carros com atrib e metodos alem disso
        // manipular essa classe no app
        // criar list do tipo crros
        List<Carros> listaCarros = new ArrayList<>();
        boolean lojaAberta = true; 
        HashMap<String,Carros> buscaCarros = new HashMap<>();


        // 3 - consultar um carro
        // 4 - apagar um carro

        while (lojaAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Cadastrar Carro"
                    + "\n 2 - listar Carros"
                    + "\n 3 - Consultar Carro"
                    + "\n 4 - Apagar Carro"));

            if (acao1 == 1) {
                // 1 - cadastrar novo carro
                Carros c = new Carros(); 
                c.setPlaca(JOptionPane.showInputDialog(null, "Informe os 4 primeiros digitos da sua placa"));
                c.setMarca(JOptionPane.showInputDialog("Informe a marca do seu carro: "));
                c.setModelo(JOptionPane.showInputDialog("Informe o modelo do seu carro: "));
                c.setAno(JOptionPane.showInputDialog("Informe o ano do seu carro: "));
                c.setCor(JOptionPane.showInputDialog("Informe a cor do seu carro: "));
                listaCarros.add(c);
            } else if (acao1 == 2) {
                // 2 - listar todos os carros
                String listar = "";
                for (Carros carros : listaCarros) {
                    listar += carros.getMarca() + " " + carros.getModelo() + "\n";
                }
                JOptionPane.showMessageDialog(null, listar);
            } else if (acao1 == 3){ 
                 // 3 - consultar um carro
                
                    buscaCarros.put(null, null);
                    
                    // Buscando um valor pela chave
                    JOptionPane.(buscaCarros.get("ES"));
                    for (String i : buscaCarros.keySet()) {
                        System.out.println(i + ": " + buscaCarros.get(i));
            
                    
                }
            }

        }

    }
}
