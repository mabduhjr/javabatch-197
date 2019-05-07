package day03;

import java.util.Scanner;

public class Soal01 {
	
	protected static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			input = new Scanner(System.in);
			
			
		System.out.println("Input N: ");
		
		
		int n = Integer.parseInt(input.nextLine());
		
		int arr[][] = new int [n][n];
		int [] deret = new int [n];
		int awal = 1;
		// deret pertama 
		for (int i = 0; i < deret.length; i++) {
				deret [i] = awal;
				awal = awal + (i + 2);
			}
		// mencari deret 2
				int[] deret2 = new int[n];
				int awal2 = 2;
				for (int y = 0; y < deret2.length; y++) {
					deret2[y] = awal2;
					awal2 = awal2 + (2 * (y+1));
				}
				

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						// diagonal kanan bawah \
						if(i == j) 
							arr[i][j]=deret[i];
						else if(i+j==n-1) // diagonal /
							arr[i][j]=deret2[j];
					System.out.print(arr[i][j] +"\t");
					}
					System.out.println();
				}

			}

		}
