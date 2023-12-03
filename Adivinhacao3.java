package adivinhacao1;
import java.util.Scanner;
import java.util.Locale;
public class Adivinhacao3 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		int i = 0;
				
		System.out.println("Digite o valor a ser adivinhado");
		x = sc.nextDouble();
		
		System.out.println("Digite o numero que voce acha que e o correto");
		y = sc.nextDouble();
		
		if(x == y) {
			System.out.println("Acertou");
		} else
			while(i < 2) {
				System.out.println("Tente de novo");
				y = sc.nextDouble();
				i = i + 1;
			} 
		  if (x != y && i == 2 ) {
			  System.out.println("Suas tentativas acabaram e voce não acertou");
		  }
		
		
		sc.close();

	}

}
