import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite o numero N: ");
		N = scan.nextInt();
		
		
		for(int i = 1; i <= 10; i++) {
			
			int resultado = N * i;
			
			System.out.println(N + " x " + i + " = " + resultado);
		}
		scan.close();
	}	
}
