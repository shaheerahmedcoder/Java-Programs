// Taking input from user
import java.util.Scanner;
class Input_User{
    public static void main(String[] args){
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        a=scan.nextInt();
        System.out.println("You choose number:");
        System.out.println(a);
    }
}