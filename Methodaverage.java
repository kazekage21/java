//java program to find the average for three units 
package methodaverage;
//importing scanner class
import java.util.Scanner;

public class Methodaverage {
    //variable declaration
static double javaprog,networking,maths,average, total;
    public static void main(String[] args) {
        //creating scanner class
       Scanner input=new Scanner(System.in);
     //ask the lecturer to enter the marks for the first unit
     System.out.println("Enter the marks for javaprogramming:");
     javaprog=input.nextDouble();
     //ask the user to enter the marks for the second unit
     System.out.println("Enter the marks for networking:");
     networking=input.nextDouble();
     //ask the user to enter the marks for the third unit
     System.out.println("Enter the marks for maths:");
     maths=input.nextDouble();
     //find the total
     total=javaprog+networking+maths;
     //prints out the total
     System.out.println("Your total is:"+total);
     //calculates the average
     average=total/3;
     //prints out the average
     System.out.println("Your average is:"+average);
    }
}
