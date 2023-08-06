package atvd16_17;

public class atvd4 {
	public static void main(String[] args) {
		double a = 80000;
		double b = 200000;
		int i =0;
		double taxa1;
		double taxa2;
		
		while(a<=b) {
			taxa1 = (a/100) * 3;
			a += taxa1;
			System.out.println("A= " + a);
			taxa2 = (b/100) * 1.5;
			b += taxa2;
			i += 1;
			System.out.println("B= " +b);
		}
		
		System.out.println("Qntd de anos é: " + i);
	}
}
