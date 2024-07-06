package labwork;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FullTimeEmployee extends Employee{
	
	private double salary;
	
	public FullTimeEmployee() {
		super();
		
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Salary: ");
		salary = Double.parseDouble(JOptionPane.showInputDialog(frame, "Salary: "));
	}
	
	public FullTimeEmployee(String dep) {
		super(dep);
		
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Salary: ");
		salary = Double.parseDouble(JOptionPane.showInputDialog(frame, "Salary: "));
	}

	@Override
	public void displayEmployeeInfo() {
//		super.displayEmployeeInfo();
//		System.out.println("Salary: " + calculatePayment());
//		System.out.println();
		if(this.department != null) {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nStart Date: " + startDate.toString() + "\nSalary: " + calculatePayment()));
		}else {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nStart Date: " + startDate.toString() + "\nSalary: " + calculatePayment()));
		}
	}

	public double calculatePayment() {
		return salary + (this.getInsuranceRate() * salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
