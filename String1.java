package Pr;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testing";
		String s1=new String(" Manual testing");
		String s2="testing";
		char a[]= {'a','b','h','i','j','e','e','t'};
		System.out.println(s==s2);
		char c=s1.charAt(4);
		int i=s1.length();
		System.out.println(i);
		System.out.println(c);
		System.out.println(s.equals(s2));
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb);
		sb.append("  Home");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(4, 5, "st");
		System.out.println(sb);
		}

}
