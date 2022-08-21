package org.abstrc;

public class FulAbs implements FulAdtt ,Kli {

	@Override
	public void fan() {
		System.out.println(2500);
		
	}
	@Override
	public void havells() {
	System.out.println("brand");	
	}

	@Override
	public void condenser() {
	System.out.println("40w");	
		
	}
	public void hi() {
		System.out.println(6);

	}
	@Override
	public void haves() {
		System.out.println(0);
		
	}

	@Override
	public void hars() {
		System.out.println(44);
		
	}
public static void main(String[] args) {
	FulAbs k = new FulAbs();
	k.fan();
    k.havells();
    k.condenser();
    k.hi();
    k.hars();
    k.haves();
    
    
    
}


}
