import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class GerenciarFuncionario {

    public List<Funcionario> funcionarios = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        GerenciarFuncionario gf = new GerenciarFuncionario();

        int opcao;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Consultar Funcionario");
            System.out.println("3. Bonificar unico funcionario");
            System.out.println("4. Bonificar todos os funcionarios");
            System.out.println("9. Sair");
            opcao = Integer.parseInt(gf.sc.nextLine());
            switch (opcao) {
                case 1:
                    gf.execCadastrarFuncionario();
                    break;
                case 2:
                    gf.execConsultarFuncionario();
                    break;
                case 3:
                    gf.execBonificarunico();
                    break;
                case 4:
                   // gf.execBonificartodos();
                    break;
                case 9:
                    gf.execSair();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 9);
    }


    public void execCadastrarFuncionario() {

        System.out.println("Cadastra um novo Funcionario");
        System.out.println("----------------------------");
        System.out.println("Codigo de identificacao do funcionario:");
        long Idfuncionario = Long.parseLong(sc.nextLine());
        System.out.println("Nome do Funcionario:");
        String nome = sc.nextLine();
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Salario a ser recebido");
        double salario = Double.parseDouble(sc.nextLine());

        Funcionario funcionario = new Funcionario();

        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);
        funcionario.setIdfuncinario(Idfuncionario);
        funcionario.setSalario(salario);

        funcionarios.add(funcionario);

        System.out.println("Funcionario Cadastrado com sucesso");
        System.out.println("Comfirme os dados abaixo");
        System.out.println(funcionario);


    }

    public void execConsultarFuncionario() {
        System.out.println("Funcionarios cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


    }

    private Funcionario buscarF(long Idfuncinario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdfuncinario() == Idfuncinario) {
                return funcionario;
            }
        }

        return null;
    }

    public void  execBonificarunico(){
        System.out.println("Bonificar unico funcionario");
        System.out.println("Insira o Código de identificação desejado:");
        long Idfuncinario = Long.parseLong(sc.nextLine());

        Funcionario funcionario = buscarF(Idfuncinario);
        if (Idfuncinario == Idfuncinario){
            System.out.println(funcionario);
        }



        System.out.println("Digite o valor da bonificação desejada:");
        double salario =Double.parseDouble(sc.nextLine());

        funcionario.bonificar(salario);

        System.out.println("Funcionário bonificado com sucesso.");
        System.out.println("Valor da bonificação: " + salario);
        return;
    }




    public void execBonificartodos() {

        System.out.println("Aumento para todos os Funcionarios de uma vez:");
        System.out.println("Valor do aumento");
        double salario =Double.parseDouble((sc.nextLine()));
        for (Funcionario funcionario : funcionarios) {

            funcionario.bonificar(salario);
        }

        System.out.println("Funcionários bonificados com sucesso.");
        System.out.println("Valor da bonificações: " + salario);
        return;

    }


        public void execSair () {
            System.out.println("Voce saiu do programa!");
            System.exit(0);
        }
}

