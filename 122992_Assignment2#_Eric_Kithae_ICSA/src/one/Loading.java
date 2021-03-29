package one;

public class Loading {
	public static void DelayTime(int time) {
		try {
			Thread.sleep(time);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static void Bootcalculator(String word) {
	System.out.print("Loading " + word);
	DelayTime(100);
	for(int x= 0;x < 50;x++) {
		System.out.print(".");
		DelayTime(100);
	}
	DelayTime(10);
	System.out.println("Successfull");
	}
}
