package org.poly;

public class OvriDng extends Mtovri {

	
	@Override
	public void camera() {
		System.out.println("15mp");
	}
	
	@Override
	public void battery() {
		System.out.println("7000mah");
	}
	
	@Override
	public void android(String o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		OvriDng u = new OvriDng();
		u.display();
		u.camera();
		u.battery();
		u.android("yryt");
		
		
		
		
	}
	
	
	
}
	

