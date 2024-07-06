package labwork;

import java.util.Scanner;

public class Date {

	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	
	public Date() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Starting Day: ");
		day = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Starting Month: ");
		month= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Starting Year: ");
		year = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Starting Hour: ");
		hour = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Starting Minute: ");
		minute = scanner.nextInt();
		scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year + " " + hour + ":" + minute;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

}



