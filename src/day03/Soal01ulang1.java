package day03;

import java.util.Scanner;
public class Soal01ulang1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input N :" );
		int n = Integer.parseInt(input.nextLine());
		
		int arr [][] = new int [n][n];
		int[] deret = new int[n];
		int awal = 1;
		// untuk yang deret 1
		for ( int i = 0; i < deret.length; i++) {
			deret[i] = awal;
			awal = awal + (i + 2);
			
		// deret 2 dia gonal
		int[] deret2 = new int [n];
		int awal2 = 2;
		for (int y = 0; y < deret2.length; y++) {
				deret2[y] = awal2;
					awal2 = awal2 + (2 * (y+1));
				}
					for  (int j = 0; j < n; j++) {
						
						// untuk angka dagonal
						
						
					if (i == j)
						arr[i][j] = deret [i];
					else if(i+j==n-1)
						//diagonal
							arr[i][j] = deret2 [j];
					System.out.print(arr[i][j] + "\t");
					}
					System.out.println();
					}
			}
	}