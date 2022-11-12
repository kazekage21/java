//this code will help the user to find out their total grade as well as their average grade for the previous semester's units
package gradeaverage;//creating package
import java.util.Scanner;//importing Scanner class

public class Gradeaverage {
static double webdesign, javaprog, health, algorithms, datastructures, total, average;
//variable declaration
    public static void main(String[] args) {
        //creating an object of scanner class
        Scanner input=new Scanner(System.in);
        //ask the student to enter the marks for the first unit
        System.out.println("Enter the marks for the first unit");
        //prompts user to enter the webdesign marks
        webdesign=input.nextDouble();
        System.out.println("Enter the marks for the second unit");
        //prompts user to enter the javaprog marks
         javaprog=input.nextDouble();
        System.out.println("Enter the marks for the third unit");
        //prompts user to enter the health marks
         health=input.nextDouble();
        System.out.println("Enter the marks for the forth unit");
        //prompts user to enter the algorithms marks
         algorithms=input.nextDouble();
        System.out.println("Enter the marks for the fifth unit");
        //prompts user to enter the datastructures marks
         datastructures=input.nextDouble();
        total= webdesign+javaprog+health+algorithms+datastructures;
        //finds the total of the units
        System.out.println("Your total is:"+total);
        //prints out the total
        average=total/5;
        System.out.println("Your average is:"+average);
        //prints out the average
    }
}
