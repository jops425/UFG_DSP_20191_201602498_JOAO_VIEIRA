package br.com.jops425.dsp20191.aulas1316.ap.models;

/**
 * Created by aluno on 03/04/19.
 */
public class Cargo {

    private long id;

    private String nome;

    private double salario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
