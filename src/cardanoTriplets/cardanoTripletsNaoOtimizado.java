package cardanoTriplets;

import java.util.Scanner;

public class cardanoTripletsNaoOtimizado {

	public static void main(String[] argh) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int n = scan.nextInt();
			int contador = 0;
	

			for (int a = 0; a <= n; a++) {

				for (int b = 0; b <= n; b++) {
					
					for (int c = 0; c <=n; c++) {
						
						Double bSqrtc = b*Math.sqrt(c);
						Double resultado = Math.cbrt(a+bSqrtc) + Math.cbrt(a-bSqrtc);
											
						if ( resultado == 1 && a + b + c <= n) {
							contador ++;
						}
					}
							
				}

			}
			System.out.println(contador);
		}

	}

}
