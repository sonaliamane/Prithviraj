package Pr;

public class Passage implements Pass {
 public void c1() {
	 System.out.println("c1 and c2");
 }

public static void main(String args[]) {
	Passage p1=new Passage();
	p1.c1();
}
}