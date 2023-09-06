package TryCatch0108;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String senha, login, dataDeNascimento;

        while (tenteNovamente) {
            try {
                dataDeNascimento = JOptionPane.showInputDialog("Informe sua data De Nascimento");
                login = JOptionPane.showInputDialog("Informe um login");
                senha = JOptionPane.showInputDialog("Informe uma senha");
                dataDeNascimento = dataDeNascimento.replace("/", "");
                if (senha.length() < 8) {
                    throw new Exception("Senha < 8 Caracteres");
                } 
                if (senha.length() == ) {
                    
                }
                if (senha.equals(login)) {
                    throw new Exception("Senha = Login");
                }
                if (senha.equals(dataDeNascimento)) {
                    throw new Exception("senha = data de nascimento");
                }
                tenteNovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadastrada com Sucesso", "senha", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", 0);
            }
        }
    }
}
