package by.park.hightech;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите год :");
		int year = sc.nextInt();
		if (year %4 == 0){
			if ((year % 100 != 0) || (year % 400 == 0)){
				System.out.println("Год високосный");
			}
			
		} 
		else {
			System.out.println("Год не високосный!");
		}
	}

}
