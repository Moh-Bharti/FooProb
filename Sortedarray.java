import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

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






public class Sortedarray {

	
	
	
	
	public static void main(int[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Reader.init(System.in);
		try {
			
			
			int[] arr =  new  int[3];
			int[] arr1 = new int[3];
			int s = Reader.nextInt();
			int S = Reader.nextInt();
			for(int i =0 ; i<arr.length; i++){
				arr[i]= s;
				
			}
			int q = arr[3];
			int n = arr[2];
			
			
			for(int u = 0 ; u<n ;u++){
				arr1[u]=S;
			}
			
			for (int  t=0 ; t<q ; t++ ){
				//int[] apo = new int[q];
				//int s1 = Reader.nextInt();
				for (int h = 0 ; h<q ; h++){
					
					int w  = Reader.nextInt();
					
				
				if (w == 1){
					int f = Reader.nextInt();
					insert(arr,f);
					System.out.println("j");
					
				}
				else if(w==2){
					int l = Reader.nextInt();
					delete(arr,l);
					System.out.print("o");
				}
				else if(w==3){
					System.out.println(arr);
				}
					else{
						System.out.println("");
					}
				}
				}
			}
				 catch (IOException e) {
					e.printStackTrace();
			}
		
	}
	
	public static int[] insert (int[] array  , int a){
		int j = 0;
			for (int  i = 0; i<array.length ; i++){
				if (a <=array[i]){
					for (int g=i ; g<array.length ; g++){
					
					array[g]=array[g+1];
					j= j+1;
					
					}
					
				}
			
			
			
			
			
	}
			return  array;
	}

	public static int[] delete(int[] array, int r){
		int o= 0;
		for(int e=0 ; e<array.length ; e++){
			if (array[e]==r){
				for (int p=e ; p<array.length ; p++){
					array[p]=array[p-1];
					o=o+1;
				}
				
			}
		}
		
		return array;
		
	}
}

	


