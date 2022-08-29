package avcjavademo;
import java.util.Scanner;

public class Demo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int attemptsLeft = 3;
		while (attemptsLeft > 0) {
		    
		    System.out.println("Enter password: ");
		    String password = scanner.nextLine();
		    if (password.equals("Password")) {
		        System.out.println("Logged in successfully");
		        break;
		    } else {
		        System.out.println("Invalid username or password");
		        attemptsLeft--;
		    }
		}
		if (attemptsLeft == 0) {
		    System.out.println("You ran out of tries");
		}
			
			
	}

}
