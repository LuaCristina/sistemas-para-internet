import java.util.Scanner;

public class ERE02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inicio, fim;

		inicio = s.nextInt();
		fim = s.nextInt();
		s.close();

		inicio += (inicio & 1); // Transforma o número em par com Bitwise

		for (; inicio <= fim; inicio += 2) {
			System.out.println(inicio);
		}
	}
}