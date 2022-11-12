//this program will helpp the use rto find the largest and the smallest  of three input numbers
package javamethods;
//importing java class
import java.util.Scanner;

public class Methodsinjava {
 static int num1, num2,num3;
    public static void main(String[] args) {
        //creating scanner
     Scanner input= new Scanner(System.in);
     System.out.println("Program to find the the largest and smallest numbers ");
     //enter the first number
     System.out.println("Enter the first number");
      num1=input.nextInt();
      System.out.println("Enter the second number");
      num2=input.nextInt();
      System.out.println("Enter the third number");
      num3=input.nextInt();
      if(num1>num2 && num1>num3){
          System.out.println("The largest number is:"+num1);
      }
       if(num2>num1 && num2>num3){
          System.out.println("The largest number is:"+num2);
      }
       else if(num3>num1 && num3>num2){
          System.out.println("The largest number is:"+num3);
      }
      else{
          System.out.println("The smallest number is:"+num1);
          System.out.println("The smallest number is:"+num2);
          System.out.println("The smallest number is:"+num3);
      }
      
    }}
