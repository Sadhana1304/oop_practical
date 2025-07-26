package CSE;
import java.util.Scanner;
public class LogicalOperators {
	  public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);

	        System.out.println((5 > 3) && (8 > 5));  // true
	        System.out.println((5 > 3) && (8 < 5));  // false

	        System.out.println((5 < 3) || (8 > 5));  // true
	        System.out.println((5 > 3) ||  (8 < 5));  // true
	        System.out.println((5 < 3) || (8 < 5));  // false

	        System.out.println(!(5 == 3));  // true
	        System.out.println(!(5 > 3));  // false
	      }
}
