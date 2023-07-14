/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class greatof2no
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N1 = scan.nextInt();
		System.out.println("Enter the number: ");
		int N2 = scan.nextInt();
		if(N1<N2){
		   System.out.printf("Output %d",N2);
		}
		else{
		   System.out.printf("Output %d",N1);
	}

}
}