package labwork;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HourlyEmployee extends Employee {

	int workHour;
	double payment;
	
	public HourlyEmployee() {
		super();
	
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Payment: ");
		payment = Double.parseDouble(JOptionPane.showInputDialog(frame, "Payment: "));
		
		//System.out.println("Work Hour: ");
		workHour = Integer.parseInt(JOptionPane.showInputDialog(frame, "Work Hour: ")); 
	}
	
	public HourlyEmployee(String dep) {
		super(dep);
	
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Payment: ");
		payment = Double.parseDouble(JOptionPane.showInputDialog(frame, "Payment: "));
				
		//System.out.println("Work Hour: ");
		workHour = Integer.parseInt(JOptionPane.showInputDialog(frame, "Work Hour: "));
	}
	
	@Override
	public void displayEmployeeInfo() {
//		super.displayEmployeeInfo();
//		System.out.println("Daily Payment: " + calculatePayment());
//		System.out.println();
		if(department != null) {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nStart Date: " + startDate.toString() + "\nDaily Payment: " + calculatePayment()));
		}else {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nStart Date: " + startDate.toString() + "\nDaily Payment: " + calculatePayment()));
		}
	}

	public double calculatePayment() {
		 return ((payment * workHour) + (this.getInsuranceRate() * payment * workHour));
	 }

}
