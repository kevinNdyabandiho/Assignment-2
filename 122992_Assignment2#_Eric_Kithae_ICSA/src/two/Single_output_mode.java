package two;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Single_output_mode {
	public static void Calculate() {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Welcome to single output mode");
		System.out.println("In this mode a single input is accepted and a single output is returned");
		System.out.println("Decimal inputs will be rounded off to three decimal places and output will return a maximum of five decimal places");
		System.out.println("Input [1] to leave this mode ");
		System.out.println("Input [2] to access resources");
		System.out.print("Input => ");
		int Input = input.nextInt();
		if(Input == 1 ) {Modes.Mode_Choice();}
		if(Input == 2) {
		String word = "resources";
		Loading.Bootcalculator(word);
		while(Input == 2) {
			System.out.print("Enter number => ");
			double put = input.nextDouble();
			double n = Double.parseDouble(df.format(put));
			String binaryTotal ="";
			String binarywhole = "";
			String binaryfraction = "";
			String remark = "";
			int Trancate = 0;
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
				if(binaryFraction[10 + count] == 0) {
					Trancate += 1;
				}
				else if(binaryFraction[10 + count] == 1) {
					Trancate -=1;
				}
			}if(Trancate >= 4) {remark = "Exact";}else {remark = "Approximate";}
		
			
			for(int k = 0; k < 5;k++) {
				bFraction.append(binaryFraction[k]);
			}
			binaryfraction = bFraction.toString();
			binaryTotal = bWhole + "." + bFraction + " " + remark;
			System.out.println(binaryTotal);
			System.out.println();
			System.out.print("Input [2] to stay in this mode else input any number to leave => ");
			Input = input.nextInt();
			System.out.println();
			}
		Modes.Mode_Choice();
		input.close();
		
		}
	}
		
	}

