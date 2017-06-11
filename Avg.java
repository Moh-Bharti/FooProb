
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.lang.*;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
public class Avg{
	
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		int h=Reader.nextInt();
		int[] dat=new int[h];
		for(int i=0;i<h;i++){
			dat[i]=Reader.nextInt();
		}
		int y=Average(dat);
		System.out.println(y);
	}
	
	public static int Average(int[] a){
		int sum=0;
		int count=0;
		int n=a.length;
		//int avg=sum/n;
		for (int i=0;i<n;i++){
			sum=sum+a[i];}
			for(int i=0;i<n;i++){
			if(sum/n<a[i]){
				//System.out.print(a[i]+" ");
					count=count+1;
			}
		
			
		
		}
		//System.out.println(sum/n);
		return count;
		
	}
	
}
