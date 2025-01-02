import java.util.Scanner;
public class divisor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input=");
        int n= scan.nextInt();
        divisors(n,1);
    }
    private static void divisors(int n,int d){
        if (d<=n){
            if (n%d==0){
                System.out.print(d+" ");
            }
            divisors(n,d+1);
        }
    }
}
    
      
