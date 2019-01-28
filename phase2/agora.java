/* USER: u122
LANG: Java
TASK: agora */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class agora {
 
// methodos ypologismou megistoy koinoy diaireti
	long gcd(long x, long y) {
	if (y == 0) {
	return x;
		}
	return gcd(y, x % y);
	}
 
// methodos ypologismoy elaxistoy koinoy pollaplasioy
	long lcm(long arr[], long n) {
	long ans = arr[0];
 	for (int i = 1; i < n; i++) {
		ans = (((arr[i] * ans)) / (gcd(arr[i], ans)));
	}
 
return ans;
}

//kyria methodos	
public static void main(String[] args) throws IOException {
		
	FileReader agr = new FileReader("agora.in");
	Scanner sc = new Scanner(agr);
	int xwria = sc.nextInt();
	long[] syxn = new long[xwria];
	long[] syxn2 = new long[xwria];
	long sygk[] = new long[xwria];
	long[][] apan = new long[xwria][2];
	
	for(int k=0; k<xwria; k++) {
		syxn[k] = sc.nextInt();
		syxn2[k] = syxn[k];
	}
	
	agora t1 = new agora();
	long s = t1.lcm(syxn, syxn.length);
	for(int f=0; f<xwria; f++) {
		
		syxn[f] = 1;
		
		sygk[f] = t1.lcm(syxn, syxn.length);
		
		for(int h=0; h<xwria; h++) {
			syxn[h] = syxn2[h];
		}		
	}
	
	for(int i=0; i<xwria; i++) {
		apan[i][0] = i+1;
		apan[i][1] = sygk[i];
	}
	
	//taxinomisi
    long x,y,k,l,b,c,d,e;
    
    for (int i=1; i<xwria; i++){
        if(apan[i][1] < apan[i-1][1]){
            
            
            x = apan[i][1];
            k = apan[i][0];
            y = apan[i-1][1];
            l = apan[i-1][0];
            
            apan[i][1] = y;
            apan[i][0] = l;
            apan[i-1][0] = k;
            apan[i-1][1] = x;
            
            
            for(int a=1; a<xwria; a++){
                if(apan[a][1] < apan[a-1][1]){
                    e = apan[a][1];
                    d = apan[a][0];
                    b = apan[a-1][1];
                    c = apan[a-1][0];
                    
                    apan[a][1] = b;
                    apan[a][0] = c;
                    apan[a-1][0] = d;
                    apan[a-1][1] = e;
                    
                    
                }
                i=0;
            }
            
        }
            
    }
    
    PrintWriter wr = new PrintWriter("agora.out", "UTF-8");
	if(s <= apan[0][1]) {
		wr.print(s+" "+ 0);
	} else {
		wr.print(apan[0][1]+" "+apan[0][0]);
	}
	wr.close();	
	}
 
}