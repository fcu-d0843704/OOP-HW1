import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num;
		num = scanner.nextInt();
		System.out.println("Enter a float point number: :");
		float num2;
		num2 = scanner.nextFloat();
		System.out.println("Enter a your name:");
		String name;
		name = scanner.next();
		
		System.out.println("Hi " + name + ", the multiplication of " + num + " and " + num2 + " is ");
	}

}
