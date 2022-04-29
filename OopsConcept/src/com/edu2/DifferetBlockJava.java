//Different Blocks
//main, costructor, static, method, normal block
package com.edu2;

public class DifferetBlockJava {

	static {
		System.out.println("static executes before main");
	}
	//normal block
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	DifferetBlockJava(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		System.out.println("MainBlock");
		DifferetBlockJava ob=new DifferetBlockJava();
	}

}
