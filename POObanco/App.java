package POObanco;

import java.nio.file.WatchService;

import javax.swing.JOptionPane;

import POObanco.Conta.Conta;
import POObanco.Conta.ContaPF;
import POObanco.Conta.ContaPJ;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ContaPF contasPF[] = new ContaPF[5];
        ContaPJ contasPJ[] = new ContaPJ[5];
        boolean agenciaAberta = true;
        int contPF = 0;
        int contPJ = 0;
        int contaAtual = 0;

        // contasPF[0] = new ContaPF();
        // contasPF[0].setNome("Lucas");
        // contasPF[0].setNumeroConta(1001);
        // contasPF[0].setSaldo(1000000);
        // contasPF[0].setnCPF("77777777777777");

        while (agenciaAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Criar Conta Pessoa Fisica;"
                    + "\n 2 - Criar Conta Pessoa Juridica;"
                    + "\n 3 - Acessar Contas PF;"
                    + "\n 4 - Acessar Contas PJ;"));

            if (acao1 == 1) {
                // ******CONTA PF******
                contasPF[contPF] = new ContaPF();// obj criado
                // atribuir infos
                contasPF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPF[contPF].setNumeroConta(1000 + contPF + 1);
                contasPF[contPF].setSaldo(0);
                contasPF[contPF].setnCPF(JOptionPane.showInputDialog("Informe o CPF:"));
                JOptionPane.showMessageDialog(null, "CONTA CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do cliente: "
                        + "\n Nome do cliente: " + contasPF[contPF].getNome()
                        + "\n Numero da conta: " + contasPF[contPF].getNumeroConta()
                        + "\n Saldo da conta: " + contasPF[contPF].getSaldo());
                contPF++;

            }

            // ******CONTA PJ******
            if (acao1 == 2) {
                // criar conta PJ
                contasPJ[contPJ] = new ContaPJ();// obj criado
                // atribuir infos
                contasPJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPJ[contPJ].setNumeroConta(2000 + contPJ + 1);
                contasPJ[contPJ].setSaldo(0);
                contasPJ[contPJ].setnCNPJ(JOptionPane.showInputDialog("Informe o CNPJ:"));
                JOptionPane.showMessageDialog(null, "CONTA CRIADA!");
                JOptionPane.showMessageDialog(null, "Informaçoes do cliente: "
                        + "\n Nome do cliente: " + contasPJ[contPJ].getNome()
                        + "\n Numero da conta: " + contasPJ[contPJ].getNumeroConta()
                        + "\n Saldo da conta: " + contasPJ[contPJ].getSaldo());
                contPJ++;

            }

            // ******CONSULTAR CONTAS******

            // acessar conta - percorrer o vetor criado e procurar um valor ou nº da conta
            // ou
            // nome

            if (acao1 == 3) {

                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da Conta"));

                for (int i = 0; i < contPF; i++) {// nullpointexc
                    if (nContaBuscada == contasPF[i].getNumeroConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");

                        boolean acessar = true;
                        //
                        while (acessar) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada:"
                                    + "\n 1 - Consultar saldo;"
                                    + "\n 2 - Fazer deposito;"
                                    + "\n 3 - Fazer saque; "
                                    + "\n 4 - Fazer empréstimo;"
                                    + "\n 5 - Fazer transferência; "));
                            // opções dos métodos da conta PFs
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null, contasPF[nContaBuscada - 1001].getSaldo());

                            } else if (acao2 == 2) {
                                contasPF[nContaBuscada - 1001]
                                        .deposito(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")));
                                // JOptionPane.showMessageDialog(null, (contasPF[nContaBuscada -
                                // 1001].getSaldo()));
                                JOptionPane.showMessageDialog(null, "deposito realizado com sucesso.");
                                JOptionPane.showMessageDialog(null, "Saldo atual: " + contasPF[contaAtual].getSaldo());

                            } else if (acao2 == 3) {
                                double valorSaque = Double
                                        .parseDouble(JOptionPane.showInputDialog(null, "Valor de saque:"));
                                contasPF[contaAtual].saque(valorSaque);

                                JOptionPane.showMessageDialog(null, "Saldo atual: " + contasPF[contaAtual].getSaldo());
                            } else if (acao2 == 4) {
                                contasPF[nContaBuscada - 1001]
                                        .emprestimo(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")));
                            } else if (acao2 == 5) {
                                int nContaDestino = Integer
                                        .parseInt(JOptionPane.showInputDialog("Informe o nº da Conta de Destino"));
                                for (int j = 0; j < contasPF.length; j++) {
                                    if (nContaDestino == contasPF[j].getNumeroConta()) {
                                        contasPF[nContaBuscada - 1001].transferencia(
                                                Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")),
                                                contasPF[j]);
                                        JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso.");

                                        break;
                                    }
                                }
                            }

                        }

                    } else if (nContaBuscada != contasPF[i].getNumeroConta()) {
                        JOptionPane.showMessageDialog(null, "Conta não encontrada");
                        JOptionPane.showMessageDialog(null, "Verifique se a conta não é PJ");
                    }

                }
            } else if (acao1 == 4) {

                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da Conta"));

                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada:"
                        + "\n 1 - Consultar saldo;"
                        + "\n 2 - Fazer deposito;"
                        + "\n 3 - Fazer saque; "
                        + "\n 4 - Fazer empréstimo;"
                        + "\n 5 - Fazer transferência; "));
                // opções dos métodos da conta PFs
                if (acao2 == 1) {
                    JOptionPane.showMessageDialog(null, contasPJ[nContaBuscada - 2001].getSaldo());

                } else if (acao2 == 2) {
                    contasPJ[nContaBuscada - 2001]
                            .deposito(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")));
                    JOptionPane.showMessageDialog(null, (contasPJ[nContaBuscada - 2001].getSaldo()));

                } else if (acao2 == 3) {
                    double valorSaque = Double
                            .parseDouble(JOptionPane.showInputDialog(null, "Valor de saque:"));
                    contasPJ[contaAtual].saque(valorSaque);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + contasPJ[contaAtual].getSaldo());
                } else if (acao2 == 4) {
                    contasPJ[nContaBuscada - 2001]
                            .emprestimo(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")));
                } else if (acao2 == 5) {
                    int nContaDestino = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe o nº da Conta de Destino"));
                    for (int j = 0; j < contasPJ.length; j++) {
                        if (nContaDestino == contasPJ[j].getNumeroConta()) {
                            contasPJ[nContaBuscada - 2001].transferencia(
                                    Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")),
                                    contasPJ[j]);
                            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso.");

                            break;
                        }
                    }
                }

            }

        }
    }
}
