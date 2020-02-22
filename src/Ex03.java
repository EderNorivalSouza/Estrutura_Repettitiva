import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int clientes = 0;
		
		
		while (x!=4) {
			if (x<1 || x>4) {
				System.out.println("codigo invalido");
			}
			else if (x==1) {
				alcool += 1;
				clientes += 1;
			}
			else if (x==2) {
				gasolina += 1;
				clientes += 1;
			}
			else if (x==3) {
				diesel +=1;
				clientes += 1;
			}
			
			x = sc.nextInt();
			
			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println(alcool);
		System.out.println(gasolina);
		System.out.println(diesel);
		System.out.println(clientes);
		
		sc.close();
	}

}
