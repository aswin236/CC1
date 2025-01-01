import java.util.Scanner;
public class countdigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input=");
        int n= scan.nextInt();
        int c=digit(n);
        System.out.println(c);
    }
    public static int digit(int n){
        if (n==0){
            return 0;
        }else{
            return 1+digit(n/10);
        }
    }
}
