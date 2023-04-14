import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionario {
    public String nome;
    public long Idfuncinario;
    public static double salario;
    public String telefone;

public List<Funcionario> funcionarios;



    public Funcionario(String nome, int Idfuncionario, String telefone,int salario){
        this.nome = nome;

        this.Idfuncinario = Idfuncionario;
        this.salario = salario;
       this.telefone = telefone;
        this.funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
    }



    public Funcionario() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdfuncinario() {
        return Idfuncinario;
    }

    public void setIdfuncinario(long idfuncinario) {
        Idfuncinario = idfuncinario;
    }

    public static double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void bonificar(double salario) {
        setSalario(getSalario() + salario);
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + "\n" +
                "Registro: " + getIdfuncinario() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Salário: " + getSalario() + "\n" ;

    }
}



