package labwork;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Product implements Payable{

	private static int productCounter = 0;
	private int id;
	private String brand;
	private String model;
	private String isShippingFree;
	private String category;
	private int stock;
	JFrame frame = new JFrame();

	public Product() {
		productCounter++;
		//Scanner myScanner = new Scanner(System.in);
		
		boolean contFlag = false;
		do {
			//System.out.println("ID:");
			String sel = JOptionPane.showInputDialog(frame, "ID: ");
			try {
				int selInt = Integer.parseInt(sel);
				contFlag = true;
				
			} catch (NumberFormatException e){
				//System.out.println("ID can't contain letters!");
				JOptionPane.showMessageDialog(frame, "ID can't contain letters!");
				//myScanner.nextLine();
			}
		}while(!contFlag);
		
		
		//System.out.println("Brand:");
		brand = JOptionPane.showInputDialog(frame, "Brand: ");
		//brand = myScanner.nextLine();
		
		//System.out.println("Model:");
		model = JOptionPane.showInputDialog(frame, "Model: ");
		//model = myScanner.nextLine();
		
		//System.out.println("Free Shipping(y/n):");
		isShippingFree = JOptionPane.showInputDialog(frame, "Free Shipping(y/n): ");
		//isShippingFree = myScanner.nextLine();
		
		//System.out.println("Stock: ");
		stock = Integer.parseInt(JOptionPane.showInputDialog(frame, "Stock: "));
		//stock = myScanner.nextInt();
		//myScanner.nextLine();	
		
		category = "Other";
	}
	
	public Product(String cat) {
		productCounter++;
		//Scanner myScanner = new Scanner(System.in);
		
		category = cat;
		
		boolean contFlag = false;
		do {
			//System.out.println("ID:");
			String sel = JOptionPane.showInputDialog(frame, "ID: ");
			try {
				int selInt = Integer.parseInt(sel);
				contFlag = true;
				
			} catch (NumberFormatException e){
				//System.out.println("ID can't contain letters!");
				JOptionPane.showMessageDialog(frame, "ID can't contain letters!");
				//myScanner.nextLine();
			}
		}while(!contFlag);
		
		//System.out.println("Brand:");
		brand = JOptionPane.showInputDialog(frame, "Brand: ");
		//brand = myScanner.nextLine();
		
		//System.out.println("Model:");
		model = JOptionPane.showInputDialog(frame, "Model: ");
		//model = myScanner.nextLine();
		
		//System.out.println("Free Shipping(y/n):");
		isShippingFree = JOptionPane.showInputDialog(frame, "Free Shipping(y/n): ");
		//isShippingFree = myScanner.nextLine();
		
		//System.out.println("Stock: ");
		stock = Integer.parseInt(JOptionPane.showInputDialog(frame, "Stock: "));
		//stock = myScanner.nextInt();
		//myScanner.nextLine();	
	}
	
	public void displayProductInfo() {
		
//		System.out.println();
//		System.out.println("ID: " + id );		
//		System.out.println("Brand: " + brand);
//		System.out.println("Model: " + model);
//		System.out.println("Free Shipping: " + isShippingFree);
//		System.out.println("Stock: " + stock);
//		System.out.println();
		
		JOptionPane.showMessageDialog(frame, ("ID: " + id + "\nBrand: " + brand + "\nModel: " + model + "\nFree Shipping: " + isShippingFree + "\nStock: " + stock));
	}
	
	public double calculatePayment() {
		if(isShippingFree.equalsIgnoreCase("y")){
			return 50;
		}else {
			return 60;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getIsShippingFree() {
		return isShippingFree;
	}

	public void setIsShippingFree(String isShippingFree) {
		this.isShippingFree = isShippingFree;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public static int getProductCounter() {
		return productCounter;
	}

	public static void setProductCounter(int productCounter) {
		Product.productCounter = productCounter;
	}

}


