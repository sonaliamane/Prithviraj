package Pr;

public class Abstractgrandch extends Abstractchild {
public void c1() {
	System.out.println("c1");
	}
public void c2() {
	System.out.println("c2");
	}
public void c3() {
	System.out.println("c3");
	}
public void c4() {
	System.out.println("c4");
	}
public static void main(String args[]) {
	/*Abstractgrandch a1=new Abstractgrandch();
	a1.c1();
	a1.c2();
	a1.c3();
	a1.c4();*/
	Abstractchild a2=new Abstractgrandch();
	a2.c1();
	a2.c2();
	a2.c3();
	a2.c4();
}
}
