//This code helps the user to identify the number of characters their names have//
//This code helps the user to know if the ages input are even or odd//
package sirname;
import java.util.Scanner ;
//We use the Scanner class since it's the easiest way to read input in java program

public class Sirname {
 static int age;
//declaring age as variable//
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
    System.out.println("Enter Your age "); 
    //this wiil prompt the user to enter his age//
    age=input.nextInt();
    //Prompt the output from the program//
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your Sirname");
    //This will prompt the user to enter his/her name//
   String name=sc.nextLine();
    //promts the output from the program//
    System.out.println("The count of characters in the name is:"+name.length());
    //shows the user what name he has put in//
    //introduce conditions//
    if (age%2==0){
        System.out.println("Your age is an even number");
    }
    else{
        System.out.println("Your age is an odd number");
    }
    }
}
