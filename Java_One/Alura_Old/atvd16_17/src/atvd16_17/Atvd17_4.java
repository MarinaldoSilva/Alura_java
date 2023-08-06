package atvd16_17;
import java.text.DecimalFormat;
public class Atvd17_4 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		
		double brasil = 80000;
		double russia = 200000;
		int anos = 0;
		String ResultadoBrsil;
		String ResultadoRussia;
		
		while(brasil<russia) {
			
			brasil += brasil *3 /(100);
			russia += russia * 1.5 /(100);
			anos++;
		
		}
		
		System.out.println("anos: " + anos);
		ResultadoBrsil = String.format("%.0f",brasil);
		ResultadoRussia = String.format("%.0f",russia);
		
		System.out.println("Barsil: " + ResultadoBrsil);
		System.out.println("Russia: " + ResultadoRussia);
		System.out.println("Vai demorar " + anos + " anos Para o Brasil superar a população da Russia");
		
			
	}

}
