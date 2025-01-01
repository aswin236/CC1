import java.util.Scanner;
public class power{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input=");
        int n= scan.nextInt();
        int p=scan.nextInt();
        int result=power(n,p);
        System.out.println(result);
    }
    public static int power(int n,int p){
        if (p==0){
            return 1;
        }else{
            return n*power(n,p-1);
        }
    }
}
