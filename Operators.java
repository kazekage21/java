//the code below is used to help the user to use operators
package operators;
//importing java class 
import java.util.Scanner;
//working with arithmetic operators
//+,-,*,/
public class Operators {
//declaring variables
   static int num1, num2, sum, diff,product,division;
   
    public static void main(String[] args) {
        //creating scanner object 
    Scanner input= new Scanner(System.in);
    //ask the user to enter the first two numbers
    System.out.println("Enter the first number");
    //getting the first number
   num1=input.nextInt();
    System.out.println("Enter the second number");
    //getting the second number
    num2=input.nextInt();
    //Addition
    sum=num1+num2;
    System.out.println("sum of the numbers is:"+sum);
      //diff
      diff=num1-num2;
      System.out.println("difference of the numbers is:"+diff);
      //multiply
      product=num1*num2;
      System.out.println("Product of the numbers is:"+product);
      //division
      division=num1/num2;
      System.out.println("division of the numbers is"+division);
      
    }
}
