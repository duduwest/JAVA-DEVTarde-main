package Testeaula3107;

import javax.swing.JOptionPane;

import RevisaoFPOO.Agenda.Agendamento;
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
        Agendamento agendamento [] = new Agendamento[100]; // vetor dos agendamentos 
        boolean veterinarioAberta = true;
        int contcachorro = 0;
        
        int contgato = 0;
        int contoutros = 0;
        int animalAtual = 0;

        while (veterinarioAberta) {
            int acao1 = Integer
                    .parseInt(JOptionPane.showInputDialog("Olá bem vindo a nossa veterinaria, escolha uma opção:"
                            + "\n Opção 1 - Cadastrar cachorro"
                            + "\n Opção 2 - Cadastrar gato"
                            + "\n Opção 3 - Cadastrar outro Animal"
                            + "\n Opção 4 - Acessar Cadastro de cachorro"
                            + "\n Opção 5 - Acessar Cadastro de gato"
                            + "\n Opção 6 - Acessar Cadastro de outro animal"
                            + "\n Opção 7 - SAIR"));

            if (acao1 == 1) {
                cachorro[contcachorro] = new Cachorro();
                cachorro[contcachorro].setProprietario(JOptionPane.showInputDialog("Informe o Nome do proprietario:"));
                cachorro[contcachorro].setGenero(JOptionPane.showInputDialog("Informe o gênero do cachorro:"));
                cachorro[contcachorro]
                        .setPeso(Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Informe o peso do cachorro (sem letras):")));
                cachorro[contcachorro].setPorte(JOptionPane.showInputDialog("Informe o porte do cachorro:"));
                cachorro[contcachorro].setIdAnimal(100 + contcachorro + 1);
                JOptionPane.showMessageDialog(null, "CADASTRO CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do cachorro: "
                        + "\n Nome do proprietario: " + cachorro[contcachorro].getProprietario()
                        + "\n ID do seu animal: " + cachorro[contcachorro].getIdAnimal()
                        + "\n Gênero do cachorro: " + cachorro[contcachorro].getGenero()
                        + "\n Peso do cachorro: " + cachorro[contcachorro].getPeso()
                        + "\n Porte do cachorro: " + cachorro[contcachorro].getPorte());
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
                gato[contgato].setIdAnimal(200 + contgato + 1);
                JOptionPane.showMessageDialog(null, "CADASTRO CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do gato: "
                        + "\n Nome do proprietario: " + gato[contgato].getProprietario()
                        + "\n ID do seu animal: " + gato[contgato].getIdAnimal()
                        + "\n Gênero do gato: " + gato[contgato].getGenero()
                        + "\n Peso do gato: " + gato[contgato].getPeso()
                        + "\n Porte do gato: " + gato[contgato].getPorte());
                contgato++;

            }
            if (acao1 == 3) {
                // gato[contgato] = new Gato();
                outros[contoutros].setProprietario(JOptionPane.showInputDialog("Informe o Nome do proprietario:"));
                outros[contoutros].setGenero(JOptionPane.showInputDialog("Informe o gênero do Animal:"));
                outros[contoutros]
                        .setPeso(Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Informe o peso do Animal(sem letras):")));
                outros[contoutros].setPorte(JOptionPane.showInputDialog("Informe o porte do Animal:"));
                outros[contoutros].setIdAnimal(300 + contoutros + 1);
                JOptionPane.showMessageDialog(null, "CADASTRO CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do Animal: "
                        + "\n Nome do proprietario: " + outros[contoutros].getProprietario()
                        + "\n Gênero do Animal: " + outros[contoutros].getGenero()
                        + "\n ID do seu animal: " + outros[contoutros].getIdAnimal()
                        + "\n Peso do Animal: " + outros[contoutros].getPeso()
                        + "\n Porte do Animal: " + outros[contoutros].getPorte());
                contoutros++;

            }
            if (acao1 == 3) {

                int nIdAnimalBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do seu animal:  "));

                for (int i = 0; i < contcachorro; i++)
                    ;
                if (nIdAnimalBuscado == cachorro[i].getIdAnimal()) {
                    animalAtual = i;
                    JOptionPane.showMessageDialog(null, "Cadastro Encontrada");

                }
            } else if (acao == 4) {  
             //agendamento 
            //verificar se ja existe o cadastro 
        String
            }
           
        }
    }
}  