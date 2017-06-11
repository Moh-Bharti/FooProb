import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


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
	class Node{
		int data;
		Node next;
		
		Node(int num , Node p){
			this.data=num;
			this.next=p;
		}
		public int getdata(){
			return data;
		}
		public void setlink(Node k){
			next=k;
		}
		public Node getlink(){
			return next;
		}
	}
	
	
	
	int size;
	protected Node top;
	
	Stack(){
		top=null;
		size=0;
	}
	boolean isempty(){
		return top==null;
	}
	int getsize(){
		return size;
	}
	void push(int kapa){
		Node pri= new Node(kapa,null);
		if(top==null){
			top=pri;
		}
		else{
			pri.setlink(top);
			top=pri;
		}
		size++;
	}
	int pop(){
		if(isempty() ){
			return -1;
		}
		Node war = top;
		top=war.getlink();
		size--;
		return war.getdata();
	}
	int top(){
		if(isempty()){
			return -1;
		}
		int d=top.getdata();
		return d;
	}
	int p;
	
	int getmin(){
		Stack minStack=new Stack();
		Node tpr= top;
		if(isempty()){
			return -1;
		}
		
			int o = top.getdata();
			
			if(tpr.getlink()==null){
				return top.getdata();
			}
			while(tpr!=null){
				 p=tpr.getdata();
			if(o<p){
				minStack.push(o);
			}
			else if(minStack.top()<o){
				minStack.pop();
				minStack.push(o);
			}
			else{
				o=p;
			minStack.push(o);}
			tpr=tpr.getlink();
			}
			//System.out.println(o);
			int min= minStack.top();
			
			return min;
	}


	
	
}

public class Stackpack {
	static String w;
	
	public static void main(String[] args)throws IOException {
		
		//String q="0123456789";
		//String e="push";
		//String f="getmin";
		//String g="pop";
		//String h="top";
		// TODO Auto-generated method stub
		 
		Reader.init(System.in);
		Stack t= new Stack();
		int p= Reader.nextInt();
		t.size=p;
		int o = Reader.nextInt();
		//String[] Y=new String[o];
		for(int y=0 ; y<o;y++){
			 w=Reader.next();
			 if(w.equals("push")){
					t.push(Integer.parseInt(Reader.next()));
					System.out.println(t.top());
				}
				else if(w.equals("pop")){
					int r=t.pop();
					System.out.println(r);
				}
				else if(w.equals("getmin")){
					int v=t.getmin();
					System.out.println(v);
				}
				else if(w.equals("top")){
					int l=t.top();
					System.out.println(l);
				}
				else if(w.equals("isempty")){
					if(t.isempty()){
						System.out.println(1);
					}
					else{
					System.out.println(0);}
				}
				
				
			}
			 
		 
		}
		
		

}
