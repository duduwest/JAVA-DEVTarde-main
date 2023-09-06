package POOintroducao;

/**
 * App
 */
public class App {
    public static void main(String[] args) {

        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        // endereço em ordem

        // altera as informaçoes com o set
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua armando clovis, 890");
        ana.setIdade(29);
        ana.setNotaCiencias(9.5);
        ana.setNotaMatematica(9.0);
        ana.setNotaPortugues(8.9);
        System.out.println("Nome: " + ana.getNome());
        System.out.println("Endereço: " + ana.getEndereco());
        System.out.println("Idade: " + ana.getIdade());
        System.out.println("Média: " + ana.getMedia());
        System.out.println("==============================");
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua luiz varga,505");
        beto.setIdade(27);
        beto.setNotaCiencias(9.8);
        beto.setNotaMatematica(7.0);
        beto.setNotaPortugues(6.9);
        System.out.println("Nome: " + beto.getNome());
        System.out.println("Endereço: " + beto.getEndereco());
        System.out.println("Idade: " + beto.getIdade());
        System.out.println("Média: " + beto.getMedia());
        System.out.println("==============================");
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        carlos.setNome("Carlos Alberto");
        carlos.setEndereco("Rua diogo takamori");
        carlos.setIdade(30);
        carlos.setNotaCiencias(6.0);
        carlos.setNotaMatematica(9.7);
        carlos.setNotaPortugues(5.9);
        System.out.println("Nome: " + carlos.getNome());
        System.out.println("Endereço: " + carlos.getEndereco());
        System.out.println("Idade: " + carlos.getIdade());
        System.out.println("Média: " + carlos.getMedia());
        System.out.println("=============================");
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 

        Alunos aluno1 = new Alunos(); 
        aluno1.setNome("Alberto");
        System.out.println(aluno1.getNome()); 

    }
}
