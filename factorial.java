import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        int fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=5;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("the factorial is:");
    }
}
