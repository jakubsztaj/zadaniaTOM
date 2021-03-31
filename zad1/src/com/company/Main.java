
package com.company;

		import java.util.Scanner;
		import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			for (int i = 0; i <= 2; i++) {
				System.out.print("Hello, What's your name? ");
				String name = scanner.nextLine();
				System.out.println("Hello " + name + " How are you doing?");
				scanner.nextLine();
				System.out.println("Excelent!");
				TimeUnit.SECONDS.sleep(2);
			}
		} catch (Exception e) {
			System.out.println("Try Again!");
		}
	}
}

