package br.com.jops425.dsp20191.aulas0508.ap;

public class Conexao {

    private String sgbd;

    private String tipoConexao;

    private String bancoDados;

    private String urlBd;

    private String sistemaOperacional;

    public Conexao() { }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getBancoDados() {
        return bancoDados;
    }

    public void setBancoDados(String bancoDados) {
        this.bancoDados = bancoDados;
    }

    public String getUrlBd() {
        return urlBd;
    }

    public void setUrlBd(String urlBd) {
        this.urlBd = urlBd;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

}
