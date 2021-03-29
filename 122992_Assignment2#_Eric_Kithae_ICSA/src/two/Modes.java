package two;
import java.util.Scanner;
public class Modes {
	public static void Mode_Choice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select mode by inputing the corresponding number");
		System.out.println("Single output mode------>[1]");
		System.out.println("Table output mode------->[2]");
		System.out.print("Input ");
		int mode = input.nextInt();
		if(mode == 1) {
			Single_output_mode.Calculate();
		}else if(mode == 2) {
			Table_output_mode.calculate();
		}
	}
}
