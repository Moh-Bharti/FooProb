

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
public class ThreeLeggedDefender{
	
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		int h=Reader.nextInt();
		for(int i=0;i<h;i++){
			int g=Reader.nextInt();
			int[] d= new int[g];
			int count=0;
			for(int j=0;j<g;j++){
				d[j]=Reader.nextInt();
				count=count+Math.abs(d[j]/3);
			}
			System.out.println(count);
		}
	}
	
	
}
