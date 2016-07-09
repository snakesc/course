package by.park.hightech;
import java.util.Scanner;

public class Waight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш рост : ");/** enter growth and weight*/
		int growth = sc.nextInt();
		System.out.println("Введите ваш вес :");
		int weight = sc.nextInt();
		int difference = growth - 100; /** check the formula*/
		if (difference > weight){
			System.out.println("Вам необходимо поправиться!");/** out result */
		}
		if (difference < weight){
			System.out.println("Вам нужно похудеть!");
		}
		if (difference == weight){
			System.out.println("У вас идеальный вес!");
		}

	}

}
