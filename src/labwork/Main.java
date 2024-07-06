package labwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		//Scanner scanner = new Scanner(System.in);
	
		ArrayList<Payable> payableLs = new ArrayList<Payable>();
		
		String optionalInfo;
		int wantedID;
		boolean flag = false;

		int userInp = -1;
		
		while(userInp != 0) {
			
//			System.out.println("1. Create a New Product");
//			System.out.println("2. Create a New Product with Category");
//			System.out.println("3. Create a New Employee");
//			System.out.println("4. Create a New Employee with Department");
//			System.out.println("5. Display Product Information");
//			System.out.println("6. Display Employee information");
//			System.out.println("7. Display Number of Products");
//			System.out.println("8. Calculate Total Payment");
//			System.out.println("0. Exit");
			
			String message = "1. Create a New Product\n"
							 + "2. Create a New Product with Category\n"
							 + "3. Create a New Employee\n"
							 + "4. Create a New Employee with Department\n"
							 + "5. Display Product Information\n"
							 + "6. Display Employee information\n"
							 + "7. Display Number of Products\n"
							 + "8. Calculate Total Payment\n"
							 + "0. Exit";
			
			String sel = JOptionPane.showInputDialog(frame, message);
			userInp = Integer.parseInt(sel);
			
			//userInp = scanner.nextInt();
			//scanner.nextLine();
			
			switch(userInp) {
				case 1:
					payableLs.add(new Product());
					break;
				case 2:
					optionalInfo = JOptionPane.showInputDialog(frame, "Enter Category: ");
					//System.out.println("Enter Category: ");
					//optionalInfo = scanner.nextLine();
					payableLs.add(new Product(optionalInfo));
					break;
				case 3:
					//System.out.println("1. Create a new Full Time Employee");
					//System.out.println("2. Create a new Hourly Employee");
					String sel2 = JOptionPane.showInputDialog(frame, "1. Create a new Full Time Employee\n"
																   + "2. Create a new Hourly Employee");
					userInp = Integer.parseInt(sel2);
					//userInp = scanner.nextInt();
					//scanner.nextLine();
					switch(userInp){
						case 1:
							payableLs.add(new FullTimeEmployee());
							break;
						case 2:
							payableLs.add(new HourlyEmployee());
							break;
					}
					break;
				case 4:
					//System.out.println("1. Create a new Full Time Employee");
					//System.out.println("2. Create a new Hourly Employee");
					String sel3 = JOptionPane.showInputDialog(frame, "1. Create a new Full Time Employee\n"
							   									   + "2. Create a new Hourly Employee");
					userInp = Integer.parseInt(sel3);
					//userInp = scanner.nextInt();
					//scanner.nextLine();
					//System.out.println("Department: ");
					optionalInfo = JOptionPane.showInputDialog(frame, "Department: ");
					//optionalInfo = scanner.nextLine();
					switch(userInp){
						case 1:
							payableLs.add(new FullTimeEmployee(optionalInfo));
							break;
						case 2:
							payableLs.add(new HourlyEmployee(optionalInfo));
							break;
					}
					break;

				case 5:
					//System.out.println("Enter Product ID: ");
					String sel4 = JOptionPane.showInputDialog(frame, "Enter Product ID: ");
					wantedID = Integer.parseInt(sel4);
					//wantedID = scanner.nextInt();
					//scanner.nextLine();
					
					Iterator<Payable> payableIt1 = payableLs.iterator();
					
					while(payableIt1.hasNext()) {
						Payable P = payableIt1.next();
						if(P instanceof Product) {
							Product p = ((Product) P);
							if(p.getId() == wantedID) {
								p.displayProductInfo();
								flag = true;
								break;
							}
						}
					}
					
					if(!flag) {
					//System.out.println("Product With The Given ID Is Not Found!");
					JOptionPane.showMessageDialog(frame, "Product With The Given ID Is Not Found!");
					
					}
					
					flag = false;
					break;
							
				case 6:
					ArrayList<Employee> sortedEmp = new ArrayList<Employee>();
					ArrayList<Employee> sortedEmp2 = new ArrayList<Employee>();
					
					int choice = -1;
					
					//System.out.println("1. Create a new Full Time Employee");
					//System.out.println("2. Create a new Hourly Employee");
					
					String sel5 = JOptionPane.showInputDialog(frame, "1. Sorted by ID\n"
							   									   + "2. Sorted by Name");
					choice = Integer.parseInt(sel5);
					
					//choice = scanner.nextInt();
					
					for(Payable p : payableLs) {
						if(p instanceof Employee) {
							sortedEmp.add((Employee) p);
							sortedEmp2.add((Employee) p);
						}
					}
					
					if(choice == 1) {
						Collections.sort(sortedEmp);
						Collections.reverse(sortedEmp);
						for(Employee e : sortedEmp) {
							e.displayEmployeeInfo();
						}
					}
					else if(choice == 2) {
						NameComparator nameComparator = new NameComparator();
						Collections.sort(sortedEmp2, nameComparator);
						for(Employee e : sortedEmp2) {
							e.displayEmployeeInfo();
						}
					}
					
					break;
				
				case 7:
					
					//System.out.println("Number of Products: " + Product.getProductCounter());
					//System.out.println();
					JOptionPane.showMessageDialog(frame, ("Number of Products: " + Product.getProductCounter()));
					break;
				
				case 8:
					double total = 0;
					for(Payable p : payableLs) {
						total += p.calculatePayment();
					}
					//System.out.println("Total Payment: " + total);
					JOptionPane.showMessageDialog(frame, ("Total Payment: " + total));
					break;
				
				case 0:
				
					break;
				
				default:
					
					//System.out.println("Invalid Entry!");
					JOptionPane.showMessageDialog(frame, "Invalid Entry!");
			}	
		}
	
	}
}
