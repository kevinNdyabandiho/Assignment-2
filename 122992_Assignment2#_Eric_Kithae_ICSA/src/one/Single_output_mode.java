package one;
import java.util.Scanner;
import java.io.*;
public class Single_output_mode {
	public static void Calcutate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to single output mode ");
		System.out.println("In this mode you enter a single decimal input and receive a single output");
		System.out.println("Input [1] to leave this mode ");
		System.out.println("Input [2] to access resources ");
		System.out.print("Input => ");
		int Input = input.nextInt();
		if(Input == 1) { Modes.Mode_Choice();}
		if(Input == 2) {
			String word = "resources";
			Loading.Bootcalculator(word);
			while(Input == 2) {
			System.out.print("Enter number => ");
			int n = input.nextInt();
			int m = n;
			int[] binaryNumber = new int[32];
			int i = 0;
			while(n > 0) {
				binaryNumber[i] = n%2;
				n = n/2;
				i++;
			}
			System.out.print("Binary output = ");
			for (int j = i -1; j>=0;j--) {
				System.out.print(binaryNumber[j]);
			}
			System.out.println();
			//Hex part //
			i = 0;
			char[] hexadecimalNumber = new char[100];
			while(m != 0) {
				int temp = 0;
				temp = m % 16;
				if(temp < 10) { hexadecimalNumber[i] = (char)(temp + 48); i++; }
				else { hexadecimalNumber[i] = (char)(temp + 55); i++;}
				m = m/16;
			}
			System.out.print("Hexadecimal output = ");
			for(int j = i - 1; j >= 0; j--) {
				System.out.print(hexadecimalNumber[j]);
			}
			//
			System.out.println();
			System.out.print("Input [2] to stay in this mode else input any number to leave => ");
			Input = input.nextInt();
			System.out.println();
			}
			Modes.Mode_Choice();
		input.close();
	}}}


