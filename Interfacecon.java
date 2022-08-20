package Pr;

public class Interfacecon implements Intr,Intr1 {
public void a1() {
	System.out.println("a1");
}
public void a2() {
	System.out.println("a2");
}
public void a3() {
	System.out.println("a3");
}
public static void main(String args[]) {
/*	Interfacecon I1=new Interfacecon();
	I1.a1();
	I1.a2();*/
	Intr t1=new Interfacecon();
	t1.a1();
	t1.a2();
	Intr1 t2=new Interfacecon();
	t2.a3();
}
}
