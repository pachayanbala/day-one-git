package org.datatypes;

public class DataTy {
   
	public int m1() {
		int i = 20;
		int k = 80;
	    int y = i+k;
		return y;
           
	}
	
	public int m2() {
		int r = 20;
		int s = 80;
	    int w = r+s;
		return w;
	}
	public int m3() {
		int r = 20;
		int s = 80;
	    int w = r+s;
		return w;
	}
	public int m4() {
		int r = 20;
		int s = 80;
	    int w = r+s;
		return w;
	}
	public int m5() {
		int r = 20;
		int s = 80;
	    int w = r+s;
		return w;
	}
	
	public static void main(String[] args) {
		DataTy f = new DataTy();
		int m1 = f.m1();
	   int m2 = f.m2();
	   int m3 = f.m3();
	   int m4 = f.m4();
	   int m5 = f.m5();
		int y = m1+m2+m3+m4+m5;
		
		System.out.println(y);
		int k = y*5;
		System.out.println(k);
	}
	
	
	
	
	
	
}
