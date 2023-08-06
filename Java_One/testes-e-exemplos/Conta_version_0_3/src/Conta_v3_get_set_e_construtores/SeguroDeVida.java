package Conta_v3_get_set_e_construtores;

public class SeguroDeVida extends Seguros implements Tributavel{

	private double valorDoPlano = 170;
	private double sobra;
	
	@Override//vem da Interface Tributavel;
	public double getValorImposto() {
		return valorDoPlano * 0.09; 
	}
	
	//metodo da própria função
	public void pagaMes(double valor)  {
		
		if(this.valorDoPlano < valor ){
			System.out.println("pagamento feito no valor de " + valor);
			double sobra = valor - valorDoPlano;
			
			if(sobra > 0) {
				System.out.println("você tem disponivel em creditos para proxima fatura o valor de " + sobra);
			}
			
		} else {
			System.out.println("aceitamos somente pagamento total da fatura");
		}
	}

}



