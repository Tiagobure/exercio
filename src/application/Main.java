package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.ImportedProduct;
import application.entities.Product;
import application.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stu
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Custom fee:");
				double custom = sc.nextDouble();
				list.add(new ImportedProduct(name, price, custom));

			}
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				;
				list.add(new UsedProduct(name, price, date));

			} else {

				list.add(new Product(name, price));

			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");

		for (Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();
	}

}
