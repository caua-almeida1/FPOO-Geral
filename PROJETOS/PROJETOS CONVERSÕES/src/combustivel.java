import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double tempo, velocidade, distancia, litros; 
	    
	    System.out.println("####---- CONVERSOR QUILÔMETROS EM LITROS ----#### ");
	    

		System.out.println("informe tempo");
		tempo = scanner.nextDouble();
	
		System.out.println("informe velocidade");
		velocidade = scanner.nextDouble();
		
		distancia = tempo * velocidade;
				
		litros =  distancia / 12;
		
		
		System.out.println("LITROS USADOS = " + litros);
		
		System.out.println("####----OBRIGADO POR USAR NOSSO PROGRAMA DE MÉDIA----#### ");
		
		
		}

}
