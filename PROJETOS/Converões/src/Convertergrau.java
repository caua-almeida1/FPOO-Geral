import java.util.Scanner;

public class Convertergrau {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double fahrenheit, conversao;
	    
	    System.out.println("####---- CONVERTER FAHRENHEIT PARA CELSIUS ----#### ");

		System.out.println("FAHRENHEIT: ");
		
		fahrenheit = scanner.nextDouble();
	
		conversao = (fahrenheit - 32) * 5/9;
		
		System.out.println("CELSIUS: " + conversao);
		
		System.out.println("####---- OBRIGADO!!! ----#### ");
		
		
		}

}
