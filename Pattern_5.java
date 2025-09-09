package com.codegnan.patternexamples;

public class Pattern_5 {

	public static void main(String[] args) {
		int rows=4;
		int cols=5;
		int shift=3;
    for(int i=0; i<rows; i++) {
    	for(int j=0; j<i+shift;j++) {
    		System.out.print(" ");
    	}
    	for(int k=0; k<cols;k++) {
    		System.out.print(" *");
    	}
    	System.out.println();
    }
	}

}

