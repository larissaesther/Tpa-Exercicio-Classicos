
public class Tabuada {
	public static void main (String[] args) {
		int numero = 1, resultado;
		while (numero<=10) {
			System.out.println("");
			System.out.println("Tabuada do n�mero"+numero+":");
			System.out.println("");
				for (int i=1; i<=10; i++) {
					resultado = i * numero;
					System.out.println(numero + "x" + i + "=" + resultado);
				}
				numero++;
			}
		}
}
