package com.corejava.loop;

public class Labled_ForLoop {
	/*
	 * Labled For loop:
	 *   use label before the for loop.
	 *   It is useful while using the nested for loop as we can break/continue specific for loop.
	 * 	Syntax:
		labelname:    
		for(initialization; condition; increment/decrement){    
		//code to be executed    
		}    
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          aa://lable for loop
		        for(int i=1;i<=3;i++){  
		            bb: // lable for another for loop  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  
			}

	}
