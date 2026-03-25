import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Your Age: ");
		int age = scanner.nextInt();
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}
