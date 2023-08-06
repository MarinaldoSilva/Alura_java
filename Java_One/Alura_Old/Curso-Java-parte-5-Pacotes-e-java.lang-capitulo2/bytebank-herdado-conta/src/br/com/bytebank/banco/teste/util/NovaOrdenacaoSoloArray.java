/**
 * 
 */
package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.*;
/**
 * @author Admin
 *
 */
public class NovaOrdenacaoSoloArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(157, 15487);
		Conta cc2 = new ContaCorrente(157, 15486);
		Conta cc3 = new ContaCorrente(157, 15489);
		Conta cc4 = new ContaCorrente(157, 15488);		
		cc1.deposita(150.58);
		cc2.deposita(1785.98);
		cc3.deposita(5878.74);
		cc4.deposita(698.99);
		
		Cliente cliC1 = new Cliente();
		Cliente cliC2 = new Cliente();
		Cliente cliC3 = new Cliente();
		Cliente cliC4 = new Cliente();

		cliC1.setNome("Marinaldo");
		cc1.setTitular(cliC1);
		cc1.getTitular().setCpf("999.999.999-99");
		
		cliC2.setNome("Suene");
		cc2.setTitular(cliC2);
		cc2.getTitular().setCpf("714.710.854-44");
		
		cliC3.setNome("Soni");
		cc3.setTitular(cliC3);
		cc3.getTitular().setCpf("714.710.854-25");
		
		cliC4.setNome("Kim Kataguire");
		cc4.setTitular(cliC4);
		cc4.getTitular().setCpf("987.654.123-25");

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.sort(new Comparator<Conta>() {
				@Override
				public int compare(Conta o1, Conta o2) {
					return o1.getNumero() - o2.getNumero();
				}});
		
		lista.sort( (c1,c2) -> Double.compare(c1.getSaldo(), c2.getSaldo()) );
		
		lista.sort(new Comparator<Conta>(){

			@Override
			public int compare(Conta c1, Conta c2) {
				
				String nomeTitular1 = c1.getTitular().getNome();
				String nomeTitular2 = c2.getTitular().getNome();
				
				return nomeTitular1.compareTo(nomeTitular2);
			}});
		
		lista.sort( new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				String cpf1 = c1.getTitular().getCpf();
				String cpf2 = c2.getTitular().getCpf();
				return cpf1.compareTo(cpf2);
			}});
		
		 //lista.sort((c1,c2) -> Double.compare( c1.getSaldo(), c2.getSaldo() ) );
		 lista.sort( (c1,c2) -> { System.out.println(Conta.getTotal());
		 return (int) (c1.getSaldo() - c2.getSaldo());} );

		
		for (Conta conta : lista) {
			System.out.println("saldo " + conta.getSaldo());
		}
		
	}
}
