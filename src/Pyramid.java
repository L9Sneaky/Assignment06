import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int x = i.nextInt();
		for (int rows = 1; rows <= x; rows++) {
			
			for (int s = x - rows; s >= 1; s--) {
				System.out.print("  ");
			}
			
			for (int l = rows; l >= 2; l--) {
				System.out.print(l + " ");
			}
			
			for (int r = 1; r <= rows; r++) {
				System.out.print(r + " ");
			}
	
			System.out.println();

		}

	}
	
}