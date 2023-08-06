/**
 * 
 */
package br.com.bytebank.banco.teste.util;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * @author Admin
 *
 */
public class OrdenacaoComInterfaces implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {			
		return Double.compare(c1.getSaldo(), c2.getSaldo());

	}

}
