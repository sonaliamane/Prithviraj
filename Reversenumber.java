package Pr;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		
		int i=sc.nextInt();
		//int i=12345;
int reverse=0;
while(i!=0) {
	
	int remaindar=i%10;//remaindar=5//4//3//2//1
	reverse=reverse*10+remaindar;//reverse=0*10+5=5//5*10+4=54//54*10+3=543//543*10+2=5432
	
i=i/10;//i=1234//i=123//i=12//i=1
}
System.out.println("Reverse number is  " +reverse);

	}

}
