package CSE;
import java.util.Scanner;
public class BitwiseOperators3 {
public static void main(String[] args) {
	int a,c;
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	c=sc.nextInt();
	c = a<<2;
	System.out.println("a<<2 :"+c);
	c = a>>2;
	System.out.println("a>>2 :"+c);
	c= a>>>2;
	System.out.println("a>>>2 :"+c);
	
}
}
