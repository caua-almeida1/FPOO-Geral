import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double fahrenheit, conversao;
	    
	    System.out.println("####---- CONVERTER FAHRENHEIT PARA CELSIUS ----#### ");

		System.out.println("FAHRENHEIT: ");
		
		fahrenheit = scanner.nextDouble();
	
		conversao = (fahrenheit - 32) * 5/9;
		
		System.out.println("FAHRENHEIT: " + conversao);
		
		System.out.println("####----OBRIGADO POR USAR NOSSO PROGRAMA ----#### ");
		
		
		}

}
