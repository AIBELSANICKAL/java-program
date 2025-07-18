package psn;
import java.util.Scanner;
public class Switchcase {
	public static void main (String [] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter your grade:");
		String grade=sc.nextLine();
		sc.close();
		String result =switch (grade) {
		case "O" -> "outstanding performance";
		case "A+" ->"Excelllent performance";
		case "A" -> "very good performance";
		case "B+" -> "Good performance";
		case "B" -> "Above average performance";
		case "C" -> "Average performance";
		case "P" -> "Pass";
		case "F" -> "Fail";
		default -> "Invalid grade";
		};
		
		System.out.println("grade:"+ grade);
		System.out.println("Result:" + result);
		
	}

}
