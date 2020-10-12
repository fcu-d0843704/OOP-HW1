import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num;
		num = scanner.nextInt();
		switch(num) {
			case 1:{
				System.out.println("The input integer is ¡§ONE¡¨.\n");
				break;
			}
			case 2:{
				System.out.println("The input integer is ¡§TWO¡¨.\n");
				break;
			}
			case 3:{
				System.out.println("The input integer is ¡§THREE¡¨.\n");
				break;
			}
			case 4:{
				System.out.println("The input integer is ¡§FOUR¡¨.\n");
				break;
			}
			case 5:{
				System.out.println("The input integer is ¡§FIVE¡¨.\n");
				break;
			}
			case 6:{
				System.out.println("The input integer is ¡§SIX¡¨.\n");
				break;
			}
			case 7:{
				System.out.println("The input integer is ¡§SEVEN¡¨.\n");
				break;
			}
			case 8:{
				System.out.println("The input integer is ¡§EIGHT¡¨.\n");
				break;
			}
			case 9:{
				System.out.println("The input integer is ¡§NINE¡¨.\n");
				break;
			}
			default:{
				System.out.println("The input integer is ¡§OTHER¡¨.\n");
				break;
			}
		}

	}

}
