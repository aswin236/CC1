import java.util.Scanner;
public class Digitcount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        int n=scan.nextInt();
        int c=0;
        while (n!=0){
            n=n/10;
            c++;
        }
        System.out.println(c);
        }
}
