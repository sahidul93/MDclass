package calculator;
import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOfEmployee;
		double numberOfHours;
		double hourlyPayRate;
		double grossPay;
		
		System.out.println("Welcome to sahi's calculations");
		System.out.println("Please read before you type...seriously");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("please enter the name of the employee : ");
		nameOfEmployee = scanner.nextLine();
		
		System.out.println("please enter the number of total hours employee has work : ");
		numberOfHours = scanner.nextDouble();
		
		System.out.println("please enter the hourly pay rate assign for this employee : ");
		hourlyPayRate = scanner.nextDouble();
		
		grossPay = hourlyPayRate * numberOfHours;
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("==========================PAY SLIP=========================");
		System.out.println("employee name              : " +nameOfEmployee );
		System.out.println("number of hours worked             : " + numberOfHours);
		System.out.println("hourly payment rate of employee              : " + hourlyPayRate);
		System.out.println("the total payout for employee              : " + grossPay);
		System.out.println("===========================GOODBYE============================");
		


		
	}

}
