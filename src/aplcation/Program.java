package aplcation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee # " + i + " data: ");
			System.out.print("Outsourced (y/o)? ");
			char resp = scan.next().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Ours: ");
			int hour = scan.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if(resp == 'y' ) {
				System.out.print("Aditional charge: ");
				double aditionalCharge = scan.nextDouble();
				
				lista.add(new OutsourcedEmployee(name, hour, valuePerHour, aditionalCharge));
			}else {
	
				lista.add(new Employee(name, hour, valuePerHour));
				
			}
			
		}
		
		System.out.println();
		System.out.println("Payemnt: ");
		for(Employee emp : lista) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			
		}

	}

}
