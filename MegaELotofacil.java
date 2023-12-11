package loteria;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MegaELotofacil {

	public static void main(String[] args) {

		Set<Integer> lucky = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("If is Mega tap m, else is Lotofacil, tap f: ");
		Character choice = sc.next().charAt(0);

		switch (choice) {
		case 'm':
			for (int i = 0; i < 6; i++) {
				double x = ((int) Math.round(Math.random() * 59 + 1));
				lucky.add((int) x);
			}
			while(lucky.size()<6) {
				double x = ((int) Math.round(Math.random() * 59 + 1));
				lucky.add((int) x);
			}

			break;
		case 'f':
			for (int i = 0; i < 15; i++) {
				double x = (Math.round(Math.random() * 24 + 1));
				lucky.add((int) x);
			}
			while(lucky.size()< 15) {
				double x = ((int) Math.round(Math.random() * 24 + 1));
				lucky.add((int) x);
			}
			
			break;
		default:
			System.out.println("Error choice. End of the program!");
			break;

		}
		System.out.println(lucky);

		sc.close();
	}

}
