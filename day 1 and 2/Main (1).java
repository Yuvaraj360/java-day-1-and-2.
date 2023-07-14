/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class sumevenodd
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N1 = scan.nextInt();
			System.out.println("Enter the number: ");
		int N2 = scan.nextInt();
	    int N =N1+N2;
		if(N%2==0){
		   System.out.printf("Even");
		}
		else{
		   System.out.printf("Odd");
	}

}
}