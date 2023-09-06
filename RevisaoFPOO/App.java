package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Cachorro[] cachorro = new Cachorro[5];
        Gato gato[] = new Gato[5];
        Outros outros[] = new Outros[5];
        boolean veterinarioAberta = true;
        int contcachorro = 0;
        int contgato = 0;
        int contoutros = 0;
        int animalAtual = 0;

        while (veterinarioAberta) {
            int acao1 = Integer
                    .parseInt(JOptionPane.showInputDialog("Olá bem vindo a nossa veterinaria, escolha uma opção:"
                            + "\n Opção 1 - Cadastrar cachorro;"
                            + "\n Opção 2 - Cadastrar gato;"
                            + "\n Opção 3 - Acessar Cadastro de cachorro;"
                            + "\n Opção 4 - Acessar Cadastro de gato;"));

            if (acao1 == 1) {
                cachorro[contcachorro] = new Cachorro();
                cachorro[contcachorro].setProprietario(JOptionPane.showInputDialog("Informe o Nome do proprietario:"));
                cachorro[contcachorro].setGenero(JOptionPane.showInputDialog("Informe o gênero do cachorro:"));
                cachorro[contcachorro]
                        .setPeso(Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Informe o peso do cachorro (sem letras):")));
                cachorro[contcachorro].setPorte(JOptionPane.showInputDialog("Informe o porte do cachorro:"));
                cachorro[contcachorro].setRacaDog(JOptionPane.showInputDialog("Informe a raça do cachorro:"));
                cachorro[contcachorro].setIdAnimal(100 + contcachorro + 1);
                JOptionPane.showMessageDialog(null, "CADASTRO CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do cachorro: "
                        + "\n Nome do proprietario: " + cachorro[contcachorro].getProprietario()
                        + "\n Gênero do cachorro: " + cachorro[contcachorro].getGenero()
                        + "\n Peso do cachorro: " + cachorro[contcachorro].getPeso()
                        + "\n Porte do cachorro: " + cachorro[contcachorro].getPorte()
                        + "\n Raça do cachorro: " + cachorro[contcachorro].getRacaDog());
                contcachorro++;

            }
            if (acao1 == 2) {
                // gato[contgato] = new Gato();
                gato[contgato].setProprietario(JOptionPane.showInputDialog("Informe o Nome do proprietario:"));
                gato[contgato].setGenero(JOptionPane.showInputDialog("Informe o gênero do gato:"));
                gato[contgato]
                        .setPeso(Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Informe o peso do gato (sem letras):")));
                gato[contgato].setPorte(JOptionPane.showInputDialog("Informe o porte do gato:"));
                gato[contgato].setRacaCat(JOptionPane.showInputDialog("Informe a raça do gato:"));
                gato[contgato].setIdAnimal(100 + contgato + 1);
                JOptionPane.showMessageDialog(null, "CADASTRO CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do gato: "
                        + "\n Nome do proprietario: " + gato[contgato].getProprietario()
                        + "\n Gênero do gato: " + gato[contgato].getGenero()
                        + "\n Peso do gato: " + gato[contgato].getPeso()
                        + "\n Porte do gato: " + gato[contgato].getPorte()
                        + "\n Raça do gato: " + gato[contgato].getRacaCat());
                contgato++;

            }

        }
    }
}
