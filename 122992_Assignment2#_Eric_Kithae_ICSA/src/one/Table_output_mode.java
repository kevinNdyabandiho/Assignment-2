package one;
import java.util.Scanner;
import java.util.Arrays;
public class Table_output_mode {
	public static int[] binaryNumber = new int[10];
	public static char[] hexadecimalNumber = new char[10];
	public static String Decimal_to_Binary(int n) {
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while(n > 0) {
			binaryNumber[i] = n%2;
			n = n/2;
			i++;
		}
		for(int j = i - 1; j>=0;j--) {
			sb.append(binaryNumber[j]);
		}
		String binary = sb.toString();
		return binary;	
	}
	public static String Decimal_to_Hexadecimal(int n) {
		StringBuffer buff = new StringBuffer();
		int i = 0;
		while(n != 0) {
			int temp = 0;
			temp = n % 16;
			if(temp < 10) { hexadecimalNumber[i] = (char)(temp + 48); i++; }
			else { hexadecimalNumber[i] = (char)(temp + 55); i++;}
			n = n/16;
		}

		for(int j = i - 1; j>=0;j--) {
			buff.append(hexadecimalNumber[j]);
		}
		String hexadecimal = buff.toString();
		return hexadecimal;
	}
	public static void Print_Table(int n) {
		System.out.println(String.format("%-10s  %-10s %-10s", "Decimal number","Binary number","Hexadecimal number"));
		for(int i = 0;i <= n;i++) {
			System.out.printf(String.format("%10d %10s %10s", i,Decimal_to_Binary(i),Decimal_to_Hexadecimal(i)));
			System.out.println();
		}
	}
	public static void calculate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to table output mode");
		System.out.println("Here you enter the ending point of a range of values starting from 0 and a table will be printed");
		System.out.println("Input [1] to access resources");
		System.out.println("Input [2] to access resources ");
		System.out.print("Input => ");
		int Input = input.nextInt();
		if(Input == 1) { Modes.Mode_Choice();}
		String word = "resources";
		Loading.Bootcalculator(word);
		if(Input == 2) {
			while(Input == 2) {
			System.out.print("Enter ending point => ");
			int n = input.nextInt();
			String Word = "table";
			Loading.Bootcalculator(Word);
			Print_Table(n);
			System.out.print("Input [2] to stay in this mode else input any number to leave => ");
			Input = input.nextInt();
			System.out.println();
			}}
		Modes.Mode_Choice();
		input.close();
	}
}
