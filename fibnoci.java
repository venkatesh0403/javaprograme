/**
 *
 * @author venkatesh
 */
import java.util.Scanner;

public class fibnoci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int number=10;
        int a=0,b=1,c;
        System.out.println("enter a number");
        for(int i=0;i<=number;i++){
            System.out.println("fibnoci is");
            c=a+b;
            b=a-b;
            a=a-b;
            
            
        }
    }
    
}
