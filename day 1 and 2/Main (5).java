/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter the number: ");
    int N = scan.nextInt ();
    if (N < 0)
      {
	System.out.println ("Negative");
      }
    else if (N > 0)
      {
	System.out.println ("Positive");
      }
    else
      {
	System.out.println ("Zero");
      }
  }
}