import java.util.Scanner;

/**
 * Main
 */
public class Main {    
    static void prediction(int n){
        if(fib(n)%2==0){
            System.out.print("Dead");
        }
        else{
            System.out.print("Alive");
        }
    }
    static int fib(int n){
        int num1 = 0, num2 = 1;
        int ans=0;
        int counter = 0;
        while (counter < n) {
            ans= num1;
    
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return ans;
    }
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            prediction(n);
    }
}
