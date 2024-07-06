package labwork;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public abstract class Employee implements Payable, Comparable<Employee>{
	
	private static int employeeCounter = 0;
	protected int id;
	protected String name;
	protected String department;
	protected Date startDate;
	private double insuranceRate;
	JFrame frame = new JFrame();
	
	public Employee() {
		employeeCounter++;
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter ID: ");
		//id = scanner.nextInt();
		//scanner.nextLine();
		
		String sel = JOptionPane.showInputDialog(frame, "Enter ID: ");
		id = Integer.parseInt(sel);
		
		boolean contFlag = false;
		do {
			//System.out.println("Enter Name: ");
			String sel1 = JOptionPane.showInputDialog(frame, "Enter Name: ");
			try {
				if(!sel1.matches("[A-Za-z]+")) {
					throw new InputMismatchException();
				}
				name = sel1;
				//name = scanner.nextLine();
				contFlag = true;
				
			} catch (InputMismatchException e){
				//System.out.println("Name can't contain numbers!");
				JOptionPane.showMessageDialog(frame, "Name can't contain numbers!");
				//scanner.nextLine();
			}
		}while(!contFlag);
		
		startDate = new Date();
		
		department = "Tech";
		
		setInsuranceRate(0.2);
	}
	
	public Employee(String dep) {
		employeeCounter++;
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter ID: ");
//		id = scanner.nextInt();
//		scanner.nextLine();
		
		String sel = JOptionPane.showInputDialog(frame, "Enter ID: ");
		id = Integer.parseInt(sel);
		
		boolean contFlag = false;
		do {
			//System.out.println("Enter Name: ");
			String sel1 = JOptionPane.showInputDialog(frame, "Enter Name: ");
			try {
				if(!sel1.matches("[A-Za-z]+")) {
					throw new InputMismatchException();
				}
				name = sel1;
				//name = scanner.nextLine();
				contFlag = true;
				
			} catch (InputMismatchException e){
				//System.out.println("Name can't contain numbers!");
				JOptionPane.showMessageDialog(frame, "Name can't contain numbers!");
				//scanner.nextLine();
			}
		}while(!contFlag);
		
		department = dep;
		
		startDate = new Date();
		
		if(dep.equalsIgnoreCase("tech")) {
			setInsuranceRate(0.2);
		}else if(dep.equalsIgnoreCase("finance")) {
			setInsuranceRate(0.1);
		}else {
			setInsuranceRate(0.05);
		}
	}

	public void displayEmployeeInfo() {
		
//		System.out.println();
//		System.out.println("ID: " + id );		
//		System.out.println("Name: " + name);
//		if(department != null) {
//		System.out.println("Department: " + department);
//		}
//		System.out.println("Start Date: " + startDate.toString());
		
		if(department != null) {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nStart Date: " + startDate.toString()));
		}else {
			JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nName: " + name + "\nStart Date: " + startDate.toString()));
		}
	}
	
	public static int getEmployeeCounter() {
		return employeeCounter;
	}

	public static void setEmployeeCounter(int employeeCounter) {
		Employee.employeeCounter = employeeCounter;
	}

	@Override
	public int compareTo(Employee e2) {
		return this.getId() - e2.getId();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getInsuranceRate() {
		return insuranceRate;
	}

	public void setInsuranceRate(double insuranceRate) {
		this.insuranceRate = insuranceRate;
	}
	
}
