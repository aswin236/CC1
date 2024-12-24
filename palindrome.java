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
        boolean isPalindrome = true;
        for (int i=0; i<n/2;i++){
            if (arr[i]!=arr[n-i-1]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
        }
}
