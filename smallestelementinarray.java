import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n=scan.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int small=a[0];
        for (int i=1;i<n;i++){
            if (a[i]<small){
                small=a[i];
            }
        }
        System.out.println(small);
    }
}
