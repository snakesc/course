package by.park.hightech;
import java.util.Scanner;

public class Declension {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Введите сумму :");/** this enter number*/
		int x = sc.nextInt();/** this method for checking the ends of words*/ 
		if (x == 1){
			System.out.println(x+ " рубль");
		}
		if ((x % 10 >=2) && (x %10 <=4)){
			System.out.println(x+ " рубля");
		}
		if ((x % 10 >=5) && (x % 10 <= 9) || (x % 10 ==0 )){
			System.out.println(x + " рублей");
		}

	}

}
