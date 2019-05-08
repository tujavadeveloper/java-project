import java.util.Scanner;

public class Lab1 {


public static void main(String[] args) {
	// TODO Auto-generated method stubo
    
	
    Scanner input1 = new Scanner(System.in);
	System.out.println("Nhap a:");	
	int a = input1.nextInt();
//	System.out.println("a=" + a);
	

    Scanner input2 = new Scanner(System.in);
	System.out.println("Nhap b:");	
	int b = input2.nextInt();
//	System.out.println("b=" + b);
	
//	System.out.println(check(a,b));
	System.out.println("a+b:" + (a+b));
	System.out.println("a-b:" + (a-b));
	System.out.println("a%b:" + (a%b));
	System.out.println("a/b:" + (a/b));
	System.out.println("a++:" + ++a);
	System.out.println("b--:" + --b);
//10}
//public static String check(int a, int b) {
//	return (a>b) ? "a>b":"a<=b";
if (a>b) {
	System.out.println("a>b");
}
else {
	System.out.println("a<=b");
	
}

}
}
