package com.codegnan.patternexamples;

public class Pattern_example03 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++)
		
				{
		System.out.print("  ");
		//System.out.print(j+" ");//
		//System.out.print(6-j+" ");//
		//System.out.print(i+" ");//
		//System.out.print((6-i)+" ");//
		//System.out.print((char)(96+j)+" ");//
		//System.out.print((char)(102-j)+" ");//
		//System.out.print((char)(96+i)+" ");//
		//System.out.print((char)(102-i)+" ");//
	}
			for(int k=0;k<5-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
}
	}

	}


