import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args) {
		Scanner leitura = new Scanner(System.in);
		int n = leitura.nextInt(), a = 1, b = 0;
		System.out.println(a+",");
		for (int i=1; i<n; i++) {
			a = a + b;
			b = a - b;
			System.out.println(a+",");
		}
	}

}
