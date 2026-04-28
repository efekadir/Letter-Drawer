import java.util.Scanner;

public class LetterDrawer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to letter printer program.");
		ques(sc);
		while(true) {
			System.out.println("Do you wanna continue? Y / N?");
			String q = sc.nextLine();
			q = q.toUpperCase();
			if (q.equals("Y")){
				ques(sc);
			}
			else if (q.equals("N")) {
				break;
			}
			else {
				System.out.println("Pls write only Y or N.");
			}
			}
		}
	public static void ques(Scanner sc) {
		int size = 0;
		String letter = "";
		while(true) {
			System.out.print("Enter the size: ");
			size = sc.nextInt();
			sc.nextLine();
			if(size >= 5 && size % 2 == 1) {
				break;
			}
			else {
				System.out.print("Invalid size. ");
			}
		}
		while(true) {
			System.out.print("Enter the letter: ");
			letter = sc.nextLine().toUpperCase();
			if(letter.equals("W") || letter.equals("Z")) {
				break;
			}
			else {
				System.out.print("Invalid letter. ");
			}
		}
		if (letter.equals("W"))
			drawW(size);
		else if (letter.equals("Z")) {
			drawZ(size);
		}
	}
	public static void drawW(int size) {
		for (int a = 0; a < size; a++){
			for (int i = 0; i < a; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int i = 0; i < (size - a) * 2 - 3; i++) {
				System.out.print(" ");
			}
			if (a != size - 1) {
			System.out.print("*");
			}
			for (int i = 0; i < (a + 1) * 2 - 3; i++) {
				System.out.print(" ");
			}
			if (a != 0) {
			System.out.print("*");
			}
			for (int i = 0; i < (size - a) * 2 - 3; i++) {
				System.out.print(" ");
			}
			if (a != size - 1) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void drawZ(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int a = 1; a < size - 1; a++){
			for (int i = 0; i < size - (a + 1); i++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}