//Number Guessing Game
import java.lang.Math;
import java.util.Scanner;
class Guess{
    public static void main(String[] args){
        int guessNum=(int)Math.random()*100;
        int num,counter=0;
        boolean won=false;
        while(true){
            System.out.println("Enter your Guess: ");
            Scanner scan=new Scanner(System.in);
            num=scan.nextInt();
           System.out.println("You Guess: ");
            System.out.println(num);
            counter++;
            if(num==-1){
                break;
            }
            if(num > guessNum){
                System.out.println("Very Large! ");
            }
            else if(num < guessNum){
                System.out.println("Very Small! ");
            }
            else{
                won=true;
                break;
            }
        }
        if(won){
            System.out.println("Congratulations, You guessed it correctly!");
            System.out.println("You have got the number" + " " + num +" "+ "correctly after" +" "+ counter +" "+ "tries!");}
        else{
            System.out.println("Better luck next time!");
        }
        System.out.println("Thanks for playing!");
    }}
