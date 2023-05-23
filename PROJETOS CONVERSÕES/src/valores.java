import java.util.Scanner;

public class valores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double A, B = 0, conversao, conversao1;
	    
	    System.out.println("####---- TROCA DE VALORES ----#### ");

		System.out.println("DIGITE O VALOR DE A:");
		
		A = scanner.nextDouble();

		System.out.println("DIGITE O VALOR DE B:");
		
		B = scanner.nextDouble();
		
		conversao = (A + B - A );
		
		conversao1 = (A + B - B );
			
		System.out.println("A:" + conversao);
		
		System.out.println("B:" + conversao1);
		
		System.out.println("####----OBRIGADO POR USAR NOSSO PROGRAMA DE MÉDIA----#### ");
		
		
		}

}
