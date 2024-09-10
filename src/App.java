import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner num = new Scanner(System.in);
        System.out.println("please, give the value of 1st number");
        int number1 = num.nextInt();
        System.out.println("please, give the value of 2nd number");
        int number2 = num.nextInt();
        int sum = number1 + number2;
        
        if(sum > 10){
            System.out.println("The value is greater than 10. It is " + sum + ".");
        }
        else{
            System.out.println("The sum is " + sum);
        }


    }
}