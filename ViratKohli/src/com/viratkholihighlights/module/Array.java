package com.viratkholihighlights.module;

public class Array {
	
	
	public static void main(String[] args) {
		
		
		int a[]={10,2,3,7,16,100,200,1};
		
	    int small=a[0];
	    
	    int length = a.length;
	    System.out.println("lent ="+length);
	    
//	    for(int i=0;i<a.length;i++) {
//	    	
//	    	if(a[i]<=small) {
//	    		small=a[i];
//	    	}
//	    	System.out.println(small);
//	    	
	 //   }
	    for(int x : a) {
	    	System.out.println(x);
	    }
	    
	}

}
