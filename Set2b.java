import java.util.Scanner;
public class Set2b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        int x=scan.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(x*i);
        }
    }
}
