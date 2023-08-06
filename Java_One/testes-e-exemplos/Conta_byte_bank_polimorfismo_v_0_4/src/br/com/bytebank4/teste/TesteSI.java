package br.com.bytebank4.teste;

import br.com.bytebank4.banco.*;

public class TesteSI {

	public static void main(String[] args) {
		//usando o import não é necessário utilizar essa extensão enorme nos arquivos
		br.com.bytebank4.banco.SistemaInterno si = new SistemaInterno();
		Administrador adm = new Administrador();
		Cliente cliente = new Cliente();
		Gerente gr = new Gerente();
		Cliente t = new Cliente();
		
		cliente.setSenha(15);
		adm.setSenha(15);
		gr.setSenha(15);
		t.setSenha(15);
		
		si.autenticacaoSenha(cliente);
		si.autenticacaoSenha(t);
		si.autenticacaoSenha(adm);
		si.autenticacaoSenha(gr);
	}

}
