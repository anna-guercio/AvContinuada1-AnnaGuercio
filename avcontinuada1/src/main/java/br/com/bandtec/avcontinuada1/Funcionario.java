package br.com.bandtec.avcontinuada1;

public class Funcionario implements Tributavel{

    // Atributos
    private String nome;
    private Integer idFunc;
    private String cpf;
    private Double salario;

    // Construtor
    public Funcionario(String nome, Integer idFunc, String cpf, Double salario) {
        this.nome = nome;
        this.idFunc = idFunc;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Métodos

    // Método abstrato da interface Tributavel
    // O valor do tributo é de 20% do valor do salario
    @Override
    public Double getValorTributo() {
        return salario*0.20;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idFunc=" + idFunc +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", tributo="+getValorTributo()+
                '}';
    }
}
