import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int c = 1 , x , k , d;
		
		System.out.println("Enter a number (-1 to end): ");
		
		x = i.nextInt();
		
		while (x != -1) {
			d = (int) Math.log10(x) + 1;
			
			for (k = 1; k <= d; k++) {
				System.out.println("Digit" + c +" = "+ x%10);
				x/=10;
				c++;
			}
			System.out.println("Enter a number (-1 to end): ");
			x = i.nextInt();
			c=1;
		}

	}

}
