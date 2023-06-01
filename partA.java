import java.util.Scanner;
public class partA {

	public static void main(String[] args) {
		int Ao = 100;
		float k = 0.25f;
		int t = 6;
		
		double A;
		
		A = Ao*(Math.exp(k*t));
		
		System.out.println("Your answer is: "+ A);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Value of A0: ");
		Ao=input.nextInt();
		
		System.out.print("Please Enter Value of K: ");
		k=input.nextFloat();
		
		System.out.print("Please Enter Value of t: ");
		t=input.nextInt();
		
		A = Ao*(Math.exp(k*t));
		System.out.print("Your answer is: "+ A);
	}
}