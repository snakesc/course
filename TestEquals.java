package by.park.hightech;
import java.util.Scanner;

class TestEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число :");		/** Enter two numbers */
		int a = sc.nextInt();
		System.out.println("Введите второе число :");
		int b = sc.nextInt();
		if (a > b) {		/** equals result */
			System.out.println("Первое число больше!");
			}
			if (a < b) {
				System.out.println("Второе число больше!");
				}
				if (a == b) {
						System.out.println ("Числа равны!");
			}	
		}
	}

