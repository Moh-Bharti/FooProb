/**
 * 
 */

/**
 * @author MOH BHARTI
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


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
public class RepeatTwice {

	/**
	 * @param args
	 */
	static int a;
	//int b;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int l=Reader.nextInt();
		int[] m=new int[l];
		for(int x=0;x<l;x++){
			m[x]=Reader.nextInt();
		}
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(m[i]==m[j]){
					a=m[i];
					System.out.print(a+" ");
				}
			}
		}

	}

}
