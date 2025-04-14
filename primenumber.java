/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 */
import java.util.Scanner;
public class primenumber {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        if(isPrime(number)){
            System.out.println("the number is prime");
        }
            else {
                 System.out.println("the number is not a prime");
                    }
    }
            public static boolean isPrime(int numbe){
                for(int i=2;i<=numbe;i++){
                    if(numbe%i==0){
                        return 0;
                    }
            }
        
    }
}
   