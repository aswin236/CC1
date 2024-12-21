import java.util.Scanner;
public class Set1b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        int a1=scan.nextInt();
        int a2=scan.nextInt();
        int a3=scan.nextInt();
        if (a1+a2+a3==180){
            System.out.println("Triangle can be formed");
        } else{
            System.out.println("Triangle cannot be formed");
        }
        }
    }
