import java.util.Scanner;

public class Celsius {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 double celsius, conversao;
		    
		    System.out.println("####---- CONVERTER CELSIUS PARA FAHRENHEIT ----#### ");

			System.out.println("CELSIUS: ");
			
			celsius = scanner.nextDouble();
		
			conversao = (celsius * 9/5 + 32);
			
			System.out.println("FAHRENHEIT: " + conversao);
			
			System.out.println("####----OBRIGADO POR USAR NOSSO PROGRAMA DE CONVERSÃO----#### ");
			
			
			}

	}
