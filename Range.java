//this code helps the user to find the multiples of input numbers within a range of nmbers
package range;


public class Range {
//variable declaration
    
    public static void main(String[] args) {
        int num;
        for(num=71; num<151; num++){
            if(num % 2 == 0){
                System.out.println("Numbers divisible by 2: " + num);
            }
            if(num % 3 == 0){
                System.out.println("Numbers divisible by 3: " + num);
                
            }
            if(num % 7== 0){
                System.out.println("Numbers divisible by 7: " + num);
                
            }
        }
    }
}
