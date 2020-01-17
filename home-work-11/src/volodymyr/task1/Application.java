package volodymyr.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		Integer Integer [] = new Integer[7];
		Random rm = new Random();
		int Rm;
		
		for(int i = 0; i < 7; i++) {
			Rm = rm.nextInt(50);
			Integer[i] = Rm;
		}
		
		//for(int i = 0; i < 7; i++) {
			//System.out.println(Integer[i] + " ");
			System.out.println(Arrays.toString(Integer));
	//	}
			System.out.println("After sorting asc");
			Arrays.sort(Integer);
			System.out.println(Arrays.toString(Integer));
			
			System.out.println("After sorting desc");
			Arrays.sort(Integer, Collections.reverseOrder());
			System.out.println(Arrays.toString(Integer));
	}
	
}
