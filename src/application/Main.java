package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println("Product #" + i + " data:" );
			System.out.print("Common, used or imported (c/u/i)? " );
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			

		}
		
		
		sc.close();
	}

}
