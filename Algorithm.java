import java.util.Scanner;

public class Algorithm{
	
	int units;
	int tenth;
	int hundreds;
	int a;
	int b;
	
	Scanner in = new Scanner(System.in);
	
	public void startCalculate() {
		System.out.println("Enter a 3 digit integer");
		a = in.nextInt();
		hundreds = (a/100)*100;
		b = a - hundreds;
		tenth = (b/10)*10;
		units = b - tenth;
		
		System.out.println(hundreds + "\n" + tenth + "\n" + units );
	}	
}
