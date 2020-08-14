/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
    static int reverseNum(int num)
    {
        int reverse = 0;
        int rem = 0;
        while (num != 0)
        {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        return reverse;
    }
     
    //Method to check for a Palindrome
    static boolean checkPal(int num)
    {
        int reverse = reverseNum(num);
        if(reverse == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    //Method to reverse and add given number until you get a Palindrome
    //as well as printing the number of iterations to get the Palindrome
    static void reverseAndIterate(int num)
    {
        int numIterations = 0;
        if(checkPal(num))
        {
            System.out.println("Given Number is already a palindrome.");
            System.out.println("Number of iterations is 0.");
        }
        else
        {
            while (!checkPal(num))
            {
                int reverse = reverseNum(num);
                int sum = num + reverse;
                System.out.println(num + " + " + reverse + " = " + sum);
                num = sum;
               //int numIterations = 0;
                numIterations++;
                //System.out.println("Number of iterations has been increased by 1.");
            }
            System.out.println("Total number of iterations is " + numIterations + ".");
        }
    }
    
    //Method to get the number of iterations to get the palindrome
/*    static int numIterations(int num)
    {
       int numIterations = 0;
       if(checkPal(num)) 
       {
           System.out.println("Number of iterations is 0.");
       }
       else
       {
            while(!checkPal(num))
            {
                numIterations++;
                //System.out.println("Number of iterations has been increased by 1.");
            }
            //System.out.println("Total number of iterations is " + numIterations + ".");
       }
    } 
*/
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNum = sc.nextInt();
        reverseAndIterate(inputNum);
        //numIterations(inputNum);
	}
}

