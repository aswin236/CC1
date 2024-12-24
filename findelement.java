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
        System.out.print("Enter index:");
        int key=scan.nextInt();
       if (key>=0 && key < n){
           System.out.println(arr[key]);
       } else{
           System.out.println("Invalid");
       }
       }
    }
