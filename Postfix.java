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
class Stack{
	int size;
	Node top;
	class Node{
		String str;
		Node next;
		Node(String S){
			this.str=S;
		}
	}
	Stack(){
		this.top=null;
		size=0;
	}
	boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
	void push(String h){
		Node tmp = new Node(h);
		if(isEmpty()){
			top=tmp;
			
		}else{
			
			top.next=tmp;
		}
		size++;
	}
	String pop(){
		if(isEmpty()){
			return "-1";
		}
		else{
			Node tm=top;
			String j= tm.str;
			tm.next=top;
			size--;
			return j;
		}
		
	}
}






public class Postfix {
	static Stack E=new Stack();
	//static Stack R=new Stack();
	public static void main(String[] args)throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int l=Reader.nextInt();
		String[] S= new String[l];
		for(int i =0 ;i<l;i++){
			S[i]=Reader.next();
			//System.out.print(S[i]+"");
		}
		int k =eval(S);
		System.out.println(k);
		//int q=Integer.parseInt(S[0]);
		//int p=Integer.parseInt(S[l-1]);
		//System.out.println(performOp(q,S[l-2],p));
		

	}
	public static int eval(String[] g){
		E=new Stack();
		int n=g.length;
		for(int i=0;i<n;i++){
			if(!isOperand(g[i])){
				E.push(g[i]);
				
				//E.push(g[i+1]);
				
			}
			/*else if(isOperand(g[i])&&R.size!=0){
				int a=Integer.parseInt(E.pop());
				int b=Integer.parseInt(R.pop());
				int c=performOp(b,g[i],a);
				 E.push(Integer.toString(c));
				 //System.out.print(R.pop()+" ");
			}*/
			else if(isOperand(g[i])&&E.size!=0){
				int a=Integer.parseInt(E.pop());
				int b=Integer.parseInt(E.pop());
				int c=performOp(b,g[i],a);
				E.push(Integer.toString(c));
			}
			/*else{
				int h=Integer.parseInt(E.pop());
				int w=Integer.parseInt(E.pop());
				
				int c=performOp(w,g[i],h);
				R.push(Integer.toString(c));
				//System.out.println(R.pop());
				}*/
			}
		return Integer.parseInt(E.pop());
		}
	
	static int performOp(int c , String operand, int e){
		//String operand;
		
		int m=0;
		
			if(operand.equals("+")){
			 int r=c+e;
			 //System.out.println(r);
			 //.push(Integer.toString(r));
			 m=r;
			}
		
			else if(operand.equals("-")){
			 int r=c-e;
			 //System.out.println(r);
			// R.push(Integer.toString(r));
			 m=r;
			 }
		
			else if(operand.equals("*")){
			int r=c*e;
			//System.out.println(r);
		//	R.push(Integer.toString(r));
			m=r;
					
			}
			
	
			else if(operand.equals("/")){
			int r=c/e;
			//System.out.println(r);
			//R.push(Integer.toString(r));
			m=r;
			}
			
			return m;
		
	}
	
	
	
	
	static boolean isOperand(String s){
	String add="+";
	String sub="-";
	String mul="*";
	String div="/";
	if(s.equals(add) || s.equals(mul) || s.equals(div) || s.equals(sub)){
		return true;
	}
	else{
		return false;
	}
	}

}
