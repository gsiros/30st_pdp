/* USER: u122
LANG: Java
TASK: astrolavos */

import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;



public class astrolavos {

	public static void main(String[] args) throws IOException {
		
		
		Locale.setDefault(Locale.US);
		
		FileReader file = new FileReader("astrolavos.in");
		Scanner granazia = new Scanner(file);
		
		
		
		int gran = granazia.nextInt();
		
		
		float[] dontakia;
		dontakia = new float[gran];
		
		float[] strofes;
		strofes = new float[gran];
		 
		
		BufferedReader br = new BufferedReader (new FileReader ("astrolavos.in"));
		String grammi = br.readLine();
		
		

		if((grammi = br.readLine() ) != null) {
			
			String[] strs = grammi.trim().split("\\s+");
			
			for (int i = 0; i < strs.length; i++) {
			dontakia[i] = Integer.parseInt(strs[i]);
			}
	
		}
		
		if((grammi = br.readLine() ) != null) {
	
			String[] strs2 = grammi.trim().split("\\s+");
			
			int[] epiloges;
			epiloges = new int[strs2.length];
	
			
			for (int i = 0; i < strs2.length; i++) {
			epiloges[i] = Integer.parseInt(strs2[i]);
			
			}
			
			strofes[0] = epiloges[0];
			
			PrintWriter writer = new PrintWriter("astrolavos.out", "UTF-8");
			
			
			for (int j = 1; j < gran; j++) {
				strofes[j]= (strofes[0] * dontakia[0])/ dontakia[j];
			} 
			
			for (int j=1; j <= epiloges.length -1 ; j++) {
				writer.printf("%.3f" , strofes[epiloges[j]-1]);
				writer.print(" ");
			}
			
			//writer 
			writer.close();
			
		}
		//ifs
	
	}
	
}