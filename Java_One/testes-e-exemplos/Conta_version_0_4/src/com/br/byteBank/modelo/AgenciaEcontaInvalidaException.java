package com.br.byteBank.modelo;
/**
 *Criação de uma exceção que vai retornar uma String informando que para criar uma conta é necessário ter uma agencia e número da conta. 
 * no construtor.
 * 
 *@author Marinaldo Silva de Santana
 *@param  String msg
 */


public class AgenciaEcontaInvalidaException extends RuntimeException {
	public AgenciaEcontaInvalidaException(String msg) {
		super(msg);
	}
}
