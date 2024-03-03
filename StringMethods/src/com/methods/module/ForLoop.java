package com.methods.module;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 7) {

				System.out.println(i);
				continue;

			}
			System.out.println(i);

		}

		System.out.println("==================================");
		System.out.println("      *");
        System.out.println("     * *");
        System.out.println("    * * *");
        System.out.println("   * * * *");
        System.out.println("  * * * * *");
        
        for (int a = 1; a <=8; a++) {
        	
        	System.out.println(a);
        	if (a==5) {
        		System.out.println(a);
        		System.out.println("===============================");
        		break;
        		
				
			}
        	
        	}
        for (int b = 1; b <=10; b++) {
        	
        	System.out.println(b);
			
		}
               
	}
	
	
	

}
