package com.corejava.loop;

import java.util.Scanner;

public class SeriesPrograms {
/**
 * Write a program to find sum of this series
 * 1/2+1/4+1/6....N times
 *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=in.nextInt();
        	for(int i=1;i<=n;i++) {
        		sum=sum+(1.0/(i*2));
        	}
        	System.out.print("Sum= "+sum);
            System.out.println("\n---------------------------------------");
            /*Write a program to find sum of this series
            * 1/4+1/9+1/16....N times
            */
            double sum1=0;
            	for(int i=1;i<=n;i++) {
            		sum1=sum1+(1.0/(i*i));
            	}
            	System.out.print("Sum= "+sum1);
            	System.out.println("\n---------------------------------------");
            	/*Write a program to find sum of this series
                 * X+x^2+X^3+....X^n times 
                 */
            	double sum2=0;
            	System.out.print("Enter value of N:");
            	 int N=in.nextInt();
            	 System.out.print("Enter value of x:");
            	 int X=in.nextInt();
            	 for(int i=1;i<=N;i++) {
             		sum2=sum2+Math.pow(X,i);
             	}
             	System.out.print("Sum= "+sum2);
             	System.out.println("\n---------------------------------------");
            	/*Write a program to find sum of this series
                 * X-x^2+X^3-X^4....X^n times 
                 */
            	double sum3=0;
            	 for(int i=1;i<=N;i++) {
            		 if(i%2==0) {
             		sum3=sum3-Math.pow(X,i);
            		 }else {
            			 sum3=sum3+Math.pow(X,i);
            		 }
             	}
             	System.out.print("Sum= "+sum3);
	}
}
