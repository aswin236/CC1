import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int L=scan.nextInt();
       int R=scan.nextInt();
       int sum=0;
       for (int i=L;i<=R;i++){
           if (isPrime(i)){
               sum+=i;
           }
       }
       System.out.println("Sum="+sum);
    }
    private static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
       
