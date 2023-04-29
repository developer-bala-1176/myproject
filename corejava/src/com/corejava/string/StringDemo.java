package com.corejava.string;

public class StringDemo {
	public static void main (String args[]) {
		StringDemo sd=new StringDemo();
		String[] names= {"i'm","bala","from","trichy."};
		sd.joinWords(names);
		}

	private void joinWords(String[] names) {
		String sentance="";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("~~~~~~For each~~~~~~");
		for(String name:names) {
			sentance =sentance+name+" ";
		}System.out.println(sentance);
		
	}
}
