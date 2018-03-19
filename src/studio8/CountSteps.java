package studio8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps{
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:/Users/mitry/Desktop/stepsTest.csv");
		Scanner scanner = new Scanner(file);
		int count = 0;
		
		double[] z = new double[99999999];
		int i = 0;
		while(scanner.hasNextLine()) {
			String s = scanner.nextLine();
		String[] oneLine = s.split(",");
	//	System.out.println("x: " + oneLine[0] + "y: " + oneLine[1] + "z: " + oneLine[2]);
		
		
		z[i] = Double.parseDouble(oneLine[0]);
		
		i++;
		}
		
		for(int j = 1; j < i; j++) {
			if(z[j] > z[j-1] && z[j] > z[j+1]) {
				count++;
				System.out.println("Step Number: " + count + " occured at z = " + j);
			}
		}
		
		
		
		scanner.close();
	}
	
	
	
	
	
}