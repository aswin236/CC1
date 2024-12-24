import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of array=");
        int n= scan.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for (int i=0;i<n;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
