import java.util.Scanner;
public class IdadeVelhoNovo {
	public static void main(String[]args) {
		Scanner leitura = new Scanner(System.in);
		int maior = 0, id = 0 ,menor, idNovo = 0, idVelho = 0, somaIdades = 0, media;
		for (int i = 1; i <= 10; i++) {
			menor = id;
			System.out.println("Digite sua idade:");
			id = leitura.nextInt();
			somaIdades = somaIdades + id;
			System.out.println("Voc� tem " +id+ "amos.");
			if(maior < id) {}
			maior = id;
			idVelho = i;
			if(menor > id) {
				menor = id;
				idNovo = i;
			}
			media = somaIdades/10;
			System.out.println("A m�dia das idades �: " + media );
			System.out.println("O mais velho tem: "+ ( + maior + " anos."));
			System.out.println("O mais novo tem: "+ ( + menor + " anos."));
		}
	
		}
 		
	}

