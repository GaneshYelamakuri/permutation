package com.jsp.Stringpack;

public class permuatation {

	public static void main(String[] args) 
	{	
		String s="abc";
		int n=s.length();
	  permutation(s,0,n-1);	
	

	}

	
   public static void permutation(String s,int start,int end) 
   
   {
	   if(start>=end) 
	   {
		   System.out.println(s);
		   return;   
	   }
	   for(int i=start;i<=end;i++) {
		   String s1=swap(s,start,i);
		   permutation(s1,start+1,end);
	   }
	   
   }
	public  static String swap(String s,int i,int j) 
	{
		char[] c= s.toCharArray();
		char temp =c [i];
		c[i]= c [j];
	    c [j]=temp;
	    
	    return new String (c);	
		
	}

}
