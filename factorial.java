import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=scan.nextInt();
        int b=1;
        for(int i=1; i<a+1; i++){    // or i<=a;
         b*=i;
        }
        System.out.println(b);
    }
}