import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite o numero N: ");
		N = scan.nextInt();
		
		if(N % 2 != 0) {
			System.out.print("Weird");
		}else {
			if(N >= 2 && N < 5) {
				System.out.println("Not Weird");
			}else if(N >= 6 && N <= 20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}
	}
}
