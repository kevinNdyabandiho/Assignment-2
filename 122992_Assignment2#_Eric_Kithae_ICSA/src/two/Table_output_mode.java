package two;
import java.util.Random;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Table_output_mode {
	public static String Decimal_to_Binary(double n) {
		DecimalFormat df = new DecimalFormat("#.###");
		double m = Double.parseDouble(df.format(n));
		String binaryTotal ="";
		String binarywhole = "";
		String binaryfraction = "";
		String remark = "";
		int Trancate1 = 0;
		int Trancate0 = 0;
		int Specifier = 20;
		StringBuffer bWhole = new StringBuffer();
		StringBuffer bFraction = new StringBuffer();
		
		int Whole = (int)n;
		double Fraction = n - Whole;
		
		//Whole part
		int []binaryWhole = new int[32];
		int []binaryFraction = new int[20];
		int i = 0;
		while(Whole > 0) {
			binaryWhole[i] = Whole%2;
			Whole = Whole/2;
			i++;
		}
		for(int j = i - 1;j >=0;j--) {
			bWhole.append(binaryWhole[j]);
		}
		binarywhole = bWhole.toString();
		
		//Fraction part
		int j = 0;
		while(Specifier > 0){
			//Compare to zero and decrement
			Fraction = Fraction * 2;
			int fract_bit = (int) Fraction;
			if(fract_bit == 1) {
				binaryFraction[j] = 1;
				Fraction = Fraction - fract_bit;
			}else if(fract_bit == 0) {
				binaryFraction[j] = 0;
			}
			j++;
			Specifier--;
		}
		for(int count = 0; count < 10;count++) {
			 if(binaryFraction[count + 10] == 1) {
				Trancate1 -=1;
			}
			 if(binaryFraction[count + 10] == 0) {
				 Trancate1 +=1;
			 }
		}
		if(Trancate1 >= 4 ) {remark = "Exact";}else {remark = "Approximate";}
		for(int k = 0; k < 5;k++) {
			bFraction.append(binaryFraction[k]);
		}
		binaryfraction = bFraction.toString();
		binaryTotal = bWhole + "." + bFraction + " " + remark;
		return binaryTotal;
	}
	public static void Print_Table(int n) {
		System.out.println(String.format("%-20s %-20s", "Decimal number","Binary output and remark"));
		for(int i = 0;i <=n ;i++) {
			Random rand = new Random();
			Random irand = new Random();
			int randi = irand.nextInt(100);
			double k = rand.nextDouble();
			double inputed = k + randi;
			DecimalFormat df1 = new DecimalFormat("#.###");
			String dec = df1.format(inputed);
			System.out.println(String.format("%-22s %-20s", dec,Decimal_to_Binary(inputed)));
		}
	}
	public static void calculate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to table output mode");
		System.out.println("Here your input will be the number of randomly generated values you want to convert to binary");
		System.out.println("Input will be in three decimal places and output will be in five decimal places");
		System.out.println("Input [1] to access resources");
		System.out.println("Input [2] to access resources ");
		System.out.print("Input => ");
		int Input = input.nextInt();
		if(Input == 1) { Modes.Mode_Choice();}
		String word = "resources";
		Loading.Bootcalculator(word);
		if(Input == 2) {
			while(Input == 2) {
			System.out.print("Enter number of values => ");
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
