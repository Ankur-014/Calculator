package Main;

import java.util.Scanner;

import Calculator.Arithmetic;
import Calculator.Trigonometry;

abstract public class Main {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
					
		System.out.println("Press 1 for Arithmetic\n2 for Trigenometric");
		int choice = scr.nextInt();
		
		if(choice == 1){
		
			System.out.println("Enter the two numbers : ");
			double x = scr.nextDouble();
			double y = scr.nextDouble();
			
			System.out.println("Press 1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for exponential");
			int option = scr.nextInt();
		
			Arithmetic cal = new Arithmetic();
		
			switch (option) {
			case 1:
				System.out.println("Addition : " + cal.add(x,y));
				break;
			
			case 2:
				System.out.println("Subtraction : " + cal.sub(x,y));
				break;
			
			case 3:
				System.out.println("Multiplication : " + cal.mul(x,y));
				break;
		
			case 4:
				System.out.println("Division : " + cal.div(x,y));
				break;
			
			case 5:
				System.out.println("Exponential : " + cal.exp(x,y));
				break;	
				
			default:
				System.out.println("Option is invalid");
				break;
			}
		}
		
		else if(choice ==2){
			System.out.println("Enter the number: ");
			double z = scr.nextDouble();
			
			
			System.out.println("Press 1 for Sine\n2 for Cosine\n3 for Tangent\n4 for Secant\n5 for Cosecant\n6 for Cotangent");
			int c = scr.nextInt();
			
			Trigonometry tr = new Trigonometry(z);
			
			switch (c) {
			case 1:
				System.out.println("Sine Value: "+ tr.sine());
				break;
			
			case 2:
				System.out.println("Cosine Value: "+ tr.cosine());
				break;
			
			case 3:
				System.out.println("Tangent Value: "+ tr.tangent());
				break;

			case 4:
				System.out.println("Secant Value: "+ tr.secant());
				break;
				
			case 5:
				System.out.println("Cosecant Value: "+ tr.cosecant());
				break;
				
			case 6:
				System.out.println("Cotangent Value: "+ tr.cotangent());
				break;
				
			default:
				System.out.println("Invalid Option!!");
				break;
			}
		}
		
		else{
			System.out.println("Invalid Choice!!");
		}

	}

}
