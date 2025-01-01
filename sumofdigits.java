import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input=");
        int n= scan.nextInt();
        int sum=digit(n);
        System.out.println(sum);
    }
    public static int digit(int n){
        if (n==0){
            return 0;
        }else{
            return (n%10)+digit(n/10);
        }
    }
}
