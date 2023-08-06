package br.com.bytebank.banco.modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private int ContaAtiva; 

    public int getContaAtiva() {
		return ContaAtiva;
	}
	public void setContaAtiva(int contaAtiva) {
		ContaAtiva = contaAtiva;
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
