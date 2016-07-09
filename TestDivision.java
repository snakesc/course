package by.park.hightech;
import java.util.Scanner;

public class TestDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число :"); /** this enter two number */
		double a = sc.nextDouble();
		System.out.println ("введите второе число :");
		double b = sc.nextDouble();
		double c = a / b; /** divide the number */
		System.out.println("частное этих чисел : " + c); /** out result*/

	}

}
