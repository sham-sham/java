import java.util.Scanner;
public class BillTip {
	public static void main(String[] args) {
		double bill,tip,total;
		System.out.print("Please enter the subtotal: ");
		Scanner input = new Scanner(System.in);
		bill = input.nextDouble();
		if(bill<=30) {
			tip = 5;
		}else {
			tip = bill * 0.15;
		}
		tip = Math.ceil(tip*100)/100;
		total = bill + tip;
		total = Math.ceil(total*100)/100;
		System.out.println("The gratuity is $"+tip+", and the total bill is $"+total+".");
		
	}

}

