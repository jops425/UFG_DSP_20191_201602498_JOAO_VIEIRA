package br.com.jops425.aula2932jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by aluno on 22/05/19.
 */
@Data
@NoArgsConstructor
@Entity
public class Reino implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reino_id")
    private Long id;

    private String nome;

    private String continente;

    @OneToOne
    private Monarca monarca;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

}
