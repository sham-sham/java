import java.util.Scanner;
public class feetToMeters {
	public static void main(String[] args) {
		double feet, meters;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a value for feet:");
		feet=scn.nextDouble();
		meters=feet*0.305;
		System.out.println(feet+" feet is "+meters+" meters");
	}
}

