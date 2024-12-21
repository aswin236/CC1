import java.util.Scanner;
class reverseno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        int n=scan.nextInt();
        int sum=0;
        while (n>0){
            int ld = n%10;
            sum = (sum*10)+ ld;
            n=n/10;
        }
        System.out.println(sum);
    }
}
