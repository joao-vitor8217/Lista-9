package funcionarios;

/**
 Classe que representa um funcionário com nome, idade, cargo, salário, telefone e endereço.
 */
public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    /**
     Construtor da classe Funcionario.
     @param nome Nome do funcionário.
     @param idade Idade do funcionário.
     @param cargo Cargo do funcionário.
     @param salario Salário do funcionário.
     @param telefone Número de telefone do funcionário.
     @param endereco Endereço do funcionário.
     */
    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /**
     Método para exibir os dados do funcionário.
     @return String contendo os dados do funcionário formatados.
     */
    public String exibe() {
        return "Nome: " + nome +
               "\nIdade: " + idade +
               "\nCargo: " + cargo +
               "\nSalário: " + salario +
               "\nTelefone: " + telefone +
               "\nEndereço: " + endereco;
    }
}

package funcionarios;

/**
 Classe responsável por cadastrar funcionários em um vetor e imprimir o vetor de cadastro.
 */
public class Cadastro {
    private Funcionario[] funcionarios;
    private int tamanho;

    /**
     Construtor da classe Cadastro.
     @param capacidade Capacidade inicial do vetor de cadastro.
     */
    public Cadastro(int capacidade) {
        funcionarios = new Funcionario[capacidade];
        tamanho = 0;
    }

    /**
     Método para cadastrar um funcionário no vetor de cadastro.
     @param funcionario Funcionário a ser cadastrado.
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        if (tamanho < funcionarios.length) {
            funcionarios[tamanho] = funcionario;
            tamanho++;
        } else {
            System.out.println("Cadastro de funcionários está cheio.");
        }
    }

    /**
     Método para imprimir o vetor de cadastro.
     */
    public void imprimirCadastro() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(funcionarios[i].exibe() + "\n");
        }
    }
}

package funcionarios;

/**
 Classe principal que inicia o algoritmo, instanciando o objeto da classe Cadastro
 e realizando operações de cadastro e impressão de funcionários.
 */
public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(5);

        Funcionario funcionario1 = new Funcionario("João Silva", 30, "Analista", 3500.0, "123-456-789", "Rua A, 123");
        Funcionario funcionario2 = new Funcionario("Maria Oliveira", 25, "Programador", 3000.0, "987-654-321", "Rua B, 456");
        Funcionario funcionario3 = new Funcionario("Carlos Souza", 35, "Gerente", 5000.0, "111-222-333", "Rua C, 789");

        cadastro.cadastrarFuncionario(funcionario1);
        cadastro.cadastrarFuncionario(funcionario2);
        cadastro.cadastrarFuncionario(funcionario3);

        cadastro.imprimirCadastro();
    }
}
