import java.util.Scanner;


public class FootBallStats{
	public static void main(String[]args) {
		
		//Declare the required variables
		double TD; //Store touchdowns
		double Yards; //Store yards
		double INT; //Store interception
		double comp;//Store completions
		double ATT;//Store phases attempted
		double a,b,c,d;
		
		double QBRating;
		
		//Inputs from keyboard
		Scanner sc = newScanner(System.in);
		
		System.out.println("Enter touchdowns (TD):");
		TD = sc.nextDouble();
		System.out.println("Enter Yards (Yards): ");
		Yards = sc.nextDouble();
		System.out.println("Enter interception (INT): ");
		INT = sc.nextDouble();
		System.out.println("Enter completions (comp): ");
		comp = sc.nextDouble();
		System.out.println("Enter number phases attempted (ATT): ");
		ATT = sc.nextDouble();
		
		//Compute with the components
		
		a = (comp/ATT-0.3)*5;
		b = (Yards/ATT-3)*0.25;
		c = (TD/ATT)*20;
		d = 2.375 - ((INT/ATT)*25);
		
		//QB Rating
		QBRating = ((a+b+c+d)/6)*100;
		
		System.out.println("QB rating:"+QBRating);
	}
}