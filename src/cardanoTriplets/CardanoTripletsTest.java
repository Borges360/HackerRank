package cardanoTriplets;

import java.util.Scanner;

public class CardanoTripletsTest {

	public static void main(String[] argh) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int n = scan.nextInt();
			int contador = 0;
			long b = 0;
			

			for (long a = 0; a <= n; a++) {
				if (a + b  < n) {
					for (b = 0; b <= n; b++) {
						if (a + b < n) {
							Double c = (8 * Math.pow(a, 3) + 15 * Math.pow(a, 2) + 6 * a - 1)/(27*Math.pow(b, 2));
							if (isInt(c) && a + b + c <= n) {
								contador += 1;
							}
						} else {
							break;
						}
					
					}
				} else {
					break;
				}
			b = 0;	
			}
			System.out.println(contador);
		}

	}
	
	public static boolean isInt(double val)	{
		return ((int)val==val);
	}
}